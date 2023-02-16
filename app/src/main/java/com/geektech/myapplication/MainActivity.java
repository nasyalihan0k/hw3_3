package com.geektech.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<String> contactList;
    private ContactAdapter adapter;

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            recyclerView = findViewById(R.id.rv_contacts);
            loadData();
            adapter = new ContactAdapter(contactList);
            recyclerView.setAdapter(adapter);

            {

            }
        }


    }

    private void loadData() {
        contactList = new ArrayList<>();
        contactList.add("акула бык");
        contactList.add("синяя акула");
        contactList.add("тигровая акула ");
        contactList.add("большая белая акула");
        contactList.add("акула молот");
        contactList.add("китовая акула");
        contactList.add("рифавая акула");
        contactList.add("мако");
        contactList.add("мегалодон");
        contactList.add("гренландская акула");
        contactList.add("леопардаваяя акула");
        contactList.add("песочная акула");
        contactList.add("лимоная акула");
        contactList.add("гигансткая акула");
        //брал инфармацию о виде акул из интернета
    }
}

