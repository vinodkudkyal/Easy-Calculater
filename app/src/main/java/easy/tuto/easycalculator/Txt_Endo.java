package easy.tuto.easycalculator;

import static easy.tuto.easycalculator.R.id.encode;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Txt_Endo extends AppCompatActivity {
    Button encode;
    EditText messaged , encodedmsg , val1 , val2;
    String y , z , c3;
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_endo);
        encode = findViewById(R.id.encode);
        messaged = findViewById(R.id.messaged);
        encodedmsg = findViewById(R.id.encodedmsgd);
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);

        encode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z =   val1.getText().toString();
                y =   val2.getText().toString();
                c3 =   messaged.getText().toString();
                String loname = c3.toLowerCase();
                char[] charOfarr = loname.toCharArray();
                StringBuilder res = new StringBuilder();
                for (char chh : charOfarr) {
                    if (chh == 'a') {
                        res.append(z).append(y).append("  ");
                    } else if (chh == 'b') {
                        res.append(y).append(z).append(z).append(z).append("  ");
                    } else if (chh == 'c') {
                        res.append(y).append(z).append(y).append(z).append("  ");
                    } else if (chh == 'd') {
                        res.append(y).append(z).append(z).append("  ");
                    } else if (chh == 'e') {
                        res.append(z).append("  ");
                    } else if (chh == 'f') {
                        res.append(z).append(z).append(y).append(z).append("  ");
                    } else if (chh == 'g') {
                        res.append(y).append(y).append(z).append("  ");
                    } else if (chh == 'h') {
                        res.append(z).append(z).append(z).append(z).append("  ");
                    } else if (chh == 'i') {
                        res.append(z).append(z).append("  ");
                    } else if (chh == 'j') {
                        res.append(z).append(y).append(y).append(y).append("  ");
                    } else if (chh == 'k') {
                        res.append(y).append(z).append(y).append("  ");
                    } else if (chh == 'l') {
                        res.append(z).append(y).append(z).append(z).append("  ");
                    } else if (chh == 'm') {
                        res.append(y).append(y).append("  ");
                    } else if (chh == 'n') {
                        res.append(y).append(z).append("  ");
                    } else if (chh == 'o') {
                        res.append(y).append(y).append(y).append("  ");
                    } else if (chh == 'p') {
                        res.append(z).append(y).append(y).append(z).append("  ");
                    } else if (chh == 'q') {
                        res.append(y).append(y).append(z).append(y).append("  ");
                    } else if (chh == 'r') {
                        res.append(z).append(y).append(z).append("  ");
                    } else if (chh == 's') {
                        res.append(z).append(z).append(z).append("  ");
                    } else if (chh == 't') {
                        res.append(y).append("  ");
                    } else if (chh == 'u') {
                        res.append(z).append(z).append(y).append("  ");
                    } else if (chh == 'v') {
                        res.append(z).append(z).append(z).append(y).append("  ");
                    } else if (chh == 'w') {
                        res.append(z).append(y).append(y).append("  ");
                    } else if (chh == 'x') {
                        res.append(y).append(z).append(z).append(y).append("  ");
                    } else if (chh == 'y') {
                        res.append(y).append(z).append(y).append(y).append("  ");
                    } else if (chh == 'z') {
                        res.append(y).append(y).append(z).append(z).append("  ");
                    } else if (chh == ' ') {
                        res.append("_").append("  ");
                    }else if (chh == '!') {
                        res.append("!").append("  ");
                    }else if (chh == '@') {
                        res.append("@").append("  ");
                    }else if (chh == '#') {
                        res.append("#").append("  ");
                    }else if (chh == '$') {
                        res.append("$");
                    }else if (chh == '%') {
                        res.append("%").append("  ");
                    }else if (chh == '^') {
                        res.append("^").append("  ");
                    }else if (chh == '&') {
                        res.append("&").append("  ");
                    }else if (chh == '*') {
                        res.append("*").append("  ");
                    }else if (chh == '?') {
                        res.append("?").append("  ");
                    }

                }
                encodedmsg.setText(res.toString());
            }
        });

    }
}