package com.example.ut.component.impl;

import com.example.ut.service.RemoteAddress;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

/**
 * Created by mengliang on 2019/1/15.
 */

public class DubboFirstAddressApiImplTest {
    @InjectMocks
    private DubboFirstAddressImpl dubboFirstAddressImpl;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        RemoteAddress address = Mockito.mock(RemoteAddress.class);
        Mockito.when(address.list()).thenReturn(Arrays.asList("dubooMock1", "dubboMock2"));

        dubboFirstAddressImpl.setRemoteAddress(address);

    }

    @After
    public void teardown() {

    }


    @Test
    public void testAdd() {
        Assert.assertEquals("dubooMock1", dubboFirstAddressImpl.fetchFirstAddress());
    }
}
