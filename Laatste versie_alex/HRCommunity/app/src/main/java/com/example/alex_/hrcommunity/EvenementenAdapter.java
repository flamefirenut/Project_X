package com.example.alex_.hrcommunity;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class EvenementenAdapter extends RecyclerView.Adapter<EvenementenAdapter.EvenementenViewHolder> {
    private ArrayList<EvenementenReader> mEvenementenReaders;

    public static class EvenementenViewHolder extends RecyclerView.ViewHolder{
        public TextView mTitelView;
        public TextView mBeginTijdView;
        public TextView mEindTijdView;
        public TextView mDatumView;

        public EvenementenViewHolder(final View itemView) {
            super(itemView);
            mTitelView = itemView.findViewById(R.id.titelEvenement);
            mBeginTijdView = itemView.findViewById(R.id.beginTijdEvenement);
            mEindTijdView = itemView.findViewById(R.id.eindTijdEvenement);
            mDatumView = itemView.findViewById(R.id.datumEvenement);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    itemView.getContext().startActivity(new Intent(itemView.getContext(),MainActivity.class));
                }
            });
        }
    }

    public EvenementenAdapter(ArrayList<EvenementenReader> evenementenReaderList) {
        mEvenementenReaders = evenementenReaderList;
    }

    @NonNull
    @Override
    public EvenementenViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.example_item, parent, false);
        EvenementenViewHolder evh = new EvenementenViewHolder(v);
        return evh;
    }

    @Override
    public void onBindViewHolder(@NonNull EvenementenViewHolder holder, int position) {
        EvenementenReader currentReader = mEvenementenReaders.get(position);

        holder.mTitelView.setText(currentReader.gettitelEvenement());
        holder.mBeginTijdView.setText(currentReader.getbeginTijdEvenement());
        holder.mEindTijdView.setText(currentReader.geteindTijdEvenement());
        holder.mDatumView.setText(currentReader.getdatumEvenement());
    }

    @Override
    public int getItemCount() {
        return mEvenementenReaders.size();
    }
}