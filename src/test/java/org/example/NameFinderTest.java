package org.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NameFinderTest {

    @Test
    public void testGetMostPopular() {
        List<String> names = new ArrayList();
        names.add("jane");
        names.add("jane");
        names.add("joe");
        names.add("joe");
        names.add("joe");
        names.add("homer");
        names.add("marge");
        names.add("marge");
        String mostPopular = new NameFinder(names.toArray(new String[0])).getMostPopular();
        Assert.assertTrue(mostPopular.equals("joe"));
    }

    @Test
    public void testGetLeastPopular() {
        List<String> names = new ArrayList();
        names.add("jane");
        names.add("jane");
        names.add("homer");
        names.add("paul");
        names.add("paul");
        names.add("joe");
        names.add("joe");
        names.add("joe");
        String leastPopular = new NameFinder(names.toArray(new String[0])).getLeastPopular();
        Assert.assertTrue(leastPopular.equals("homer"));
    }
}
