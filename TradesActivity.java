package com.example.peanutclientapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.peanutclientapp.R;
import java.util.ArrayList;
import java.util.List;

public class TradesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    TradeAdapter adapter;
    List<TradeModel> tradeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trades);

        recyclerView = findViewById(R.id.recyclerTrades);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create dummy trade data
        tradeList = new ArrayList<>();
        tradeList.add(new TradeModel("Trade #001", "Buy", "Peanuts", "₹5000", "Success"));
        tradeList.add(new TradeModel("Trade #002", "Sell", "Groundnut Oil", "₹4200", "Pending"));
        tradeList.add(new TradeModel("Trade #003", "Buy", "Organic Peanuts", "₹2500", "Success"));
        tradeList.add(new TradeModel("Trade #004", "Sell", "Peanut Butter", "₹7000", "Failed"));

        // Attach adapter
        adapter = new TradeAdapter(tradeList);
        recyclerView.setAdapter(adapter);

        Toast.makeText(this, "Showing all trades", Toast.LENGTH_SHORT).show();
    }
}