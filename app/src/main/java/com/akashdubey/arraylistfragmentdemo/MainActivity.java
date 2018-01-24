package com.akashdubey.arraylistfragmentdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ListFrag.ListItemListerner {
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        output=(TextView)findViewById(R.id.outputTV);
    }


    @Override
    public void setOutput(int position) {
        position++;
        output.setText("Layout "+position);
    }
}
