package com.example.ut.component.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.ut.component.Address;
import com.example.ut.component.FirstAddressApi;
import com.example.ut.service.RemoteAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by mengliang on 2019/1/16.
 */
@Component
public class DubboAndAutowiredApiImpl implements FirstAddressApi {
    @Autowired
    private Address address;

    @Reference
    private RemoteAddress remoteAddress;

    @Override
    public String fetchFirstAddress() {
        if (remoteAddress.list().get(0) != null) {
            return remoteAddress.list().get(0);
        } else {
            return address.list().get(0);
        }
    }
}
