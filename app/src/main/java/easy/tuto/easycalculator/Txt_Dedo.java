package easy.tuto.easycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Txt_Dedo extends AppCompatActivity {
    Button decode;
    EditText encodemsg , orgmsg , val1 , val2;
    String t,y,z,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_txt_dedo);
        decode = findViewById(R.id.decode);
        orgmsg = findViewById(R.id.orgmsg);
        encodemsg = findViewById(R.id.encomsg);
        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);

        decode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z = val1.getText().toString();
                y = val2.getText().toString();
                t = encodemsg.getText().toString();
                result = "";
                for (String word : t.split(" ")) {
                    if ((z + y).equals(word)) {
                        result += "a";
                    } else if ((y + z + z + z).equals(word)) {
                        result += "b";
                    } else if ((y + z + y + z).equals(word)) {
                        System.out.print("c");
                    } else if ((y + z + z).equals(word)) {
                        result += "d";
                    } else if ((z).equals(word)) {
                        result += "e";
                    } else if ((z + z + y + z).equals(word)) {
                        result += "f";
                    } else if ((y + y + z).equals(word)) {
                        result += "g";
                    } else if ((z + z + z + z).equals(word)) {
                        result += "h";
                    } else if ((z + z).equals(word)) {
                        result += "i";
                    } else if ((z + y + y + y).equals(word)) {
                        result += "j";
                    } else if ((y + z + y).equals(word)) {
                        result += "k";
                    } else if ((z + y + z + z).equals(word)) {
                        result += "l";
                    } else if ((y + y).equals(word)) {
                        result += "m";
                    } else if ((y + z).equals(word)) {
                        result += "n";
                    } else if ((y + y + y).equals(word)) {
                        result += "o";
                    } else if ((z + y + y + z).equals(word)) {
                        result += "p";
                    } else if ((y + y + z + y).equals(word)) {
                        result += "q";
                    }else if (("Z" + y + z).equals(word)) {
                        result += "r";
                    } else if ((z + z + z).equals(word)) {
                        result += "s";
                    } else if ((y).equals(word)) {
                        result += "t";
                    } else if ((z + z + y).equals(word)) {
                        result += "u";
                    } else if ((z + z + z + y).equals(word)) {
                        result += "v";
                    } else if ((z + y + y).equals(word)) {
                        result += "w";
                    } else if ((y + z + z + y).equals(word)) {
                        result += "x";
                    } else if ((y + z + y + y).equals(word)) {
                        result += "y";
                    } else if ((y + y + z + z).equals(word)) {
                        result += "z";
                    } else if ("_".equals(word)) {
                        result += " ";
                    }else if ("!".equals(word)) {
                        result += "!";
                    }else if ("@".equals(word)) {
                        result += "@";
                    }else if ("#".equals(word)) {
                        result += "#";
                    }else if ("$".equals(word)) {
                        result += "$";
                    }else if ("%".equals(word)) {
                        result += "%";
                    }else if ("?".equals(word)) {
                        result += "?";
                    }else if ("^".equals(word)) {
                        result += "^";
                    }else if ("*".equals(word)) {
                        result += "*";
                    }else if ("&".equals(word)) {
                        result += "&";
                    }

                }
                orgmsg.setText(result);
            }
        });
    }
}