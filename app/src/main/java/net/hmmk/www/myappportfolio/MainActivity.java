package net.hmmk.www.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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

    /** Called when the user touches the button */
    public void showToast(View views) {
        // Do something in response to button click


        switch (views.getId()) {
            case R.id.button1:
                displayToast("This button will launch the Popular Movies App!");
                break;
            case R.id.button2:
                displayToast("This button will launch the Football Scores App!");
                break;
            case R.id.button3:
                displayToast("This button will launch the Library App!");
                break;
            case R.id.button4:
                displayToast("This button will launch the Build It Bigger App!");
                break;
            case R.id.button5:
                displayToast("This button will launch the XYZ Reader");
                break;
            case R.id.button6:
                displayToast("My Own App!");
                break;
        }



    }

    public void displayToast(String text){
        Context context = getApplicationContext();
        int duration;
        duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
