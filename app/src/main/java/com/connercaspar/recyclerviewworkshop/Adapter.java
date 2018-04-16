package com.connercaspar.recyclerviewworkshop;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by connercaspar on 4/16/18.
 */

public class Adapter extends RecyclerView.Adapter {

    private List<Students> studentsList;

    public Adapter(List<Students> studentsList) {
        this.studentsList = studentsList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);

        return ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return studentsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        
        private TextView studentName;
        private TextView studentSummary;
        private TextView studentPhoneType;
        private TextView studentAge;

        public ViewHolder(View itemView) {
            super(itemView);
            studentName = itemView.findViewById(R.id.name_textview);
            studentAge = itemView.findViewById(R.id.age_textview);
            studentPhoneType = itemView.findViewById(R.id.phone_type_textview);
            studentSummary = itemView.findViewById(R.id.summary_textview);
            itemView.setOnClickListener(this);
        }

        public void bind(int position) {

            studentName.setText(studentsList.get(position).getName());
            studentAge.setText(studentsList.get(position).getAge());
            studentSummary.setText(studentsList.get(position).getSummary());
            studentPhoneType.setText(studentsList.get(position).getPhoneType());
        }
    }

}
