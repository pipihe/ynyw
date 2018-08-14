package com.huawei.ynyw.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.huawei.smartcare.dac.sdk.bean.ColumnType;

public class GetModelNameByTabName
{
    
    /***
     * 根据叶签的名称获取指标名称
     * 
     * @param tabName
     *            叶签的名称
     * @return 指标名称
     */
    public static Map<String, Object> getModelNameByTabName(String tabName)
    {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        if(tabName.contains("(")){
        	tabName = tabName.substring(0,tabName.indexOf("(")) ;
    	}
        switch (tabName)
        {
            case "视频初始播放成功率":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.Z_TS_START_SUCC_RATEE);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "视频初始播放请求次数":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.SYS_SQI_STREAMING_R_GRP_PLAY_SR_TOTAL);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "GET响应成功率":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_GET_RESP_SUCCS_RATEE);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "初始缓冲成功率":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_INI_BUFF_SUCC_RATEE);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "视频初始缓冲时延":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.C_TS_INTBUFFER_SUC_DELAYY);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "DNS响应时长":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.Z_S_DNS_QUE_DELAYY);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "TCP建链时长":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_TCP_CONN_DELAYY);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "GET响应时长":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.C_TS_GET_SUC_DELAYY);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "初始缓冲时长":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.C_TS_INTBUFFER_AVG_DELAY);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "视频播放停顿频次":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.Z_TS_STALL_TIMEE);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "服务器侧上行TCP丢包率":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.C_TS_SERVER_UL_LOST_PKTT);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "服务器侧下行TCP丢包率":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.C_TS_SERVER_DW_LOST_PKTT);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "服务器侧RTT":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_SERVER_RTTT);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "终端侧RTT":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_CLIENT_RTTT);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "上行TCP重传率":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_UL_TCP_RETRANS_RATEE);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "下行TCP重传率":
                dataMap.put("tableName", Constant.SYS_SDR_FOR_VIDEO_ANA_ALL);
                dataMap.put("name", Constant.Z_TS_DL_TCP_RETRANS_RATEE);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            case "视频下载速率":
                dataMap.put("tableName", Constant.SYS_VIDEO_KQI_ANALYSIS);
                dataMap.put("name", Constant.Z_TS_DW_THROUGHPUTT);
                dataMap.put("type", ColumnType.MODEL);
                return dataMap;
            default:
                return null;
        }
        
    }
    
    /***
     * 根据叶签的名称获取维度名称
     * 
     * @param tabName
     *            叶签的名称
     * @return 指标名称
     */
    public static Map<String, Object> getDimensionByTabName(String tabName)
    {
        Map<String, Object> dataMap = new HashMap<String, Object>();
        
        switch (tabName)
        {
            case "小区":
                dataMap.put("name", Constant.ECGI);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "SP":
                dataMap.put("name", Constant.SUB_PROT);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "IP":
                dataMap.put("name", Constant.SERVER_IP);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "终端":
                dataMap.put("name", Constant.TERMINAL_TYPE);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "流向":
                dataMap.put("name", Constant.TRAFFIC_DIRECTION);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "区域":
                dataMap.put("name", Constant.LAYER3);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "PGW":
                dataMap.put("name", Constant.PGW);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            case "SGW":
                dataMap.put("name", Constant.SGW);
                dataMap.put("type", ColumnType.DIMENSION);
                return dataMap;
            default:
                return null;
        }
        
    }
    
    /***
     * 根据叶签的名称获取指标名称 用于柱状图
     * 
     * @param tabName
     *            叶签的名称
     * @return 指标名称
     */
    public static Map<String,Object> getModelNameByTabNameForBar(String tabName)
    {
        Map<String,Object> data = new HashMap<>();
        List<String> modelList = new ArrayList<>();
        if(tabName.contains("(")){
        	tabName = tabName.substring(0,tabName.indexOf("(")) ;
    	}
        switch (tabName)
        {
            // SYS_SDR_FOR_VIDEO_ANA_ALL
            // DNS响应时长 不下钻，有频谱SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_1_ID
           case "视频初始缓冲时延":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STARTDELAY_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-500,500-800,800-1000,1000-1200,1200-2200,2200-2700,2700以上");
                return data;
            case "TCP建链时长":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_TCP_RTT_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-20,20-40,40-60,60-180,180-230,230-280,280以上");
                return data;
            case "GET响应时长":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_GET_DELAY_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-100,100-200,200-400,400-1000,1000-1500,1500-2000,2000以上");
                return data;
            case "初始缓冲时长":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_INTDELAY_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-200,200-400,400-600,600-800,800-1600,1600-1800,1800以上");
                return data;
            case "视频播放停顿频次":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_STALLPERM_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-0.05%,0.05%-0.1%,0.1%-0.5%,0.5%-1%,1%-2%,2%-3%,3%以上");
                return data;
            case "服务器侧RTT":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_UL_RTT_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-5,5-10,10-20,20-50,50-60,60-80,80以上");
                return data;
            case "终端侧RTT":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_AVG_DL_RTT_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-40,40-80,80-100,100-180,180-220,220-260,260以上");

                return data;
            case "视频下载速率":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-500,500-800,800-1000,1000-1500,1500-2000,2000-2500,2500以上");
                return data;
            case "DNS响应时长":
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_1_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_2_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_3_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_4_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_5_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_6_ID");
                modelList.add("SYS_SQI_STREAMING_R_GRP_AH_VIDEO_DL_SPEED_7_ID");
                data.put("model", modelList);
                data.put("xLine", "0-500,500-800,800-1000,1000-1500,1500-2000,2000-2500,2500以上");
                return data;
            default:
                return null;
        }
        
    }
    
}
