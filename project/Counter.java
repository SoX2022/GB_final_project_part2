package project;

import java.io.Closeable;
import java.io.IOException;

public class Counter implements Closeable{
    protected int counter = 0;

    public void add() {
        this.counter++;
    }

    @Override
    public void close() throws IOException {
        System.out.println("Counter.add() autoclosed");;
    }
}
