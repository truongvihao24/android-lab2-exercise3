package com.truongvihao.exercise2_bt3_v2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText result;
    private TextView operation;

    private Double storevalue=null;
    private String operand;
    private String storeOperation;

    public double getStorevalue() {
        return storevalue;
    }

    public void setStorevalue(double storevalue) {
        this.storevalue = storevalue;
    }

    public String getOperand() {
        return operand;
    }

    public void setOperand(String operand) {
        this.operand = operand;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);

        Button button0=findViewById(R.id.button0);
        Button button1=findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);
        Button button6=findViewById(R.id.button6);
        Button button7=findViewById(R.id.button7);
        Button button8=findViewById(R.id.button8);
        Button button9=findViewById(R.id.button9);


        Button buttonPhay=findViewById(R.id.buttonPhay);
        Button buttonBang=findViewById(R.id.buttonBang);
        Button buttonCong=findViewById(R.id.buttonCong);
        Button buttonTru=findViewById(R.id.buttonTru);
        Button buttonNhan=findViewById(R.id.buttonNhan);
        Button buttonChia=findViewById(R.id.buttonChia);
        Button buttonPercent=findViewById(R.id.buttonPercent);
        Button buttonNEG=findViewById(R.id.buttonNegative);
        Button buttonClear=findViewById(R.id.buttonClear);

        operation=findViewById(R.id.operation);
        View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userInput = result.getText().toString();
                if(userInput.contains("Enter")){
                    result.setText("");
                }
                Button b = (Button) view;
                result.append(b.getText().toString());
            }
        };

        button0.setOnClickListener(listener);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
        button3.setOnClickListener(listener);
        button4.setOnClickListener(listener);
        button5.setOnClickListener(listener);
        button6.setOnClickListener(listener);
        button7.setOnClickListener(listener);
        button8.setOnClickListener(listener);
        button9.setOnClickListener(listener);

        View.OnClickListener oplistener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button b = (Button) view;
                String op = b.getText().toString();
                String value = result.getText().toString();
                try {
                    Double doubleValue = Double.valueOf(value);
                    performOperation(doubleValue, op);
                } catch (NumberFormatException e) {
                    result.setText("");
                }
                operation.setText((op));
        };

        private void performOperation(Double value, String operation) {
            if(null==storevalue)
            {
                storevalue=value;
                result.setText("");
            }else
            {
                if(storeOperation.equals("=")) {
                    storeOperation = operation;
                }
            }
            switch 
        }
    };
}
}