package com.example.a15104163d.mapbox;

import android.Manifest;
import android.app.Activity;
import android.app.AppComponentFactory;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View.OnClickListener;
import android.widget.Toast;


public class Other extends AppCompatActivity {

    private Button call1, call2, call3, call4, call5, call6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other);


        call1 = (Button) findViewById(R.id.fm1);
        call1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String phoneNum = "1008611";

                Intent call1 = new Intent(Intent.ACTION_DIAL);
                call1.setData(Uri.parse("tel:" + phoneNum));

                Toast.makeText(Other.this, "Call Family 1", Toast.LENGTH_SHORT).show();


                if (ActivityCompat.checkSelfPermission(Other.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    return;
                }
                startActivity(call1);


            }
        });


        call2 = (Button) findViewById(R.id.fm2);
        call2.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String phoneNum = "66666666";
                Toast.makeText(Other.this, "Call Family 2", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNum));

                if (ActivityCompat.checkSelfPermission(Other.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    return;
                }
                startActivity(intent);
            }
        });

        call3 = (Button) findViewById(R.id.friend1);
        call3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String phoneNum = "66666666";
                Toast.makeText(Other.this, "Call Friend 1", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNum));

                if (ActivityCompat.checkSelfPermission(Other.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    return;
                }
                startActivity(intent);
            }
        });

        call4 = (Button) findViewById(R.id.friend2);
        call4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String phoneNum = "66666666";
                Toast.makeText(Other.this, "Call Friend 2", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNum));

                if (ActivityCompat.checkSelfPermission(Other.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    return;
                }
                startActivity(intent);
            }
        });

        call5 = (Button) findViewById(R.id.emer1);
        call5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String phoneNum = "66666666";
                Toast.makeText(Other.this, "Fire Alarm Call", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNum));

                if (ActivityCompat.checkSelfPermission(Other.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    return;
                }
                startActivity(intent);
            }
        });

        call6 = (Button) findViewById(R.id.emer2);
        call6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String phoneNum = "66666666";
                Toast.makeText(Other.this, "Call Ambulance", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNum));

                if (ActivityCompat.checkSelfPermission(Other.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    return;
                }
                startActivity(intent);
            }
        });


    }

    private void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                // TODO: Consider calling
                //    ActivityCompat#requestPermissions
                // here to request the missing permissions, and then overriding
                //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                //                                          int[] grantResults)
                // to handle the case where the user grants the permission. See the documentation
                // for ActivityCompat#requestPermissions for more details.
                return;
            }
            startActivity(intent);
        }
    }


}
