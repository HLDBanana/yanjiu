package com.hanergy.out.utils;


import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author: HANLIDONG
 * @date: 2018/6/19 9:21
 * @description: 日期工具类
 */
public class DateUtils extends org.apache.commons.lang3.time.DateUtils {

    private static Logger log = LoggerFactory.getLogger(DateUtils.class);

    public static final String DATE_SHORT_FORMAT = "yyyyMMdd";
    public static final String DATE_CH_FORMAT = "yyyy年MM月dd日";

    public static final String DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
    public static final String DATE_FORMAT = "yyyy-MM-dd";
    public static final String DATE_MONTH_FORMAT = "yyyy-MM";
    public static final String TIME_FORMAT = "HH:mm:ss";

    public static final String DAYTIME_START = "00:00:00";
    public static final String DAYTIME_END = "23:59:59";

    private static final String[] FORMATS = {"yyyy-MM-dd", "yyyy-MM-dd HH:mm",
            "yyyy-MM-dd HH:mm:ss", "HH:mm", "HH:mm:ss", "yyyy-MM",
            "yyyy-MM-dd HH:mm:ss.S"};

    private DateUtils() {

    }

    /**
     * 字符串转换成日期 主要解决json传入日期问题
     */
    public static Date convert(String str) {
        if (str != null && str.length() > 0) {
            if (str.length() > 10 && str.charAt(10) == 'T') {
                str = str.replace('T', ' ');// 去掉json-lib加的T字母
            }
            for (String format : FORMATS) {
                if (format.length() == str.length()) {
                    try {
                        Date date = new SimpleDateFormat(format).parse(str);
                        return date;
                    } catch (ParseException e) {
                        if (log.isWarnEnabled()) {
                            log.warn(e.getMessage());
                        }
                    }
                }
            }
        }
        return null;
    }

    /**
     * 字符串、日期格式 转换日期
     * @param format 例如: "yyyy-MM-dd HH:mm:ss"
     * @param str 例如: "2012-12-03 23:21:24"
     */
    public static Date convert(String str, String format) {
        if (!StringUtils.isEmpty(str)) {
            try {
                Date date = new SimpleDateFormat(format).parse(str);
                return date;
            } catch (ParseException e) {
                if (log.isWarnEnabled()) {
                    log.warn(e.getMessage());
                }
            }
        }
        return null;
    }

    /**
     * 将日期转换成format字符串
     * @param date 例如: Sun Jun 10 09:18:00 CST 2018
     * @param dateFormat 例如: "yyyy-MM-dd HH:mm:ss"
     */
    public static String convert(Date date, String dateFormat) {
        if (date == null) {
            return null;
        }
        if (null == dateFormat) {
            dateFormat = DATE_TIME_FORMAT;
        }
        return new SimpleDateFormat(dateFormat).format(date);
    }

    /**
     * 根据传入的日期  转换成这样格式的字符串 如：“yyyy-MM-dd HH:mm:ss”
     */
    public static String convert(Date date) {
        return convert(date, DATE_TIME_FORMAT);
    }

    /**
     * 时间拼接 将日期和实现拼接 ymd 如2012-05-15 hm 如0812 最终 2012-05-15 08:12:00
     */
    public static Date concat(String ymd, String hm) {
        if (!StringUtils.isBlank(ymd) && !StringUtils.isBlank(hm)) {
            try {
                String dateString = ymd.concat(" ").concat(hm.substring(0, 2)).concat(":").concat(hm.substring(2, 4)).concat(":00");
                Date date = DateUtils.convert(dateString, DateUtils.DATE_TIME_FORMAT);
                return date;
            } catch (NullPointerException e) {
                if (log.isWarnEnabled()) {
                    log.warn(e.getMessage());
                }
            }
        }
        return null;
    }

    /**
     * 根据传入的日期返回年月日的6位字符串，例：20101203
     */
    public static String getDay(Date date) {
        return convert(date, DATE_SHORT_FORMAT);
    }

    /**
     * 根据传入的日期返回中文年月日字符串，例：2010年12月03日
     */
    public static String getChDate(Date date) {
        return convert(date, DATE_CH_FORMAT);
    }

    /**
     * 返回该天从00:00:00开始的日期
     */
    public static Date getStartDatetime(Date date) {
        String thisDate = convert(date, DATE_FORMAT);
        return convert(thisDate + " " + DAYTIME_START);
    }

    /**
     * 返回该天到23:59:59结束的日期
     */
    public static Date getEndDatetime(Date date) {
        String thisDate = convert(date, DATE_FORMAT);
        return convert(thisDate + " " + DAYTIME_END);
    }
    /**
     * 将短时间格式时间转换为字符串 yyyy-MM-dd
     *
     * @param dateDate
     * @return
     */
     public static String dateToStr(Date dateDate) {
         SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
         String dateString = formatter.format(dateDate);
         return dateString;
     }

    /**
     * 将短时间格式时间转换为字符串 yyyy-MM-dd
     *
     * @param dateDate
     * @return
     */
    public static String dateToStr(Date dateDate,String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        String dateString = formatter.format(dateDate);
        return dateString;
    }

    /**
     * 返回n天到23:59:59结束的日期
     */
    public static Date getEndDatetime(Date date, Integer diffDays) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);
        String thisDate = dateFormat.format(date.getTime() + MILLIS_PER_DAY * diffDays);
        return convert(thisDate + " " + DAYTIME_END);
    }


    /**
     * 将传入的时间格式的字符串转成时间对象      例如：传入2012-12-03 23:21:24
     */
    public static Date strToDate(String dateStr) {
        SimpleDateFormat formatDate = new SimpleDateFormat(DATE_TIME_FORMAT);
        Date date = null;
        try {
            date = formatDate.parse(dateStr);
        } catch (Exception e) {

        }
        return date;
    }


    /**
     * 将传入的时间格式的字符串转成时间对象      例如：传入2012-12-03 23:21:24
     */
    public static Date strToDate(String dateStr,String format) {
        SimpleDateFormat formatDate = new SimpleDateFormat(format);
        Date date = null;
        try {
            date = formatDate.parse(dateStr);
        } catch (Exception e) {

        }
        return date;
    }

    /**
     * 返回该日期的最后一刻，精确到纳秒
     */
    public static Timestamp getLastEndDatetime(Date endTime) {
        Timestamp ts = new Timestamp(endTime.getTime());
        ts.setNanos(999999999);
        return ts;
    }

    /**
     * 返回该日期加1秒
     */
    public static Timestamp getEndTimeAdd(Date endTime) {
        Timestamp ts = new Timestamp(endTime.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ts);
        calendar.add(Calendar.MILLISECOND, 1000);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    /**
     * 返回该日期加 millisecond 毫秒，正数为加，负数为减
     */
    public static Timestamp getDateAdd(Date date, int millisecond) {
        Timestamp ts = new Timestamp(date.getTime());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(ts);
        calendar.add(Calendar.MILLISECOND, millisecond);
        calendar.set(Calendar.MILLISECOND, 0);
        return new Timestamp(calendar.getTimeInMillis());
    }

    /**
     * 相对当前日期，增加或减少天数
     */
    public static String addDay(Date date, int day) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(new Date(date.getTime() + MILLIS_PER_DAY * day));
    }

    /**
     * 相对当前日期，增加或减少天数
     */
    public static String addDay(String time, int day) {
        Date date = strToDate(time,DATE_FORMAT);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DATE_FORMAT);
        return simpleDateFormat.format(new Date(date.getTime() + MILLIS_PER_DAY * day));
    }

    /**
     *  当前日期添加month月之后的日期
     * @param time      日期
     * @param month     增加的月份
     * @return 2019-11-01 转换成2019-12-01
     */
    public static String addMonth(String time,int month){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date sDate = sdf.parse(time);
            System.out.println("String类型转Date类型 "+sDate);    //要实现日期+1 需要String转成Date类型

            Format f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println("Date结束日期:" + f.format(sDate));

            Calendar c = Calendar.getInstance();
            c.setTime(sDate);
            c.add(Calendar.MONTH, 1);            //利用Calendar 实现 Date日期+1天

            sDate = c.getTime();
            System.out.println("Date结束日期+1 " +f.format(sDate)); //打印Date日期,显示成功+1天

            SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
            time = sdf1.format(sDate);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return  time;
    }

    /**
     * 相对当前日期，增加或减少天数
     */
    public static Date addDayToDate(Date date, int day) {
        return new Date(date.getTime() + MILLIS_PER_DAY * day);
    }

    public static Long getTimeDiff(String startTime, String endTime) {
        int months = 0;
        Long days = null;
        Date startDate = null;
        Date endDate = null;
        try {
            if (startTime.length() == 10 && endTime.length() == 10) {
                startDate = new SimpleDateFormat(DATE_FORMAT).parse(startTime);
                endDate = new SimpleDateFormat(DATE_FORMAT).parse(endTime);
                days = getTimeDiff(startDate, endDate);
            } else if (startTime.length() == 7 && endTime.length() == 7) {
                startDate = new SimpleDateFormat(DATE_MONTH_FORMAT).parse(startTime);
                endDate = new SimpleDateFormat(DATE_MONTH_FORMAT).parse(endTime);
                months = getMonthDiff(startDate, endDate);
                days = new Long((long) months);
            } else {
                startDate = new SimpleDateFormat(DATE_TIME_FORMAT).parse(startTime);
                endDate = new SimpleDateFormat(DATE_TIME_FORMAT).parse(endTime);
                days = getTimeDiff(startDate, endDate);
            }
        } catch (ParseException e) {
            if (log.isWarnEnabled()) {
                log.warn(e.getMessage());
            }
            days = null;
        }
        return days;
    }

    /**
     * 返回两个时间的相差天数
     */
    public static Long getTimeDiff(Date startTime, Date endTime) {
        Long days = null;

        Calendar c = Calendar.getInstance();
        c.setTime(startTime);
        long l_s = c.getTimeInMillis();
        c.setTime(endTime);
        long l_e = c.getTimeInMillis();
        days = (l_e - l_s) / MILLIS_PER_DAY;
        return days;
    }

    /**
     * 返回两个时间的相差分钟数
     */
    public static Long getMinuteDiff(Date startTime, Date endTime) {
        Long minutes = null;

        Calendar c = Calendar.getInstance();
        c.setTime(startTime);
        long l_s = c.getTimeInMillis();
        c.setTime(endTime);
        long l_e = c.getTimeInMillis();
        minutes = (l_e - l_s) / MILLIS_PER_MINUTE;
        return minutes;
    }

    /**
     * 返回两个时间的相差秒数
     */
    public static Long getSecondDiff(Date startTime, Date endTime) {
        return (endTime.getTime() - startTime.getTime()) / MILLIS_PER_SECOND;
    }

    /**
     * 返回两个时间的相差月数
     */
    public static int getMonthDiff(Date startTime, Date endTime) {
        int months = 0;

        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();
        startCalendar.setTime(startTime);
        endCalendar.setTime(endTime);
        months = endCalendar.get(Calendar.MONTH) - startCalendar.get(Calendar.MONTH);
        return months;
    }

    /**
     * 获取两个日期之间的所有日期
     *
     * @param startTime
     *            开始日期
     * @param endTime
     *            结束日期
     * @return
     */
    public static List<String> getReverseDays(String startTime, String endTime) {

        // 返回的日期集合
        List<String> days = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = dateFormat.parse(startTime);
            Date end = dateFormat.parse(endTime);

            Calendar tempStart = Calendar.getInstance();
            tempStart.setTime(start);

            Calendar tempEnd = Calendar.getInstance();
            tempEnd.setTime(end);
            //tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
            tempStart.add(Calendar.DATE,-1);        // 日期减1(包含结束)

            while (tempEnd.after(tempStart)) {
                days.add(dateFormat.format(tempEnd.getTime()));
                tempEnd.add(Calendar.DAY_OF_YEAR, -1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }

    /**
     * 获取两个日期之间的所有日期
     *
     * @param startTime
     *            开始日期
     * @param endTime
     *            结束日期
     * @return
     */
    public static List<String> getDays(String startTime, String endTime) {
        // 返回的日期集合
        List<String> days = new ArrayList<>();

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date start = dateFormat.parse(startTime);
            Date end = dateFormat.parse(endTime);

            Calendar tempStart = Calendar.getInstance();
            tempStart.setTime(start);

            Calendar tempEnd = Calendar.getInstance();
            tempEnd.setTime(end);
            tempEnd.add(Calendar.DATE, +1);// 日期加1(包含结束)
            while (tempStart.before(tempEnd)) {
                days.add(dateFormat.format(tempStart.getTime()));
                tempStart.add(Calendar.DAY_OF_YEAR, 1);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return days;
    }

    /**
     * 获取两个日期之间的所有日期
     *
     * @param startTime
     *            开始日期
     * @param endTime
     *            结束日期
     * @return
     */
    public static List<String> getMonths(String startTime, String endTime) {
        ArrayList<String> result = new ArrayList<String>();
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//格式化为年月

            Calendar min = Calendar.getInstance();
            Calendar max = Calendar.getInstance();

            min.setTime(sdf.parse(startTime));
            min.set(min.get(Calendar.YEAR), min.get(Calendar.MONTH), 1);

            max.setTime(sdf.parse(endTime));
            max.set(max.get(Calendar.YEAR), max.get(Calendar.MONTH), 2);

            Calendar curr = min;
            while (curr.before(max)) {
                result.add(sdf.format(curr.getTime()));
                curr.add(Calendar.MONTH, 1);
            }
        }catch (ParseException e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取两个日期之间所有的周X
     * @param startTime 例如：2019-10-01
     * @param endTime   例如：2019-12-01
     * @param week      例如：星期一
     * @return  日期集合
     */
    public static List<String> getWeeksBetween(String startTime, String endTime,String week){
        List<String> result = new ArrayList<>();
        try {
            List<String> list = getDays(startTime,endTime);
            log.info("日期集合"+list.size());
            for (String day : list){
                boolean isWeek = weekOrNot(day,week);
                if (isWeek){
                    result.add(day);
                }
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 判断日期是不是周X 例如：2019-12-13是不是周五
     * @param time  日期   例如：2019-12-13
     * @param week  星期X  例如：星期一
     * @return
     */
    public static boolean weekOrNot(String time,String week) throws ParseException{
        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(time);
        SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
        String currSun = dateFm.format(date);
        if (currSun.equals(week) || currSun.equals(englishWeek(week))) {
            //log.info(week+currSun);
            return true;
        }
        return false;
    }
    public static String englishWeek(String week) throws ParseException {
        String englishWeek = "";
        switch(week){
            case "星期一":
                englishWeek = "Monday";
                break;
            case "星期二":
                englishWeek = "Tuesday";
                break;
            case "星期三":
                englishWeek = "Wednesday";
                break;
            case "星期四":
                englishWeek = "Thursday";
                break;
            case "星期五":
                englishWeek = "Friday";
                break;
            case "星期六":
                englishWeek = "Saturday";
                break;
            case "星期日":
                englishWeek = "Sunday";
                break;
            default:
                englishWeek = "Monday";
                break;
        }
        return englishWeek;
    }

    public static void main(String[] args) throws Exception {
        String strType = "2018-06-20 12:00:00";
        String format = "yyyy-MM-dd HH:mm:ss";
        Date dateType = new Date();

        Date date = new SimpleDateFormat(format).parse(strType);
        String str = new SimpleDateFormat(format).format(dateType);
        System.out.println("Date: " + date);
        System.out.println("String: " + str);
        Date newTime = new Date(date.getTime() + MILLIS_PER_DAY * 2);
        System.out.println("newTime Date: " + newTime);
        System.out.println("newTime String: " + new SimpleDateFormat(format).format(newTime));

        System.out.println("相差天数: " + (newTime.getTime() - date.getTime()) / (1000l * 24 * 60 *60));
        System.out.println("相差秒数: " + (newTime.getTime() - date.getTime()) / MILLIS_PER_SECOND);

        Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);

        System.out.println("Calendar.getTimeInMillis() = " + calendar.getTimeInMillis());
        System.out.println("Date.getTime() = " + dateType.getTime());
        System.out.println("System.currentTimeMillis() = " + System.currentTimeMillis());

        Date d = new Date(calendar.getTimeInMillis());
        System.out.println(d.getTime());

        System.out.println(calendar.getTimeInMillis() - dateType.getTime());
        System.out.println((calendar.getTimeInMillis() - dateType.getTime()) / MILLIS_PER_SECOND);


        Date currentTime = new Date();
        System.out.println("当前时间: " + convert(currentTime));
        Date newDate = getEndDatetime(currentTime, 1);
        System.out.println("返回n天到23:59:59结束的日期: " + convert(newDate));

        Date date1 = null;
        try {
            date1 = new SimpleDateFormat(DATE_TIME_FORMAT).parse("2018-06-10 09:18:00");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("String转换date1: " + date1);

        System.out.println("返回该日期的最后一刻，精确到纳秒: " + getLastEndDatetime(currentTime));
        System.out.println("返回该日期加1秒: " + getEndTimeAdd(currentTime));

        System.out.println("相对当前日期，增加10天: " + addDay(currentTime, 10));
        System.out.println("currentTime: " + currentTime);
        System.out.println("date1: " + date1);
        System.out.println("相差的天数: " + (currentTime.getTime() - date1.getTime()) / MILLIS_PER_DAY);

    }

    /**
     * 返回昨天
     * @param endDate
     * @return
     */
    public static String getYesterday(String endDate){
        String yesterday = DateUtils.addDay(DateUtils.convert(endDate, DateUtils.DATE_FORMAT), -1);
        return yesterday;
    }

    /**
     * 获取当前月第一天和最后一天
     * @param dataStr
     * @return 逗号拼接
     */
    public static String getCurrentMonth(String dataStr) {
        try {
            //获取当前月第一天：
            Calendar c = Calendar.getInstance();
            c.setTime(new SimpleDateFormat(DATE_FORMAT).parse(dataStr));
            c.add(Calendar.MONTH, 0);
            c.set(Calendar.DAY_OF_MONTH,1);//设置为1号,当前日期既为本月第一天
            String first = new SimpleDateFormat(DATE_FORMAT).format(c.getTime());

            //获取当前月最后一天
            Calendar ca = Calendar.getInstance();
            ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));
            String last = new SimpleDateFormat(DATE_FORMAT).format(ca.getTime());
            return first + "," + last;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 当前周的 第一天和最后一天
     * @param dataStr
     * @return 逗号拼接
     */
    public static String getCurrentWeek(String dataStr){
        try {
            Calendar cal = Calendar.getInstance();
            cal.setTime(new SimpleDateFormat(DATE_FORMAT).parse(dataStr));
            int d = 0;
            if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
                d = -6;
            } else {
                d = 2 - cal.get(Calendar.DAY_OF_WEEK);
            }
            cal.add(Calendar.DAY_OF_WEEK, d);
            // 所在周开始日期
            String data1 = new SimpleDateFormat(DATE_FORMAT).format(cal.getTime());
            cal.add(Calendar.DAY_OF_WEEK, 6);
            // 所在周结束日期
            String data2 = new SimpleDateFormat(DATE_FORMAT).format(cal.getTime());

            return data1 + "," + data2;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }


    /**
     * 计算两个日期的分差
     *
     * @param beforDate
     * @param afterDate
     * @return
     */
    public static Long getMinuteBetweenDate(Date beforDate, Date afterDate) {
        return (afterDate.getTime() - beforDate.getTime()) / (1000 * 60);
    }

}

