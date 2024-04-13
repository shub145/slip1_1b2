package com.example.a2b2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class New extends Activity {
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
            TextView tv1 = findViewById(R.id.tv1);
            String dob = getIntent().getStringExtra("dob");
            tv1.setText("DOB = " + dob);
        }
}
