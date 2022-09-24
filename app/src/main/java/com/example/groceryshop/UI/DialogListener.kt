package com.example.groceryshop.UI

import com.example.groceryshop.Database.Entity.GroceryItems

//package com.example.grocerylist.UI

//import com.example.groceryshop.Database.Entity.GroceryItems

interface DialogListener {

    // Create a function to add items
    // in GroceryItems on clicking
    fun onAddButtonClicked(item: GroceryItems)
}
