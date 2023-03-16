package com.mercadolivro.controller.request

import com.mercadolivro.model.CustomerModel
import com.mercadolivro.validation.EmailAvailable
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class PostCustomerRequest (
    @field:NotEmpty(message="Nome deve ser irfomado")
    var name: String,
    @field:Email(message="E-mail deve ser valido")
    @EmailAvailable
    var email: String,

    @field:NotEmpty(message="Senha deve ser informada")
    var password: String
)