package com.example.ncalculate;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    ImageView btn_0,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_equals;
    ImageView btn_dot,btn_minus,btn_divide,btn_plus,btn_module,cros,btn_multiply,btn_ac,btn_extra;
    TextView textView_input,textView_output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findView();
        OnClick();

    }
    // find ciew by id
    public void findView(){
        btn_0 = findViewById(R.id.btn_0);
        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_equals = findViewById(R.id.btn_equal);
        btn_dot = findViewById(R.id.btn_dot);
        btn_minus = findViewById(R.id.btn_minus);
        btn_divide = findViewById(R.id.btn_divide);
        btn_plus = findViewById(R.id.btn_plus);
        btn_module = findViewById(R.id.btn_module);
        cros = findViewById(R.id.cros);
        btn_multiply = findViewById(R.id.btn_multiply);
        btn_ac = findViewById(R.id.btn_ac);
        btn_extra = findViewById(R.id.btn_extra);
        textView_input = findViewById(R.id.textView_input);
        textView_output = findViewById(R.id.textView_output);

    }
    // onclick listener
    public void OnClick(){
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("0"));
            }
        });
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("1"));
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("2"));
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("3"));
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("4"));
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("5"));
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("6"));
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("7"));
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("8"));
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("9"));
            }
        });
        btn_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("."));
            }
        });
        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("-"));
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("/"));
            }
        });
        btn_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("+"));
            }
        });
        btn_module.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("%"));
            }
        });
        cros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                // while loop to solve the app crashing problem when no input is given and cut the string is invoked
                // sol: don"t press excessive cros button till the problem is resolved
                while(input.isEmpty()){
                    cros.setEnabled(false);
                }
                textView_input.setText(input.substring(0, input.length() - 1));
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText(input.concat("*"));
            }
        });
        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText("");
                textView_output.setText("");
            }
        });
        btn_extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                textView_input.setText("Chin tapak dum dum");
            }
        });
        btn_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = textView_input.getText().toString();
                String final_result = Calculate(input);
                textView_output.setText(final_result);
            }
        });


    }
    // btn_equals implementation where string is provided and its value is calculate
    public String Calculate(String input){
        Context rhino = Context.enter();
        rhino.setOptimizationLevel(-1);
        Scriptable scriptable = rhino.initStandardObjects();
        String final_res = rhino.evaluateString(scriptable,input,"Javsscript",1,null).toString();
        String final_result = final_res.substring(0, input.length() - 2);
        return final_res;
    }
}