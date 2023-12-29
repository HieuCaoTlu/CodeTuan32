package com.example.codetuan32;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<Contact> {
    private Context context;
    private int resource;
    private List<Contact> objects;
    private LayoutInflater inflater;
    public CustomAdapter(@NonNull Context context, int resource, List<Contact> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
        inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = new ViewHolder();
        if(convertView == null) {
            convertView = inflater.inflate(R.layout.item_list, null);
            holder.ItemTitle = (TextView)convertView.findViewById(R.id.ItemTitle);
            holder.ItemDescription = (TextView)convertView.findViewById(R.id.ItemDescription);
            holder.ItemImage = (ImageView)convertView.findViewById(R.id.ItemImage);

            convertView.setTag(holder);
        }
        else {
            holder = (ViewHolder)convertView.getTag();
        }
        Contact contact = objects.get(position);
        holder.ItemTitle.setText(contact.getTitle());
        holder.ItemDescription.setText(contact.getDescription());
        holder.ItemImage.setImageResource(contact.getAvatar());
        return convertView;
    }

    public class ViewHolder {
        TextView ItemTitle, ItemDescription;
        ImageView ItemImage;


    }
}
