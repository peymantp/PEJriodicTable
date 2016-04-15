package comp3717.pejriodictable;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
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

        decorView = (View) getWindow().getDecorView();

        LinearLayout layout = (LinearLayout) findViewById(R.id.detailsView);
        //Number
        String leftAtomicNum = message1.split("\n")[0];
        String rightAtomicNum = message2.split("\n")[0];
        TextView metalNumber = (TextView) findViewById(R.id.metalNumber);
        metalNumber.setText(leftAtomicNum);
        TextView gasNumber = (TextView) findViewById(R.id.gasNumber);
        gasNumber.setText(rightAtomicNum);

        //Names
        TextView metalName = (TextView) findViewById(R.id.metalName);
        metalName.setText(message1.split("\n")[2]);
        TextView gasName = (TextView) findViewById(R.id.gasName);
        gasName.setText(message2.split("\n")[2]);

        //Symbol
        TextView metalSymbol = (TextView) findViewById(R.id.metalSymbol);
        metalSymbol.setText(message1.split("\n")[1]);
        TextView gasSymbol = (TextView) findViewById(R.id.gasSymbol);
        gasSymbol.setText(message2.split("\n")[1]);

        //Weight
        TextView metalWeight = (TextView) findViewById(R.id.metalWeight);
        metalWeight.setText(message1.split("\n")[3]);
        TextView gasWeight = (TextView) findViewById(R.id.gasWeight);
        gasWeight.setText(message2.split("\n")[3]);

        RetrieveData getLeftElement = new RetrieveData(this, leftAtomicNum);
        RetrieveData getRightElement = new RetrieveData(this, rightAtomicNum);

        String leftElementInfo[] = getLeftElement.returnResult();
        String rightElementInfo[] = getRightElement.returnResult();

        TextView compound = (TextView) findViewById(R.id.compoundSymbol);

        Log.d("t", rightElementInfo[1]);

        if (rightElementInfo[1].equals("2") || rightElementInfo[1].equals("10") || rightElementInfo[1].equals("18")
                || rightElementInfo[1].equals("36") || rightElementInfo[1].equals("54") || rightElementInfo[1].equals("86")) {
            compound.setText("\nCan't balances noble gases!");

        } else {

            if (leftElementInfo[4] != null && rightElementInfo[4] != null) {
                int leftCharge = Integer.parseInt(leftElementInfo[4]);
                int rightCharge = Integer.parseInt(rightElementInfo[4]);

                int[] counts = balance(leftCharge, rightCharge);
                if (counts[0] == 1 && counts[1] == 1) {
                    compound.setText("\n" + leftElementInfo[0] + rightElementInfo[0]);
                } else if (counts[1] == 1) {
                    compound.setText("\n" + leftElementInfo[0] + counts[0] + rightElementInfo[0]);
                } else if (counts[0] == 1) {
                    compound.setText("\n" + leftElementInfo[0] + rightElementInfo[0] + counts[1]);
                } else {
                    compound.setText("\n" + leftElementInfo[0] + counts[0] + rightElementInfo[0] + counts[1]);
                }
            }
        }
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

    public int[] balance(int leftCharge, int rightCharge) {
        int[] counts = new int[2];

        //count of elements on the left side
        counts[0] = 1;
        //count of elements on the right side
        counts[1] = 1;

        while (Math.abs(counts[0] * leftCharge) != Math.abs(counts[1] * rightCharge)) {

            if (Math.abs((counts[0] * leftCharge)) < Math.abs((counts[1] * rightCharge))) {
                counts[0]++;
            } else {
                counts[1]++;
            }
        }
        return counts;
    }

}
