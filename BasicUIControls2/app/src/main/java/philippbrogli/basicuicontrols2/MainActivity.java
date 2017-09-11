package philippbrogli.basicuicontrols2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //AutoCompleteTextView
        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.autocomplete_login);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, new String[]{"Pasi","Juha","Kari","Jouni","Esa","Hannu"});
        actv.setAdapter(aa);
    }
    public void selectButtonClicked(View view){
        EditText et1 = (EditText) findViewById(R.id.autocomplete_login);
        Editable eLogin =(Editable)et1.getText();
        String text_login = eLogin.toString();
        EditText et2 = (EditText) findViewById(R.id.edit_password);
        Editable ePassword =(Editable)et2.getText();
        String text_password = ePassword.toString();


        String text = text_login + " " + text_password;
        Toast.makeText(getApplicationContext(),text,Toast.LENGTH_SHORT).show();
    }
}
