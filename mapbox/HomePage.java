package com.example.a15104163d.mapbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener {


    TextView HyperLink;
    Spanned Text;
    private NavigationView navigationView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        //根据不同的id点击不同按钮控制activity需要做的事件
        switch (item.getItemId()) {


            case R.id.view_info:
                Toast.makeText(this, "Display User Profile", Toast.LENGTH_SHORT).show();
                Intent intent0 = new Intent(HomePage.this,Display_Info.class);
                startActivity(intent0);
                HomePage.this.fileList();
                break;

            case R.id.user_info:
                Toast.makeText(this, "Update User Profile", Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(HomePage.this,PersonalInfo.class);
                startActivity(intent1);
                HomePage.this.fileList();
                break;

            case R.id.reminder:
                Toast.makeText(this, "Open Reminders", Toast.LENGTH_SHORT).show();
                Intent intent2 = new Intent(HomePage.this,Reminder_Activity.class);
                startActivity(intent2);
                HomePage.this.fileList();
                break;

            case R.id.navigation:
                Toast.makeText(this, "Start Navigation", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(HomePage.this,MainActivity.class);
                startActivity(intent4);
                HomePage.this.fileList();

                break;
            case R.id.settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                Intent intent5 = new Intent(HomePage.this, Other.class);
                startActivity(intent5);
                HomePage.this.fileList();
                break;
        }
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.view_info) {
            Toast.makeText(this, "Display User Profile", Toast.LENGTH_SHORT).show();
            Intent intent0 = new Intent(HomePage.this, Display_Info.class);
            startActivity(intent0);
            HomePage.this.fileList();
        }

        if (id == R.id.user_info){

            Toast.makeText(this, "Update User Profile", Toast.LENGTH_SHORT).show();
            Intent intent1 = new Intent(HomePage.this,PersonalInfo.class);
            startActivity(intent1);
            HomePage.this.fileList();
        }
        if (id == R.id.reminder){

            Toast.makeText(this, "Open Reminders", Toast.LENGTH_SHORT).show();
            Intent intent2 = new Intent(HomePage.this,Reminder_Activity.class);
            startActivity(intent2);
            HomePage.this.fileList();

        }
        if (id == R.id.navigation){

            Toast.makeText(this, "Start Navigation", Toast.LENGTH_SHORT).show();
            Intent intent4 = new Intent(HomePage.this,MainActivity.class);
            startActivity(intent4);
            HomePage.this.fileList();

        }
        if (id == R.id.settings){
            Toast.makeText(this, "Additional Functions", Toast.LENGTH_SHORT).show();
            Intent intent5 = new Intent(HomePage.this, Other.class);
            startActivity(intent5);
            HomePage.this.fileList();

        }


        return true;
    }
}
