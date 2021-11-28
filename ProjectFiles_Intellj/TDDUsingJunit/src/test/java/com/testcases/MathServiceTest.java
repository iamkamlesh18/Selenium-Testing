package com.testcases;

import com.exceptions.InvalidNumberRangeException;
import com.services.MathServiceImpl;
import com.services.MathService;
import org.junit.*;

public class MathServiceTest {

    private static MathService mathserve;

    @BeforeClass
    public static void setUpTestEnv()
    {
        mathserve = new MathServiceImpl();
    }

    @Test (expected = InvalidNumberRangeException.class)
    public void testAddForFirstNumberInvalid() throws InvalidNumberRangeException {
        int n1 = -100;
        int n2 = 200;

        mathserve.add(n1, n2);
    }
    @Test (expected = InvalidNumberRangeException.class)
    public void testAddForSecondNumberInvalid() throws InvalidNumberRangeException {
        int n1 = 100;
        int n2 = -200;

        mathserve.add(n1, n2);

    }
    @Test
    public void testAddForBothNumberInvalid(){


    }

    @Test
    public void testAddForBothValid() throws InvalidNumberRangeException {
        int n1=100, n2=200;
        int expectedAns=300;

        int actualAns = mathserve.add(n1, n2);

//        if (actualAns==expectedAns) {
//            System.out.println("Pass");
//        }
//        else
//            System.out.println("Fail");

        // assert logic instead if else logic

        Assert.assertEquals(expectedAns,actualAns);



    }



}
