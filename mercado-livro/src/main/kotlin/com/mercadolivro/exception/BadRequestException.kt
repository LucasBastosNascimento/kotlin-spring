package com.mercadolivro.exception

class BadRequestException(override val message: String, val erroCode: String): Exception() {
}