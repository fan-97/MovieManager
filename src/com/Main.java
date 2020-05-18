package com;

import com.util.StorageCache;

import java.util.Scanner;

/**
 * 启动类
 */
public class Main {
    public static void main(String[] args) {
        printMenu();
        //初始化数据到内存中
        StorageCache.init();
        String op = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("输入你需要进行的操作");
        } while ((op = in.nextLine()) != null);


    }

    private static void printMenu() {
        System.out.println(
                " _______________________________________\n" +
                        "|                                       |\n" +
                        "|           影评管理系统                 |\n" +
                        "|                                       |\n" +
                        "|           1.用户管理                   |\n" +
                        "|           2.影片管理                   |\n" +
                        "|           3.影评管理                   |\n" +
                        "|           4.退出                      |\n" +
                        "|_______________________________________|");
    }
}
