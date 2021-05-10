package com.example.countryflag;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class countryFlagAdpter extends ArrayAdapter<countryFlag> {
    public countryFlagAdpter(@NonNull Activity context, ArrayList<countryFlag> countryFlags) {
        super(context,0, countryFlags);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.costume_view, parent, false);
        }
        countryFlag currentCountryFlag = getItem(position);
        ImageView flag = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        flag.setImageResource(currentCountryFlag.getImageResourceID());

        TextView countryName = (TextView) listItemView.findViewById(R.id.country_name);
        countryName.setText(currentCountryFlag.getCountryName());
        return listItemView;
    }
}
