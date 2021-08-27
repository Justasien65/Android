package com.udemy.arraysandcollections;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // My Array of integer numbers
//        int[] myIntNumberArray = {1,2,3,4,5,6,7,8,9,10};
//        Log.i("ArrayNumber", myIntNumberArray[4] + "");
//        Log.i("Array Count", myIntNumberArray[myIntNumberArray.length - 1]+ "");
//        Log.i("Array", myIntNumberArray + "");

        ArrayList myArrayList = new ArrayList();

        myArrayList.add("Lion");
        myArrayList.add("Tiger");
        myArrayList.add("Leopard");
        myArrayList.add("Fish");
        Log.i("ArrayList", myArrayList.get(1) + "");
        Log.i("ArrayContents", myArrayList.toString());
        myArrayList.remove(1);
        Log.i("ArrayListAfter", myArrayList.get(1) + "");

        Log.i("ArrayContents", myArrayList.toString());

        HashMap computers = new HashMap();

        computers.put(4, "Galaxy S7");
        computers.put("laptop", "Alienware");
        computers.put("sport", "Football");
        computers.put("mobile", "iPhone");

        Log.i("ArrayHash", computers.get(4) + "");
        Log.i("ArrayHashAll", computers.toString());

        computers.remove(4);

        Log.i("ArrayHashAll", computers.toString());

        String[] sportNamesArray = new String[5];

        sportNamesArray[0] = "Boxing";
        sportNamesArray[1] = "Rugby";
        sportNamesArray[2] = "Football";
        sportNamesArray[3] = "BaseBall";
        sportNamesArray[4] = "Soccer";

        Log.i("MyStringArray", sportNamesArray[0].toString());
        Log.i("myStringArray", sportNamesArray.);
        

    }
}