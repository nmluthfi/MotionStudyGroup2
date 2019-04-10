package com.example.luthfi.motionstudygroup2fix.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.luthfi.motionstudygroup2fix.DetailMenu;
import com.example.luthfi.motionstudygroup2fix.R;
import com.example.luthfi.motionstudygroup2fix.model.Makanan;

import java.util.ArrayList;

public class ListMenuAdapter extends RecyclerView.Adapter<ListMenuAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<Makanan> mMakananList;

    public ListMenuAdapter(Context mContext, ArrayList<Makanan> mMakananList) {
        this.mContext = mContext;
        this.mMakananList = mMakananList;
    }

    @NonNull
    @Override
    public ListMenuAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_main, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListMenuAdapter.ViewHolder viewHolder, int position) {
        final Makanan makanan = mMakananList.get(position);
        viewHolder.foodTitle.setText(makanan.getTitle());
        viewHolder.foodPrice.setText("Rp" + makanan.getPrice());

        viewHolder.cardMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mContext, DetailMenu.class);
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mMakananList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView foodImg;
        TextView foodTitle, foodPrice;
        CardView cardMenu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImg = itemView.findViewById(R.id.iv_foto_makanan);
            foodTitle = itemView.findViewById(R.id.tv_judul_makanan);
            foodPrice = itemView.findViewById(R.id.tv_harga_makanan);
            cardMenu = itemView.findViewById(R.id.cardview_item);
        }

    }

}
