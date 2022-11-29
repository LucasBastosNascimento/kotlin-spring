package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {
    ML_0000("ML-0000","Access Denied"),
    ML_0001("ML-0001","Invalid Request"),
    ML_B0001("ML-B0001","Book [%s] not exists"),
    ML_B0002("ML-B0002","Cannot update book with status [%s]"),
    ML_C0001("ML-C0001","Customer [%s] not exists")
}