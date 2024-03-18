package ru.netology.service;

public class CashBackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

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
    }
}

