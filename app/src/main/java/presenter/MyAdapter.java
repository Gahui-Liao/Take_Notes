package presenter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gahui.take_notes.R;

import java.util.ArrayList;

import model.Data;

public class MyAdapter extends BaseAdapter {

    LayoutInflater inflater;
    ArrayList<Data> array;

    public MyAdapter(LayoutInflater inf,ArrayList<Data> arry){
        this.inflater=inf;
        this.array=arry;
    }

    @Override
    public int getCount() {
        return array.size();
    }

    @Override
    public Object getItem(int position) {
        return array.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {  //代码块中包含了对listview的效率优化
        ViewHolder vh;
        if(convertView==null){
            vh=new ViewHolder();
            convertView=inflater.inflate(R.layout.list_item,null);//加载listview子项
            vh.tv1=(TextView) convertView.findViewById(R.id.list_title);
            vh.tv2=(TextView) convertView.findViewById(R.id.list_time);
            convertView.setTag(vh);
        }
        vh=(ViewHolder) convertView.getTag();
        vh.tv1.setText(array.get(position).getTitle());
        vh.tv2.setText(array.get(position).getTimes());
        return convertView;
    }
    class ViewHolder{     //内部类，对控件进行缓存
        TextView tv1,tv2;
    }
}