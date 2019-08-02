package pardillo.john.jv.listwithpicture;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView lv;
    private ItemAdapter adapter;
    private ArrayList<Person> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.lv = this.findViewById(R.id.listView);
        this.adapter = new ItemAdapter(this, list);
        this.lv.setAdapter(adapter);

        list.add(new Person(R.drawable.img1, "Spongebob", "0998123451"));
        list.add(new Person(R.drawable.img4, "Charis Pengpengko", "0998123454"));
        list.add(new Person(R.drawable.img6, "Mr. Krabs", "0998123456"));
        list.add(new Person(R.drawable.img7, "Gwapo Unta", "0998123457"));
        list.add(new Person(R.drawable.img10, "Mrs. Puff", "0998123410"));
        list.add(new Person(R.drawable.img12, "Big Tits", "0998123412"));

        this.lv.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, "Name: " +list.get(position).getPersonName(), Toast.LENGTH_SHORT).show();
    }
}
