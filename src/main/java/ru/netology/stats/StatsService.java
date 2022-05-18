package ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int average = 0;
        int x = sales.length;
        if (x > 0) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            average = sum / x;
        }
        return average;
    }

    public int findMaxSale(int[] sales) {
        int currentMaxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (currentMaxSale < sales[i]) {
                currentMaxSale = sales[i];
            }
        }
        int monthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == currentMaxSale) {
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }

    public int findMinSale(int[] sales) {
        int currentMinSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (currentMinSale > sales[i]) {
                currentMinSale = sales[i];
            }
        }
        int monthNumber = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == currentMinSale) {
                monthNumber = i + 1;
            }
        }
        return monthNumber;
    }
    public int belowAverageMonth(int[] sales) {
        int average = 0;
        int x = sales.length;
        if (x > 0) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            average = sum / x;
        }
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                count++;
            }
        }
        return count;
    }

    public int aboveAverageMonth(int[] sales) {
        int average = 0;
        int x = sales.length;
        if (x > 0) {
            int sum = 0;
            for (int sale : sales) {
                sum += sale;
            }
            average = sum / x;
        }
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                count++;
            }
        }
        return count;
    }

}
