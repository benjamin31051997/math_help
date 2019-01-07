package app.andriod.thinkfactory.mathhelp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import app.andriod.thinkfactory.math_basic.basic.CoreFunctions;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: 1+2= "+ CoreFunctions.add(1,2));
    }
}
