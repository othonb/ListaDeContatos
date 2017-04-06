package com.example.professor.listadecontatosmelhorada;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by professor on 06/04/2017.
 */

public class ListaContatosItem extends BaseAdapter {

    Context context;
    String[] data;
    int[] image;
    private static LayoutInflater inflater = null;

    public ListaContatosItem(Context context, String[] data, int[] image) {
        // TODO Auto-generated constructor stub
        this.context = context;
        this.data = data;
        this.image = image;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return data.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return data[position];
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        View vi = convertView;
        if (vi == null)
            vi = inflater.inflate(R.layout.lista_contatos_item, null);
        TextView text = (TextView) vi.findViewById(R.id.textView);
        text.setText(data[position]);

        ImageView imagem = (ImageView) vi.findViewById(R.id.imageView);
        imagem.setImageResource(image[position]);


        return vi;
    }
}