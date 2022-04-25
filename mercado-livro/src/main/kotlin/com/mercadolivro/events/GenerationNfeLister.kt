package com.mercadolivro.events

import org.springframework.context.event.EventListener
import org.springframework.stereotype.Component
import java.util.*

@Component
class GenerationNfeLister {

    @EventListener
    fun listen(purchaseEvent: PurchaseEvent){
        val nfe = UUID.randomUUID().toString()
        val purchaseModel = purchaseEvent.purchaseModel.copy(nfe=nfe)
    }
}