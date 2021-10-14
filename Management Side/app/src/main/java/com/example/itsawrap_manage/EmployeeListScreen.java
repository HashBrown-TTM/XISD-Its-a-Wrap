package com.example.itsawrap_manage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmployeeListScreen extends AppCompatActivity {

    Button btn_view_emp, btn_add_new_emp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_list_screen);

        btn_view_emp = findViewById(R.id.btn_view_employees);
        btn_add_new_emp = findViewById(R.id.btn_add_new_employee);

        btn_view_emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeeListScreen.this, ViewEmployeesScreen.class));
            }
        });

        btn_add_new_emp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EmployeeListScreen.this, CreateAccountScreen.class));
            }
        });
    }
}