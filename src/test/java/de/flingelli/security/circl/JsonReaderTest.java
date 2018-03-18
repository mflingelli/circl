package de.flingelli.security.circl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JsonReaderTest {

    @Test
    public void getCveItem() {
        Assert.assertEquals(TestHelper.getCveItem().getId(), "CVE-2018-6521");
    }
}
