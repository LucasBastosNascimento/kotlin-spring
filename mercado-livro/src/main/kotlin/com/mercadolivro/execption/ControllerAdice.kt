package com.mercadolivro.execption

import com.mercadolivro.controller.response.ErroResponse
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ControllerAdice {

    @ExceptionHandler(NotFoundException::class)
    fun handlerExeption(ex: NotFoundException, response: WebRequest):ResponseEntity<ErroResponse> {
      val erro = ErroResponse(
            HttpStatus.NOT_FOUND.value(),
            ex.message,
            ex.erroCode,
            null
        )

       return ResponseEntity(erro, HttpStatus.NOT_FOUND)
    }
}