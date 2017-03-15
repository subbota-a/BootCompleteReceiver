package subbota.autostarttest;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences pref = getSharedPreferences("Startup", MODE_PRIVATE);
        ((TextView)findViewById(R.id.textId)).setText(pref.getString("Startup", "No startup"));
        android.R.layout.simple_expandable_list_item_1
    }
}
