package HelperClasses;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import firebase.mychat.com.firebasechat.R;


public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    ArrayList <String> myDataSet;
    public MyAdapter(ArrayList <String> myDataSet) {
        this.myDataSet =myDataSet;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chat_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mTextview.setText(myDataSet.get(position));



    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mTextview;
        public ViewHolder(View itemView) {
            super(itemView);
            mTextview= (TextView) itemView.findViewById(R.id.frag2_chattext);
        }
    }
}
