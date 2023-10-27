package com.houda.actionbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView myText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        myText = findViewById(R.id.menu_message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings){
            // User chose the "Settings" item, show the app settings UI...
            myText.setText(getString(R.string.action_settings));
            return true;
        } else if (item.getItemId() == R.id.action_home) {
            // User chose the "Home" action, ...
            myText.setText(getString(R.string.action_home));
            return true;
        } else if (item.getItemId() == R.id.action_search) {
            // User chose the "Search" action, ...
            myText.setText(getString(R.string.action_search));
            return true;
        } else if (item.getItemId() == R.id.action_item_a) {
            // User chose the "item2" action, ...
            myText.setText(getString(R.string.action_item_a));
            return true;
        } else if (item.getItemId() == R.id.action_item_b) {
            // User chose the "item2" action, ...
            myText.setText(getString(R.string.action_item_b));
            return true;
        }else {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            return super.onOptionsItemSelected(item);
        }
    }
}