package com.example.groceryshop.UI

import com.example.groceryshop.Database.Entity.GroceryItems
import com.example.groceryshop.Database.*

/*class GroceryViewModel {
}
package com.example.grocerylist.UI
*/
import androidx.lifecycle.ViewModel
import com.example.groceryshop.GroceryRepository
//import com.example.groceryshop.Database.Entity.GroceryItems
//import com.example.groceryshop.Database.GroceryRepository
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class GroceryViewModel(private val repository: GroceryRepository) : ViewModel() {

    // In coroutines thread insert item in insert function.
    fun insert(item: GroceryItems) = GlobalScope.launch {
        repository.insert(item)
    }

    // In coroutines thread delete item in delete function.
    fun delete(item: GroceryItems) = GlobalScope.launch {
        repository.delete(item)
    }

    //Here we initialized allGroceryItems function with repository
    fun allGroceryItems() = repository.allGroceryItems()

}
