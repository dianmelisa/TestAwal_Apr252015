package id.ac.unsyiah.jte.mobile.testawal25april2015;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;


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

    public void onClickTombol(View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        String angka= getString(R.string.angka);
        txtTulisan.setText(angka);
        final Random myRandom = new Random();
        int Low = 100;
        int High = 200;
        final TextView textGenerateNumber = (TextView)findViewById(R.id.txtTulisan);
        textGenerateNumber.setText(String.valueOf(myRandom.nextInt(High-Low) + Low));
    }
}
