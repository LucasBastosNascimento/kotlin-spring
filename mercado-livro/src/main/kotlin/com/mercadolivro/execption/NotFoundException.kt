package com.mercadolivro.execption

class NotFoundException(override val message: String, val erroCode: String): Exception() {
}