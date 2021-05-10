package com.example.countryflag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<countryFlag> countryFlags = new ArrayList<countryFlag>();
        countryFlags.add(new countryFlag("Afghanistan",R.drawable.afghanistan));
        countryFlags.add(new countryFlag("Albania",R.drawable.albania));
        countryFlags.add(new countryFlag("Algeria",R.drawable.algeria));
        countryFlags.add(new countryFlag("Andorra",R.drawable.andorra));
        countryFlags.add(new countryFlag("Angola",R.drawable.angola));
        countryFlags.add(new countryFlag("Afghanistan",R.drawable.afghanistan));
        countryFlags.add(new countryFlag("Canada",R.drawable.canada));
        countryFlags.add(new countryFlag("China",R.drawable.china));
        countryFlags.add(new countryFlag("U.S.",R.drawable.us));
        countryFlags.add(new countryFlag("Korea",R.drawable.south_korea));

        countryFlagAdpter myCountryFlagAdpter = new countryFlagAdpter(this,countryFlags);

        ListView myListView = (ListView) findViewById(R.id.main_list_view);
        myListView.setAdapter(myCountryFlagAdpter);
    }
}