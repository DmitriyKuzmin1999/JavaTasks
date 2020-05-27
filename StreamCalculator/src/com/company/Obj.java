package com.company;

public class Obj {
    int res = 0;
    int count;
    Generator g;
    Calculator c;

    public Obj(int i){
        g = new Generator();
        count = i;
    }

    public void GenAndCalcul(){
        g.GenerAll(count);
        c = new Calculator(g.sb);
        c.AllCal();
        res = c.res;
        System.out.println(res);
    }
}
