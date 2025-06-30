package com.mss.flexpay.controller

import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.model.User
import com.mss.flexpay.service.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/users")
class UserController {

    @Autowired
    private lateinit var userService: UserService


    @PostMapping
    @RequestMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(
        @RequestBody
        userRequest: UserRequest
    ): User {
        val user = userRequest.userRequestToBO(
            id = userRequest.id,
            name = userRequest.name,
            userType = userRequest.userType,
            email = userRequest.email
        )
        userService.createUser(user)
        return user
    }
}