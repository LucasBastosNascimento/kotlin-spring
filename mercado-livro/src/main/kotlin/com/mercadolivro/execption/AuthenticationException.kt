package com.mercadolivro.execption

class AuthenticationException(override val message: String, val errorCode: String) : Exception()