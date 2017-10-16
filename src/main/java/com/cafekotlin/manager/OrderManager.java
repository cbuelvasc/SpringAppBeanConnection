package com.cafekotlin.manager;

import java.io.PrintStream;

public class OrderManager {

    private PrintStream stream;

    public OrderManager(PrintStream stream) {
        this.stream = stream;
    }

    public void checkBeforeRunningOrder() {
        stream.println("Start order, order manager is executed before executing order!");
    }

    public void checkAfterRunningOrder() {
        stream.println("Verified, order manager is executed after executing order!");
    }
}