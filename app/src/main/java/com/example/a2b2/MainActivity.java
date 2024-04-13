/*Create First Activity to accept information like Teacher having First Name, [20 Marks]
Middle Name, Last Name, Date of birth, Address, Mobile No.,
Specialization and display all information on Second Activity when user
click on Submit button.*/

package com.example.a2b2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et1 = findViewById(R.id.et1);
        EditText et2 = findViewById(R.id.et2);
        EditText et3 = findViewById(R.id.et3);
        EditText et4 = findViewById(R.id.et4);
        EditText et5 = findViewById(R.id.et5);
        EditText et6 = findViewById(R.id.et6);
        EditText et7 = findViewById(R.id.et7);
        Button b1 = findViewById(R.id.b1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String f_name = et1.getText().toString();
                String m_name= et2.getText().toString();
                String l_name = et3.getText().toString();
                String dob = et4.getText().toString();
                String address= et5.getText().toString();
                String m_no = et6.getText().toString();
                String spellization = et7.getText().toString();

                Intent i = new Intent(getApplicationContext(),New.class);
                i.putExtra("f_name",f_name);
                i.putExtra("m_name", m_name);
                i.putExtra("l_name", l_name);
                i.putExtra("dob",dob);
                i.putExtra("address", address);
                i.putExtra("m_no",m_no);
                i.putExtra("spellization",spellization);
                startActivity(i);


            }
        });
    }
}