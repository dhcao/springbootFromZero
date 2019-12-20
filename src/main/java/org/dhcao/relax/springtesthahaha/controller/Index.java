package org.dhcao.relax.springtesthahaha.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author caodahuan
 * @version 2019/12/20
 */
@RestController
public class Index {


    @RequestMapping("hello")
    public String Index(){

        return "Hello World";
    }
}
