package org.xpdojo.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController {

    @GetMapping("/")
    fun index(): String {
        return "Go to /health to see the health status"
    }

    @GetMapping("/health")
    fun health(): String {
        return "OK"
    }

}
