package com.example.asagir.oscars;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by User_1_Benjamin_Rosenthal on 2/29/16.
 */
public class ActorAdapter extends ArrayAdapter<String> {

    private final Context context;
    private final String[] values;

    public ActorAdapter(Context context, String[] values) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listview, parent, false);
        TextView mActorTextView = (TextView) rowView.findViewById(R.id.actor);
        TextView mMovieTextView = (TextView) rowView.findViewById(R.id.movie);
        TextView mAwardTextView = (TextView) rowView.findViewById(R.id.award);
        textView.setText(values[position]);
        // change the icon for Windows and iPhone
        String s = values[position];


        return rowView;
    }
}





