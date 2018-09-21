package com.zaloni.zdp.cucumber.stepdefs;

import com.zaloni.zdp.ZdpApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ZdpApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
