//package com.capstoneBangkit.konseria.data.network
//
//import android.content.Context
//import com.capstoneBangkit.konseria.utils.Preference
//import okhttp3.OkHttpClient
//import okhttp3.logging.HttpLoggingInterceptor
//import retrofit2.Retrofit
//import retrofit2.converter.gson.GsonConverterFactory
//
//class ApiConfig {
//    companion object{
//        private fun getInterceptor(token: String?): OkHttpClient {
//            val loggingInterceptor =
//                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
//
//            return if (token.isNullOrEmpty()) {
//                OkHttpClient.Builder()
//                    .addInterceptor(loggingInterceptor)
//                    .build()
//            } else {
//                OkHttpClient.Builder()
//                    .addInterceptor(AuthInterceptor(token))
//                    .addInterceptor(loggingInterceptor)
//                    .build()
//            }
//        }
//
//        fun getApiService(context: Context): ApiService {
//
//            val sharedPref = Preference.initPref(context, "onSignIn")
//            val token = sharedPref.getString("token", null).toString()
//
//            val retrofit = Retrofit.Builder()
//                .baseUrl("https://konseria-389710.et.r.appspot.com/konseria")
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(getInterceptor(token))
//                .build()
//            return retrofit.create(ApiService::class.java)
//        }
//    }
//}