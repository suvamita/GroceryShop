package com.example.groceryshop

import com.example.groceryshop.Database.Entity.GroceryItems

package com.example.groceryshop.Database

import androidx.lifecycle.LiveData
import androidx.room.*

// This class is used to create
// function for database.
@Dao
interface GroceryDao {

    // Insert function is used to
    // insert data in database.
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: GroceryItems)

    // Delete function is used to
    // delete data in database.
    @Delete
    suspend fun delete(item: GroceryItems)

    // getAllGroceryItems function is used to get
    // all the data of database.
    @Query("SELECT * FROM grocery_items")
    fun getAllGroceryItems(): LiveData<List<GroceryItems>>
}
