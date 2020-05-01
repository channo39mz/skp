package com.example.oo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Frist extends AppCompatActivity {

    private EditText in1,in2,in3;
    private Button add,want;
    private String typ,num,unit;
    private TextView txt;
    private Float f,t,v,s,r;
    // f=ความถี่ t=คาบ v=อัตราเร็วเชิงเส้น s=ระยะทาง r=รัศมี


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frist);
        in1 = (EditText)findViewById(R.id.rub1);
        in2 = (EditText)findViewById(R.id.rub2);
        in3 = (EditText)findViewById(R.id. rub3);
        add = findViewById(R.id.add);
        want = (Button)findViewById(R.id. finD);
        txt = (TextView)findViewById(R.id. torf);

        typ = in1.getText().toString();
        num = in2.getText().toString();
        unit = in3.getText().toString();

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View)
            {
                typ = in1.getText().toString();
                num = in2.getText().toString();
                unit = in3.getText().toString();
                //txt.setText(typ);

                if (typ.contentEquals("f"))
                {
                    if(unit.contentEquals("s/t"))
                    {
                        f = Float.parseFloat(num);
                        t = 1/f;
                        txt.setText(t.toString());
                        if(v!=null)
                        {
                            s = v*f;
                        }
                        if(s!=null)
                        {
                            v = s/t;
                        }

                    }
                }
                if(typ.contentEquals("t"))
                {
                    if(unit.contentEquals("s/t"))
                    {

                    }
                }
                in1.setText("");
                in2.setText("");
                in3.setText("");
            }
        });
    }
}
