package com.company;

public class ThreadMas {
    JThread[] threads = new JThread[4];

    public ThreadMas(int j){
        for(int i = 0; i < 4; i++){
            threads[i] = new JThread("t"+i, j);
        }
    }


}
