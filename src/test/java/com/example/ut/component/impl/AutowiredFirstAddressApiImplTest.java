package com.example.ut.component.impl;

import com.example.ut.component.Address;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

/**
 * Created by mengliang on 2019/1/15.
 */

public class AutowiredFirstAddressApiImplTest {
    @InjectMocks
    private AutowiredFirstAddressApiImpl autowiredFirstAddressApiImpl;

    @Mock
    private Address address;


    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        Mockito.when(address.list()).thenReturn(Arrays.asList("mock1", "mock2"));

    }

    @After
    public void teardown() {

    }


    @Test
    public void testAdd() {
        Assert.assertEquals("mock1", autowiredFirstAddressApiImpl.fetchFirstAddress());
    }
}
