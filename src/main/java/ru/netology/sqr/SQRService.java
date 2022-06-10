package ru.netology.sqr;

public class SQRService {

    public int sqrNum(int lowerLimit, int upperLimit) {
        int counter = 0;
        for (int i = 0; i <= 99; i++) {
            if (i * i >= lowerLimit) {
                System.out.println("Нижняя граница");
                if (i * i <= upperLimit) {
                    System.out.println("Верхняя граница");

                }
            }
            counter = counter++;
        }
        return counter++;
    }
}
