package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenF1S2() {
        int first = 1;
        int second = 2;
        int expected = 2;
        int out = Max.max(first,second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenF1S2T3F4() {
        int first = 1;
        int second = 2;
        int third = 3;
        int fourth = 4;
        int expected = 4;
        int out = Max.max(first,second,third,fourth);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenF101S12T3F41() {
        int first = 101;
        int second = 12;
        int third = 3;
        int fourth = 41;
        int expected = 101;
        int out = Max.max(first,second,third,fourth);
        Assert.assertEquals(expected, out);
    }
}