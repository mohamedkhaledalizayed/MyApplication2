package smile.khaled.mohamed.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import smile.khaled.mohamed.mylibrary.Pretty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Pretty(this);
    }
}
