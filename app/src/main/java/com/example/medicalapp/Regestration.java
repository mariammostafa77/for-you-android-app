package com.example.medicalapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class Regestration extends Fragment {
    Communicator communicator;
    Button btnSignIn,btnRegestrationForm;
    CheckBox checkpass;
    static MyDB myDB;
    EditText etemail,etUser, edPassword ;

    public Regestration() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.regestration, container, false);
//start of views which in xml file
        btnSignIn = v.findViewById(R.id.btnSignIn);
        edPassword=v.findViewById(R.id.etPassword);
        checkpass=v.findViewById(R.id.checkpass);
        etUser=v.findViewById(R.id.etUserName);
        etemail=v.findViewById(R.id.etemail);
        myDB=new MyDB(((MainActivity)getActivity()));
        btnRegestrationForm=v.findViewById(R.id.btnRegestrationForm);
//end of views which in xml file
//start of code that enable send data to database and go to sign in activity

        btnRegestrationForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1=etemail.getText().toString().trim();
                String s2=etUser.getText().toString().trim();
                String s3=edPassword.getText().toString().trim();
                boolean result=Regestration.myDB.insert(s2,s1,s3);
                if(result){
                    Intent intent = new Intent((MainActivity) getActivity(), HomePage.class);
                    startActivity(intent);
                    Toast.makeText((MainActivity)getActivity(), "Register Succeffully", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText((MainActivity)getActivity(), "Register Failed", Toast.LENGTH_SHORT).show();
                }


            }
        });



//end of code that enable send data to database and go to sign in activity

//start of show password
        checkpass.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){

                    // show password
                    edPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());

                    Log.i("checker", "true");
                }

                else{
                    Log.i("checker", "false");

                    // hide password
                    edPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }

            }
        });
//end of show password
// start of click listener to go to sign in activity
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent((MainActivity)getActivity(),MainActivity.class));
            }
        });
        return v;

    }
// start of click listener to go to sign in activity

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }


}
