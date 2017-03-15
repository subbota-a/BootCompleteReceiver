package subbota.autostarttest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;

import java.text.DateFormat;
import java.util.Date;

import static android.content.Context.MODE_PRIVATE;

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("MyBootReceiver", "onReceive");
        SharedPreferences pref = context.getSharedPreferences("Startup", MODE_PRIVATE);
        Date date = new Date();
        pref.edit().putString("Startup", new Date().toString()).commit();
    }
}
