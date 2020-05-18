package com.util;

import com.entity.Comment;
import com.entity.Movie;
import com.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 存储所有在内存操作的对象
 */
public class StorageCache {
    public static List<Comment> COMMENT_CACHE_LIST = new ArrayList<>();
    public static List<Movie> MOVIE_CACHE_LIST = new ArrayList<>();
    public static List<User> USER_CACHE_LIST = new ArrayList<>();

    /**
     * 将硬盘中的数据读取到内存中
     */
    public static void init() {

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
