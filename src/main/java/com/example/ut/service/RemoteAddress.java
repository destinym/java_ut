package com.example.ut.service;

import com.alibaba.dubbo.config.annotation.Service;

import java.util.List;

/**
 * Created by mengliang on 2019/1/15.
 */

@Service
public interface RemoteAddress {
    List<String> list();
}
