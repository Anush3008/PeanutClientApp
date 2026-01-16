package com.example.peanutclientapp.activities;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.peanutclientapp.R;

import java.util.List;

public class TradeAdapter extends RecyclerView.Adapter<TradeAdapter.TradeViewHolder> {

    List<TradeModel> tradeList;

    public TradeAdapter(List<TradeModel> tradeList) {
        this.tradeList = tradeList;
    }

    @NonNull
    @Override
    public TradeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_trade, parent, false);
        return new TradeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TradeViewHolder holder, int position) {
        TradeModel trade = tradeList.get(position);
        holder.tvTradeId.setText(trade.getTradeId());
        holder.tvType.setText(trade.getType());
        holder.tvProduct.setText(trade.getProduct());
        holder.tvAmount.setText(trade.getAmount());
        holder.tvStatus.setText(trade.getStatus());
    }

    @Override
    public int getItemCount() {
        return tradeList.size();
    }

    public static class TradeViewHolder extends RecyclerView.ViewHolder {
        TextView tvTradeId, tvType, tvProduct, tvAmount, tvStatus;

        public TradeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTradeId = itemView.findViewById(R.id.tvTradeId);
            tvType = itemView.findViewById(R.id.tvType);
            tvProduct = itemView.findViewById(R.id.tvProduct);
            tvAmount = itemView.findViewById(R.id.tvAmount);
            tvStatus = itemView.findViewById(R.id.tvStatus);
        }
    }
}