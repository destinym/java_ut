package com.example.ut.component.impl;

import com.example.ut.component.Address;
import com.example.ut.component.FirstAddressApi;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by mengliang on 2019/1/15.
 */
public class NewFirstAddressImpl implements FirstAddressApi {
    private Address address;

    public NewFirstAddressImpl() {
        address = new AddressImpl();
    }


    @Autowired
    public String fetchFirstAddress() {
        return address.list().get(0);
    }

    // for ut test
    public void setAddress(Address address) {
        this.address = address;
    }
}

