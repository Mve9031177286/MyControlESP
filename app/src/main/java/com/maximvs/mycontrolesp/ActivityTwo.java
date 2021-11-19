package com.maximvs.mycontrolesp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityTwo extends AppCompatActivity {

    private Button buttonDeCrypt;
    private Button buttonDeleteAllTwo;
    private Button buttonGoCrypt;
    private EditText editTextCryptTwo;
    private TextView editTextDeCrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        buttonDeCrypt = (Button) findViewById(R.id.buttonDeCrypt);
        buttonDeleteAllTwo = (Button) findViewById(R.id.buttonDeleteAllTwo);
        buttonGoCrypt = (Button) findViewById(R.id.buttonGoCrypt);
        editTextCryptTwo = (EditText) findViewById(R.id.editTextCryptTwo);
        editTextDeCrypt = (TextView) findViewById(R.id.editTextDeCrypt);

        buttonDeCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextCryptTwo.getText().length() == 0)
                    Toast.makeText(ActivityTwo.this, R.string.instruction5, Toast.LENGTH_SHORT).show();
                else {
                    String eTextCry = editTextCryptTwo.getText().toString();
                    editTextDeCrypt.setText(decrypter(eTextCry));
                }
            }
        });

        buttonDeleteAllTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTextDeCrypt.setText(" ");
                editTextCryptTwo.setText(" ");
            }
        });

        buttonGoCrypt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public static String decrypter(String string) {

        String newString = string.replace('б', 'q');
        String newString1 = newString.replace('г', 'w');
        String newString2 = newString1.replace('д', 'e');
        String newString3 = newString2.replace('ж', 'r');
        String newString4 = newString3.replace('з', 't');
        String newString5 = newString4.replace('й', 'y');
        String newString6 = newString5.replace('л', 'u');
        String newString7 = newString6.replace('п', 'i');
        String newString8 = newString7.replace('ф', 'o');
        String newString9 = newString8.replace('ц', 'p');
        String newString10 = newString9.replace('ч', 'a');
        String newString11 = newString10.replace('ш', 's');
        String newString12 = newString11.replace('щ', 'd');
        String newString13 = newString12.replace('ы', 'f');
        String newString14 = newString13.replace('ь', 'g');
        String newString15 = newString14.replace('ъ', 'h');
        String newString16 = newString15.replace('э', 'j');
        String newString17 = newString16.replace('ю', 'k');
        String newString18 = newString17.replace('я', 'l');
        String newString19 = newString18.replace('1', 'z');
        String newString20 = newString19.replace('2', 'x');
        String newString21 = newString20.replace('3', 'c');
        String newString22 = newString21.replace('4', 'v');
        String newString23 = newString22.replace('5', 'b');
        String newString24 = newString23.replace('6', 'n');
        String newString25 = newString24.replace('7', 'm');
        String newString26 = newString25.replace('8', ' ');

        return newString26;
    }
}