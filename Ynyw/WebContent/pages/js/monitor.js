$(function(){
	//页面过滤条件的id名
	var filterVar={
		areaType:"areaType",
		area:"area",
		coreNetwork:"coreNetwork",
		bigClass:"bigClass"
	};
	var sweetVar={};//保存sweet 过滤条件的 样式
	//区域选择
	sweetVar.areaType=new Sweet.form.ComboBox_v1({ 
		width: "100%",
		height: "100%",
		 data: [
			 {text: "省", value: "省"},
			 {text: "市", value: "市"},
			
		 ],
		 label: false,
		 labelText: "多选、可编辑、可操作已选择",
		 labelWidth: 180,
		 multi: false,
		 all: false,
		 tip: true,
		 emptyText: "ALL",
		 renderTo : filterVar.areaType  
	});
	//区域
	sweetVar.area=new Sweet.form.ComboBox_v1({ 
		width: "100%",
		height: "100%",
		 data: [
			 {text: "省", value: "省"},
			 {text: "市", value: "市"},
			
		 ],
		 label: false,
		 labelText: "多选、可编辑、可操作已选择",
		 labelWidth: 180,
		 multi: false,
		 all: false,
		 tip: true,
		 emptyText: "ALL",
		 renderTo : filterVar.area  
	});
	//核心网选择
	sweetVar.coreNetwork=new Sweet.form.ComboBox_v1({ 
		width: "100%",
		height: "100%",
		 data: [
			 {text: "省", value: "省"},
			 {text: "市", value: "市"},
			
		 ],
		 label: false,
		 labelText: "多选、可编辑、可操作已选择",
		 labelWidth: 180,
		 multi: false,
		 all: false,
		 tip: true,
		 emptyText: "ALL",
		 renderTo : filterVar.coreNetwork  
	});
	//即时通信，视频，音乐，游戏，应用商店，阅读，动漫
	//应用大类
	var bigClassData=[
		 {text: "即时通信", value: "即时通信"},
		 {text: "视频", value: "视频"},
		 {text: "音乐", value: "音乐"},
		 {text: "游戏", value: "游戏"},
		 {text: "应用商店", value:"应用商店"},
		 {text: "阅读", value: "阅读"},
		 {text: "动漫", value: "动漫"},
	 ]
	sweetVar.bigClass=new Sweet.form.ComboBox_v1({ 
		width: "100%",
		height: "100%",
		value:bigClassData[0],
		 data: bigClassData,
		 label: false,
		 labelText: "多选、可编辑、可操作已选择",
		 labelWidth: 180,
		 multi:true,
		 all: false,
		 tip: true,
		 emptyText: "ALL",
		 renderTo : filterVar.bigClass  
	});
	inquire(sweetVar);//页面的查询按钮的功能
	
	
})
/*
 	@name: inquire
 	@class：页面的查询按钮的功能
 	@param: sweetVar 页面的过滤条件的组件
 	@requires:
 	@return: undefined
 */
function inquire(sweetVar){
	$("#Inquire").on("click",function(){
		console.log(11);
		bookmark(sweetVar);//右侧页签切换
	})
}
/*
	@name: bookmark
	@class：右侧页签切换
	@param: sweetVar 页面的过滤条件的组件
	@requires:
	@return: undefined
*/
function bookmark(sweetVar){
	console.log(sweetVar.bigClass.getValue())
	var str="";
	for(var i=0;i<sweetVar.bigClass.getValue().length;i++){
		str+='<li><span class="main_left_active">'+sweetVar.bigClass.getValue()[i]["text"]+'</span></li>';
	}
	$("#bookmarkName ul").html(str);
	$("#bookmarkName ul li span") .on("click",function(){
		$(this).removeClass("main_left_none").addClass("main_left_active")
				.parent('li').siblings("li").children("span")
				.removeClass("main_left_active").addClass("main_left_none");
		
	})
} 






















