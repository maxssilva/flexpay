package com.mss.flexpay.enums

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue

enum class UserType(private val value: String) {
    ADMIN("admin"),
    SELLER("seller"),
    PAYER("payer");

    @JsonValue
    fun getValue(): String = value

    companion object {
        @JvmStatic
        @JsonCreator
        fun fromValue(value: String): UserType =
            values().find { it.value.equals(value, ignoreCase = true) }
                ?: throw IllegalArgumentException("Invalid user type: $value")
    }}