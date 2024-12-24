package com.example.recipesandcookingtips1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

public class RecipesAdapter (var context: Context, var RecipeList:ArrayList<Recipe>): BaseAdapter() {
    override fun getCount(): Int {
        return RecipeList.count()
    }

    override fun getItem(p0: Int): Any {
        return RecipeList.elementAt(p0)
    }

    override fun getItemId(p0: Int): Long {
        return RecipeList.elementAt(p0).RecipesImageId.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View=convertView ?: LayoutInflater.from(context).inflate(R.layout.list_item,parent,false)
        val itemRef=getItem(position) as Recipe

        view.findViewById<TextView>(R.id.title_testview).text=itemRef.RecipesTile
        view.findViewById<TextView>(R.id.author_textview).text=itemRef.RecipesAuthor
        view.findViewById<ImageView>(R.id.book_imageview).setImageResource(itemRef.RecipesImageId)

        return view
    }
}