package com.example.domain

import java.util.*
import javax.persistence.*

@Entity
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: UUID = UUID.randomUUID(),
        var name: String = "",
        var email: String = "",
        var password: String = ""
)