package com.springAi.Friday.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

@GetMapping("/")
 public String hello(){
     return "Hey Buddy";
 }

}