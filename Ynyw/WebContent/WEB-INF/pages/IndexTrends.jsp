<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>自有业务指标趋势</title>
        <link rel="stylesheet" type="text/css" href="pages/css/common.css"/>
        <link rel="stylesheet" type="text/css" href="pages/css/IndexTrends.css"/>
    </head>
    <body>
        <div class="wrapper">
          <div class="hearder"><!--头部导航start-->
            <div class="hearder_com"><!--头部内容start-->
                <div class="hearder_left"><!--单选区域start-->
                    <ul>
                        <li><span></span>15min</li>
                        <li><span></span>小时</li>
                        <li><span></span>天</li>
                    </ul>
                </div><!--单选区域end-->
                <div class="hearder_right"><!--头部搜索框start-->
                    <div class="drop3">
                        <span class="drop_word">区域类型：</span>
                        <span class="drop_kuang"></span>
                        <span class="drop_kuang"></span>                        
                    </div>
                  <div class="drop">
                        <span class="drop_word2">核心网：</span>
                        <span class="drop_kuang2"></span>
                  </div>
                  <div class="drop">
                        <span class="drop_word">应用小类：</span>
                        <span class="drop_kuang2"></span>
                  </div>
                  <div class="drop">
                        <span class="drop_word">应用大类：</span>
                        <span class="drop_kuang2"></span>
                  </div>
                  <div class="drop_btn">
                        <span>查询</span>                     
                  </div>
                </div><!--头部搜索框end-->
            </div><!--头部内容end-->
          </div> <!--头部导航end-->
          <div class="main"><!--主体内容start-->
              <div class="main_chart">
                 <div class="chart_tit">当前周期用户数趋势</div>
                 <div class="chart_content"></div><!--在此div中放置组件-->
              </div><!--放置表格位置-->
          </div><!--主体内容end-->
        </div>
    </body>
</html>
       