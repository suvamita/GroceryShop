package com.example.groceryshop

import com.example.groceryshop.Database.Entity.GroceryItems

package com.example.groceryshop.Database

import com.example.groceryshop.Database.Entity.GroceryItems

class GroceryRepository(private val db: GroceryDatabase) {

    suspend fun insert(item: GroceryItems) = db.getGroceryDao().insert(item)
    suspend fun delete(item: GroceryItems) = db.getGroceryDao().delete(item)

    fun allGroceryItems() = db.getGroceryDao().getAllGroceryItems()
}
