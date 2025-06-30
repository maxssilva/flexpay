package com.mss.flexpay.dtos

import com.mss.flexpay.enums.UserType
import com.mss.flexpay.model.User
import java.util.UUID

class UserRequest(
    val id: String?,
    val name: String,
    val userType: UserType,
    val email: String
) {
    fun userRequestToBO(
        id: String?,
        name: String,
        userType: UserType,
        email: String
    ): User {
        return User(
            id = id?.takeIf { it.isNotBlank() } ?: UUID.randomUUID().toString(),
            name,
            userType,
            email
        )
    }
}