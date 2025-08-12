package com.mss.flexpay.controller

import com.mss.flexpay.converter.toNewUser
import com.mss.flexpay.converter.toUpdateUser
import com.mss.flexpay.dtos.UserRequest
import com.mss.flexpay.model.User
import com.mss.flexpay.service.UserServiceImpl
import jakarta.validation.Valid
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/api/v1/users")
class UserController(
    private val userService: UserServiceImpl
) {

    @PostMapping(("/create"))
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(
        @RequestBody
        userRequest: UserRequest
    ): User {
        val user = userRequest.toNewUser(
            name = userRequest.name,
            userType = userRequest.userType,
            email = userRequest.email
        )
     return userService.createUser(user)
    }

    @PutMapping("/update/{id}")
    @ResponseStatus(HttpStatus.OK)
    suspend fun updateUser(
        @PathVariable("uuid")
        @Valid
        uuid: String,
        @RequestBody
        userRequest: UserRequest
    ){
        val uuidFormated = toUUIDOrNull(uuid) ?: throw IllegalArgumentException("Invalid UUID format")
        val user = userRequest.toUpdateUser(
            id = uuidFormated
        )
        userService.updateUser(
         user
        )
    }
}

private fun toUUIDOrNull(id: String): UUID? {
    return try {
        UUID.fromString(id)
    } catch (_: IllegalArgumentException) {
        null
    }

}
