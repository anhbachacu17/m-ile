package com.example.xm;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TinhToanActivity extends AppCompatActivity {
    private Button btnHello;
    private Button btnChao;
    private Button btnClear;
    private EditText txtName;

    public static final String TAG = TinhToanActivity.class.getSimpleName(); // log này
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Log.e(TAG, "Bug Demogithub " );
        }
        else{
            Log.e(TAG,"Welcome Demoguthub");
        }
        setContentView(R.layout.activity_tinh_toan);

        XuLiClick();
    }

    public void XuLiClick(){
        btnHello = (Button) findViewById(R.id.btn_hello);
        btnChao = (Button) findViewById(R.id.btn_chao);
        btnClear = (Button) findViewById(R.id.btn_clear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = (EditText) findViewById(R.id.txt_name);
                txtName.setText("");
            }
        });

        btnChao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = (EditText) findViewById(R.id.txt_name); //R.id đang tìm kiếm một phần tử của giao diện là EditText thông qua qua id là txt_name// R là một lớp trong android dùng để truy cập tai nguyên chuỗi, màu,hình
                String name = String.valueOf(txtName.getText()); //valueof() dùng để chuyển 1 giá trị thành chuỗi
                String kq = "Chào " + name;

                Toast.makeText(getApplicationContext(),kq, Toast.LENGTH_LONG).show(); // Hiển thị thông báo lên màng hình
            }
        });
        btnHello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName = (EditText) findViewById(R.id.txt_name);
                String name = String.valueOf(txtName.getText());
                String kq = "Hello " + name;
                Toast.makeText(getApplicationContext(),kq, Toast.LENGTH_LONG).show();
            }
        });
    }

}