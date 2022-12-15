package com.example.tectfletx.util

import arrow.core.Either
import arrow.core.left
import arrow.core.right
import retrofit2.HttpException
import java.io.IOException


fun Throwable.toError():com.example.domain.Error = when (this) {
    is IOException -> com.example.domain.Error.Connectivity
    is HttpException -> com.example.domain.Error.Server(code())
    else -> com.example.domain.Error.Unknown(message ?: "")
}

suspend fun <T> tryCall(action: suspend () -> T): Either<com.example.domain.Error, T> = try {
    action().right()
} catch (e: Exception) {
    e.toError().left()
}