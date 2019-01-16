package com.example.ut.component.impl;

import com.example.ut.component.Address;
import com.example.ut.component.FirstAddressApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mengliang on 2019/1/15.
 */

@Component
public class AutowiredFirstAddressApiImpl implements FirstAddressApi {
    @Autowired
    private Address address;

    @Override
    public String fetchFirstAddress() {
        return address.list().get(0);
    }
}
