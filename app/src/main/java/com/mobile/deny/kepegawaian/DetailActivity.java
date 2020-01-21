package com.mobile.deny.kepegawaian;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imgDetail;
    TextView txtNamaDetail,txtDescDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        imgDetail = (ImageView)findViewById(R.id.imageDetail);
        txtNamaDetail = (TextView)findViewById(R.id.txtNamaDetail);
        txtDescDetail = (TextView)findViewById(R.id.txtDescDetail);
        Intent intent = getIntent();
        imgDetail.setImageResource(intent.getIntExtra("Image",0));
        txtNamaDetail.setText(intent.getSerializableExtra("Title").toString());
        txtDescDetail.setText(intent.getSerializableExtra("Description").toString());
    }
}
