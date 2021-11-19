package com.maximvs.mycontrolesp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


        private Button buttonCrypt;
        private Button buttonCopy;
        private Button buttonDeleteAll;
        private Button buttonGoDeCrypt;
        private EditText editTextInput;
        private TextView editTextCrypt;

        ClipboardManager clipboardManager;
        ClipData clipData;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            buttonCrypt = (Button) findViewById(R.id.buttonCrypt);
            buttonCopy = (Button) findViewById(R.id.buttonCopy);
            buttonDeleteAll = (Button) findViewById(R.id.buttonDeleteAll);
            buttonGoDeCrypt = (Button) findViewById(R.id.buttonGoDeCrypt);
            editTextInput = (EditText) findViewById(R.id.editTextInput);
            editTextCrypt = (TextView) findViewById(R.id.editTextCrypt);

            clipboardManager = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

            buttonCrypt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (editTextInput.getText().length() == 0)
                        Toast.makeText(MainActivity.this, R.string.instruction, Toast.LENGTH_SHORT).show();
                    else {
                        String eTextInp = editTextInput.getText().toString();
                        editTextCrypt.setText(crypter(eTextInp));
                    }
                }
            });

            buttonDeleteAll.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    editTextInput.setText(" ");
                    editTextCrypt.setText(" ");
                }
            });

            buttonGoDeCrypt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                    startActivity(intent);
                }
            });

            buttonCopy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String eTextCry = editTextCrypt.getText().toString();
                    clipData = ClipData.newPlainText("text", eTextCry);
                    clipboardManager.setPrimaryClip(clipData);
                    Toast.makeText(MainActivity.this, R.string.textCopy, Toast.LENGTH_SHORT).show();
                }
            });
        }

        public static String crypter(String string) {

            String newString = string.replace('q', 'б');
            String newString1 = newString.replace('w', 'г');
            String newString2 = newString1.replace('e', 'д');
            String newString3 = newString2.replace('r', 'ж');
            String newString4 = newString3.replace('t', 'з');
            String newString5 = newString4.replace('y', 'й');
            String newString6 = newString5.replace('u', 'л');
            String newString7 = newString6.replace('i', 'п');
            String newString8 = newString7.replace('o', 'ф');
            String newString9 = newString8.replace('p', 'ц');
            String newString10 = newString9.replace('a', 'ч');
            String newString11 = newString10.replace('s', 'ш');
            String newString12 = newString11.replace('d', 'щ');
            String newString13 = newString12.replace('f', 'ы');
            String newString14 = newString13.replace('g', 'ь');
            String newString15 = newString14.replace('h', 'ъ');
            String newString16 = newString15.replace('j', 'э');
            String newString17 = newString16.replace('k', 'ю');
            String newString18 = newString17.replace('l', 'я');
            String newString19 = newString18.replace('z', '1');
            String newString20 = newString19.replace('x', '2');
            String newString21 = newString20.replace('c', '3');
            String newString22 = newString21.replace('v', '4');
            String newString23 = newString22.replace('b', '5');
            String newString24 = newString23.replace('n', '6');
            String newString25 = newString24.replace('m', '7');
            String newString26 = newString25.replace(' ', '8');

            return newString26;
        }
}