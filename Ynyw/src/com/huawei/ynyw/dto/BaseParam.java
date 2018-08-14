package com.huawei.ynyw.dto;

public class BaseParam
{
   /***
    * 区域类型
    */
   private String areaType;
   /***
    * 具体的市
    */
   private String areaValue;
   /**
    * 核心网
    */
   private String netWork;
   /**
    * 应用大类
    */
   private String applicationBigClass; 
   /**
    * 应用小类
    */
   private String applicationSmallClass;
   /**
    * 接入网类型(网络制式)
    */
   private String accessType;
   /**
    * 页签名称
    */
   private String tabName;
   /**
    * 指标名字
    */
   private String kqi;
   
   public String getAreaType()
   {
       return areaType;
   }
   public void setAreaType(String areaType)
   {
       this.areaType = areaType;
   }
   public String getAreaValue()
   {
       return areaValue;
   }
   public void setAreaValue(String areaValue)
   {
       this.areaValue = areaValue;
   }
   public String getNetWork()
   {
       return netWork;
   }
   public void setNetWork(String netWork)
   {
       this.netWork = netWork;
   }
   public String getApplicationBigClass()
   {
       return applicationBigClass;
   }
   public void setApplicationBigClass(String applicationBigClass)
   {
       this.applicationBigClass = applicationBigClass;
   }
   public String getApplicationSmallClass()
   {
       return applicationSmallClass;
   }
   public void setApplicationSmallClass(String applicationSmallClass)
   {
       this.applicationSmallClass = applicationSmallClass;
   }
   public String getAccessType()
   {
       return accessType;
   }
   public void setAccessType(String accessType)
   {
       this.accessType = accessType;
   }
   public String getTabName()
   {
       return tabName;
   }
   public void setTabName(String tabName)
   {
       this.tabName = tabName;
   }
   public String getKqi()
   {
       return kqi;
   }
   public void setKqi(String kqi)
   {
       this.kqi = kqi;
   }
   
   @Override
   public String toString()
   {
       return "BaseParam [areaType=" + areaType + ", areaValue=" + areaValue + ", netWork=" + netWork
               + ", applicationBigClass=" + applicationBigClass + ", applicationSmallClass=" + applicationSmallClass
               + ", accessType=" + accessType + ", tabName=" + tabName + ", kqi=" + kqi + "]";
   }
    
}
