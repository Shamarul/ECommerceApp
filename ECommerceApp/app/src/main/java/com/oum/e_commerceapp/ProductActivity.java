package com.oum.e_commerceapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.Toast;

import com.oum.e_commerceapp.adapter.CategoryAdapter;
import com.oum.e_commerceapp.adapter.ProductAdapter;

public class ProductActivity extends Activity {
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        int position = getIntent().getIntExtra("position",0);

        gridView = findViewById(R.id.grid_product);

        Toast.makeText(getApplicationContext(),String.valueOf(position),Toast.LENGTH_LONG).show();

        switch (position){
            case 0:

                String[] clothList = {"SHIRT", "BLOUSE", "SWEATER"};
                int[] clothimageList = {R.drawable.shirt, R.drawable.Blouse, R.drawable.Sweater};

                String[] clothpriceList = {"RM 40", "RM 60", "RM 50"};
                gridView.setAdapter(new ProductAdapter(clothList, clothimageList, clothpriceList, getApplicationContext()));

                break;

            case 1:

                String[] electronicsList = {"SAMSUNG", "PANASONIC", "TOSHIBA"};
                int[] electroimageList = {R.drawable.Samsung, R.drawable.PanasonicFan, R.drawable.WasherMachine};

                String[] electropriceList = {"RM 2200", "RM 200", "RM 1800"};
                gridView.setAdapter(new ProductAdapter(electronicsList, electroimageList, electropriceList, getApplicationContext()));

                break;

            case 2:

                String[] softwareList = {"MICROSOFT", "ADOBE", "ANTIVIRUS"};
                int[] softwareimageList = {R.drawable.Microsoft, R.drawable.Adobe, R.drawable.Antivirus};

                String[] softwarepriceList = {"RM 100", "RM 60", "RM 80"};
                gridView.setAdapter(new ProductAdapter(softwareList, softwareimageList, softwarepriceList, getApplicationContext()));

                break;

            case 3:

                String[] cellphonesList = {"SAMSUNG", "HUAWEI", "SONY"};
                int[] cellimageList = {R.drawable.GalaxyS9, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j};

                String[] cellpriceList = {"RM 2200", "RM 1400", "RM 1800"};
                gridView.setAdapter(new ProductAdapter(cellphonesList, cellimageList, cellpriceList, getApplicationContext()));

                break;

            case 4:

                String[] automobilesList = {"TOYOTA", "PROTON", "HONDA"};
                int[] autoimageList = {R.drawable.samsung_galaxy, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j, R.drawable.lg_g, R.drawable.pixel, R.drawable.samsung_j};

                String[] autopriceList = {"RM 77120", "RM 49325", "RM 96540"};
                gridView.setAdapter(new ProductAdapter(automobilesList, autoimageList, autopriceList, getApplicationContext()));

                break;

        }
    }
}
