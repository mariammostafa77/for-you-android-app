package com.example.medicalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    ArrayList<ContentTwo> data;
    Context context;
    public ListAdapter(Context context) {
        this.context = context;
        data = new ArrayList<ContentTwo>();
        data.add(new ContentTwo("Tarek Emara", "Glim:", "Mohamed bahaa eldin al ghatwary", "200LE","01023546780", R.drawable.doct));
        data.add(new ContentTwo("Mohamed Abd Eltwab", "Smoha:", "Takseem el kodah", "250LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Niveen Badr", "Smoha:", "Mohamed bahaa eldin al ghatwary", "380LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Marwa Ibrahim", "El-Agamy:", "El hanovil square", "120LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Bassant Ali", "ElManshia:", "Safr basha", "320LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Hamdy Elsayed", "El-Mandara:", "Gamal abdelnaser", "600LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("sana Barakat", "Mostafa kamel:", "Ahmed shawky", "300LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Ramy Ahmed", "El-Agamy:", "Fathallah twores", "100LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Hossam Romeh", "Smoha:", "Alhadara saed elgendy street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Mahmoud Hussein", "Smoha:", "Taawnyat smouha", "200LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("shimaa Raafat", "Smoha:", "Elfardous street", "340LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Hemat Aly", "Smoha:", "Street 314 branched of mostafa kamel", "200LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Naser Zahran", "Smoha:", "Souq computer", "280LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("Ammar Alani", "Smoha:", "Elfardous street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Tarek Emara", "Glim:", "Mohamed bahaa eldin al ghatwary", "200LE","01023546780", R.drawable.doct));
        data.add(new ContentTwo("Mohamed Abd Eltwab", "Smoha:", "Takseem el kodah", "250LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Niveen Badr", "Smoha:", "Mohamed bahaa eldin al ghatwary", "380LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Marwa Ibrahim", "El-Agamy:", "El hanovil square", "120LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Bassant Ali", "ElManshia:", "Safr basha", "320LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Hamdy Elsayed", "El-Mandara:", "Gamal abdelnaser", "600LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("sana Barakat", "Mostafa kamel:", "Ahmed shawky", "300LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Ramy Ahmed", "El-Agamy:", "Fathallah twores", "100LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Hossam Romeh", "Smoha:", "Alhadara saed elgendy street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Mahmoud Hussein", "Smoha:", "Taawnyat smouha", "200LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("shimaa Raafat", "Smoha:", "Elfardous street", "340LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Hemat Aly", "Smoha:", "Street 314 branched of mostafa kamel", "200LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Naser Zahran", "Smoha:", "Souq computer", "280LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("Ammar Alani", "Smoha:", "Elfardous street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Tarek Emara", "Glim:", "Mohamed bahaa eldin al ghatwary", "200LE","01023546780", R.drawable.doct));
        data.add(new ContentTwo("Mohamed Abd Eltwab", "Smoha:", "Takseem el kodah", "250LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Niveen Badr", "Smoha:", "Mohamed bahaa eldin al ghatwary", "380LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Marwa Ibrahim", "El-Agamy:", "El hanovil square", "120LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Bassant Ali", "ElManshia:", "Safr basha", "320LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Hamdy Elsayed", "El-Mandara:", "Gamal abdelnaser", "600LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("sana Barakat", "Mostafa kamel:", "Ahmed shawky", "300LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Ramy Ahmed", "El-Agamy:", "Fathallah twores", "100LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Hossam Romeh", "Smoha:", "Alhadara saed elgendy street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Mahmoud Hussein", "Smoha:", "Taawnyat smouha", "200LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("shimaa Raafat", "Smoha:", "Elfardous street", "340LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Hemat Aly", "Smoha:", "Street 314 branched of mostafa kamel", "200LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Naser Zahran", "Smoha:", "Souq computer", "280LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("Ammar Alani", "Smoha:", "Elfardous street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Tarek Emara", "Glim:", "Mohamed bahaa eldin al ghatwary", "200LE","01023546780", R.drawable.doct));
        data.add(new ContentTwo("Mohamed Abd Eltwab", "Smoha:", "Takseem el kodah", "250LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Niveen Badr", "Smoha:", "Mohamed bahaa eldin al ghatwary", "380LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Marwa Ibrahim", "El-Agamy:", "El hanovil square", "120LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Bassant Ali", "ElManshia:", "Safr basha", "320LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Hamdy Elsayed", "El-Mandara:", "Gamal abdelnaser", "600LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("sana Barakat", "Mostafa kamel:", "Ahmed shawky", "300LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Ramy Ahmed", "El-Agamy:", "Fathallah twores", "100LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Hossam Romeh", "Smoha:", "Alhadara saed elgendy street", "200LE", "01023546780", R.drawable.doc2));
        data.add(new ContentTwo("Mahmoud Hussein", "Smoha:", "Taawnyat smouha", "200LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("shimaa Raafat", "Smoha:", "Elfardous street", "340LE", "01023546780", R.drawable.msdoc2));
        data.add(new ContentTwo("Hemat Aly", "Smoha:", "Street 314 branched of mostafa kamel", "200LE", "01023546780", R.drawable.msdoc));
        data.add(new ContentTwo("Naser Zahran", "Smoha:", "Souq computer", "280LE", "01023546780", R.drawable.doct));
        data.add(new ContentTwo("Ammar Alani", "Smoha:", "Elfardous street", "200LE", "01023546780", R.drawable.doc2));
    }



        @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.list,parent,false);

        TextView tvName=row.findViewById(R.id.tvName);
        TextView tvTit=row.findViewById(R.id.tvtitle);
        TextView tvAddress=row.findViewById(R.id.tvAddress);
        TextView tvfeed=row.findViewById(R.id.tvfeed);
        TextView tvPhone=row.findViewById(R.id.tvPhone);
        ImageView img=row.findViewById(R.id.img);

        final ContentTwo temp=data.get(i);

        tvName.setText(temp.name);
        tvTit.setText(temp.tit);
        tvAddress.setText(temp.address);
        tvfeed.setText(temp.feed);
        tvPhone.setText(temp.phone);
        img.setImageResource(temp.img);
        return row;
    }
}
