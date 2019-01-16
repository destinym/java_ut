package com.example.ut.component.impl;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mengliang on 2019/1/15.
 */

public class AddressImplTest {
    @Test
    public void testList() {
        AddressImpl address = new AddressImpl();
        Assert.assertEquals(3, address.list().size());
    }
}

