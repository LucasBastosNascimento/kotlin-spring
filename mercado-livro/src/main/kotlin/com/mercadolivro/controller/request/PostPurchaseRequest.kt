package com.mercadolivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias
import com.sun.istack.NotNull
import javax.validation.constraints.Positive

data class PostPurchaseRequest(
    @field:NotNull
    @field:Positive
    @JsonAlias("customer_id")
    val customerId: Int,

    @field:NotNull
    @JsonAlias("book_ids")
    val bookIds: Set<Int>
)
