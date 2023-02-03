package com.Producer.Consumer.Problem;

public class Company {
	int n;
	boolean f = false;
	  // if f= false chance to produce
	 //  if f=true chance to consume
	  synchronized public void produce_item(int n)  {
		this.n=n;
		if(f) {
			try { wait();}catch(Exception e) {e.getMessage(); }
		}
		System.out.println("Produced : "+this.n);
		f=true;
		notify();
	}
	
	  synchronized public int consume_item()  {
		  if(!f) {
			  
			 try { wait();}catch(Exception e) {e.getMessage(); }
		  }
		System.out.println("Consumed : "+this.n);
		f=false;
		notify();
		return this.n;
	}

}
