package com.example.ut.component.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.ut.component.FirstAddressApi;
import com.example.ut.service.RemoteAddress;
import org.springframework.stereotype.Component;

/**
 * Created by mengliang on 2019/1/15.
 */
@Component
public class DubboFirstAddressImpl implements FirstAddressApi {
    @Reference
    private RemoteAddress remoteAddress;

    @Override
    public String fetchFirstAddress() {
        return remoteAddress.list().get(0);
    }

    public void setRemoteAddress(RemoteAddress remoteAddress) {
        this.remoteAddress = remoteAddress;
    }
}
