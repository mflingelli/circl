package de.flingelli.security.circl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RefmapTest {

    @Test
    public void getConfirm() {
        Assert.assertEquals(getRefmap().getConfirm().size(), 1);
    }

    @Test
    public void getDebian() {
        Assert.assertEquals(getRefmap().getDebian().size(), 1);
    }

    @Test
    public void getMlist() {
        Assert.assertEquals(getRefmap().getMlist().size(), 1);
    }

    @Test
    public void checkConfirmValue() {
        Assert.assertEquals(getRefmap().getConfirm().get(0), "https://simplesamlphp.org/security/201801-03");
    }


    @Test
    public void checkDebianValue() {
        Assert.assertEquals(getRefmap().getDebian().get(0), "DSA-4127");
    }


    @Test
    public void checkMlistValue() {
        Assert.assertEquals(getRefmap().getMlist().get(0), "[debian-lts-announce] 20180209 [SECURITY] [DLA 1273-1] simplesamlphp security update");
    }

    private Refmap getRefmap() {
        return TestHelper.getCveItem().getRefmap();
    }
}
