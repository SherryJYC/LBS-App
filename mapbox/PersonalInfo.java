package com.example.a15104163d.mapbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.io.Serializable;
import java.util.List;

public class PersonalInfo extends AppCompatActivity {
    //TODO: Personal Information
    //Input data and dispaly data

    public static String[] save = new String[7];

    //String username, blood_type, Email, Address1, Address2, contact_no, age;
    Button submission, back_3;

    //List<String> save;

    EditText nameinput, bloodinput, emailinput, addinput1, addinput2, phone, userage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal_info);

        nameinput = (EditText) findViewById(R.id.name);
        bloodinput = (EditText) findViewById(R.id.blood);
        emailinput = (EditText) findViewById(R.id.email);
        addinput1 = (EditText) findViewById(R.id.addr1);
        addinput2 = (EditText) findViewById(R.id.addr2);
        phone = (EditText) findViewById(R.id.phone);
        userage = (EditText) findViewById(R.id.age);



        System.out.println(save[2]);

        // convert array to display_info activity
        //Intent convert = new Intent(PersonalInfo.this,Display_Info.class);
        //Bundle bundle = new Bundle();
        //bundle.putStringArray("new_info",save);
        //convert.putExtra("new",save);
        //startActivity(convert);


        // press save button to save infor to array
        submission = (Button) findViewById(R.id.sub_btn);
        submission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                save[0] = nameinput.getText().toString();
                save[1] = userage.getText().toString();
                save[2] = bloodinput.getText().toString();
                save[3] = phone.getText().toString();
                save[4] = emailinput.getText().toString();
                save[5] = addinput1.getText().toString();
                save[6] = addinput2.getText().toString();


                //setContentView(R.layout.display_info);
                System.out.println(save[0]);
                System.out.println("=========info===========");

                Intent update = new Intent(PersonalInfo.this, Display_Info.class);
                startActivity(update);
                PersonalInfo.this.fileList();

            }
        });
        back_3 = (Button) findViewById(R.id.back_3);
        back_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent update = new Intent(PersonalInfo.this, Display_Info.class);
                startActivity(update);
                PersonalInfo.this.fileList();

            }
        });

    }

}
