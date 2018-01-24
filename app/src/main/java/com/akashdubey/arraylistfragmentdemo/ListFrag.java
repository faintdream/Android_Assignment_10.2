package com.akashdubey.arraylistfragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by FLAdmin on 1/24/2018.
 */

public class ListFrag extends Fragment {
    String [] myLayouts={"Layout1","layout2","Layout3","Layout4","Layout5"};
    ListView lv;
    ListItemListerner listItemListerner;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable final ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment,container,false);
        lv=(ListView)view.findViewById(R.id.listLV);
        listItemListerner=(ListItemListerner)getContext();

        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,myLayouts);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                listItemListerner.setOutput(i);

            }
        });
        return view;
    }

public interface ListItemListerner{
        void setOutput(int position);
}
}
