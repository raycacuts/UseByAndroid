package com.example.useby.ai

import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface OpenAiApi {
    @Headers("Content-Type: application/json")
    @POST("/v1/chat/completions")
    suspend fun chat(@Body body: Map<String, Any>): Map<String, Any>
}

object OpenAiClient {
    // TODO: build Retrofit with your API key (from secure storage) and use function to parse OCR text to item + expiry
}
