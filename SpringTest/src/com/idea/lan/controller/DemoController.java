package com.idea.lan.controller;

import com.idea.lan.service.DemoService;

public class DemoController {
    DemoService ser;

    public DemoService getSer() {
        return ser;
    }

    public void setSer(DemoService ser) {
        this.ser = ser;
    }

    public boolean demo_func(){
        return ser.demo_func();
    }
}
