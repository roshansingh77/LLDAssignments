package com.example.sept.oops.scaler.multithreading.syncMethod;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable {
    private Count count;

    public Subractor(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
            for (int i = 1; i < 100000000; i++) {
                this.count.incrementValue(-i);
            }
    }
}
