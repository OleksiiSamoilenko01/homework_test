package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class simpletest {
    @Test
    public void Test_1(){
        System.out.println("Test_1");
        Assert.assertTrue(true);
    }
}
