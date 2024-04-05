package easy.tuto.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Text_Modual extends AppCompatActivity {
    Button encode , decode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_modual);
        encode = findViewById(R.id.encode);
        decode = findViewById(R.id.decode);

        encode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endo();
            }
        });

        decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dedo();
            }
        });
    }
    public void endo(){
        Intent intent1 = new Intent(this,Txt_Endo.class);
        startActivity(intent1);
    }

    public void dedo(){
        Intent intent2 = new Intent(this,Txt_Dedo.class);
        startActivity(intent2);
    }
}
