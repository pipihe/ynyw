<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>自有业务监控</title>
        <link rel="stylesheet" type="text/css" href="pages/css/common.css"/>
        <link rel="stylesheet" type="text/css" href="pages/css/monitor.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/jquery-2.2.4.min.js"></script> 
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/sweet/sweet-ui-all.js" ></script>
        <link rel="stylesheet" type="text/css" href="pages/css/sweetStyle.css"/>
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/echarts3.js"></script>     
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/monitor.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/pages/js/common.js"></script>
    </head>
    <body>
        <div class="wrapper">
          <div class="hearder"><!--头部导航start-->
            <div class="hearder_com"><!--头部内容start-->
                <div class="hearder_left"><!--头部搜索框start-->
                    <div class="drop3">
                        <span class="drop_word">区域类型：</span>
                        <span class="drop_kuang"><span id="areaType"></span></span>
                        <span class="drop_kuang"><span id="area"></span></span>                        
                    </div>
                  <div class="drop">
                        <span class="drop_word2">核心网：</span>
                        <span class="drop_kuang2"><span id="coreNetwork"></span></span>
                  </div>
                  <div class="drop">
                        <span class="drop_word">应用大类：</span>
                        <span class="drop_kuang2"><span id="bigClass"></span></span>
                  </div>
                  <div class="drop_btn">
                        <span id="Inquire" style="cursor: pointer">查询</span>                     
                  </div>
                </div><!--头部搜索框end-->
               <div class="hearder_right"><!--头部右侧时间start-->
                        <span class="timetext">当前统计周期：</span>
                        <span class="time">15:15-15:30</span>
               </div><!--头部右侧时间end-->
            </div><!--头部内容end-->
          </div> <!--头部导航end-->
          <div class="main"><!--主体内容start-->
                <div class="main_left" id="bookmarkName"><!--左侧tab切换内容区域start-->
                     <ul>
                        <li><span class="main_left_active">即时通信</span></li>
                        <li><span class="main_left_none">视频</span></li>
                        <li><span class="main_left_none">音乐</span></li>
                        <li><span class="main_left_none">游戏</span></li>
                        <li><span class="main_left_none">应用商店</span></li>
                        <li><span class="main_left_none">阅读</span></li>
                        <li><span class="main_left_none">动漫</span></li>
                     </ul>
                </div><!--左侧tab切换内容区域end-->
                <div class="main_right"><!--右侧表格区域start-->
                    <!--在此div中放置表格-->
                     <div class="charts">
                        <div id="monitorTable"></div>
                         
                     </div>
                </div><!--右侧表格区域end-->
          </div><!--主体内容end-->
        </div>
    </body>
</html>
       