package com.example.kevin.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;
import android.app.Activity;

public class Calculator extends Activity {

    private enum Operator{none,add,minus,multiply,divide}
    private double data1 =0, data2 =0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }

    public void btn00click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"0");
    }

    public void btn01click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"1");
    }

    public void btn02click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"2");
    }

    public void btn03click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"3");
    }

    public void btn04click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"4");
    }

    public void btn05click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"5");
    }

    public void btn06click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"6");
    }

    public void btn07click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"7");
    }

    public void btn08click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"8");
    }

    public void btn09click(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+"9");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(etext.getText().toString());
        etext.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.minus;
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(etext.getText().toString());
        etext.setText("");
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.multiply;
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(etext.getText().toString());
        etext.setText("");
    }

    public void btnDivideClick(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        optr = Operator.divide;
        data1 = Double.parseDouble(etext.getText().toString());
        etext.setText("");
    }

    public void btnClearClick(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText("");
    }

    public void btnDotClick(View view) {
        EditText etext = (EditText)findViewById(R.id.resultEdit);
        etext.setText(etext.getText()+".");
    }

    public void btnResultClick( View view){
        if(optr!=Operator.none){
            EditText etext = (EditText)findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(etext.getText().toString());
            double result = 0;
            if(optr==Operator.add) {
                result = data1 + data2;
            } else if(optr==Operator.minus) {
                result = data1 - data2;
            }else if(optr==Operator.multiply) {
                result = data1 * data2;
            }else if(optr ==Operator.divide) {
                result = data1 / data2;
            }
            optr=Operator.none;
            data1=result;
            if((result-(int)result)!=0)
                etext.setText(String.valueOf(result));
            else
                etext.setText(String.valueOf((int)result));
            }
        }
    }
