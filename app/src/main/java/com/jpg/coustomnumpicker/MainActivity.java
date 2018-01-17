package com.jpg.coustomnumpicker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn);



        final NumPicker np = new NumPicker(this);
        np.setOnCancelListener(new NumPicker.OnCancelClickListener() {
            @Override
            public void onClick() {
                np.dismiss();
            }
        });
        np.setOnComfirmListener(new NumPicker.onComfirmClickListener() {
            @Override
            public void onClick(int num) {
                Toast.makeText(MainActivity.this, num + "", Toast.LENGTH_SHORT).show();
                np.dismiss();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                np.show();
            }
        });
    }
}
