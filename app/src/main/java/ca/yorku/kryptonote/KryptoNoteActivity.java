//Student Name: Sophia Nguyen
//This project was done individually
package ca.yorku.kryptonote;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileWriter;

public class KryptoNoteActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kryptonote_activity);
    }

    public void onEncrypt(View v) {

    }

    public void onDecrypt(View v) {

    }

    public void onSave(View v) {
        try
        {
            String name = ((EditText) findViewById(R.id.file)).getText().toString();
            File dir = this.getFilesDir();
            File file = new File(dir, name);
            FileWriter fw = new FileWriter(file);
            fw.write(((EditText) findViewById(R.id.data)).getText().toString());
            fw.close();
            Toast.makeText(this,"Note Saved.",Toast.LENGTH_LONG);
        }
        catch (Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG);
        }
    }

    public void onLoad(View V) {
        
    }
}
