package com.example.recipesandcookingtips;


import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn1)

                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this,PageActivity.class);
                        startActivity(intent);
                        finish();
                    }
                });
    }

    import android.content.res.Resources;
    import android.os.Bundle;
    import android.widget.ListView;
    import androidx.appcompat.app.AppCompatActivity;
    import java.util.ArrayList;


    public class MainActivity extends AppCompatActivity {
        private ArrayList<Recipes> RecipeList;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            RecipeList = new ArrayList<>();

            //getting string arrays from resource
            Resources res = getResources();
            String[] allRecipes = res.getStringArray(R.array.Recipes);
            String[] allAuthors = res.getStringArray(R.array.authors);

            pupoluateRecipeList(allRecipes, allAuthors);

            //setting adapter and listview
            RecipesAdapter adapter = new RecipesAdapter(getApplicationContext(),
                    R.layout.list_item, RecipeList);
            ListView listview = findViewById(R.id.Recipes_List);
            listview.setAdapter(adapter);

        }

        public void pupoluateRecipeList(String[] Recipes, String[] authors) {
            RecipeList.add(new Recipe(Recipes[0], authors[0], R.drawable.Cheesecakeimage));
            RecipeList.add(new Recipe(Recipes[1], authors[1], R.drawable.CookiesImage));
            RecipeList.add(new Recipe(Recipes[2], authors[2], R.drawable.CrepeImage));
            RecipeList.add(new Recipe(Recipes[3], authors[3], R.drawable.DonutsImage));
            RecipeList.add(new Recipe(Recipes[4], authors[4], R.drawable.HoneycakeImage));
            RecipeList.add(new Recipe(Recipes[5], authors[5], R.drawable.MochiImage));
            RecipeList.add(new Recipe(Recipes[6], authors[6], R.drawable.PanCakeImage));
            RecipeList.add(new Recipe(Recipes[7], authors[7], R.drawable.VanillaicecreamImage));
        }

    }