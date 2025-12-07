package com.mss.flexpay.service

import com.mss.flexpay.enums.UserType
import com.mss.flexpay.model.User
import com.mss.flexpay.repository.UserRepository
import io.mockk.coEvery
import io.mockk.junit5.MockKExtension
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertNotNull
import org.junit.jupiter.api.extension.ExtendWith
import java.util.UUID
import kotlin.test.assertEquals

@ExtendWith(MockKExtension::class)
class UserServiceImplTest {


    private val userRepository: UserRepository = mockk()
    private val userService = UserServiceImpl(userRepository)

    @Test
    fun `should return a user`() = runTest {
        val uuid = UUID.randomUUID()
        val usuarioEsperado = User(
            id = uuid,
            name = "Jane Doe",
            email = "user@email.com",
            userType = UserType.SELLER
        )

        coEvery { userRepository.findById(uuid) } returns usuarioEsperado

        val resultado = userService.findById(uuid)

        assertNotNull(resultado)
        assertEquals(uuid, resultado.id)
        assertEquals("Jane Doe", resultado.name)
        assertEquals("user@email.com", resultado.email)
        assertEquals(UserType.SELLER, resultado.userType)
    }

    @Test
    fun `should throw exception when user not found by id`() = runTest {
        val uuid = UUID.randomUUID()

        coEvery { userRepository.findById(uuid) } returns null

        try {
            userService.findById(uuid)
        } catch (e: IllegalArgumentException) {
            assertEquals("Usuario nao encontrado com o id: $uuid", e.message)
        }
    }

    @Test
    fun `should create a user successfully`() = runTest {
        val uuid = UUID.randomUUID()
        val newUser = User(
            id = uuid,
            name = "Alice Smith",
            email = "email@email.com",
            userType = UserType.PAYER
        )
        coEvery { userRepository.save(newUser) } returns newUser
        val createdUser = userService.createUser(newUser)
        assertNotNull(createdUser)
        assertEquals("Alice Smith", createdUser.name)
    }
}

