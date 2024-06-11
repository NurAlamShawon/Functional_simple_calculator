package com.example.functional_calculator_cse489_081;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button one, two, three, four, five, six, seven, eight, nine, zero, delete,ac,divide, multiply, subtract, addition, dot, equal;
    private EditText calculation,result;
    private boolean dot_inserted,operator_inserted;
private String cur,res;
    private char currentSymbol;


    private double val1 = Double.NaN;
    private double val2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       res="";
       cur="";
       dot_inserted=false;
       operator_inserted=false;
        calculation = findViewById(R.id.calculation);
        result=findViewById(R.id.result);

        findViewById(R.id.one).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='1';
              displayone();
            }
        });
        findViewById(R.id.two).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='2';
                displayone();
            }
        });
        findViewById(R.id.three).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='3';
                displayone();
            }
        });

        findViewById(R.id.four).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='4';
                displayone();
            }
        });

        findViewById(R.id.five).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='5';
                displayone();
            }
        });

        findViewById(R.id.six).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='6';
                displayone();
            }
        });
        findViewById(R.id.seven).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='7';
                displayone();
            }
        });
        findViewById(R.id.eight).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='8';
                displayone();
            }
        });
        findViewById(R.id.nine).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='9';
                displayone();
            }
        });

        findViewById(R.id.zero).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cur+='0';
                displayone();
            }
        });
        findViewById(R.id.dot).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(cur.isEmpty()){
                   cur="0.";
                   dot_inserted=true;
               }

               if(dot_inserted==false){
                   cur=cur+".";
                   dot_inserted=true;

               }

               displayone();
            }
        });



        findViewById(R.id.delete).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clear();
                displayone();
                displaytwo();
            }
        });
        findViewById(R.id.ac).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backspace();
                displayone();

            }
        });

        findViewById(R.id.divide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!cur.isEmpty()){


                    if(cur.substring(cur.length()-1,cur.length()).equals(".")){
                        backspace();
                    }
                    if(operator_inserted==false){
                        cur+=" ÷ ";
                        operator_inserted=true;
                        displayone();
                    }


                }
            }
        });

        findViewById(R.id.multiply).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!cur.isEmpty()){


                    if(cur.substring(cur.length()-1,cur.length()).equals(".")){
                        backspace();
                    }
                    if(operator_inserted==false){
                        cur+=" x ";
                        operator_inserted=true;
                        displayone();
                    }


                }
            }
        });


        findViewById(R.id.addition).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!cur.isEmpty()){


                    if(cur.substring(cur.length()-1,cur.length()).equals(".")){
                        backspace();
                    }
                    if(operator_inserted==false){
                        cur+=" + ";
                        operator_inserted=true;
                        displayone();
                    }


                }
            }
        });


        findViewById(R.id.subtract).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dot_inserted=false;
                if(!cur.isEmpty()){


                    if(cur.substring(cur.length()-1,cur.length()).equals(".")){
                        backspace();
                    }
                    if(operator_inserted==false){
                        cur+=" - ";
                        operator_inserted=true;
                        displayone();
                    }


                }
            }
        });


findViewById(R.id.equal).setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        if(operator_inserted==true && !cur.substring(cur.length()-1,cur.length()).equals(" ")){
String [] tokens=cur.split(" ");

switch (tokens[1].charAt(0)){
    case '+':
        res=Double.toString(Double.parseDouble(tokens[0])+Double.parseDouble(tokens[2]));
        break;
    case '-':
        res=Double.toString(Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]));
        break;
    case 'x':
        res=Double.toString(Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]));
        break;
    case '÷':
        res=Double.toString(Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]));
        break;

}
displaytwo();

        }
    }
});









displayone();
displaytwo();


    }

    public void displayone(){

        calculation.setText(cur);

    }
    public void displaytwo(){

        result.setText(res);

    }
    public  void clear(){


        cur="";
        res="";
        dot_inserted=false;
        operator_inserted=false;
    }

public  void backspace(){
        if(!cur.isEmpty()){

            if(cur.substring(cur.length()-1,cur.length()).equals(".")){
                dot_inserted=false;
            }
            if(cur.substring(cur.length()-1,cur.length()).equals(" ")){
                cur=cur.substring(0,cur.length()-3);
                operator_inserted=false;
            }else{
                cur=cur.substring(0,cur.length()-1);
            }



        }
}






}