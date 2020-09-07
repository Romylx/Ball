package ru.mirea.pr1;
import java.lang.System;

public class ballmain {
    public static void main(String[] args) {
        Ball myBall = new Ball("Voleyball", "Mikasa");
        System.out.println("Test of Ball class");
        System.out.println("Ball type: " + myBall.getBallType());
        System.out.println("Ball manufacturer: " + myBall.getballMenufacturer() + "\n");
    }
}