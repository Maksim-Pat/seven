package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findAnotherMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 8, 4, 5, 3, 8, 6, 13, 11, 12};
        long expected = 13;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}