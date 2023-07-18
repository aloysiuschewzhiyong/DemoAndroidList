    package sg.edu.rp.c346.id22001095.demoandroidlist;

    import androidx.appcompat.app.AppCompatActivity;

    import android.os.Bundle;
    import android.widget.ArrayAdapter;
    import android.widget.ListView;

    import java.util.ArrayList;

    public class MainActivity extends AppCompatActivity {

        ListView list;
        ArrayList<AndroidVersion> alAndroid;
        //ArrayAdapter<AndroidVersion> aaAndroid;
        CustomAdapter ca;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            list= findViewById(R.id.lv);
            alAndroid = new ArrayList<>();

            alAndroid.add(new AndroidVersion("Pie", "9.0"));
            alAndroid.add(new AndroidVersion("Oreo", "8.0 - 8.1"));
            alAndroid.add(new AndroidVersion("Nougat", "7.0 - 7.1.2"));


            ca = new CustomAdapter(this, R.layout.row, alAndroid);

            list.setAdapter(ca);


        }
    }

