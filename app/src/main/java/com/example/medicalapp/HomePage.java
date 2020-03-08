package com.example.medicalapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        GridView grideView=findViewById(R.id.gridView);
        grideView.setAdapter(new ListResources(this));


        grideView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i=new Intent(HomePage.this, Details.class);
                startActivity(i);
            }
        });
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
               // startActivity(new Intent(HomePage.this,HomePage.class));
                break;
           /* case R.id.itemtwo:
                startActivity(new Intent(Details.this,HomePage.class));
                break;*/
            case R.id.itemthree:
                startActivity(new Intent(HomePage.this,About.class));
                break;
            case R.id.itemfour:
                Intent i=new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,"For you"+"\n https://play.google.com/store/apps/details?id=package com.example.medicalapp");
                i.setType("text/plain");
                startActivity(Intent.createChooser(i,"For You"));
                break;

            case R.id.itemfive:
                startActivity(new Intent(HomePage.this,AboutApp.class));
                break;
            case R.id.itemsix:
                Intent intent=new Intent(HomePage.this,MainActivity.class);
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
