package com.example.ut.controller;

import com.example.ut.component.FirstAddressApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by mengliang on 2019/1/16.
 */
@Controller
public class AddressController {
    @Autowired
    private FirstAddressApi autowiredFisrtAddressApi;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String fetchFirstAddress() {
        return autowiredFisrtAddressApi.fetchFirstAddress();
    }

}
