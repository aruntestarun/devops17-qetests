package com.sndevops.eng;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {
    private String INPUT = "44";
    private String INPUT1 = "1234567";
    private String INPUT2 = "115";
    private boolean isPassed = true;
    // Add more tests
    // Connected , unconfigured track true- Case 1
    @Test
    public void testLength() {
        // Test with new Dev build 1
        Assert.assertEquals(INPUT,"44");
        Assert.assertEquals(INPUT2,"115");
    }
    
    @Test
    public void testPassed() {
        Thread.sleep(6000);
        Assert.assertEquals(isPassed,true);
    }
    
        @Test
    public void testFailed() {
        Assert.assertEquals(isPassed,false);
    }
}
