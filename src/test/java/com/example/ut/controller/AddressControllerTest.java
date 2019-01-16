package com.example.ut.controller;

import com.example.ut.component.FirstAddressApi;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by mengliang on 2019/1/16.
 */


@RunWith(SpringRunner.class)
public class AddressControllerTest {
    @InjectMocks
    private AddressController addressController;

    @Mock
    private FirstAddressApi firstAddressApi;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        Mockito.when(firstAddressApi.fetchFirstAddress()).thenReturn("mock1");
    }


    @Test
    public void fetchFirstAddress() {
        Assert.assertEquals("mock1", addressController.fetchFirstAddress());
    }

}
