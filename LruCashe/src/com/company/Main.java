package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("______________");
        LruCacheUnit<Integer, String> cache = new LruCacheUnit<Integer, String>();

        int num;
        do {
            System.out.println("Select menu item:\n" +
                    "1 - Add key : value\n" +
                    "2 - Get value from key\n" +
                    "3 - Max size\n" +
                    "4 - Count of elems\n" +
                    "5 - Print cache\n");
            num = sc.nextInt();
            while ((num > 5) || (num < 0)) {
                System.out.println("Invalid number\nEnter new number");
                num = sc.nextInt();
            }
            switch (num) {
                case 1:
                    System.out.println("Input KEY");
                    int k = sc.nextInt();
                    System.out.println("Input VALUE");
                    String v = sc.next();
                    cache.set(k, v);
                    break;
                case 2:
                    System.out.println("Input KEY");
                    int k2 = sc.nextInt();
                    System.out.println(cache.get(k2));
                    break;
                case 3:
                    System.out.println(cache.getLimit());
                    break;
                case 4:
                    System.out.println(cache.getSize());
                    break;
                case 5:
                    cache.print();
                    break;
            }

        } while (num != 0);
    }
}
