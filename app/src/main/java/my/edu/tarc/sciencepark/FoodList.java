package my.edu.tarc.sciencepark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_list);
        final String[] foodList = {"Nasi Lemak", "Mee Goreng", "Roti Canai", "Lamb Chop", "Fish & Chips", "Prawn Mee", "Char Kuey Teow"};
        double[] prices = {5.00,6.00,6.50,5.50,4.50,5.50,8.00};
        String orderMe = "Order Now!";
        Intent intent = getIntent();
        final String restaurant = intent.getStringExtra("SelectedRestaurant");
        int count=0;
        for(String s : foodList) {
            foodList[count] += "\n" + String.format("RM %.2f", prices[count]);
            count++;
        }
        final ListView listViewFood = (ListView)findViewById(R.id.listViewFood);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getBaseContext(),android.R.layout.simple_list_item_1,foodList);
        listViewFood.setAdapter(adapter);
        listViewFood.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(FoodList.this,FoodDetail.class);
                intent.putExtra("SelectedFood",foodList[position]);
                intent.putExtra("FoodPosition",position);
                intent.putExtra("SelectedRestaurant",restaurant);
                startActivity(intent);
            }
        });
    }
}
