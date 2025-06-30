package com.mss.flexpay.model

import com.mss.flexpay.enums.UserType
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "users")
class User(
    @Id
    val id: String? = null,
    val name: String, val userType: UserType,
    val email: String
)
