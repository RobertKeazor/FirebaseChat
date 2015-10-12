package DomainLayer;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;


public class ContactDatabase extends SQLiteOpenHelper {

    SQLiteDatabase db;
    public static final int DatabaseEntries = 1;
    public static final String Database_NAME = "Contacts.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + FeedEntry.TABLE_NAME + " (" +
                    FeedEntry._ID + " INTEGER PRIMARY KEY," +
                    FeedEntry.COLUMN_NAME_ENTRY_ID + TEXT_TYPE + COMMA_SEP +
                    FeedEntry.COLUMN_PASSWORD + TEXT_TYPE + COMMA_SEP +" )";


    public ContactDatabase(Context context) {
        super(context, Database_NAME, null, DatabaseEntries);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
        this.db=db;

    }
    public void insertEntry (Contact c){
        db=getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(FeedEntry.COLUMN_NAME_ENTRY_ID,c.getUserName());
        values.put(FeedEntry.COLUMN_PASSWORD,c.getPassword());
        db.insert(FeedEntry.TABLE_NAME,null,values);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     String tableCheck ="DROP TABLE IF EXISTS";
        db.execSQL(tableCheck);
    }
    public static abstract class FeedEntry implements BaseColumns {
        public static final String TABLE_NAME = "entry";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_PASSWORD = "password";
        public static final String COLUMN_NAME_SUBTITLE = "subtitle";

    }


}


