package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatsServiceTest {

    @Test
    void statisticSaleSum() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = (int) service.statisticSaleSum(sale);
        assertEquals(expected, actual);
    }

    @Test
    void statisticSaleAverageMonth() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = (double) service.statisticSaleAverageMonth(sale);
        assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMax() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.statisticSaleMax(sale);
        assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMin() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.statisticSaleMin(sale);
        assertEquals(expected, actual);
    }

    @Test
    void statisticMonthUnderAverage() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.statisticMonthUnderAverage(sale);
        assertEquals(expected, actual);
    }

    @Test
    void statisticMonthOverAverage() {
        StatsService service = new StatsService();
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.statisticMonthOverAverage(sale);
        assertEquals(expected, actual);
    }
}
