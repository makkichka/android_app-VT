package com.example.makkichka.newapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.makkichka.newapp.MoreDetailsActivity;
import com.example.makkichka.newapp.R;
import com.example.makkichka.newapp.etc.Data;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by makki on 06.02.2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    List<Data> list;
    Context context;
    int flag;



    public RecyclerViewAdapter(List<Data> list, Context context, int flag){
        this.list = list;
        this.context = context;
        this.flag = flag;


    }

    // Создает новые views (вызывается layout manager-ом)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_item, parent, false);
        ViewHolder holder = new ViewHolder(v);


        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        //Use the provided View Holder on the onCreateViewHolder method to populate the current row on the RecyclerView
        holder.title.setText(list.get(position).title);
        holder.imageView.setImageResource(list.get(position).imageId);


    }

    @Override
    public int getItemCount() {
        return list.size();
    }




    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);


    }

    /**
     * Created by makki on 06.02.2017.
     */

    public class ViewHolder  extends RecyclerView.ViewHolder{

        TextView title;
        ImageView imageView;
        private final Context context;


        public ViewHolder(final View itemView) {
            super(itemView);

            title = (TextView)itemView.findViewById(R.id.name);
            imageView = (ImageView)itemView.findViewById(R.id.img);
            context = itemView.getContext();

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    long position = getAdapterPosition();
                    Toast.makeText(itemView.getContext(),"Нажато "+ position, Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(context, MoreDetailsActivity.class);
                    intent.putExtra("index",position);

                    intent.putExtra("flag",flag);
                    Log.d(TAG, "flagPut = " + flag);

                    context.startActivity(intent);

                }
            });
        }
    }

}
