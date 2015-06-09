package com.example.e39178.myapplication;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

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

    public void OnClickButton_spotifystreamer(View view) {
        ShowToast(getString(R.string.toast_spotify_streamer));
    }

    public void OnClickButton_scoresapp(View view) {
        ShowToast(getString(R.string.toast_scores_app));
    }

    public void OnClickButton_libraryapp(View view) {
        ShowToast(getString(R.string.toast_library_app));
    }

    public void OnClickButton_builditbigger(View view) {
        ShowToast(getString(R.string.toast_build_it_bigger));
    }

    public void OnClickButton_baconreader(View view) {
        ShowToast(getString(R.string.toast_bacon_reader));
    }

    public void OnClickButton_capstonemyownapp(View view) {
        ShowToast(getString(R.string.toast_capstone_my_own_app));
    }

    private void ShowToast(CharSequence text)
    {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
