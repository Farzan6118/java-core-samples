package com.other_samples.pack_one;

public class RunnableSetterTwo implements Runnable{
    private ConstantTwo constantTwo;

    public RunnableSetterTwo(ConstantTwo constantTwo) {
        this.constantTwo = constantTwo;
    }

    @Override
    public void run() {
        this.constantTwo.setKey("java");
    }
}
