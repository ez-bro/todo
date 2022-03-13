package com.example.todo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class TodoApplication

fun main(args: Array<String>) {
    runApplication<TodoApplication>(*args)
}
