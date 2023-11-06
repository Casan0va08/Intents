package com.example.intents;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View view)
    {
        // Button b = (Button)view;

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);


        if (view.getId() == R.id.b1)
        {
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
        }

        else if (view.getId() == R.id.b2)
        {
            Intent intent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.es"));
            startActivity(intent2);
        }

        else if (view.getId() == R.id.b3)
        {
            Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:112"));
            startActivity(intent3);
        }

        else if (view.getId() == R.id.b4)
        {
            Intent intent4 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.2, 2.1"));
            startActivity(intent4);
        }

        else if (view.getId() == R.id.b5)
        {
            Intent intent5 = new Intent(Intent.ACTION_WEB_SEARCH);
            intent5.putExtra(SearchManager.QUERY, "Texto a buscar");
            startActivity(intent5);
        }

    }
}