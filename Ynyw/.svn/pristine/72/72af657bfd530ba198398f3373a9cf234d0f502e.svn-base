/***
 * Eclipse Class Decompiler plugin, copyright (c) 2016 Chen Chao
 * (cnfree2000@hotmail.com)
 ***/
package com.huawei.ynyw.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.apache.commons.lang.time.DateFormatUtils;

public class DateUtils extends org.apache.commons.lang.time.DateUtils
{
    private static String[] parsePatterns =
    {"yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", "yyyy-MM", "yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss",
            "yyyy/MM/dd HH:mm", "yyyy/MM", "yyyy.MM.dd", "yyyy.MM.dd HH:mm:ss", "yyyy.MM.dd HH:mm", "yyyy.MM",
            "HH:mm yyyy-MM-dd"};
    
    private static DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
    // private static SimpleDateFormat fmtMin = new SimpleDateFormat("yyyy-MM-dd
    // HH:mm");
    
    public static String getDate()
    {
        return getDate("yyyy-MM-dd");
    }
    
    public synchronized static long getUtcData(String time)
    {
        long utc = 0L;
        try
        {
            System.out.println("getUtcData = " + time);
            if (time == null || "".equals(time))
            {
                System.out.println(time);
            }
            else
            {
                utc = format.parse(time + ":00").getTime();
                utc /= 1000L;
            }
        }
        catch (ParseException e)
        {
            System.out.println("***********" + time + "*********************");
            e.printStackTrace();
        }
        return utc;
    }
    
    public static String getDate(String pattern)
    {
        return DateFormatUtils.format(new Date(), pattern);
    }
    
    public static String formatDate(Date date, Object[] pattern)
    {
        String formatDate = null;
        if ((pattern != null) && (pattern.length > 0))
        {
            formatDate = DateFormatUtils.format(date, pattern[0].toString());
        }
        else
        {
            formatDate = DateFormatUtils.format(date, "yyyy-MM-dd");
        }
        return formatDate;
    }
    
    public static String formatDateTime(Date date)
    {
        return formatDate(date, new Object[]
        {"yyyy-MM-dd HH:mm:ss"});
    }
    
    public static String getTime()
    {
        return formatDate(new Date(), new Object[]
        {"HH:mm:ss"});
    }
    
    public static String getDateTime()
    {
        return formatDate(new Date(), new Object[]
        {"yyyy-MM-dd HH:mm:ss"});
    }
    
    public static String getYear()
    {
        return formatDate(new Date(), new Object[]
        {"yyyy"});
    }
    
    public static String getMonth()
    {
        return formatDate(new Date(), new Object[]
        {"MM"});
    }
    
    public static String getDay()
    {
        return formatDate(new Date(), new Object[]
        {"dd"});
    }
    
    public static String getWeek()
    {
        return formatDate(new Date(), new Object[]
        {"E"});
    }
    
    public static Date parseDate(Object str)
    {
        if (str == null)
        {
            return null;
        }
        try
        {
            return parseDate(str.toString(), parsePatterns);
        }
        catch (ParseException e)
        {
        }
        return null;
    }
    
    public static Calendar getStatCalendar(int minute)
    {
        Calendar calendar = Calendar.getInstance();
        int times = calendar.get(12) / minute;
        int min = minute * times;
        
        calendar.set(calendar.get(1), calendar.get(2), calendar.get(5), calendar.get(11), min, 0);
        
        return calendar;
    }
    
    public static Date[] getBeforeMinute(Calendar calendar, int times, int minute)
    {
        Date[] dateTimes = new Date[times];
        for (int i = Constant.ZERO.intValue(); i < times; ++i)
        {
            calendar.add(12, -minute * 2);
            dateTimes[(times - 1 - i)] = calendar.getTime();
        }
        return dateTimes;
    }
    
    public static String[] getXaxis(int sum)
    {
        String[] str = new String[sum];
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date[] dateTimes = getBeforeMinute(getStatCalendar(Constant.GRANULARITY.intValue()), sum,
                Constant.GRANULARITY.intValue());
        for (int i = Constant.ZERO.intValue(); i < dateTimes.length; ++i)
        {
            str[i] = sdf.format(dateTimes[i]);
        }
        return str;
    }
    
    public static String getLastTime()
    {
        String str = null;
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm yyyy-MM-dd");
        Date[] dateTimes = getBeforeMinute(getStatCalendar(Constant.GRANULARITY.intValue()), Constant.ONE.intValue(),
                Constant.GRANULARITY.intValue());
        
        str = sdf.format(dateTimes[Constant.ZERO.intValue()]);
        return str;
    }
    
    public static String getLastTimeSeconds()
    {
        Date date = parseDate(getLastTime());
        // update by ypx 结束时间推后-->当前时间向前的第一个整点时间的15
        Long time = Long.parseLong(String.valueOf(date.getTime() / Constant.ONE_THOUSAND.intValue()));
        return String.valueOf(time);
    }
    
    public static String getLastTimeSecondsBefore(int sum)
    {
        Date date = parseDate(getLastTime());
        return String.valueOf(date.getTime() / Constant.ONE_THOUSAND.intValue() - (Constant.MINUTE.intValue() * (sum)));
    }
    
    public static String getBeforeOneDayTimes(int sum)
    {
        Date beginDate = parseDate(getLastTime());
        Calendar date = Calendar.getInstance();
        date.setTime(beginDate);
        date.set(5, date.get(5) - 1);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm yyyy-MM-dd");
        Date endDate = parseDate(sdf.format(date.getTime()));
        return String
                .valueOf(endDate.getTime() / Constant.ONE_THOUSAND.intValue() - (Constant.MINUTE.intValue() * sum));
    }
    
    public static String getTodayZoneTimes(int sum)
    {
        String zone = getDate("yyyy-MM-dd") + " 00:00:00";
        Date date = parseDate(zone);
        return String.valueOf(date.getTime() / Constant.ONE_THOUSAND.intValue() - (Constant.MINUTE.intValue() * sum));
    }
    
    public static String getTimeSeconds(Date date)
    {
        String str = getDate("yyyy-MM-dd HH:mm");
        return String.valueOf(parseDate(str + ":00").getTime() / Constant.ONE_THOUSAND.intValue());
    }
    
    public static String getDays(int sum)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd");
        int ret = 0;
        try
        {
            long to = new Date().getTime();
            long from = df.parse("1970.1.1").getTime();
            ret = (int) ((to - from) / Constant.ONE_THOUSAND.intValue() * Constant.SIXTY.intValue()
                    * Constant.SIXTY.intValue() * Constant.TWENTY_FOUR.intValue());
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return String.valueOf(ret - sum);
    }
    
    public static String getUTCTimeStr()
    {
        StringBuffer utcTimeBuffer = new StringBuffer();
        
        Calendar cal = Calendar.getInstance();
        
        int zoneOffset = cal.get(15);
        
        int dstOffset = cal.get(16);
        
        cal.add(14, -(zoneOffset + dstOffset));
        int year = cal.get(1);
        int month = cal.get(2) + 1;
        int day = cal.get(5);
        int hour = cal.get(11);
        int minute = cal.get(12);
        utcTimeBuffer.append(year).append("-").append(month).append("-").append(day);
        utcTimeBuffer.append(" ").append(hour).append(":").append(minute);
        try
        {
            format.parse(utcTimeBuffer.toString());
            return utcTimeBuffer.toString();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return null;
    }
    
    public static String getLocalTimeFromUTC(String utcTime)
    {
        Date utcDate = null;
        String localTimeStr = null;
        try
        {
            utcDate = format.parse(utcTime);
            format.setTimeZone(TimeZone.getTimeZone("GMT-8"));
            localTimeStr = format.format(utcDate);
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return localTimeStr;
    }
    
    public static String getLocTimeByUTC(String utcDate)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Long utcTime = Long.valueOf(Long.parseLong(utcDate) * Constant.ONE_THOUSAND.intValue());
        Date d = new Date(utcTime.longValue());
        String time = sdf.format(d);
        return time;
    }
    
    public static String getStr(Long lo)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        Long utcTime = Long.valueOf(lo.longValue() * Constant.ONE_THOUSAND.intValue());
        Date d = new Date(utcTime.longValue());
        String time = sdf.format(d);
        return time;
    }
    
    public static String utcPraseTime(String time)
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String date = sdf.format(new Date(Long.parseLong(time) * 1000L));
        return date;
    }
    
    /***
     * 获取当前时间的0点0分 UTC时间
     * 
     * @return
     */
    public static String getTimeZero()
    {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, 0);
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return String.valueOf(todayStart.getTime().getTime() / 1000);
    }
    
    /***
     * 当前时间向前一个整点的小时UTC时间
     * @return
     */
    public static String getBefoOneHourDate()
    {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, todayStart.get(Calendar.HOUR_OF_DAY));
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return String.valueOf(todayStart.getTime().getTime() / 1000);
    }
    
    
    /***
     * 当前时间向前n个整点的小时UTC时间 
     * @return
     */
    public static String getBeforeNHourDate(int n)
    {
        Calendar todayStart = Calendar.getInstance();
        todayStart.set(Calendar.HOUR_OF_DAY, todayStart.get(Calendar.HOUR_OF_DAY));
        todayStart.set(Calendar.MINUTE, 0);
        todayStart.set(Calendar.SECOND, 0);
        todayStart.set(Calendar.MILLISECOND, 0);
        return String.valueOf(todayStart.getTime().getTime() / 1000-n*3600);
    }
    
}
