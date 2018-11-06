package com.buildit.aws.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @RequestMapping
    private fun sayHello() : String {
        return "Hello from spring boot sample!!"
    }

}