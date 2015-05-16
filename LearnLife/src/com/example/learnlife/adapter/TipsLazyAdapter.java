package com.example.learnlife.adapter;


import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.learnlife.R;
import com.example.learnlife.TipsRowItem;

public class TipsLazyAdapter extends ArrayAdapter<TipsRowItem> {

    Context context;

    public TipsLazyAdapter(Context context, int resourceId, List<TipsRowItem> items){
        super(context, resourceId, items);
        this.context = context;
    }

    public class ViewHolder{
        TextView title;
        TextView description;
        LinearLayout card;
    }


    public View getView(int position, View convertView, ViewGroup parent){
        ViewHolder holder;
        TipsRowItem rowItem = getItem(position);

        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.tips_row, null);
            holder = new ViewHolder();
            holder.card = (LinearLayout) convertView.findViewById(R.id.card);
            holder.title = (TextView)convertView.findViewById(R.id.title);
            holder.description = (TextView)convertView.findViewById(R.id.description);
            
            convertView.setTag(holder);
        } else
            holder = (ViewHolder)convertView.getTag();

        holder.title.setText(rowItem.getTitle());
        holder.description.setText(rowItem.getDesc());
        
        Animation animation = AnimationUtils.loadAnimation(context, R.anim.card_animation);
        holder.card.startAnimation(animation);
        
        
        return convertView;
    }
}
