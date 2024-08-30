package com.pps.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

/**
 * Entry point for the application
 */
@SpringBootApplication
class DemoApp

fun main(args: Array<String>) {
  runApplication<DemoApp>(*args)
}
