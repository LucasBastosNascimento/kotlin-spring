package com.mercadolivro

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableAsync


@EnableAsync
@SpringBootApplication
class MercadoLivroApplication

fun main(args: Array<String>) {
	runApplication<MercadoLivroApplication>(*args)
	//Para consultar o swagger utilise a url http://localhost:8080/swagger-ui/

    // mudar na vw do -Dspring.profiles.active=prod
}
