package com.law.retete.sliceapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RetetaAdapter extends RecyclerView.Adapter<RetetaAdapter.ProductViewHolder> {

    private Context mCtx;
    private List<Reteta> productList;

    public RetetaAdapter(Context mCtx, List<Reteta> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }

    public void filterList(List<Reteta> filteredNames) {
        this.productList = filteredNames;
        notifyDataSetChanged();
    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.list_layout, null);
        return new ProductViewHolder(view, mCtx, productList);
    }

    @Override
    public void onBindViewHolder(final ProductViewHolder holder, int position) {
        final Reteta reteta = productList.get(position);

        holder.textViewTitle.setText(reteta.getTitle());
        holder.textViewDesc.setText(reteta.getShortdesc());
        holder.textViewRating.setText(reteta.getRating());
        holder.textViewPrice.setText(reteta.getPrice());
        holder.imageStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reteta.setFav(1);
                holder.imageStar.setImageResource(android.R.drawable.star_big_on);
            }
        });

        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(reteta.getImage()));
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView, imageStar;
        TextView textViewTitle, textViewDesc, textViewRating, textViewPrice, textViewText;
        List<Reteta> retete;
        Context ctx;
        public ProductViewHolder(View itemView, Context ctx, List<Reteta> retete) {
            super(itemView);
            this.retete = retete;
            this.ctx = ctx;
            itemView.setOnClickListener(this);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textViewTitle);
            textViewDesc = itemView.findViewById(R.id.textViewShortDesc);
            textViewRating = itemView.findViewById(R.id.textViewRating);
            textViewPrice = itemView.findViewById(R.id.textViewPrice);
            imageStar = itemView.findViewById(R.id.starSelect);
        }

        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            retete = productList;
            Reteta r = this.retete.get(position);
            Intent intent = new Intent(this.ctx, DescReteta.class);
            intent.putExtra("img_id", r.getImage());
            intent.putExtra("title", r.getTitle());
            intent.putExtra("desc", r.getShortdesc());
            intent.putExtra("rating", r.getRating());
            intent.putExtra("price", r.getPrice());
            intent.putExtra("text", r.getText());
            intent.putExtra("tags", r.getTags());
            this.ctx.startActivity(intent);
        }
    }
}
