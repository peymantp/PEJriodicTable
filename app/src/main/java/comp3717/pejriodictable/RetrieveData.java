package comp3717.pejriodictable;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Justin on 2016-04-03.
 */
public class RetrieveData
{
    Context context;
    private DataDBHelper mDbHelper;
    String atomicNum;
    String[] result;
    RetrieveData(final Context con, final String num)
    {
        context = con;
        mDbHelper = new DataDBHelper(context);
        atomicNum = num;

        SQLiteDatabase dbRead = mDbHelper.getReadableDatabase();

        // Define a projection that specifies which columns from the database
        // you will actually use after this query.
        String[] projection = {
                DataContract.Data.COLUMN_NAME_SYMBOL,
                DataContract.Data.COLUMN_NAME_ATOMIC_NUM,
                DataContract.Data.COLUMN_NAME_NAME,
                DataContract.Data.COLUMN_NAME_WEIGHT,
                DataContract.Data.COLUMN_NAME_CHARGE
        };

        Cursor c = dbRead.rawQuery("select * from " + DataContract.Data.TABLE_NAME + " where "
                + DataContract.Data.COLUMN_NAME_ATOMIC_NUM + " = " + atomicNum + " order by "
                + DataContract.Data.COLUMN_NAME_ATOMIC_NUM + " asc" , null);

        if (c.moveToFirst()) {
            String[] info = new String[5];
            for (int i = 0; i < info.length; i++) {
                info[i] = c.getString(i + 1);
            }

            result =  info;
        } else {
            result = null;
        }

    }

    public String[] returnResult() {
        return result;
    }
}
