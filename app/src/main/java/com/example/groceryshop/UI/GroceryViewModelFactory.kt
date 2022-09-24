package com.example.groceryshop.UI

import com.example.groceryshop.GroceryRepository

//import com.example.groceryshop.GroceryRepository

//package com.example.grocerylist.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.groceryshop.Database.*
//import com.example.groceryshop.GroceryRepository

class GroceryViewModelFactory(private val repository: GroceryRepository):ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return GroceryViewModel(repository) as T
    }
}
