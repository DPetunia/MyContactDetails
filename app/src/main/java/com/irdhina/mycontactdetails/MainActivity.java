package com.irdhina.mycontactdetails;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
public class MainActivity extends AppCompatActivity {
    ImageButton call,msg,email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call=findViewById(R.id.ibtnCall);
        msg=findViewById(R.id.ibtnSms);
        email=findViewById(R.id.ibtnMail);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phone_intent = new Intent(Intent.ACTION_CALL);
                // Set data of Intent through Uri
                // by parsing phone number
                phone_intent.setData(Uri.parse("tel:045383322"));
                // start Intent
                startActivity(phone_intent);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mail_intent=new
                        Intent(getApplicationContext(),sendMail.class);
                startActivity(mail_intent);
            }
        });
        msg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sms_intent=new
                        Intent(getApplicationContext(),sendSMS.class);
                startActivity(sms_intent);
            }
        });
    }
}