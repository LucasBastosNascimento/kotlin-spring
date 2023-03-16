package com.mercadolivro.exception

class AuthenticationException(override val message: String, val erroCode: String): Exception() {
}