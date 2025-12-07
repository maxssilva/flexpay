package com.mss.flexpay.utils

import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.enums.UserType.SELLER
import com.mss.flexpay.model.User

object MockFactory {
    fun userRequestMock(): UserRequest {
        return UserRequest(
            name = "user test",
            userType = SELLER,
            email = "userTest@email.com"
        )
    }

    fun userMock(): User {
        return User(
            id = java.util.UUID.randomUUID(),
            name = "user test",
            userType = SELLER,
            email = "usertest2@email.com"
        )
    }
}