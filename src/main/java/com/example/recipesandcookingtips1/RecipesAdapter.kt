package com.example.recipesandcookingtips1

import android.content.Context
import android.graphics.Color
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

        val titleRef : TextView= view.findViewById<TextView>(R.id.title_testview)
        titleRef.setText(itemRef.RecipesTile)
        view.findViewById<TextView>(R.id.author_textview).setText(itemRef.RecipesAuthor)
        view.findViewById<ImageView>(R.id.book_imageview).setImageResource(itemRef.RecipesImageId)

        return view
    }

    //TODO: Обработать событие нажатия на рецепт из списка:
    //  Обработка события происходит следующим образом:
    //  Из аргументов события определяется (выделяется) номер выбранного элемента
    //  Этот номер необходимо будет передать в новое окно (новая activity)
    //  Далее при создании окна нового activity в этом новом окно будет определятся, какие данные необходимо показывать на экране в соответствии с номером выбранного рецепта
    //  Номер выбранного рецепта будет указывать на номер рецепта из ресурсов, т.е. каждому номеру свои данные на главном экране

    //TODO: Необходимо добавить список строк для подробного описания каждого рецепта
}