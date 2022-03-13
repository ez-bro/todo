package com.example.todo.config

import com.example.todo.database.TodoDataBase
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

//어플이 실행될때 먼저 참조
@Configuration
class AppConfig {

    @Bean(initMethod = "init")
    fun todoDataBase(): TodoDataBase {
        return TodoDataBase()
    }
}