package edu.hzuapps.androidlabs.soft1714080902435;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

 public class Soft1714080902435Activity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
     @Override
     protected void onCreate(Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_soft1714080902435);
            button=(Button)findViewById(R.id.Start);
            button.setOnClickListener(this);
        }
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Soft1714080902435Activity.this,Soft1714080902435Activity2.class);
            startActivity(intent);
    }
}
