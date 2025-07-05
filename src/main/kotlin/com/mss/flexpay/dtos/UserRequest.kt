package com.mss.flexpay.dtos

import com.mss.flexpay.enums.UserType
import com.mss.flexpay.model.User

class UserRequest(
    val id: Long?,
    val name: String,
    val userType: UserType,
    val email: String
) {
    fun userRequestToBO(
        id: Long?,
        name: String,
        userType: UserType,
        email: String
    ): User {
        return User(
            id = id,
            name,
            userType,
            email
        )
    }
}
