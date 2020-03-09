package com.rawanali97.userinterface2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void swt_onClick(View view) {

            Switch swt = (Switch)view;
            //test test...
            String info = "";
            if(swt.isChecked()){
                info = "Switch is On";
            }
            else{
                info = "Switch is Off";
            }
            printInfo(info);
        }

        private void printInfo(String info) {
            Toast.makeText(this, info,
                    Toast.LENGTH_SHORT).show();
        }


    // For RadioButton Without GroupButton Checking Which was clicked ...
    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.rdo1 :
                if (checked)
                    Toast.makeText(this, "Radio 1 is Checked ",
                            Toast.LENGTH_SHORT).show();
                    break;
            case R.id.rdo2:
                if (checked)
                    Toast.makeText(this, "Radio 2 is Checked ",
                            Toast.LENGTH_SHORT).show();
                    break;

        }

    }
}
