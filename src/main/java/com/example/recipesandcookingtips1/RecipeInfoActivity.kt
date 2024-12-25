package com.example.recipesandcookingtips1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class RecipeInfoActivity : AppCompatActivity() {
    companion object ImagesNumberArray{
        val Images: Array<Int> = arrayOf(
            R.drawable.cheesecakeimage,
            R.drawable.cookiesimage,
            R.drawable.crepeimage,
            R.drawable.donutsimage,
            R.drawable.honeycakeimage,
            R.drawable.mochiimage,
            R.drawable.pancakeimage,
            R.drawable.vanillaicecreamimage
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_info)


        val selectedRecipe : Recipe? = intent.extras?.getSerializable("recipe") as Recipe

        if(selectedRecipe != null) {
            findViewById<ImageView>(R.id.book_imageview).setImageResource(selectedRecipe.RecipesImageId)
            findViewById<TextView>(R.id.title_testview).setText(selectedRecipe.RecipesTile)
            findViewById<TextView>(R.id.author_textview).setText(selectedRecipe.RecipesAuthor)

            val resArray = resources.getStringArray(R.array.Recipes)
            var selectedNumber : Int = -1
            for(i in 0..resArray.size){
                if(resArray[i]==selectedRecipe.RecipesTile) {
                    selectedNumber=i
                    break
                }
            }

            findViewById<TextView>(R.id.descriptionTextView).setText(resources.getStringArray(R.array.descriptions)[selectedNumber])
        }
        //finish()
    }
}