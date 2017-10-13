package com.lito.www.aop.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lito.www.aop.anntotation.LogExecutionTime;

@RestController
@RequestMapping
public class DemoRestController {

  @LogExecutionTime
  @GetMapping("/doStuff")
  public void doStuff() {
    
  }
}
