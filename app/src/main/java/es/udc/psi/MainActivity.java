package es.udc.psi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    //Paquete P21.Rivera y sdk 25
    String TAG = "TAG";
    String ACTIV = "MainActivity";
    Button button;

   /* @Override
    public <T extends View> T findViewById(int id) {
        return super.findViewById(id);
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.boton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, ACTIV="onCreate");
                button.setText(R.string.new_text_button);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,ACTIV="onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,ACTIV="onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,ACTIV="onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,ACTIV="onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,ACTIV="onDestroy");
    }
}
