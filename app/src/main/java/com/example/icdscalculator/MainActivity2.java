package com.example.icdscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText inPow = findViewById(R.id.inPow);

        EditText inSev = findViewById(R.id.inSev);

        EditText inGnl = findViewById(R.id.inGnl);

        TextView TtlBnf = findViewById(R.id.TtlBnf);
        Button cBtn = findViewById(R.id.cBtn);
        Button RsetBtn = findViewById(R.id.RsetBtn);

        TextView EggPwo,EggSevere,EggGne,EggTotal;
        EggPwo = findViewById(R.id.EggPwo);
        EggSevere = findViewById(R.id.EggSevere);
        EggGne = findViewById(R.id.EggGne);
        EggTotal = findViewById(R.id.EggTotal);

        TextView vegPwo,vgeSevere,vgeGne,vegTotal,EggVegSoaTtl,AllTtlcost;
        vegPwo = findViewById(R.id.vegPwo);
        vgeSevere = findViewById(R.id.vgeSevere);
        vgeGne = findViewById(R.id.vgeGne);
        vegTotal = findViewById(R.id.vegTotal);
        EggVegSoaTtl = findViewById(R.id.EggVegSoaTtl);
        AllTtlcost = findViewById(R.id.AllTtlcost);

        TextView GenMngSlsk,SevereMngSlsk,CtatuSugGenCost,ChatuSugSevereCost,ChatuSugTtlcost;
        GenMngSlsk = findViewById(R.id.GenMngSlsk);
        SevereMngSlsk = findViewById(R.id.SevereMngSlsk);
        CtatuSugGenCost = findViewById(R.id.CtatuSugGenCost);
        ChatuSugSevereCost = findViewById(R.id.ChatuSugSevereCost);
        ChatuSugTtlcost = findViewById(R.id.ChatuSugTtlcost);



        cBtn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("DefaultLocale")
            @Override
            public void onClick(View v) {
                int PowL,Sev ,Gen;

                PowL =  Integer.parseInt(String.valueOf(inPow.getText()));
                Sev =  Integer.parseInt(String.valueOf(inSev.getText()));
                Gen =  Integer.parseInt(String.valueOf(inGnl.getText()));
                int tbnF = PowL+Sev+Gen;
                TtlBnf.setText(String.valueOf(tbnF));


                float EgPow = (float) (PowL * 6.50);
                float EgSev = (float) (Sev * 6.50);
                float EgGen = (float) ( Gen * 6.50);
                float EgTotl = (EgPow + EgSev + EgGen);
                EggPwo.setText(String.format("%.2f",EgPow));
                EggSevere.setText(String.format("%.2f",EgSev));
                EggGne.setText(String.format("%.2f",EgGen));
                EggTotal.setText(String.format("%.2f",EgTotl));

                float vegPw= (float) (PowL * 0.84);
                float vgeSever = (float) (Sev * 0);
                float vgeGn = (float) ( Gen * 0);
                float vegTot = (vegPw +vgeSever + vgeGn);
                vegPwo.setText(String.format("%.2f",vegPw));
                vgeSevere.setText(String.format("%.2f",vgeSever));
                vgeGne.setText(String.format("%.2f",vgeGn));
                vegTotal.setText(String.format("%.2f",vegTot));

                float EggVegSoaTt =  (vegTot+ EgTotl);
                EggVegSoaTtl.setText(String.format("%.2f",EggVegSoaTt));


                int GenMngSls = (Gen * 0);
                int SevereMngSls =( Sev * 0);
                GenMngSlsk.setText(String.valueOf(GenMngSls));
                SevereMngSlsk.setText(String.valueOf(SevereMngSls));

                float CtatuSugGenCos = (float) (Sev * 0);
                float ChatuSugSevereCos = (float) ( Gen * 0);
                float ChatuSugTtlcos = (CtatuSugGenCos + ChatuSugSevereCos);
                CtatuSugGenCost.setText(String.format("%.2f",CtatuSugGenCos));
                ChatuSugSevereCost.setText(String.format("%.2f",ChatuSugSevereCos));
                ChatuSugTtlcost.setText(String.format("%.2f",ChatuSugTtlcos));


                float AllTtlcos = (vegTot+ EgTotl + ChatuSugTtlcos);
                AllTtlcost.setText(String.format("%.2f",AllTtlcos));

            }
        });


        RsetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inPow.setText("");
                inGnl.setText("");
                inSev.setText("");
                TtlBnf.setText("");

                EggPwo.setText("");
                EggSevere.setText("");
                EggGne.setText("");
                EggTotal.setText("");

                vegPwo.setText("");
                vgeSevere.setText("");
                vgeGne.setText("");
                vegTotal.setText("");
                EggVegSoaTtl.setText("");

                GenMngSlsk.setText("");
                SevereMngSlsk.setText("");

                CtatuSugGenCost.setText("");
                ChatuSugSevereCost.setText("");
                ChatuSugTtlcost.setText("");
                AllTtlcost.setText("");

            }
        });
    }
}