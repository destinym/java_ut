package com.example.ut.component.impl;

import com.example.ut.component.Address;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by mengliang on 2019/1/15.
 */

@Component
public class AddressImpl implements Address {
    @Override
    public List<String> list() {
        return Arrays.asList("add1", "add2", "add3");
    }
}
