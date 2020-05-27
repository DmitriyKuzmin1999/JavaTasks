package com.company;

public class Main {

    public static void main(String[] args) {
        RingBuffer<Integer> r =  null;
        try {
            r =  new RingBuffer();
        }
        catch(Exception e) {
            System.out.println(e);
        }

        /*r.add(100);
        r.add(1);
        r.add(2);
        r.add(3);
        r.add(4);
        r.add(5); // Добавляем вместо 100
        System.out.println(r.count);
        System.out.println(r.poll()); // Достаем 1
        System.out.println(r.poll()); // Достаем 2
        r.add(7); // добавляем на место 1цы 7
        r.poll(); // Достаем 3
        r.poll(); // Достаем 4
        for(int el :  r) {
            System.out.println(el);
        }*/

        System.out.println(r.count);
        r.add(100);
        System.out.println(r.count);
        r.add(1);
        System.out.println("______________");
        for(int el :  r) {
            System.out.println(el);
        }
        System.out.println("______________");
        System.out.println(r.count);
        r.add(2);
        System.out.println(r.count);
        r.add(3);
        System.out.println(r.count);
        System.out.println("______________");
        for(int el :  r) {
            System.out.println(el);
        }
        System.out.println("______________");
        r.add(50);
        System.out.println(r.count);
        System.out.println("______________");
        for(int el :  r) {
            System.out.println(el + ' ');
        }
        System.out.println("______________");
        r.add(5); // Добавляем вместо 100
        System.out.println(r.count);
        System.out.println("______________");
        for(int el :  r) {
            System.out.println(el + ' ');
        }
        System.out.println("______________");
        r.add(5); // Добавляем вместо 100
        System.out.println(r.count);
        System.out.println("______________");
        for(int el :  r) {
            System.out.println(el + ' ');
        }
        System.out.println("______________");
    }
}