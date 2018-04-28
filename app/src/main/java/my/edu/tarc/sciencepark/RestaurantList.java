package my.edu.tarc.sciencepark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static java.lang.System.in;

public class RestaurantList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list);
        ListView listViewRestaurant = (ListView)findViewById(R.id.listViewRestaurant);
        final List<String> restaurantList = new ArrayList<String>();
        String[] Rlistsp1 = {"Al-Fariz Mamak", "KFC Restaurant", "Mc Donald", "Bistro 1980", "BBQ Plaza","llao llao"};
        String[] Rlistsp2 = {"ZhapFan88", "Burger King", "Morganfield", "Tealive"};
        for(String restaurant : Rlistsp1){
            restaurantList.add(restaurant);
        }
        for(String r : Rlistsp2){
            restaurantList.add(r);
        }
        final ArrayAdapter<String> restaurantAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_dropdown_item_1line,restaurantList);
        listViewRestaurant.setAdapter(restaurantAdapter);

        listViewRestaurant.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(RestaurantList.this, FoodList.class);
                intent.putExtra("SelectedRestaurant",restaurantList.get(position));
                startActivity(intent);
            }
        });


    }
}
