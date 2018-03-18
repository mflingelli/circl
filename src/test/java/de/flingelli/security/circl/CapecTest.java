package de.flingelli.security.circl;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CapecTest {

    @Test
    public void getCapecs() {
        Assert.assertEquals(TestHelper.getCveItem().getCapecs().size(), 2);
    }

    @Test
    public void getRelatedWeakness() {
        Assert.assertEquals(getCapec().getRelatedWeakness().size(), 8);
    }

    @Test
    public void getId() {
        Assert.assertEquals(getCapec().getId(), 19);
    }

    @Test
    public void getName() {
        Assert.assertEquals(getCapec().getName(), "Embedding Scripts within Scripts");
    }

    @Test
    public void getSummary() {
        Assert.assertTrue(getCapec().getSummary().startsWith( "An attack of this type exploits"));
    }

    @Test
    public void getSolutions() {
        Assert.assertTrue(getCapec().getSolutions().startsWith("Design: Use browser technologies that do not allow client side scripting."));
    }

    @Test
    public void getPrerequisites() {
        Assert.assertTrue(getCapec().getPrerequisites().startsWith("Target software must be able to execute scripts"));
    }

    private Capec getCapec() {
        return TestHelper.getCveItem().getCapecs().get(0);
    }
}
