package com.example.ut.component.impl;

import com.example.ut.component.Address;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;

/**
 * Created by mengliang on 2019/1/15.
 */

@RunWith(MockitoJUnitRunner.class)
public class NewFirstAddressApiImplTest {
    private NewFirstAddressImpl newFirstAddressImpl;

    @Before
    public void setup() {
        newFirstAddressImpl = new NewFirstAddressImpl();
        Address address = Mockito.mock(Address.class);
        Mockito.when(address.list()).thenReturn(Arrays.asList("newMock1", "newMock2"));
        newFirstAddressImpl.setAddress(address);

    }

    @After
    public void teardown() {

    }


    @Test
    public void testAdd() {
        Assert.assertEquals("newMock1", newFirstAddressImpl.fetchFirstAddress());
    }
}
