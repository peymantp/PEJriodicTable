package comp3717.pejriodictable;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

/**
 * Created by Justin on 2016-04-03.
 *
 * This class populates a table with data for each element, and then displays the data on screen.
 */
class InsertData
    extends AsyncTask<String, Void, String> {
    Activity activity;
    Context context;
    private DataDBHelper mDbHelper;

    InsertData(final Activity a, final Context c) {
        activity = a;
        context = c;
        mDbHelper = new DataDBHelper(context);
    }

    protected String doInBackground(final String... urls) {
        SQLiteDatabase dbWrite = mDbHelper.getWritableDatabase();

        dbWrite.execSQL("delete from " + DataContract.Data.TABLE_NAME);

        ContentValues[] allValues = new ContentValues[71];
        int i = 0;

        ContentValues values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "H");
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "1");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Hydrogen");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "1.008");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "2");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "He");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Helium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "4.002602");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "0");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "3");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Li");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Lithium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "6.94");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "4");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Be");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Beryllium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "9.0121831");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "5");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "B");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Boron");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "10.81");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "6");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "C");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Carbon");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "12.011");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "7");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "N");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Nitrogen");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "14.007");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "8");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "O");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Oxygen");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "15.999");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "9");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "F");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Flourine");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "18.998");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "10");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ne");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Neon");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "20.1797");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "0");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "11");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Na");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Sodium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "22.98976928");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "12");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Mg");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Magnesium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "24.305");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "13");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Al");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Aluminium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "26.9815385");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "14");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Si");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Silicon");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "28.085");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "15");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "P");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Phosphorus");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "30.973761998");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "16");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "S");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Sulfur");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "32.06");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "17");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Cl");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Chlorine");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "35.45");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "18");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ar");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Argon");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "39.948");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "0");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "19");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "K");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Potassium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "39.0983");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "20");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ca");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Calcium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "40.078");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "21");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Sc");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Scandium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "44.955908");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "22");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ti");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Titanium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "47.867");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "23");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "V");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Vandium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "50.9415");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "5");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "24");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Cr");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Chromium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "51.9961");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "25");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Mn");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Maganese");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "54.938044");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "26");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Fe");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Iron");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "55.845");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "27");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Co");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Cobalt");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "58.933194");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "28");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ni");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Nickel");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "58.6934");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "29");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Cu");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Copper");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "63.546");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "30");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Zn");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Zinc");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "65.38");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "31");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ga");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Gallium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "69.723");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "32");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ge");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Germanium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "72.63");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "33");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "As");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Arsenic");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "74.921595");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "34");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Se");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Selenium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "78.971");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "35");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Br");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Bromine");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "79.904");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "36");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Kr");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Krypton");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "83.798");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "0");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "37");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Rb");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Rubidium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "85.4678");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "38");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Sr");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Strontium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "87.62");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "39");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Y");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Yttrium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "88.90584");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "40");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Zr");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Zirconium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "91.224");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "41");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Nb");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Niobium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "92.90637");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "5");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "42");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Mo");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Molybdenum");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "95.95");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "43");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Tc");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Technetium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "98");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "44");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ru");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Ruthenium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "101.07");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "45");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Rh");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Rhodium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "102.90550");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "46");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Pd");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Palladium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "106.42");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "47");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ag");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Silver");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "107.8682");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "48");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Cd");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Cadmium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "112.414");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "49");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "In");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Indium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "114.818");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "50");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Sn");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Tin");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "118.71");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "51");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Sb");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Antimony");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "121.76");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "52");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Te");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Tellurium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "127.6");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "53");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "I");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Iodine");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "126.90447");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "54");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Xe");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Xenon");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "131.293");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "0");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "55");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Cs");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Caesium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "132.90545196");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "56");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ba");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Barium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "137.327");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "72");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Hf");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Hafnium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "178.49");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "73");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ta");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Tantalum");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "180.94788");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "5");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "74");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "W");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Tungsten");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "183.84");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "75");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Re");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Rhenium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "186.207");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "76");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Os");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Osmium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "190.23");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "4");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "77");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ir");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Irdium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "192.217");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "78");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Pt");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Platinum");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "195.084");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "79");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Au");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Gold");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "196.966569");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "80");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Hg");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Mercury");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "200");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "81");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Ti");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Thallium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "204.38");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "82");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Pb");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Lead");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "207.2");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "83");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Bi");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Bismuth");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "208.98040");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "3");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "84");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Po");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Polonium");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "209");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "2");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "85");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "At");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Astatine");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "210");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "-1");
        allValues[i++] = values;

        values = new ContentValues();
        values.put(DataContract.Data.COLUMN_NAME_ATOMIC_NUM, "86");
        values.put(DataContract.Data.COLUMN_NAME_SYMBOL, "Rn");
        values.put(DataContract.Data.COLUMN_NAME_NAME, "Radon");
        values.put(DataContract.Data.COLUMN_NAME_WEIGHT, "222");
        values.put(DataContract.Data.COLUMN_NAME_CHARGE, "0");
        allValues[i++] = values;

        for (ContentValues x : allValues) {

            long newRowId;
            newRowId = dbWrite.insert(
                    DataContract.Data.TABLE_NAME,
                    "null",
                    x);
        }

        Thread thread = new Thread() {
            @Override
            public void run() {

                activity.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        LayoutInflater inflater = (LayoutInflater) context
                                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                        final View v = inflater.inflate(R.layout.activity_main, null);

                        for (int idx = 1; idx < 87; idx++) {
                            if (idx == 57)
                                idx = 72;

                            int id = activity.getResources().getIdentifier("e" + idx, "id", activity.getPackageName());
                            Button innerView = (Button) activity.findViewById(id);

                            RetrieveData getElement = new RetrieveData(context, Integer.toString(idx));
                            String elementInfo[] = getElement.returnResult();

                            if (innerView != null) {
                                innerView.setText(elementInfo[1] + "\n" + elementInfo[0]);
                            }
                        }
                    }
                });
            }
        };
        thread.start();

        return null;
    }
}
