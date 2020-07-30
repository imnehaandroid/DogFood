package com.example.dogfood;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.SimpleTimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView current_tv =(TextView)findViewById(R.id.current_time);
        Button buybtn = findViewById(R.id.btn_buy);

        Calendar calendar = Calendar.getInstance();
        @SuppressLint("SimpleDateFormat") SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yy hh:mm");
        String dateTime = simpleDateFormat.format(calendar.getTime());
        current_tv.setText(dateTime);

        buybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCategory = new Intent(getApplicationContext(),FoodCategory.class);
                startActivity(goToCategory);
            }
        });

    }
}
