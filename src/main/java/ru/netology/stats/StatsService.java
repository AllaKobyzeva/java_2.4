package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int averageSale = sum / sales.length;
        return averageSale;

    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int averageSale = sum / sales.length;
        int months = 0;
        for (int sale : sales) {
            if (sale < averageSale) {
                months++;
            }

        }
        return months;
    }

    public int hightSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        int averageSale = sum / sales.length;
        int months = 0;
        for (int sale : sales) {
            if (sale > averageSale) {
                months++;
            }

        }
        return months;
    }
}