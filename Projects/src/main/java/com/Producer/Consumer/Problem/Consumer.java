package com.Producer.Consumer.Problem;

public class Consumer extends Thread {
	Company c;
	
	public Consumer(Company c) {
		this.c=c;
	}
	 
	public void run() {
		int i=1;
		while(true) {
			this.c.consume_item();
			try{Thread.sleep(1000);}catch(Exception e) { e.getMessage();}
			i++;
			}
		
	}

}
