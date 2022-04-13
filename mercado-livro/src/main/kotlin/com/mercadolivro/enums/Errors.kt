package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {

    ML_B0001("ML-B0001","Book [%s] not exists"),
    ML_C0001("ML-C0001","Customer [%s] not exists")
}