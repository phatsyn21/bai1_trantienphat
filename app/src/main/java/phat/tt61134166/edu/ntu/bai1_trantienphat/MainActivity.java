package phat.tt61134166.edu.ntu.bai1_trantienphat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText canhday = findViewById(R.id.edtday);
        EditText canhben1 = findViewById(R.id.edtcanhben);
        EditText chieucao = findViewById(R.id.edtccao);
        Button tinhchuvi = findViewById(R.id.edtCvi);
        Button tinhdientich = findViewById(R.id.edtDtich);
        TextView ketqua = findViewById(R.id.edtkqua);
           tinhdientich.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   int ccao = Integer.parseInt(chieucao/getText().toString());
                   int day =Integer.parseInt(canhday.getText().toString());
                   int kqua = day *ccao;
                   ketqua.setText("Dien tich HBH la: " +kqua);

               }
           });

        tinhchuvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ccao = Integer.parseInt(chieucao/getText().toString());
                int canhben =Integer.parseInt(canhben1.getText().toString());
                int kqua =  (ccao+canhben)*2;
                ketqua.setText("Chu vi HBH la: " +kqua);

            }
        });

    }
}