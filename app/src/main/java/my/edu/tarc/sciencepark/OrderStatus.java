package my.edu.tarc.sciencepark;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class OrderStatus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_status);
        List<String> myOrders = new ArrayList<String>();
        Item item = new Item("Al-Fariz Mamak","Nasi Lemak", "Science Park 1", 5.00);
        myOrders.add(item.toString());
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,myOrders);
        ListView orderList = (ListView)findViewById(R.id.listViewMyOrders);
        orderList.setAdapter(adapter);
    }
}
