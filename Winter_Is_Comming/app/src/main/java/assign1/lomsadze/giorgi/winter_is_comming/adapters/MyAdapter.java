package assign1.lomsadze.giorgi.winter_is_comming.adapters;

import android.content.Context;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import assign1.lomsadze.giorgi.winter_is_comming.R;
import assign1.lomsadze.giorgi.winter_is_comming.models.AndroidPhones;

/**
 * Created by GiorgiL on 4/28/2016.
 */
public class MyAdapter extends BaseAdapter {

    private  ArrayList<AndroidPhones> list;
    private Context context;

    public MyAdapter(Context context, ArrayList<AndroidPhones> list){
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView;
        ViewHolder viewHolder;

        if (convertView == null){
            listItemView = View.inflate(context, R.layout.list_item_view, null);
            TextView nameView = (TextView) listItemView.findViewById(R.id.nameView);
            ImageView imageView = (ImageView) listItemView.findViewById(R.id.imageView);
            viewHolder = new ViewHolder();
            viewHolder.nameField = nameView;
            viewHolder.imageField = imageView;

            listItemView.setTag(viewHolder);
        }else {
            listItemView = convertView;
            viewHolder = (ViewHolder) convertView.getTag();
        }



        AndroidPhones androidPhones = (AndroidPhones) getItem(position);

        viewHolder.nameField.setText(androidPhones.getName());
        Picasso.with(context).load(androidPhones.getImage()).resize(80,80).centerCrop().into(viewHolder.imageField);

        return listItemView;
    }

    class ViewHolder{
        TextView nameField;
        ImageView imageField;
    }
}

