package com.example.ndhung.demo_android_20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class HelloAndroid extends AppCompatActivity {
    /** Declare variables*/
    EditText editText;
    Button addButton;
    TextView textView;
    ListView listView;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_android);
    }
}
