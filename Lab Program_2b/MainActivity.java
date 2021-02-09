package com.example.aad_linearlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener{
    String[] state = { "Select your State" , "Andhra Pradesh", "Goa","Karnataka","Kerala", "Maharastra", "Telangana", "TamilNadu" ,"Arunachal Pradesh" , "" +
            "Assam", "Bihar"};
    EditText uname;
    EditText pass;
    EditText address;
    RadioButton gender;
    RadioGroup radioGroup;
    EditText age;
    DatePicker date;
    String pos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = (EditText) findViewById(R.id.username);
        pass = (EditText) findViewById(R.id.password);
        address = (EditText) findViewById(R.id.address);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        age = (EditText)findViewById(R.id.ageNumeric);
        date = (DatePicker) findViewById(R.id.datePicker);
        Spinner spin = (Spinner) findViewById(R.id.state_spinner);
        spin.setOnItemSelectedListener(this);
        ArrayAdapter a = new ArrayAdapter(this,android.R.layout.simple_spinner_item,state);
        a.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(a);

    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position, long id) {
        pos = "State = "+ state[position];
    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void onSubmitBtn(View view) {
        int selectedId = radioGroup.getCheckedRadioButtonId();
        gender = (RadioButton) findViewById(selectedId);
        String day = "Date = " + date.getDayOfMonth()+"/"+(date.getMonth() + 1)+"/"+date.getYear();
        Toast.makeText(getApplicationContext(), "Username = " + uname.getText() +
                "\nPassword = "+pass.getText()+ "\nAddress = "+address.getText()+
                "\nGender = "+ gender.getText()+ "\nAge = "+ age.getText() + "\n"+
                day + "\n" + pos, Toast.LENGTH_SHORT).show();
    }
}