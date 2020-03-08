package com.example.medicalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import android.widget.Toast;

public class Details extends AppCompatActivity {

    TextView tvName,tvPhone,tvTitle,tvAddress,tvfeed;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        tvName=findViewById(R.id.tvName);
        tvTitle=findViewById(R.id.tvtitle);
        tvAddress=findViewById(R.id.tvAddress);
        tvfeed=findViewById(R.id.tvfeed);
        tvPhone=findViewById(R.id.tvPhone);
        img=findViewById(R.id.img);

        GridView list=findViewById(R.id.gridView);
        list.setAdapter(new ListAdapter(this));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.itemone:
                startActivity(new Intent(Details.this,HomePage.class));
                break;

            case R.id.itemthree:
                startActivity(new Intent(Details.this,About.class));
                break;
            case R.id.itemfour:
                Intent i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,"For you"+"\n https://play.google.com/store/apps/details?id=package com.example.medicalapp");
                i.setType("text/plain");
                startActivity(Intent.createChooser(i,"For You"));
                break;

            case R.id.itemfive:
                startActivity(new Intent(Details.this,AboutApp.class));
                break;
            case R.id.itemsix:
                Intent intent=new Intent(Details.this,MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                break;
            default:
                Toast.makeText(this,"some thing is wrong",Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}
