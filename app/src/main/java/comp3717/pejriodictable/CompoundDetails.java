package comp3717.pejriodictable;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class CompoundDetails extends AppCompatActivity {
    View decorView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.FIRST_ELEMENT_MESSAGE);
        String message2 = intent.getStringExtra(MainActivity.SECOND_ELEMENT_MESSAGE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_details);

        decorView = (View)getWindow().getDecorView();

        LinearLayout layout = (LinearLayout) findViewById(R.id.detailsView);

        TextView firstElement = new TextView(this);
        firstElement.setText(message1);
        layout.addView(firstElement);

        TextView secondElement = new TextView(this);
        secondElement.setText(message2);
        layout.addView(secondElement);
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

}
