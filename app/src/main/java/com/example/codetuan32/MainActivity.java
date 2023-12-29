package com.example.codetuan32;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = findViewById(R.id.ListViewAttend);
        ArrayList<Contact> arrContact = new ArrayList<Contact>();
        arrContact.add(new Contact("Peter Johnson", "Thực tập sinh", R.drawable.man, "Bây giờ hoặc không bao giờ"));
        arrContact.add(new Contact("Maria Carey", "Phó ban Marketing", R.drawable.woman, "Sống là để ăn"));
        arrContact.add(new Contact("Harmony Emily", "Trưởng ban Marketing", R.drawable.woman2, "Độc thân 30 năm có thành phù thủy không?"));
        arrContact.add(new Contact("Joe Amilson", "Giám đốc tài chính", R.drawable.man2, "Chức vụ càng lớn, trán hói càng cao"));
        arrContact.add(new Contact("Hellen Nobel", "Bác sĩ gia đình", R.drawable.woman3, "Mỗi ngày 1 quả táo, chữa được bách bệnh"));
        arrContact.add(new Contact("Santa Claus", "Ông già Noel", R.drawable.man3, "Không có thật"));
        arrContact.add(new Contact("Morning Kardashian", "Trợ lý giám đốc", R.drawable.woman4, "Lương không nhiều, đừng hỏi"));

        CustomAdapter adapter = new CustomAdapter(this, R.layout.item_list, arrContact);
        lvContact.setAdapter(adapter);

        lvContact.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contact selectedContact = (Contact) parent.getItemAtPosition(position);
                String title = selectedContact.getTitle();
                String quote = selectedContact.getQuote();
                int image = selectedContact.getAvatar();

                LinearLayout linearLayout = findViewById(R.id.ItemPreview);
                linearLayout.setVisibility(View.VISIBLE);
                TextView nameTextView = findViewById(R.id.ItemTitlePreview);
                ImageView imageView = findViewById(R.id.ItemImagePreview);
                TextView quoteTextView = findViewById(R.id.ItemQuotePreview);
                nameTextView.setText(title);
                imageView.setImageResource(image);
                quoteTextView.setText(quote);

            }
        });

    }
}