package com.uniquexiaobai.androiddemos.listviewwidget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new SimpleAdapter(this, getData(), R.layout.list_item_view, new String[]{"itemName", "itemAge", "itemSex", "itemGrade"}, new int[] {R.id.itemName, R.id.itemAge, R.id.itemSex, R.id.itemGrade}));

    }

    private List<Map<String, Object>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("itemName", "白航");
        map.put("itemAge", 22);
        map.put("itemSex", "男");
        map.put("itemGrade", 1404);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("itemName", "富豪");
        map.put("itemAge", 11);
        map.put("itemSex", "男");
        map.put("itemGrade", 1404);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("itemName", "杜朋");
        map.put("itemAge", 33);
        map.put("itemSex", "男");
        map.put("itemGrade", 1404);
        list.add(map);

        return list;
    }
}
