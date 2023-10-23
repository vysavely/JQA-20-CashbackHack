package ru.netology.service;

import org.testng.Assert;
//import org.testng.annotations.Test;
//import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemainEqually1000() { //покупка ровно на 1000 р (здесь возникает ошибка!)
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainLess1000() { //покупка на сумму меньшую 1000
        CashbackHackService service = new CashbackHackService();

        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemainMore1000() { //покупка больше 1000
        CashbackHackService service = new CashbackHackService();

        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
}