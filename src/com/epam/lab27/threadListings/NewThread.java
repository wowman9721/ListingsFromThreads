package com.epam.lab27.threadListings;


public class NewThread implements Runnable {
    String name;
    Thread t;

    public NewThread(String threadName) {
        name = threadName;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start();
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
            }

            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(name + " interrupted.");

        }
        System.out.println(name + " exiting");


    }
}
