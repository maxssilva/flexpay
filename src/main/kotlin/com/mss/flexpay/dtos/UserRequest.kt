package com.mss.flexpay.dtos

import com.mss.flexpay.model.User

class UserRequest(
    val id: String? = null,
    val name: String,
    val userType: String,
    val email: String,
    val password: String
) {
    fun userRequestToBO(
        id: String? = null,
        name: String,
        userType: String,
        email: String,
        password: String
    ): User {
        return User(
            id ?: this.id,
            name,
            com.mss.flexpay.enums.UserType.valueOf(userType.uppercase()),
            email,
            password
        )
    }
}