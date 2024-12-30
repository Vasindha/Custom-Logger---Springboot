package vipendrasinh.logger.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;

@RestController
public class TestController {
    private final Logger logger = LogManager.getLogger(TestController.class);
    @GetMapping("test")
    public String test() {
        logger.info("Inside test controller");
        return "test";
    }
}
