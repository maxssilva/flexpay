package com.mss.flexpay.enums

enum class UserType(string: String) {
    ADMIN("admin"),
    SELLER("seller"),
    PAYER("payer");

    override fun toString(): String {
        return name
    }
}