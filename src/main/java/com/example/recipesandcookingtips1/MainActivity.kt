package com.example.recipesandcookingtips1

import android.content.Intent
import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var btn: Button
    private lateinit var recipeList: ArrayList<Recipe>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.saveUsernameButton)
        btn.setOnClickListener {
            val intent = Intent(this, PageActivity::class.java)
            startActivity(intent)
            finish()
        }

        recipeList = ArrayList()
        /*
        // Получаем массивы строк из ресурсов
        val res: Resources = resources
        val allRecipes: Array<String> = res.getStringArray(R.array.Recipes)
        val allAuthors: Array<String> = res.getStringArray(R.array.authors)

        populateRecipeList(allRecipes, allAuthors)

        // Установка адаптера и ListView
        val adapter = RecipesAdapter(applicationContext, recipeList)
        val listView: ListView = findViewById(R.id.Recipes_List)
        listView.adapter = adapter*/
    }

    private fun populateRecipeList(recipes: Array<String>, authors: Array<String>) {
        recipeList.add(Recipe(recipes[0], authors[0], R.drawable.cheesecakeimage))
        recipeList.add(Recipe(recipes[1], authors[1], R.drawable.cookiesimage))
        recipeList.add(Recipe(recipes[2], authors[2], R.drawable.crepeimage))
        recipeList.add(Recipe(recipes[3], authors[3], R.drawable.donutsimage))
        recipeList.add(Recipe(recipes[4], authors[4], R.drawable.honeycakeimage))
        recipeList.add(Recipe(recipes[5], authors[5], R.drawable.mochiimage))
        recipeList.add(Recipe(recipes[6], authors[6], R.drawable.pancakeimage))
        recipeList.add(Recipe(recipes[7], authors[7], R.drawable.vanillaicecreamimage))
    }
}