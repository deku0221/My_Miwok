package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class itemAdapter extends ArrayAdapter<Word> {

    public itemAdapter(@NonNull Context context, @NonNull ArrayList<Word> words) {
        super(context,0,words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;
        if(listItemView == null)
        {
            listItemView=LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }
        Word word=getItem(position);

        TextView miwok=listItemView.findViewById(R.id.miwok);
        miwok.setText(word.getMiwokTranslation());

        TextView english=listItemView.findViewById(R.id.english);
        english.setText(word.getEnglishTranslation());

        ImageView imageView=listItemView.findViewById(R.id.image);

        int imageres=word.getImage_resource_id();
        if(imageres == 0)
        {
            imageView.setVisibility(View.GONE);
        }
        else imageView.setImageResource(imageres);
        return listItemView;
    }
}
