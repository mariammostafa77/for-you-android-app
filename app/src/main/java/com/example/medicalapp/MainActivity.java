package com.example.medicalapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Communicator {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createSign();


    }
    public void createSign(){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        SignIn signin=new SignIn();
        signin.setCommunicator(this);
        ft.replace(R.id.container,signin).commit();
    }


    public void changeFragment() {
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        Regestration regestration=new Regestration();
        ft.replace(R.id.container,regestration).commit();

    }

    @Override
    public void showToast() {
        Toast.makeText(MainActivity.this, "You have registered", Toast.LENGTH_SHORT).show();
    }
    @Override
    public void showToast2() {
        Toast.makeText(MainActivity.this, "some thing is wrong", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(getSupportFragmentManager().getBackStackEntryCount()>0){
            getSupportFragmentManager().popBackStack();
        }
        else{
            super.onBackPressed();
        }
    }
}
