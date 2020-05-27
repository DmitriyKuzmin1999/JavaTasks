package com.company;
import java.util.Random;

public class Generator {

    public StringBuilder sb;


    public Generator(){
        sb = new StringBuilder();
    }

    public StringBuilder Gener(){
        StringBuilder s = new StringBuilder();
        int a = 0;
        int b = 100;
        String c;
        Random r = new Random();

        for(int i=0; i < 1000; i++){
            s.append((int)r.nextInt((b - a) + 1) + a);
            int z = (int)r.nextInt((100 - 1) + 1) + 1;
            c = (z % 2 == 1)?"+":"-";
            s.append(c);
        }

        return s;
    }

    public void GenerAll(int a){
        for(int i = 0; i < a; i++){
            sb.append(Gener());
        }
        sb.setLength(sb.length() - 1);
    }
}
