package ru.netology.sqr;

public class SQRService {

    public int sqrNum(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 10; i <= upperLimit; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    counter = counter++;
                }
            }
        }
        System.out.println(counter);
        return counter;
    }
}