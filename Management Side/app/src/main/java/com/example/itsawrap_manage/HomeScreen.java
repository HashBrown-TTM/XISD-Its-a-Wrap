package com.example.itsawrap_manage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    Button btn_assigned_orders, btn_orders,btn_employee_list,btn_menu,btn_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btn_assigned_orders = findViewById(R.id.btn_assigned_orders);
        btn_orders = findViewById(R.id.btn_orders);
        btn_employee_list = findViewById(R.id.btn_employee_list);
        btn_menu = findViewById(R.id.btn_menu);
        btn_profile = findViewById(R.id.btn_profile);


        btn_assigned_orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, DriverAssignedOrders.class));
            }
        });

        btn_orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, OrderScreen.class));
            }
        });

        btn_employee_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, EmployeeListScreen.class));
            }
        });

        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(HomeScreen.this, DriverAssignedOrders.class));
            }
        });

        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeScreen.this, ProfileScreen.class));
            }
        });
    }
}