package ru.netology.service;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();


    @org.testng.annotations.Test
    public void testAmountZero() {
        org.testng.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.testng.annotations.Test
    public void testAmount900() {

        org.testng.Assert.assertEquals(service.remain(999), 1);
    }

    @org.testng.annotations.Test
    public void testAmount1000() {

        org.testng.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.testng.annotations.Test
    public void testAmount500() {

        org.testng.Assert.assertEquals(service.remain(500), 500);
    }

    @org.testng.annotations.Test
    public void testAmount1001() {

        org.testng.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.testng.annotations.Test
    public void testAmount1() {

        org.testng.Assert.assertEquals(service.remain(1), 999);
=======
    @org.junit.Test
    public void testAmountZero() {
        org.junit.Assert.assertEquals(service.remain(0), 1000);
    }

    @org.junit.Test
    public void testAmount900() {

        org.junit.Assert.assertEquals(service.remain(999), 1);
    }

    @org.junit.Test
    public void testAmount1000() {

        org.junit.Assert.assertEquals(service.remain(1000), 0);
    }

    @org.junit.Test
    public void testAmount500() {

        org.junit.Assert.assertEquals(service.remain(500), 500);
    }

    @org.junit.Test
    public void testAmount1001() {

        org.junit.Assert.assertEquals(service.remain(1001), 999);
    }

    @org.junit.Test
    public void testAmount1() {

        org.junit.Assert.assertEquals(service.remain(1), 999);
>>>>>>> 3d087d37abfbe674538e2459b1f819572ddd81fd
    }
}

