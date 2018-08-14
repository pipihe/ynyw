/*@name ：toSpTable
	@class ：index 页面表格
	@constructor 
	@param ：
			id:绑定的元素		
	@requires:
	@example : 示例代码
			*/
var tableFlag = false ;//清空表格时使用
function  sweetTable(id,url,xmlData){
	
		var columns=[{
			header: "城市名称",
			name: "CITY_NAME",
			height: 35,
			width:	210,
			dataType: "string",
			align: "center",
			tip: true,
			/*tooltip:"日期",*/
			sortable: false,
			filter: false
		}, {
			header: "小区名称",
			name: "CGISAI_NAME",
			height: 35,
		 	//width : "auto",
			width:210,
			dataType: "string",
			align: "center",
			sortable: false,
			filter: false
		}, {
			header: "页面下载速率",
			name: "TS_KS_PAGE_DW_THROUGHPUT",
			height: 35,
			width: 210,
			dataType: "string",
			align: "center",
			sortable: false,
			filter: false
		}, {
			header: "视频下载速率",
			name: "TS_KS_VIDEO_DW_RATE",
			height: 35,
			width: 210,
			dataType: "number",
			align: "center",
			sortable: false,
			filter: false
		}, {
			header: "上行流量",
			name: "TS_KS_L4_UL_THROUGHPUT_TOTAL",
			height: 35,
			width: 210,
			dataType: "number",
			align: "center",
			sortable: false,
			filter: false
		}, {
			header: "下行流量",
			name: "TS_KS_L4_DW_THROUGHPUT_TOTAL",
			height: 35,
			width: 210,
			dataType: "number",
			align: "center",
			sortable: false,
			filter: false
		}];
	
	Sweet.ToolTip.enable();
	var reader = new Sweet.Reader.JsonReader();
	var store = new Sweet.Store.GridStore({
		cache: true,
		baseParams: xmlData,
		reader: reader,
		loadMask: true,
		url: url
	});
	var sweetGrid = new Sweet.grid.Grid({
		width: '100%',
		height: "100%",
		store: store,
		data: {
			columns:columns, 
			resizable: false,
			selectColumn: false,
			//数据 开始
			data: [
				
			],
			/*
			 * 分页页面
			 * */
			page: { //分页配置信息
				simple: true, //是否使用简单分页栏，默认false
				currentPage: 1, //设定当前页，重新给表格设置第一页值时使用
				size: 10, //页大小
				total: 0, //总条数
				//select:[15,20,30]               //可选择页大小的值
			},

			multiColumnSort: false,
			singleSelect: true, //行点击时必须设置为true
			clearFilters: false,

		},
	});

	//表格消失问题，销毁的方法
	/*if(pageTab){
		
	}else{
		pageTab.destroy();
	}*/
	if(!tableFlag){
   		tableFlag=true;
   	}else{
   		pageTab.destroy();
   	}
	   
	 pageTab = new Sweet.panel.VPanel({
		width: '100%',
		height: "100%",
		header: false,
		items: [sweetGrid],
		renderTo: id
	});
	 store.load();
	return [store,sweetGrid];
	//重置请求数据
	/*storeLeft.url = "";                                 
    storeLeft.baseParams=arrData;
    storeLeft.load(arrData);*/
}