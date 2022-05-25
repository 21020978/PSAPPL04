package sg.edu.rp.c346.id21020978.psappl04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    Button btnConfirm;
    RadioButton smoke;
    RadioButton nonsmoke;
    EditText fullname;
    EditText lastname;
    EditText number;
    EditText size;
    Button reset;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dp =findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnConfirm = findViewById(R.id.btnConfirm);
        smoke = findViewById(R.id.table_smoke);
        nonsmoke = findViewById(R.id.no_smoke);
        fullname = findViewById(R.id.full_name);
        number = findViewById(R.id.phone_number);
        size = findViewById(R.id.total_size);
        reset = findViewById(R.id.btnReset);


        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (fullname != null ) {
                    if (size != null && number != null) {
                        if (smoke.isChecked() && size!= null) {
                            int month = dp.getMonth() + 1;
                            Toast.makeText(MainActivity.this,
                                    fullname.getText()+" "+
                                            " made a registration on "+dp.getDayOfMonth()+"/"
                                            + month +"/"+dp.getYear()+" at the time of "+
                                            tp.getCurrentHour()+":"+tp.getCurrentMinute() +
                                            " on the table with smokers with "+size.getText()
                                            +" people.",Toast.LENGTH_LONG).show();

                        }
                        else if(nonsmoke.isChecked()){
                            int month = dp.getMonth() + 1;
                            Toast.makeText(MainActivity.this,fullname.getText()
                                    +" "+lastname.getText()+" made a registration on "
                                    +dp.getDayOfMonth()+"/"+ month +"/"+dp.getYear()+" at the time of "
                                    +  tp.getCurrentHour()+":"+tp.getCurrentMinute()
                                    + " on the table with non-smokers with "+size.getText()+" people."
                                    ,Toast.LENGTH_LONG).show();
                        }



                    }
                    else{
                        Toast.makeText(MainActivity.this,
                                "Please enter your details",Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this,
                            "Please enter your details",Toast.LENGTH_LONG).show();
                }
            }
            ;});
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tp.setCurrentHour(7);
                tp.setCurrentMinute(30);


                dp.updateDate(2020,5,01);


                ;  ;}});}}