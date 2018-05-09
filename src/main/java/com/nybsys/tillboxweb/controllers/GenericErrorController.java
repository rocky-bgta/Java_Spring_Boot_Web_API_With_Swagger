package com.nybsys.tillboxweb.controllers;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenericErrorController implements ErrorController {
    private static final String ERROR_PATH = "/error";

    @RequestMapping(ERROR_PATH)
    public String error() {
        //TODO: Create errorPage.html page in
        return "errorPage.html";
    }

    @Override
    public String getErrorPath() {
        return ERROR_PATH;
    }
}