package com.nagpal.garorasu.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private int mCount;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG,"Activity Started");
        setContentView(R.layout.activity_main);
        Log.d(LOG_TAG,"Layout inflated");
        mShowCount	=	(TextView)	findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Log.d(LOG_TAG,"Toast Button pressed");
        Toast.makeText(getApplicationContext(), R.string.toast_message,Toast.LENGTH_LONG).show();
    }

    public void countUp(View view) {
        Log.d(LOG_TAG,"Count Button pressed");
        mCount++;
        if(mShowCount != null)
        {
            mShowCount.setText(Integer.toString(mCount));
        }
    }
}
