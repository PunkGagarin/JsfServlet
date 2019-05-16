package com.gagarin.JsfServlet;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class TestBean {

    private String message;

    @PostConstruct
    private void init() {
        message = "JSF is running";
    }

    public String getMessage() {
        return message;
    }

}
