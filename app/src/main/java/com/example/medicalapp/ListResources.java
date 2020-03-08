package com.example.medicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListResources extends BaseAdapter {
    ArrayList<Content> mydata;
    Context context;


    ListResources(Context context){
        this.context=context;
        mydata=new ArrayList<Content>();
        mydata.add(new Content("Pediatrics",R.drawable.boy));
        mydata.add(new Content("Gynecoiogist",R.drawable.maternity));
        mydata.add(new Content("Psychologist",R.drawable.stress));


    }



    @Override
    public int getCount() {
        return mydata.size();
    }

    @Override
    public Object getItem(int i) {
        return mydata.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.grid_view,parent,false);

        TextView tvtitle=row.findViewById(R.id.tvtitle);
        ImageView img=row.findViewById(R.id.img);

        final Content temp=mydata.get(i);

        tvtitle.setText(temp.title);
        img.setImageResource(temp.img);
        return row;
    }
}
