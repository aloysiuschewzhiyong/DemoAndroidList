package sg.edu.rp.c346.id22001095.demoandroidlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<AndroidVersion> {
    Context context;
    ArrayList<AndroidVersion> al;
    int resource;

    public CustomAdapter(Context context, int resource, ArrayList<AndroidVersion> al) {
        super(context, resource, al);
        this.context = context;
        this.resource = resource;
        this.al = al;
    }

    @Override
    public View getView(int position,  View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(resource, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvVersion = rowView.findViewById(R.id.textViewVersion);

        AndroidVersion currentVersion = al.get(position);

        tvName.setText(currentVersion.getName());
        tvVersion.setText(currentVersion.getVersion());

        return rowView;
    }

}
