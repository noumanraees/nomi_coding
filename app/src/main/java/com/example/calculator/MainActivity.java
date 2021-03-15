package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
   public EditText v1;
    public EditText v2;
    public TextView tv;
    public int no1=0;
    public int no2=0;
    public int ad=0;
    int subtract=0;
    int multiplication=0;
    int division=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         v1 = (EditText) findViewById(R.id.value1);
         v2 = (EditText) findViewById(R.id.value2);
       // TextView tv = (TextView) findViewById(R.id.result);
        Spinner spinner = findViewById(R.id.spinner);
        List<String> operations = new ArrayList<>();
        operations.add("Choose Operand");
        operations.add("Addition");
        operations.add("Subtraction");
        operations.add("Multiplication");
        operations.add("Division");

        ArrayAdapter<String> dataAdapter;
        dataAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, operations);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) throws ArithmeticException {
                String text= adapterView.getItemAtPosition(i).toString();
                 tv = (TextView) findViewById(R.id.result);

                if(text.equals("Addition")){
                    try {
                        no1 = Integer.parseInt(v1.getText().toString());
                        no2 = Integer.parseInt(v2.getText().toString());
                    } catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }
                   // ad=no1+no2;
                  add abc=new add( );
                 int z= abc.ab(no1,no2);
                 tv.setText(String.valueOf(z));

                }
                else if(text.equals("Subtraction")){
                    try {
                        no1=Integer.parseInt(v1.getText().toString());
                        no2=Integer.parseInt(v2.getText().toString());
                    }catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }
                 //   subtract=no1-no2;
                    subtraction sb=new subtraction();
                    int z=sb.sub(no1,no2);
                    tv.setText(String.valueOf(z));
                }
                else if(text.equals("Multiplication")){
                    try {
                        no1=Integer.parseInt(v1.getText().toString());
                        no2=Integer.parseInt(v2.getText().toString());
                    }catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }
                //    multiplication=no1*no2;
                    multiplication mp=new multiplication();
                    float z=mp.mul(no1,no2);
                    tv.setText(String.valueOf(z));
                }
                else if(text.equals("Division")){
                    try {
                        no1=Integer.parseInt(v1.getText().toString());
                        no2=Integer.parseInt(v2.getText().toString());
                    }catch (NumberFormatException e) {
                        System.out.println("not a number");
                    }

                    Division dv=new Division();
                    String z=dv.div(no1,no2);
                    tv.setText(z);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

}


