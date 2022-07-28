package ru.netology.stats;

public class StatsService {

    public int statisticSaleSum(int[] sale) {
        int sum = 0;
        for (int purchase : sale) {
            sum += purchase;
        }
        return sum;
    }

    public double statisticSaleAverageMonth(int[] sale) {
        int numberSale = sale.length;
        double sum = statisticSaleSum(sale);
        double averageMonth = sum / numberSale;
        return averageMonth;
    }

    public int statisticSaleMax(int[] sale) {
        int saleMax = sale[0];
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[saleMax]) {
                saleMax = i;
            }
        }
        return saleMax + 1;

    }

    public int statisticSaleMin(int[] sale) {
        int saleMin = sale[0];
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[saleMin]) {
                saleMin = i;
            }
        }
        return saleMin + 1;
    }

    public int statisticMonthUnderAverage(int[] sale) {
        int averageSum = (int) statisticSaleAverageMonth(sale);
        int underAverage = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSum) {
                underAverage = underAverage + 1;
            }
        }
        return underAverage;
    }

    public int statisticMonthOverAverage(int[] sale) {
        int averageSum = (int) statisticSaleAverageMonth(sale);
        int overAverage = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSum) {
                overAverage = overAverage + 1;
            }
        }
        return overAverage;
    }
}
