package com.util;

import com.entity.Chinese;
import com.entity.Comment;

import java.io.*;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.util.StorageCache.*;

/**
 * 文件工具类
 */
public class FileUtil {

    public static void writeObject(List<Object> list) throws Exception {
        for (Object o : list) {
            writeObject(o);
        }
    }

    public static void writeObject(Object o) throws Exception {
        //获取当前对象存储的文件
        Class<?> clazz = o.getClass();
        String className = clazz.getSimpleName();
        Field[] fields = clazz.getDeclaredFields();

        File file = new File(className + ".txt");
        BufferedWriter bw = null;

        try {
            //写入标题
            if (!file.exists()) {
                bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
                String s = "";
                for (Field field : fields) {
                    Chinese annotation = field.getAnnotation(Chinese.class);
                    s += annotation.value() + "\t";
                }
                bw.write(s);
                bw.flush();
            }
            bw = bw == null ? new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file))) : bw;
            Map<String, String> values = getAllFiledValues(o);
            String str = "";

            for (Field field : fields) {
                str += values.get(field.getName()) + "\t";
            }
            if ("".equals(str)) {
                return;
            }
            bw.newLine();
            bw.write(str);
            bw.flush();
        } finally {
            bw.close();
        }
    }


    public static Map<String, String> getAllFiledValues(Object obj) throws IllegalAccessException, InstantiationException {
        Map<String, String> values = new HashMap<>();
        Class clz = obj.getClass();
        Field[] fields = clz.getDeclaredFields();

        for (Field field : fields) {
            String fieldName = field.getName();
            field.setAccessible(true);
            System.out.println(fieldName + ":" + field.get(obj));
            values.put(fieldName, field.get(obj).toString());
        }
        return values;
    }

//    public static void main(String[] args) {
//        try {
//            writeObject(new Comment(COMMENT_CACHE_LIST.size()+1,"admin", "杀破狼", 8.9, "www.baidu.com", 1000L));
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
