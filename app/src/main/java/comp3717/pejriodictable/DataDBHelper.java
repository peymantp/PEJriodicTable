package comp3717.pejriodictable;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Justin on 2016-04-03.
 */
public class DataDBHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "ElementInfo.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DataContract.Data.TABLE_NAME + " (" +
                    DataContract.Data._ID + " INTEGER PRIMARY KEY," +
                    DataContract.Data.COLUMN_NAME_SYMBOL + TEXT_TYPE + COMMA_SEP +
                    DataContract.Data.COLUMN_NAME_ATOMIC_NUM + TEXT_TYPE + COMMA_SEP +
                    DataContract.Data.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    DataContract.Data.COLUMN_NAME_WEIGHT + TEXT_TYPE + COMMA_SEP +
                    DataContract.Data.COLUMN_NAME_CHARGE + TEXT_TYPE +

            " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DataContract.Data.TABLE_NAME;



    public DataDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
