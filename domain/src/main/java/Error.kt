package com.example.domain

sealed interface Error {
    class Unknown(val message: String) : Error
    class Server(val code: Int) : Error
    object Connectivity : Error
}