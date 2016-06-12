package com.example.ndhung.demo_android_20;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.HashMap;
import java.util.List;

public class SimpleArrayAdapter extends ArrayAdapter<String> {

    Context context;
    int textViewResourceId;
    private static final String TAG = "SimpleArrayAdapter" ;
    HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    public SimpleArrayAdapter(HelloAndroid context, int textViewResourceId,
                              List<String> objects) {
        super(context, textViewResourceId, objects);
        this.context = context;
        this.textViewResourceId = textViewResourceId;
        for (int i = 0; i < objects.size(); ++i) {
            hashMap.put(objects.get(i), i);
        }
    }

    @Override
    public long getItemId(int position) {
        String item = getItem(position);
        return hashMap.get(item);
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public void add(String object){
        hashMap.put(object,hashMap.size());
        this.notifyDataSetChanged();
    }
}