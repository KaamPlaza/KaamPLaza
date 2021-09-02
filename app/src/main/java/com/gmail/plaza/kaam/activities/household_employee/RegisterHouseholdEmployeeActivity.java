package com.gmail.plaza.kaam.activities.household_employee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

import com.gmail.plaza.kaam.R;

public class RegisterHouseholdEmployeeActivity extends AppCompatActivity {

    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_household_employee);

        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Register");
    }
}