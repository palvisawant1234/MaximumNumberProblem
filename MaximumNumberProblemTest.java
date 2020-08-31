package com.bridgelabz.generics;
import com.generics.MaximumNumberProblem;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaximumNumberProblemTest {
    MaximumNumberProblem maximumNumberProblemObj;

    @Before
    public void setUp() {
        maximumNumberProblemObj = new MaximumNumberProblem();
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtFirstPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumNumberProblemObj.findMaximumNumber(50, 20, 30));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtSecondPosition_ShouldReturnSameNumber() {
        Assert.assertSame(50, maximumNumberProblemObj.findMaximumNumber(5, 50, 30));
    }

    @Test
    public void givenIntegerMaxNumber_WhenAtThirdPosition_ShouldReturnSameNumber() {
        Assert.assertSame(30, maximumNumberProblemObj.findMaximumNumber(10, 20, 30));
    }
}
