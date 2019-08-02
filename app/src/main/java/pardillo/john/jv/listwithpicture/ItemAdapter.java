package pardillo.john.jv.listwithpicture;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemAdapter extends BaseAdapter {

    Context context;
    ArrayList<Person> list;
    LayoutInflater inflater;

    public ItemAdapter(Context context, ArrayList<Person> list) {
        this.context = context;
        this.list = list;
        this.inflater = LayoutInflater.from(context);
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
        ItemHandler handler;

        if(convertView == null) {
            convertView = inflater.inflate(R.layout.layout_item, null);
            handler = new ItemHandler();

            handler.iv = convertView.findViewById(R.id.imageView);
            handler.txtName = convertView.findViewById(R.id.textView);
            handler.txtNumber = convertView.findViewById(R.id.textView2);

            convertView.setTag(handler);
        } else {
            handler = (ItemHandler) convertView.getTag();
        }

        handler.iv.setImageResource(list.get(position).getPersonImage());
        handler.txtName.setText(list.get(position).getPersonName());
        handler.txtNumber.setText(list.get(position).getPersonNumber());

        return convertView;
    }

    static class ItemHandler {
        ImageView iv;
        TextView txtName, txtNumber;
    }
}
