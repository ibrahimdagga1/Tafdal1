package com.example.tafdal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tafdal.databinding.ActivityLoginBinding;

public class Register extends AppCompatActivity {

    EditText et_name , et_mobile ,et_phone,et_title,et_email,et_password;
    Button btn_reg ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        et_name = findViewById(R.id.register_et_name);
        et_email = findViewById(R.id.register_et_email);
        et_mobile = findViewById(R.id.register_et_mobile);
        et_phone = findViewById(R.id.register_et_phone);
        et_title = findViewById(R.id.register_et_title);
        et_password = findViewById(R.id.register_et_password);
        btn_reg = findViewById(R.id.register_btn_login);

        btn_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(Register.this,Login.class);
                Register.this.startActivity(mainIntent);
                Register.this.finish();
            }
        });







    }
}