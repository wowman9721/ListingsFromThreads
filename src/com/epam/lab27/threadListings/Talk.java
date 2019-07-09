package com.epam.lab27.threadListings;

public class Talk extends Thread {
    public void run() {
        for (int i = 0; i < 8; i++) {
            System.out.println("Talking");
            try {
                // остановка на 400 миллисекунд
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}

