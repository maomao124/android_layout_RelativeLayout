package mao.android_layout_relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int processors = Runtime.getRuntime().availableProcessors();
        Log.i("MainActivity", "onCreate: processors:" + processors);
        for (int i = 0; i < processors; i++)
        {
            new Thread(new Runnable()
            {
                @Override
                public void run()
                {
                    while (true)
                    {

                    }
                }
            }).start();
        }
    }
}