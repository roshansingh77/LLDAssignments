package com.example.sept.oops.scaler.multithreading.syncproblems;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable {
    private Count count;
    private Lock lock;

    public Subractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i < 100000000; i++) {
            lock.lock();
            this.count.incrementValue(-i);
            lock.unlock();
        }
    }
}
