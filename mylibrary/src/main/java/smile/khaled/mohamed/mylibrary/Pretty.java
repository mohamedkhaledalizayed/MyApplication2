package smile.khaled.mohamed.mylibrary;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Pretty extends LinearLayout{

    public Pretty(Context context) {
        super(context);
         init(context);
    }


    private void init(Context context) {
        View view=LayoutInflater.from(context).inflate(R.layout.toast_layout, this, true);
        TextView text = (TextView) findViewById(R.id.text);
        text.setText("Hello! This is a custom toast!");
        Toast toast = new Toast(context);

        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(view);
        toast.show();

    }
}
