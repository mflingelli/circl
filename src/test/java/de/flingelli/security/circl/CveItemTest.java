package de.flingelli.security.circl;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class CveItemTest {

    @Test
    public void getId() {
        Assert.assertEquals(getCveItem().getId(), "CVE-2018-6521");
    }

    @Test
    public void getCvss() {
        Assert.assertEquals(getCveItem().getCvss(), 7.5, 0.001);
    }

    @Test
    public void getCvssNull() {
        Assert.assertNull(TestHelper.getCveItem("src/test/resources/CVE-2018-8754.json").getCvss());
    }


    @Test
    public void getCwe() {
        Assert.assertEquals(getCveItem().getCwe(), "CWE-284");
    }

    @Test
    public void getModified() {
        Assert.assertEquals(getCveItem().getModified(), "2018-02-01T20:29:00.370000");
    }

    @Test
    public void getPublished() {
        Assert.assertEquals(getCveItem().getPublished(), "2018-02-01T20:29:00.370000");
    }

    @Test
    public void getLastModified() {
        Assert.assertEquals(getCveItem().getLastModified(), "2018-03-03T21:29:04.067000");
    }

    @Test
    public void getSummary() {
        Assert.assertEquals(getCveItem().getSummary(),
                "The sqlauth module in SimpleSAMLphp before 1.15.2 relies " +
                "on the MySQL utf8 charset, which truncates queries upon encountering four-byte characters. " +
                "There might be a scenario in which this allows remote attackers to bypass intended access restrictions.");
    }

    @Test
    public void getReferences() {
        Assert.assertEquals(getCveItem().getReferences().size(), 3);
    }

    @Test
    public void checkFirstReference() {
        Assert.assertEquals(getCveItem().getReferences().get(0), "https://lists.debian.org/debian-lts-announce/2018/02/msg00008.html");
    }

    @Test
    public void getModifiedAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(getCveItem().getModifiedAsDate()), "01.02.2018 20:29:00");
    }

    @Test
    public void getPublishedAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(getCveItem().getPublishedAsDate()), "01.02.2018 20:29:00");
    }

    @Test
    public void getLastModifiedAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(getCveItem().getLastModifiedAsDate()), "03.03.2018 21:29:04");
    }

    private CveItem getCveItem() {
        return TestHelper.getCveItem();
    }
}
