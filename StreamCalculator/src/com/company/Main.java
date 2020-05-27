package com.company;

import java.util.Scanner;

public class Main {

	public static int num = 333;
    public static void main(String[] args) throws InterruptedException {
		System.out.println("Input count of streams");
    	Scanner in = new Scanner(System.in);

    	int thrCount = 0;
		int result = 0;
	/*Generator g = new Generator();
	g.GenerAll(10000);
	System.out.println(g.sb);
	Calculator c = new Calculator(g.sb);
	c.AllCal();
	System.out.println(c.res);
	 */

		thrCount = in.nextInt();
		long nano_startTime = System.nanoTime();
		ThreadMas tm = new ThreadMas(Integer.valueOf(10000/thrCount));
		for(int i=0; i < thrCount; i++){
			tm.threads[i].start();
		}
		for(int i=0; i < thrCount; i++){
			tm.threads[i].join();
		}
		for(int i=0;i < thrCount; i++){
			result += tm.threads[i].o.res;
		}
		/*Thread t1 = new JThread("t1", 1000);
		t1.start();
		t1.join();
		 */
		System.out.println("Answer: " + result);
		long nano_endTime = System.nanoTime();
		System.out.println("Time taken in ms: " + ((nano_endTime - nano_startTime) / 1000000));


    }
}
