package kr.ac.mjc.htnwls.activity_main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText xOffsetET=findViewById(R.id.xoffset_et);
        EditText yOffsetET=findViewById(R.id.yoffset_et);
        Button toastbtn=findViewById(R.id.toast_btn);
        toastbtn.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int xOffset= Intent.parseInt( xOffsetET.getText().toString());
                int yOffset= Intent.parseInt( yOffsetET.getText().toString());

                Toast t=Toast.makeText(MainActivity.this,""hello world),Toast.LENGTH_SHORT)
                t.setGravity(Gravity.CENTER,xOffset.yOffset);
                t.show();
            }
        };


    }
}
