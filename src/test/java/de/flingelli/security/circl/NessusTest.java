package de.flingelli.security.circl;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.ParseException;

public class NessusTest {

    @Test
    public void getNessusSize() {
        Assert.assertEquals(TestHelper.getCveItem().getNessus().size(), 2);
    }

    @Test
    public void getNaslFamily() {
        Assert.assertEquals(getNessus().getNaslFamily(), "Debian Local Security Checks");
    }

    @Test
    public void getNaslId() {
        Assert.assertEquals(getNessus().getNaslId(), "DEBIAN_DLA-1273.NASL");
    }

    @Test
    public void getDescription() {
        Assert.assertTrue(getNessus().getDescription().startsWith("simplesamlphp, an authentication and federation application"));
    }

    @Test
    public void getLastSeen() {
        Assert.assertEquals(getNessus().getLastSeen(), "2018-02-20");
    }

    @Test
    public void getModified() {
        Assert.assertEquals(getNessus().getModified(), "2018-02-20");
    }

    @Test
    public void getPluginId() {
        Assert.assertEquals(getNessus().getPluginId(), 106697);
    }

    @Test
    public void getPublished() {
        Assert.assertEquals(getNessus().getPublished(), "2018-02-09");
    }

    @Test
    public void getReporter() {
        Assert.assertEquals(getNessus().getReporter(), "Tenable");
    }

    @Test
    public void getSource() {
        Assert.assertEquals(getNessus().getSource(), "https://www.tenable.com/plugins/index.php?view=single&id=106697");
    }

    @Test
    public void getTitle() {
        Assert.assertEquals(getNessus().getTitle(), "Debian DLA-1273-1 : simplesamlphp security update");
    }

    @Test
    public void getPublishedAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(getNessus().getPublishedAsDate()), "09.02.2018 00:00:00");
    }

    @Test
    public void getModifiedAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(getNessus().getModifiedAsDate()), "20.02.2018 00:00:00");
    }

    @Test
    public void getLastSeenAsDate() throws ParseException {
        Assert.assertEquals(TestHelper.convertDateToString(getNessus().getLastSeenAsDate()), "20.02.2018 00:00:00");
    }

    private Nessus getNessus() {
        return TestHelper.getCveItem().getNessus().get(0);
    }
}
