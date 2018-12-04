package com.example.a15104163d.mapbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.InputStream;
import java.util.List;

public class Display_Info extends AppCompatActivity {

    Button update, back1, display;
    Switch mswitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_info);

        TextView name = (TextView) findViewById(R.id.name_display);
        TextView age_user = (TextView) findViewById(R.id.age);
        TextView blood_type = (TextView) findViewById(R.id.blood);
        TextView email_ = (TextView) findViewById(R.id.email_display);
        TextView contact = (TextView) findViewById(R.id.phone_display);
        TextView address = (TextView) findViewById(R.id.address);
        TextView street = (TextView) findViewById(R.id.stree_name);

        // switch button
        mswitch =findViewById(R.id.switch1);
        mswitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){


                    // display default information
                    display = (Button) findViewById(R.id.display);
                    display.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(Display_Info.this, "Display updated Infomation.", Toast.LENGTH_SHORT).show();


                            name.setText(PersonalInfo.save[0]);
                            age_user.setText(PersonalInfo.save[1]);


                            blood_type.setText(PersonalInfo.save[2]);

                            contact.setText(PersonalInfo.save[3]);
                            email_.setText(PersonalInfo.save[4]);
                            address.setText(PersonalInfo.save[5]);
                            street.setText(PersonalInfo.save[6]);

                        }
                    });

                }else {

                    // load default infomation

                    //String[] new_info = PersonalInfo.save;

                    String[] default_info ={"Happy" , "67" , "A", "Happyhahaha@.321com", "87654321" , "Whampoa Garden", "Hung Hom,Kowllon,Hong Kong"};

                    display = (Button) findViewById(R.id.display);
                    display.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Toast.makeText(Display_Info.this, "Display User Default Infomation.", Toast.LENGTH_SHORT).show();

                            name.setText(default_info[0]);
                            age_user.setText(default_info[1]);


                            blood_type.setText( default_info[2]);

                            email_.setText(default_info[3]);
                            contact.setText(default_info[4]);
                            address.setText(default_info[5]);
                            street.setText(default_info[6]);

                        }
                    });

                }
            }
        });

        update = (Button) findViewById(R.id.update_bn);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.personal_info);

                Intent update = new Intent(Display_Info.this, PersonalInfo.class);
                startActivity(update);
                Display_Info.this.fileList();

            }
        });

        back1 = (Button) findViewById(R.id.back1);
        back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent back_3 = new Intent(Display_Info.this,HomePage.class);
                startActivity(back_3);
                Display_Info.this.fileList();
            }
        });

    }

}
