package com.navneet.learn.springBoot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloRestController {
 
  @RequestMapping("/hello")
  public String hello() {
    return "Hello. We have taken over your planet.";
  }
}
