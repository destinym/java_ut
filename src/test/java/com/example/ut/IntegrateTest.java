package com.example.ut;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by mengliang on 2019/1/16.
 */


@RunWith(SpringRunner.class)
@TestExecutionListeners(listeners = {DependencyInjectionTestExecutionListener.class})
@SpringBootTest
@AutoConfigureMockMvc
public class IntegrateTest {

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setup() {
    }


    @Test
    public void fetchFirstAddress() throws Exception {
        mockMvc.perform(get("/"));
    }

}
