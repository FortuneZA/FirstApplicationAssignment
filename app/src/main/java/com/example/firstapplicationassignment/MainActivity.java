package com.example.firstapplicationassignment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
   //Activity Life Cycle
//---------------------------------------------------------------

    //onCreate()

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        System.out.println("Hello World");
        System.out.println("onCreate");

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
    }
//onStart()
    protected void onStart()
    {
        super.onStart();
        System.out.println("onStart");
    }
//onResume()

    protected void onResume()
    {
        super.onResume();
        System.out.println("onResume");
    }

//onRestart()

    protected void onRestart()
    {
        super.onRestart();
        System.out.println("onRestart");
    }

//onPause()

    protected void onPause()
    {
        super.onPause();
        System.out.println("onPause");
    }


//onStop()

    protected void onStop()
    {
        super.onStop();
        System.out.println(onStop);
    }

 //onDestroy

    protected void onDestroy()
    {
        super.onDestroy();
        System.out.println("onDestroy");
    }

    //--------------------------------------------------------------------
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automaticall y handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
