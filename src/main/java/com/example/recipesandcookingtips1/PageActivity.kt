package com.example.recipesandcookingtips1

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class PageActivity() : AppCompatActivity() {
    val recipeDescriptionLauncher : ActivityResultLauncher<Intent?>? = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) {
            result ->
        if(result.resultCode== RESULT_OK) {
        }
    }

    var RecipeList:ArrayList<Recipe> =  ArrayList<Recipe>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        RecipeList = ArrayList()
        val res = resources
        val allRecipes = res.getStringArray(R.array.Recipes)
        val allAuthors = res.getStringArray(R.array.authors)

        pupoluateRecipeList(allRecipes, allAuthors)

        //setting adapter and listview
        val adapter = RecipesAdapter(
            applicationContext,
            RecipeList
        )
        val listview = findViewById<ListView>(R.id.list_recipes)
        listview.adapter = adapter

        listview.setOnItemClickListener { _, _, position, _ ->
            recipeDescriptionLauncher?.launch(Intent(this,RecipeInfoActivity::class.java).putExtra("recipe",RecipeList[position]))
        }
    }

    fun pupoluateRecipeList(Recipes: Array<String?>, authors: Array<String?>) {
        RecipeList.add(Recipe(Recipes[0]!!, authors[0]!!, R.drawable.cheesecakeimage))
        RecipeList.add(Recipe(Recipes[1]!!, authors[1]!!, R.drawable.cookiesimage))
        RecipeList.add(Recipe(Recipes[2]!!, authors[2]!!, R.drawable.crepeimage))
        RecipeList.add(Recipe(Recipes[3]!!, authors[3]!!, R.drawable.donutsimage))
        RecipeList.add(Recipe(Recipes[4]!!, authors[4]!!, R.drawable.honeycakeimage))
        RecipeList.add(Recipe(Recipes[5]!!, authors[5]!!, R.drawable.mochiimage))
        RecipeList.add(Recipe(Recipes[6]!!, authors[6]!!, R.drawable.pancakeimage))
        RecipeList.add(Recipe(Recipes[7]!!, authors[7]!!, R.drawable.vanillaicecreamimage))
    }
}