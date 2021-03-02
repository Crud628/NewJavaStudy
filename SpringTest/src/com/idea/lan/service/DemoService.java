package com.idea.lan.service;


import com.idea.lan.dao.DemoDao;

public class DemoService {
    DemoDao dao;

    public DemoDao getDao() {
        return dao;
    }

    public void setDao(DemoDao dao) {
        this.dao = dao;
    }

    public boolean demo_func(){
        return dao.demo_func();
    }
}
