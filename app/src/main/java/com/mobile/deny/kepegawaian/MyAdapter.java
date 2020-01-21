package com.mobile.deny.kepegawaian;

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

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<AdapterViewPegawai> {
    private Context context;
    private List<DataPegawai> listDataPegawai;

    public MyAdapter(Context context, List<DataPegawai> listDataPegawai) {
        this.context = context;
        this.listDataPegawai = listDataPegawai;
    }

    @NonNull
    @Override
    public AdapterViewPegawai onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rview= LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_item_pegawai,parent,false);
        return new AdapterViewPegawai(rview);
    }

    @Override
    public void onBindViewHolder(final AdapterViewPegawai holder, int position) {
        holder.ImageAdapterPeg.setImageResource(listDataPegawai.get(position).getImagePegawai());
        holder.txtAdapterPeg.setText(listDataPegawai.get(position).getNamaPegawai());
        holder.cardViewPeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailActivity.class);
                intent.putExtra("Title",listDataPegawai.get(holder.getAdapterPosition()).getNamaPegawai());
                intent.putExtra("Description",listDataPegawai.get(holder.getAdapterPosition()).getDescPegawai());
                intent.putExtra("Image",listDataPegawai.get(holder.getAdapterPosition()).getImagePegawai());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listDataPegawai.size();
    }
}

class  AdapterViewPegawai extends RecyclerView.ViewHolder{
    ImageView ImageAdapterPeg;
    TextView txtAdapterPeg;
    CardView cardViewPeg;

    public AdapterViewPegawai(View itemView) {
        super(itemView);
        ImageAdapterPeg = itemView.findViewById(R.id.ImageCardView);
        txtAdapterPeg =itemView.findViewById(R.id.txtTitle);
        cardViewPeg = itemView.findViewById(R.id.cardview);
    }
}