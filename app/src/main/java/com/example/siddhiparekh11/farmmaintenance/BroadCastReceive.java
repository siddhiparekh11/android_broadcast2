package com.example.siddhiparekh11.farmmaintenance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
/**
 * Created by siddhiparekh11 on 3/13/17.
 */

public class BroadCastReceive extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals("com.example.siddhiparekh11.farmiotapp.FAN_BROADCAST")) {

            Log.d("Debug -->", "I am in Farm Maintenance Fan");
            Intent fan=new Intent(context,MainActivity.class);
            fan.putExtra("fan","fanon");
            fan.putExtra("sprinkler","sprinkleroff");
            fan.putExtra("intentnotnull","yesfan");
            context.startActivity(fan);



        }
        else if(intent.getAction().equals("com.example.siddhiparekh11.farmiotapp.SPRINKLER_BROADCAST"))
        {
            Log.d("Debug -->", "I am in Farm Maintenance Sprinkler");
            Intent sprinkler=new Intent(context,MainActivity.class);
            sprinkler.putExtra("sprinkler","sprinkleron");
            sprinkler.putExtra("fan","fanoff");
            sprinkler.putExtra("intentnotnull","yessprinkler");
            context.startActivity(sprinkler);

        }

    }

}
