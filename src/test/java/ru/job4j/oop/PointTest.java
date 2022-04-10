package ru.job4j.oop;

import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
    @Test
    public void when02to45then5() {
        Point a = new Point(0, 2);
        Point b = new Point(4, 5);
        double expected = 5;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
    @Test
    public void when00to01then1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 1);
        double expected = 1;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }
    @Test
    public void when00to11then1dot41() {
        Point a = new Point(0, 0);
        Point b = new Point(1, 1);
        double expected = 1.41;
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }


}