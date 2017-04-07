package com.example.siddhiparekh11.farmmaintenance;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends Activity {

String temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent i=getIntent();
        if(i.getStringExtra("intentnotnull")!=null)
        {

           if(i.getStringExtra("intentnotnull").equals("yesfan"))
           {
               temp="fanon";
           }
           else if(i.getStringExtra("intentnotnull").equals("yessprinkler"))
           {
               temp="sprinkleron";
           }
        }

    }
    @Override
    protected void onResume()
    {
        super.onResume();
        if(temp!=null)
        {
            if(temp.equals("fanon"))
            {
                Button b1=(Button)findViewById(R.id.button1);
                b1.setText("FAN ON");
                b1.setEnabled(true);
            }
            else if(temp.equals("sprinkleron"))
            {
                Button b2=(Button)findViewById(R.id.button2);
                b2.setText("FAN AND SPRINKLER ON");
                b2.setEnabled(true);
            }
        }
    }
    public void onButton1(View v)
    {
       Button b1=(Button)findViewById(R.id.button1);
        b1.setText("FAN OFF");
        b1.setEnabled(false);

    }
    public void onButton2(View v)
    {
       Button b2=(Button)findViewById(R.id.button2);
        b2.setText("FAN AND SPRINKLER OFF");
        b2.setEnabled(false);
    }
    public void onFinish(View v)
    {
        this.finish();
    }
}
