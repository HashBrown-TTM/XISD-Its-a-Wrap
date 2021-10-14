package com.example.itsawrap_manage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViewEmployeesScreen extends AppCompatActivity {

    Button btn_employees,btn_managers,btn_drivers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_employees_screen);

        btn_managers = findViewById(R.id.btn_managers);
        btn_employees = findViewById(R.id.btn_employees);
        btn_drivers = findViewById(R.id.btn_drivers);

        btn_managers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEmployeesScreen.this, ViewManagersScreen.class));
            }
        });

        btn_employees.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEmployeesScreen.this, ViewAllEmployeesScreen.class));
            }
        });

        btn_drivers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ViewEmployeesScreen.this, ViewDriversScreen.class));
            }
        });
    }
}