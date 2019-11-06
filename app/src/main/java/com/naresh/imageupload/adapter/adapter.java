package com.naresh.imageupload.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.naresh.imageupload.R;
import com.naresh.imageupload.model.classDetails;

import java.util.List;
public class adapter extends RecyclerView.Adapter<adapter.ContactsViewHolder>{
    Context context;
    List<classDetails> classDetailsList;

    public adapter(Context context, List<classDetails> classDetailsList) {
        this.context = context;
        this.classDetailsList = classDetailsList;
    }

    @NonNull
    @Override
    public ContactsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View v = LayoutInflater.from((parent.getContext())).inflate(R.layout.result,parent,false);
        return new ContactsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsViewHolder holder, int position) {
        final classDetails classDetails = classDetailsList.get(position);
        holder.imageview.setImageResource(classDetails.getImagenumber());
        holder.tvname.setText(classDetails.getName());
        holder.tvage.setText(classDetails.getAge());
        holder.tvgender.setText(classDetails.getGender());

    }

    @Override
    public int getItemCount() {
        return classDetailsList.size();
    }

    public class ContactsViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView tvname,tvage, tvgender;
        public ContactsViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.imageView3);
            tvname= itemView.findViewById(R.id.textView);
            tvage = itemView.findViewById(R.id.textView2);
            tvgender = itemView.findViewById(R.id.textView3);
        }
    }
}



