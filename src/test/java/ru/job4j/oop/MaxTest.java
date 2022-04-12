package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenSecond() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int out = Max.max(first,second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFourth() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int expected = 4;
        int out = Max.max(first,second,third,fourth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst() {
        int first = 101;
        int second = 12;
        int third = 3;
        int fourth = 41;
        int expected = 101;
        int out = Max.max(first,second,third,fourth);
        Assert.assertEquals(expected, out);
    }
}