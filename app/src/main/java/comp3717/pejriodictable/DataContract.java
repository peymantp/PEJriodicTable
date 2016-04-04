package comp3717.pejriodictable;

import android.provider.BaseColumns;

/**
 * Created by Justin on 2016-04-03.
 */


public final class DataContract {
    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    public DataContract() {}

    /* Inner class that defines the table contents */
    public static abstract class Data implements BaseColumns {
        public static final String TABLE_NAME = "ElementInformation";
        public static final String COLUMN_NAME_SYMBOL = "symbol";
        public static final String COLUMN_NAME_ATOMIC_NUM = "atomicNum";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_WEIGHT = "weight";
        public static final String COLUMN_NAME_CHARGE = "charge";
    }
}
