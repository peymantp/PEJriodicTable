package comp3717.pejriodictable;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import static android.app.PendingIntent.getActivity;

public class MainActivity extends AppCompatActivity {

    public final static String FIRST_ELEMENT_MESSAGE = "comp3717.pejriodictable.FIRST_ELEMENT";
    public final static String SECOND_ELEMENT_MESSAGE = "comp3717.pejriodictable.SECOND_ELEMENT";

    //left big button
    Button bigButtonLeft;
    private boolean bigButtonStateLeft = false;

    //right big button
    Button bigButtonRight;
    private boolean bigButtonStateRight = false;

    Button combineButton;

    View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        decorView = (View)getWindow().getDecorView();
        bigButtonLeft = (Button)findViewById(R.id.big1);
        bigButtonRight = (Button)findViewById(R.id.big2);
        combineButton = (Button)findViewById(R.id.combineButton);
        combineButton.setClickable(false);
    }
    @Override
    //hide nav
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

    public void onClickMetal(View view){
        Button element = (Button)view;
        Button replace;
        String tag, s;
        int ID;

        replace = bigButtonLeft;
        bigButtonStateLeft = true;

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
        if(bigButtonStateLeft == true && bigButtonStateRight == true) {
            combineButton.setClickable(true);
            combineButton.setBackgroundResource(R.drawable.table_combinebutton);
        }
    }

    public void onClickNonMetal(View view){
        Button element = (Button)view;
        Button replace;
        String tag, s;
        int ID;

        replace = bigButtonRight;
        bigButtonStateRight = true;

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
        if(bigButtonStateLeft == true && bigButtonStateRight == true) {
            combineButton.setClickable(true);
            combineButton.setBackgroundResource(R.drawable.table_combinebutton);
        }
    }

    public void onClickBigButton(View view){
        Button button = (Button)view;

        if(bigButtonLeft.equals(button)) {
            bigButtonStateLeft = false;
            combineButton.setClickable(false);
            combineButton.setBackgroundResource(R.drawable.table_buttons_metal);
        }else {
            bigButtonStateRight = false;
            combineButton.setClickable(false);
            combineButton.setBackgroundResource(R.drawable.table_buttons_metal);
        }
        button.setText(R.string.bigB);
    }

    public void onClickCombine(View view){

        Intent detailsIntent = new Intent(this, CompoundDetails.class);

        Button element1 = (Button) findViewById(R.id.big1);
        Button element2 = (Button) findViewById(R.id.big2);

        String element1String = element1.getText().toString();
        String element2String = element2.getText().toString();

        detailsIntent.putExtra(FIRST_ELEMENT_MESSAGE, element1String);
        detailsIntent.putExtra(SECOND_ELEMENT_MESSAGE, element2String);

        startActivity(detailsIntent);
    }
}
