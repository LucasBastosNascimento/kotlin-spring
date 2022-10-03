package com.mercadolivro.service

import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService

class UserDetailsCustomService(): UserDetailsService {
    override fun loadUserByUsername(id: String?): UserDetails {
        TODO("Not yet implemented")
    }

}