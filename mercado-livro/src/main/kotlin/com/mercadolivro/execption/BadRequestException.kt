package com.mercadolivro.execption

class BadRequestException(override val message: String, val erroCode: String): Exception() {
}