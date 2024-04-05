package easy.tuto.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Hidden_Fold extends AppCompatActivity {
    ImageView Txt_Modual1 , Img_Modual1 , Audio_Modual2;
//    Button txt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hidden_fold);

        Txt_Modual1 = findViewById(R.id.txt_modual1);

        Txt_Modual1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt();
            }
        });
    }
    public void txt(){
        Intent intent = new Intent(this,Text_Modual.class);
        startActivity(intent);
    }
}