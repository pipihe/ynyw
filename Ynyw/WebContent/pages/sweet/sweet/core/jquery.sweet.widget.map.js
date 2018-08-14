/**
 * @fileOverview
 * <pre>
 * 地图组件
 * 2013/09/01
 * <a href="www.huawei.com">http://www.huawei.com</a>
 * Huawei Technologies Co., Ltd. Copyright 1998-2013,  All rights reserved
 * </pre>
 * @version 1.0
 */
(function($, undefined) {
    var mapContainClass = "sweet-mapContainer-cls";
    $.widget("sweet.widgetMap", $.sweet.widget, /** @lends Sweet.map.prototype*/{
        version: "1.0",
        sweetWidgetName: "[widget-map]",
        eventNames:/** @lends Sweet.map.prototype*/{
            /**
             * @event
             * @description 单击事件,一般参数为两个(evt, data)
             */
            click:"单击事件"
        },
        //地图组件公共配置参数
        options:/** @lends Sweet.map.prototype*/{
            /**
             * 地图宽度
             * @type {String/Number}
             * @default 660px
             */
            width: 600,
            /**
             * 地图高度
             * @type {String/Number}
             * @default 600px
             */
            height: 600,
            /**
             * 小区的集合信息，例如：[{"value":"01","text":"成功率：96%，通话率：98%，拥塞率：0.00%","data":["x":"112" , "y":"115", "angle":null, "color":"#adadad"]}]
             * @type Array
             * @default []
             */
            cellData : [],
            /**
             * 地图的业务图层的编号id
             * @type number
             * @default null
             */
            layerId : null,
            /**
             * 具体图层的数据及提示信息及图层指定的颜色，及多指标时着色指标的名称
             * @example [{"value":"1190","text":"成功率:96%,通话率:98%,拥塞率:0.00%","data":{"kpiname":"通话率","color":"0xA1D9F0"}},...]
             * @type Array
             * @default []
             */
            layerData : [],
            /**
             * 图层的默认颜色值
             * @type String
             * @default ""
             */
            layerDefaultColor : ""
        },
        /**
         * @description 清除地图的当前图层
         */
        clearLayer : function(){
            var me = this;
            if(me.mapObj){
                me.mapObj.clearLayer();
            }
        },
        /**
         * 给地图设置或更新数据(图层更新或指标tips提示信息更新，图层的颜色，小区信息)
         * @param {Object/Array} data 
         */
        setData : function(data){
            var me = this;
            if($.isArray(data)){
                me.options.layerData = $.objClone(data);
            } else {
                for(var key in data){
                    me.options[key] = JSON.parse(JSON.stringify(data[key]));
                }
            }
            
            if(me.mapObj){
                me.mapObj.setLayerId(me.options.layerId);
				if(me.options.layerDefaultColor){
					me.mapObj.setLayerDefaultCorlor(me.options.layerDefaultColor);
				}
                me.mapObj.setLayerData(me.options.layerData);
            }
        },
        /**
         * @private
         * @description 设置组件宽度，子类继承实现
         * @param {number} w description
         */
        _setWidth: function(w){
            this.mapContainerEl.externalWidth(w);
            if(this.mapObj){
                this.mapObj.setWidth(w);
            }
        },
        /**
         * @private
         * @description 设置组件高度，子类继承实现
         * @param {number} h description
         */
        _setHeight: function(h){
            this.mapContainerEl.externalHeight(h);
            if(this.mapObj){
                this.mapObj.setHeight(h);
            }
        },
        /**
         * @private
         * @description 设置组件宽度、高度，子类继承实现
         * @param {number} w description
         * @param {number} h description
         */
        _setWH: function(w, h){
            this._setWidth(w);
            this._setHeight(h);
        },
        /*
         * @description 获取小区信息
         */
        getCellData: function(){
            return $.objClone(this.options.cellData);
        },
        /*
         * @public
         * @description  生成小区的扇形图
         * @param {Array} data 小区的信息 value:小区id, text:小区提示显示 ,data:小区经纬度，例如：
         * data = [{"value":"01","text":"成功率：96%，通话率：98%，拥塞率：0.00%","data":["x":"112" , "y":"115", "angle":null]}]
         */
        creatPointLayer:function(data){
            var me = this;
            //调用flex中的添加小区方法
            me.options.cellData = $.objClone(data);               
            if(me.mapObj){
                me.mapObj.addCell(data,"noTest");
            }
        },
        /**
         * @public
         * @description 移除点图层
         *
         */
        removePointLayer:function(){
            var me = this;
            //调用flex中的移除小区
            if(me.mapObj){
                me.mapObj.removePointLayer();
            }
        },

        /**
         * @public
         * @description 业务地图区域定位
         * @param {String/Number} layerId 当前图层的recid
         */
        setPosition: function(layerId){
            var me = this;
            if($.isNull(layerId)){
                return;
            }
            if(me.mapObj){
                me.mapObj.setPosition(layerId);
            }
        },
        /**
         * @private
         * @description 组件渲染, 子类继承实现
         * @param {String} id 宿主ID
         */
        _render: function(id) {
            var me = this;
            if (!me._super(id)) {
                return false;
            }
            me.mapContainerEl.appendTo(me.renderEl);
            me.rendered = true;
            me.options.renderTo = id;
            me._createMapWidget();
            return true;
        },
        /**
         * @private
         * @description 创建map组件总入口
         */
        _createSweetWidget: function() {
            if (this.renderEl) {
                return;
            }

            var me = this,
                    opt = me.options;
            me.mapContainerEl = $("<div>").attr("id", opt.id)
                    .width(opt.width)
                    .height(opt.height)
                    .addClass(opt.widgetClass);
            me.mapId = opt.id + "-map";
            me.mapEl = $("<div>").attr("id", me.mapId)
                    .width(opt.width)
                    .height(opt.height)
                    .appendTo(me.mapContainerEl);
        },
        
        /**
         * @private
         * @description 创建map组件
         */
        _createMapWidget: function() {
            var me = this,
                    opt = me.options,
                    w = opt.width,
                    h = opt.height;
            //此处嵌入地图flex工程
            me.mapObj = new Supermapflex(me, me.mapId, me.mapId, w, h, opt.cellData);
            if(me.mapObj && me.options.layerId){
                me.mapObj.setLayerId(me.options.layerId);
				if(me.options.layerDefaultColor){
					me.mapObj.setLayerDefaultCorlor(me.options.layerDefaultColor);
				}
                me.mapObj.setLayerData(me.options.layerData);
            }
        },
        /**
         * @private
         * @description 销毁MAP组件
         */
        _destroyWidget: function() {
        },
        /**
         * @private
         * @description 组件布局刷新基本处理
         */
        _doLayout:function(){
            var me = this,
                    w = me.mapContainerEl.width(),
                    h = me.mapContainerEl.height();
                
            me._setWH(w, h);
            //给地图添加border，如果在setWidth,height之前加，计算出来的宽度和高度会小于实际的宽度和高度
        },
        /**
         * @private
         * @description 获取组件宽度
         */
        _getWidth:function(){
            return this.mapContainerEl.externalWidth();
        },
        /**
         * @private
         * @description 获取组件高度
         */
        _getHeight:function(){
            return this.mapContainerEl.externalHeight();
        }
    });

    /**
     * @description 地图
     * @class
     * @extends jquery.sweet.widget
     * <pre>
     * jquery.ui.core.js
     * jquery.ui.widget.js
     * jquery.sweet.widget.js
     * </pre>
     * @example
     * 创建地图：
     * var sweetmap = new Sweet.Map({
     *      width : 600,
     *      height : 400,
     *      renderTo : "map-div"
     * });
     */
    Sweet.Map = $.sweet.widgetMap;
}(jQuery));
