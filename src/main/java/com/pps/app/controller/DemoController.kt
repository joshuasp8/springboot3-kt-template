package com.pps.app.controller

import com.pps.app.core.Demo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(private val demo: Demo) {

  @GetMapping("/demo")
  fun demoAction(): String {
    demo.run()
    return "Hello World!"
  }
}
