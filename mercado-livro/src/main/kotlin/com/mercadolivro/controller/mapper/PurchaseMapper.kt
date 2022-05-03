package com.mercadolivro.controller.mapper

import com.mercadolivro.controller.request.PostPurchaseRequest
import com.mercadolivro.model.PurchaseModel
import com.mercadolivro.service.BookService
import com.mercadolivro.service.CustomerService
import org.springframework.stereotype.Component

@Component
class PurchaseMapper(
    private  val  bookService: BookService,
    private val  customerService: CustomerService
) {

    fun toModel(resquest: PostPurchaseRequest): PurchaseModel{
        val customer= customerService.findById(resquest.customerId)
        val book = bookService.findByIds(resquest.booksId)

        return PurchaseModel(
            customer = customer,
            books = book.toMutableList(),
            price = book.sumOf { it.price }
        )
    }
}