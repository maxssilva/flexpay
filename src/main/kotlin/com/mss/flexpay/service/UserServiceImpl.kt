package com.mss.flexpay.service

import com.mss.flexpay.model.User
import com.mss.flexpay.repository.UserRepository
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class UserServiceImpl(
    private val userRepository: UserRepository
) : UserService {

    override fun createUser(user: User): User {
        return userRepository.save(user)
    }

    override suspend fun findById(id: UUID): User? {
        return userRepository.findById(id).orElseThrow { IllegalArgumentException("Usuario nao encontrado com o id: ${id}") }
    }

        override fun getAllUsers(): List<User> {
            // Implementation for retrieving all users
            TODO("Not yet implemented")
        }

        override suspend fun updateUser(user: User): User {
            userRepository.findById(user.id).orElseThrow { IllegalArgumentException("Usuário não encontrado para o id: ${user.id}") }
            return userRepository.save(
                user
            )
        }

        override fun deleteUser(id: String) {
            // Implementation for deleting a user
            TODO("Not yet implemented")
        }
    }
