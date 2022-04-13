package com.mercadolivro.execption

import com.mercadolivro.controller.response.ErroResponse
import com.mercadolivro.controller.response.FieldErrorResponse
import com.mercadolivro.enums.Errors
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ControllerAdice {

    @ExceptionHandler(NotFoundException::class)
    fun handlerNotFoudExeption(ex: NotFoundException, response: WebRequest):ResponseEntity<ErroResponse> {
      val erro = ErroResponse(
            HttpStatus.NOT_FOUND.value(),
            ex.message,
            ex.erroCode,
            null
        )

       return ResponseEntity(erro, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(BadRequestException::class)
    fun handlerBadRequestExeption(ex: BadRequestException, response: WebRequest):ResponseEntity<ErroResponse> {
        val erro = ErroResponse(
            HttpStatus.BAD_REQUEST.value(),
            ex.message,
            ex.erroCode,
            null
        )

        return ResponseEntity(erro, HttpStatus.BAD_REQUEST)
    }

    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handlerMethodArgumentNotValidException(ex: MethodArgumentNotValidException, response: WebRequest):ResponseEntity<ErroResponse> {
        val erro = ErroResponse(
            HttpStatus.UNPROCESSABLE_ENTITY.value(),
            Errors.ML_0001.message,
            Errors.ML_0001.code,
            ex.bindingResult.fieldErrors.map{ FieldErrorResponse( it.defaultMessage ?: "invalide", it.field) }
        )

        return ResponseEntity(erro, HttpStatus.UNPROCESSABLE_ENTITY)
    }
}