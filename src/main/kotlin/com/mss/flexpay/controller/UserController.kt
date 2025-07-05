package com.mss.flexpay.controller

import com.mss.flexpay.converter.toBO
import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.model.User
import com.mss.flexpay.service.UserServiceImpl
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userService: UserServiceImpl
) {

    @PostMapping
    @RequestMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(
        @RequestBody
        userRequest: UserRequest
    ): User {
        val user = userRequest.toBO(
            id = userRequest.id,
            name = userRequest.name,
            userType = userRequest.userType,
            email = userRequest.email
        )
        userService.createUser(user)
        return user
    }
}