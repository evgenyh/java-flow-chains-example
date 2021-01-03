package net.honeyflower.lectures.flow;

import net.honeyflower.lectures.flow.chain.MyProcessor;
import net.honeyflower.lectures.flow.chain.MyPublisher;
import net.honeyflower.lectures.flow.chain.MySubscriber;

public class MainApp {
	 
	  public static void main(String[] args) throws InterruptedException {
	    
	    MyPublisher publisher = new MyPublisher();
	    
	    MySubscriber subscriber = new MySubscriber();
	    subscriber.setDEMAND(3l); // MUST set number of items to be requested here!
	    
	    MyProcessor processor = new MyProcessor();
	    processor.setDEMAND(3l); // MUST set number of items to be requested here!
	    
	    publisher.subscribe(processor);
	    processor.subscribe(subscriber);
	    
	    publisher.waitUntilTerminated();
	    
	  }
	}