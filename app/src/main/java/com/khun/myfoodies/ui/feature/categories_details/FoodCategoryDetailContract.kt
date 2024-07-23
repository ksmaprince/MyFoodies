package com.khun.myfoodies.ui.feature.categories_details

import com.khun.myfoodies.data.model.FoodItem

class FoodCategoryDetailContract {
    data class State(
        val category: FoodItem?,
        val categories: List<FoodItem>
    )
}