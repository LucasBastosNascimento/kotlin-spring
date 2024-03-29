package com.mercadolivro.service

import com.mercadolivro.execption.AuthenticationException
import com.mercadolivro.repository.CustomerRepository
import com.mercadolivro.security.UserCustomerDetails
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.stereotype.Service

@Service
class UserDetailsCustomService(
    private val customerRepository: CustomerRepository
): UserDetailsService {
    override fun loadUserByUsername(id: String): UserDetails {
      val customer=  customerRepository.findById(id.toInt()).orElseThrow{AuthenticationException("Usuario não encontrado","999")}
      return  UserCustomerDetails(customer)
    }

}