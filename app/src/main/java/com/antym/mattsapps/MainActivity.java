package com.antym.mattsapps;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /** Called when the user touches a button */
    public void sendMessage(View view) {

        Context context = getApplicationContext();

        String toastString;
        String toastPrefix = "This button will load my ";
        String toastSuffix = " app!";

        switch (view.getId()) {
            case R.id.button01:
                toastString = toastPrefix + "Spotify Streamer" + toastSuffix;
                break;
            case R.id.button:
                toastString = toastPrefix + "Football Scores" + toastSuffix;
                break;
            case R.id.button2:
                toastString = toastPrefix + "Library" + toastSuffix;
                break;
            case R.id.button3:
                toastString = toastPrefix + "Build it Bigger" + toastSuffix;
                break;
            case R.id.button4:
                toastString = toastPrefix + "XYZ Reader" + toastSuffix;
                break;
            case R.id.button5:
                toastString = toastPrefix + "Capstone" + toastSuffix;
                break;
            default:
                toastString = "Invalid button!";
                break;
        }

        CharSequence text = toastString;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
