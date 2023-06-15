//package com.capstoneBangkit.konseria.data.network
//
//import retrofit2.http.Field
//import retrofit2.http.FormUrlEncoded
//import retrofit2.http.POST
//
//interface ApiService {
//    @FormUrlEncoded
//    @POST("register")
//    suspend fun postSignUp(
//        @Field("name") name: String,
//        @Field("email") email: String,
//        @Field("password") password: String
//    ): RegisterResponse
//
//    @FormUrlEncoded
//    @POST("login")
//    suspend fun postLogin(
//        @Field("email") email: String,
//        @Field("password") password: String
//    ): LoginResponse