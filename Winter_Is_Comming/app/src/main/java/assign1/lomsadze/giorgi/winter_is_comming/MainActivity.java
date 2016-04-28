package assign1.lomsadze.giorgi.winter_is_comming;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import assign1.lomsadze.giorgi.winter_is_comming.adapters.MyAdapter;
import assign1.lomsadze.giorgi.winter_is_comming.models.AndroidPhones;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<AndroidPhones> list = new ArrayList<>();

        for (int i = 0; i < Database.names.length; i++){
            AndroidPhones androidPhones = new AndroidPhones(Database.names[i], Database.images[i]);
            list.add(androidPhones);
            list.add(androidPhones);
        }
        MyAdapter adapter = new MyAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.listView);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                AndroidPhones androidPhones = (AndroidPhones) parent.getAdapter().getItem(position);
                Intent intent = new Intent(view.getContext(), Main2Activity.class);
                intent.putExtra("clicked", androidPhones.getName());
                startActivity(intent);
            }
        });
    }
}
