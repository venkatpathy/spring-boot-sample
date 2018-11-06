package com.buildit.aws

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ElasticBeanstalkApplication

fun main(args: Array<String>) {
    runApplication<ElasticBeanstalkApplication>(*args)
}
