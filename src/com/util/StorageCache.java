package com.util;

import com.entity.Comment;
import com.entity.Movie;
import com.entity.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 存储所有在内存操作的对象
 */
public class StorageCache {
    public static List<Comment> COMMENT_CACHE_LIST = new ArrayList<>();
    public static List<Movie> MOVIE_CACHE_LIST = new ArrayList<>();
    public static List<User> USER_CACHE_LIST = new ArrayList<>();
    private static int i=1;

    /**
     * 将硬盘中的数据读取到内存中
     */
    public static void init() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Comment.txt")));
            br.lines().skip(1).forEach(line -> {
                String[] ss = line.split("\\s+");
                COMMENT_CACHE_LIST.add(new Comment(i++, ss[0], ss[1], Double.parseDouble(ss[2]), ss[3], Long.parseLong(ss[4])));
            });
            br.close();

            i= 1;
            br = new BufferedReader(new InputStreamReader(new FileInputStream("Movie.txt")));
            br.lines().skip(1).forEach(line -> {
                String[] ss = line.split("\\s+");
                MOVIE_CACHE_LIST.add(new Movie(i++,ss[0], ss[1], ss[2], ss[3], ss[4], ss[5]));
            });
            br.close();

            i++;
            br = new BufferedReader(new InputStreamReader(new FileInputStream("User.txt")));
            br.lines().skip(1).forEach(line -> {
                String[] ss = line.split("\\s+");
                USER_CACHE_LIST.add(new User(i++,ss[0], ss[1], ss[2], ss[3], ss[4], ss[5]));
            });
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("数据初始化完成");
        } catch (Exception e) {
            System.out.println("初始化数据失败" + e);
        }
        System.out.println("数据初始化完成");
    }

    public void store() {
        try {
            FileUtil.writeObject(COMMENT_CACHE_LIST);
            FileUtil.writeObject(MOVIE_CACHE_LIST);
            FileUtil.writeObject(USER_CACHE_LIST);
        } catch (Exception e) {
            System.out.println("存储数据失败  " + e);
        }
    }

}
