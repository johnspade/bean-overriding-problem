package ru.johnspade.beanoverridingproblem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.web.config.EnableSpringDataWebSupport

@EnableSpringDataWebSupport
@SpringBootApplication
class BeanOverridingProblemApplication

fun main(args: Array<String>) {
	runApplication<BeanOverridingProblemApplication>(*args)
}
