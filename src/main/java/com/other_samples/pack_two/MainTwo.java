package com.other_samples.pack_two;


import com.other_samples.pack_two.function.JavaBiConsumer;

public class MainTwo {

    public static void main(String[] args) {

        new MainTwo().call();

    }

    public void call() {
        new JavaBiConsumer().biConsumerCaller();
//        new JavaPredicate().printTheResult();
//        new JavaStream().sampleOne();
//        new JavaStream().sampleTwo();

    }

}
