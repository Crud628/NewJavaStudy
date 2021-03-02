package com.idea.lan.action;

public class Action01 {
    private String message;

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void demo_fun01(){
        System.out.println(message+" demo_fun01 run");
    }

    public Action01(){

    }
    public Action01(String message) {
        this.message = message;
    }


    public void target_func(){
        System.out.println("target_func");
    }
}
