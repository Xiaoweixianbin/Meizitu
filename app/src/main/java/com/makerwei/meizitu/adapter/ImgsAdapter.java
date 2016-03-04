package com.makerwei.meizitu.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.makerwei.meizitu.R;
import com.makerwei.meizitu.model.Meizi;
import com.squareup.picasso.Picasso;

/**
 * Created by weixianbin on 16/3/4.
 */
public class ImgsAdapter extends RecyclerView.Adapter<ImgsAdapter.MyViewHolder> {
    private Meizi mMeizi;
    private Context mContext;
    public ImgsAdapter(Context context,Meizi meizi){
        this.mContext = context;
        this.mMeizi = meizi;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_imgcard,parent,false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Picasso.with(mContext)
                .load(mMeizi.getResults().get(position).getUrl())
                .into(holder.imgItem);
    }

    @Override
    public int getItemCount() {
        return mMeizi.getResults().size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imgItem;
        public MyViewHolder(View itemView) {
            super(itemView);
            imgItem = (ImageView) itemView.findViewById(R.id.img_item);
        }
    }
}
