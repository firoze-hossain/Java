package com.roze.dsaInJava.clsAndObj;

class Counter {
    private int count;

    public Counter() {// default constructor where count is 0

    }

    public Counter(int initial) {
        count = initial;
    }

    public int getCount() {
        return count;
    }

    public void increment() {
        count++;
    }

    public void increment(int delta) {
        count += delta;
    }

    public void reset() {
        count = 0;
    }
}

public class CounterDemo {
    public static void main(String[] args) {
        Counter c;
        c = new Counter();
        c.increment();
        System.out.println(c.getCount());
        c.increment(3);
        System.out.println(c.getCount());
        c.reset();
        System.out.println(c.getCount());
        Counter counter = new Counter(5);
        counter.increment();
        System.out.println(counter.getCount());
        Counter cnt = counter;
        System.out.println(cnt.getCount());
        cnt.increment(2);
        System.out.println(cnt.getCount());
    }

}
