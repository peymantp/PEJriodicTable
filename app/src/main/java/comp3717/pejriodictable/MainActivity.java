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

    //left big button
    Button bigButtonLeft;
    private boolean bigButtonStateLeft = false;

    //right big button
    Button bigButtonRight;
    private boolean bigButtonStateRight = false;

    View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decorView = (View)getWindow().getDecorView();
        bigButtonLeft = (Button)findViewById(R.id.big1);
        bigButtonRight = (Button)findViewById(R.id.big2);
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
        Button element = (Button)view;
        Button replace;
        String tag, s;
        int ID;

        if(!bigButtonStateLeft){
            replace = bigButtonLeft;
            bigButtonStateLeft = true;
        } else {
            replace = bigButtonRight;
            bigButtonStateRight = true;
        }

        for(int i = 1;i<87;i++){
            if(i==57)
                i=72;

            if(element.getTag().toString().equals("e"+i)) {
                tag = element.getTag().toString();
                ID = getResources().getIdentifier(tag, "string", getPackageName());
                s = getResources().getString(ID);

                replace.setText(s);
                Log.d("ID", "e" + i);  //button/string ID
                break;
            }
        }
    }

    public void onClickBigButton(View view){
        Button button = (Button)view;

        if(bigButtonLeft.equals(button))
            bigButtonStateLeft = false;
        else
            bigButtonStateRight = false;

        button.setText(R.string.bigB);
    }
}
