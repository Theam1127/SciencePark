package my.edu.tarc.sciencepark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FoodDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_detail);
        Intent intent = getIntent();
        String orderedFood = intent.getStringExtra("SelectedFood");
        int position = intent.getIntExtra("FoodPosition",0);
        double[] prices = {5.00,6.00,6.50,5.50,4.50,5.50,8.00};
        TextView selectedFood = (TextView)findViewById(R.id.textViewFood);
        selectedFood.setText(orderedFood);
        TextView foodPrice = (TextView)findViewById(R.id.textViewPrice);
        foodPrice.setText("RM"+ String.format(" %.2f",prices[position]));
        Button buttonConfirm = (Button)findViewById(R.id.buttonConfirmOrder);
        buttonConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Order Made! View status at \"My Orders\" page!", Toast.LENGTH_LONG);
                Intent intent = new Intent(FoodDetail.this,OrderStatus.class);//jump back to home page
                startActivity(intent);
                finish();
            }
        });
    }
}
