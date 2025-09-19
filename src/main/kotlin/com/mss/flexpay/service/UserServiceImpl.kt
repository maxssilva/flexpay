package com.mss.flexpay.service

import com.mss.flexpay.model.User
import com.mss.flexpay.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {

    override suspend fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override suspend fun findById(id: UUID): User? {
        return userRepository.findById(id)
            ?: throw IllegalArgumentException("Usuario nao encontrado com o id: $id")
    }

    override suspend fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    override suspend fun updateUser(user: User): User {
       userRepository.findById(user.id)?: throw IllegalArgumentException("Usuario nao encontrado com o id: ${user.id}")
         return userRepository.updateUser(user)
    }

    override suspend fun deleteUser(id: UUID) {
    userRepository.findById(id)?: throw IllegalArgumentException("Usuario nao encontrado com o id: $id")
        return userRepository.deleteById(id)
    }
}

