package com.testcases;

import org.junit.*;

public class SampleTest {

    // @BeforeClass  : will exe by junit framework only once before all test case
    @BeforeClass
    public static void setUpTestEnv()
    {
        System.out.println("Set up Test Env");
    }

    //will be executed by JunitFramework Before Each Test Cases

    @Before
    public void setUpMockDataEnv() {
        System.out.println("Set up Data For Test Case");
    }


    @Test
    public void test1()
    {
        System.out.println("Test1()");
    }

    @Test
    public void test2()
    {
        System.out.println("Test2()");
    }

    @After
    public void tearDownMockDataEnv() {
        System.out.println("Tear Down Mock Data Env ");
    }

    @AfterClass
    public static void tearDownTestEnv()
    {
        System.out.println("Tear Down Test Env");
    }
}
