package com.example.lab5;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.fragment.NavHostFragment;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private View myView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.


        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            //Toast.makeText(getApplicationContext(), "Shuffle", Toast.LENGTH_SHORT).show();
            Snackbar.make(findViewById(R.id.id_content_main), "Settings", Snackbar.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.about) {
            Snackbar.make(findViewById(R.id.id_content_main), "Action 1", Snackbar.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.help) {
            Snackbar.make(findViewById(R.id.id_content_main), "Action 2", Snackbar.LENGTH_LONG).show();
            return true;
        }

        if (id==R.id.fragment1)
        {
            NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).navigate(R.id.action1);
        }

        if (id==R.id.fragment2)
        {
            NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).navigate(R.id.action2);
        }

        if (id==R.id.fragment3)
        {
            NavHostFragment.findNavController(getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment)).navigate(R.id.action3);
        }

        return super.onOptionsItemSelected(item);
    }
}