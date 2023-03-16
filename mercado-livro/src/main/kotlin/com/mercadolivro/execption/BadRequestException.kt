package com.mercadolivro.execption

class BadRequestException(override val message: String, val errorCode: String) : Exception() {
}