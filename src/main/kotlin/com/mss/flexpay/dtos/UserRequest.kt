package com.mss.flexpay.dtos

import com.mss.flexpay.enums.UserType
import java.util.UUID

data class UserRequest(
    val id: UUID? = null,
    val name: String,
    val userType: UserType,
    val email: String
)
