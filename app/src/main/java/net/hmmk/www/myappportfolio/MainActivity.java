package net.hmmk.www.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) this.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch the Popular Movies App.", Toast.LENGTH_SHORT).show();
            }
        });
        Button button2 = (Button) this.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch the Football Scores App.", Toast.LENGTH_SHORT).show();
            }
        });
        Button button3 = (Button) this.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch the Library App.", Toast.LENGTH_SHORT).show();
            }
        });
        Button button4 = (Button) this.findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch the Build It Bigger App.", Toast.LENGTH_SHORT).show();
            }
        });
        Button button5 = (Button) this.findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch the XYZ Reader App.", Toast.LENGTH_SHORT).show();
            }
        });
        Button button6 = (Button) this.findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //create the toast object, set display duration,
                Toast.makeText(getApplicationContext(), "This button will launch my own app.", Toast.LENGTH_SHORT).show();
            }
        });
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


}
