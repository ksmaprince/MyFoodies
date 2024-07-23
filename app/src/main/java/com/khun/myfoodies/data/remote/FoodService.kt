package com.khun.myfoodies.data.remote

import com.khun.myfoodies.data.model.FoodCategoriesResponse
import com.khun.myfoodies.data.model.MealsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface FoodService {
    @GET("categories.php")
    suspend fun getFoodCategories(): FoodCategoriesResponse

    @GET("filter.php")
    suspend fun getFoodByCategory(@Query("c") category: String): MealsResponse
}