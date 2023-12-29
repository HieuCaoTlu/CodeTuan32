package com.example.codetuan32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.ListViewAttend);
        ArrayList<Contact> arrContact = new ArrayList<Contact>();
        arrContact.add(new Contact("Peter Johnson", "Thực tập sinh", R.drawable.man));
        arrContact.add(new Contact("Maria Carey", "Phó ban Marketing", R.drawable.woman));
        arrContact.add(new Contact("Harmony Emily", "Trưởng ban Marketing", R.drawable.woman2));
        arrContact.add(new Contact("Joe Amilson", "Giám đốc tài chính", R.drawable.man2));
        arrContact.add(new Contact("Hellen Nobel", "Bác sĩ gia đình", R.drawable.woman3));
        arrContact.add(new Contact("Santa Claus", "Ông già Noel", R.drawable.man3));
        arrContact.add(new Contact("Morning Kardashian", "Trợ lý giám đốc", R.drawable.woman4));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.item_list, arrContact);
        lvContact.setAdapter(adapter);

    }
}