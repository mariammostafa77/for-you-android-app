package com.example.medicalapp;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Intent;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class SignIn extends Fragment {
    Button btnRegester,btnSignForm;
    EditText user,pass;
    Communicator communicator;
    CheckBox checkpass2;
    static MyDB myDB;
    public SignIn() {

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sign_in, container, false);
        user=v.findViewById(R.id.etUserName);
        pass=v.findViewById(R.id.etPassword);
        myDB=new MyDB((MainActivity)getActivity());
        btnRegester = v.findViewById(R.id.btnRegester);
        btnSignForm=v.findViewById(R.id.btnSignInForm);
        checkpass2=v.findViewById(R.id.checkpass2);
        myDB=new MyDB(((MainActivity)getActivity()));
        //start of show password
        checkpass2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(!isChecked){

                    // show password
                    pass.setTransformationMethod(PasswordTransformationMethod.getInstance());

                    Log.i("checker", "true");
                }

                else{
                    Log.i("checker", "false");

                    // hide password
                    pass.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }

            }
        });
        btnSignForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = user.getText().toString().trim();
                String password = pass.getText().toString().trim();
                Cursor c=SignIn.myDB.userLoginCheck(username,password);
                c.moveToFirst();
                if(c==null){
                    Toast.makeText((MainActivity)getActivity(), "Invalid username or password", Toast.LENGTH_SHORT).show();
                }
                else {
                    String name1=c.getString(0);
                    String password1=c.getString(1);
                    if(password.equals(password1)) {

                        Intent intent = new Intent((MainActivity) getActivity(), HomePage.class);
                        startActivity(intent);
                        user.setText("");
                        pass.setText("");
                    }

                    else{
                        Toast.makeText((MainActivity)getActivity(), "Invalid username or password", Toast.LENGTH_SHORT).show();
                    }
                }

            }

        });
        btnRegester.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                communicator.changeFragment();
            }
        });
        user.addTextChangedListener(login);
        pass.addTextChangedListener(login);
        return v;

    }

    public void setCommunicator(Communicator communicator) {
        this.communicator = communicator;
    }
    private TextWatcher login = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String userName = user.getText().toString().trim();
            String password = pass.getText().toString().trim();
            btnSignForm.setEnabled(!userName.isEmpty() && !password.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}