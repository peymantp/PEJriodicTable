package comp3717.pejriodictable;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {
    View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decorView = (View)getWindow().getDecorView();
    }
    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            decorView.setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                            | View.SYSTEM_UI_FLAG_FULLSCREEN
                            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);}
    }

    public void onClick(View view){
        //test function
        Button element = (Button)view;
        Button replace = (Button)findViewById(R.id.big1);
        String tag;
        int ID;
        String s;

        for(int i = 1;i<87;i++){
            if(i==57)
                i=72;

            Log.d("ID","|"+element.getTag().toString()+"|");
            if(element.getTag().toString().equals("e"+i)) {
                Log.d("ID","passed if");
                tag = element.getTag().toString();
                //ID = getResId(tag, String.class);
                ID = getResources().getIdentifier(tag,  "string", getPackageName());
                s = getResources().getString(ID);

                replace.setText(s);
                Log.d("ID","e"+1);
                break;
            }
        }
        Log.d("ID","end");
    }
}
