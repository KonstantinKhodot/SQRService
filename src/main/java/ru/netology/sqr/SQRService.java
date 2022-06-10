package ru.netology.sqr;

public class SQRService {

    int count = 0;
    int lowerLimit = 10;
    int upperLimit = 99;

    public int sqrNum(int lowerLimit, int upperLimit) {
        int i = 0;
        for (i = 10; i <= 99; i++) ;
        {
            if (i * i >= lowerLimit) {
                System.out.println("Нижняя граница");
                if (i * i <= upperLimit) {
                    System.out.println("Верхняя граница");
                    count = count++;

                }
            }
        }
        return count;
    }
}
