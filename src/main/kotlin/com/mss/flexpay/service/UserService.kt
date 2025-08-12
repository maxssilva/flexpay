package com.mss.flexpay.service

import com.mss.flexpay.model.User

interface UserService{
    fun createUser(user: User): User
    fun getUserById(id: String): User?
    fun getAllUsers(): List<User>
    suspend  fun updateUser(user: User): User
    fun deleteUser(id: String)
}