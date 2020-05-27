package com.company;

public class JThread extends Thread {
    Obj o;
    public JThread(String name, int j){
        super(name);
        o = new Obj(j);
    }

    public void run(){
        o.GenAndCalcul();
    }

    public int ReturnResult(){
        return o.res;
    }

}
