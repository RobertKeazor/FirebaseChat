package Model;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import DomainLayer.Contact;
import DomainLayer.ContactDatabase;


public class Model_Database_Impementation implements MODLE_DATABASE {

    private SQLiteDatabase MyDatabase;

    @Override
    public void getCreatedDatabase(Context c, Contact mContact, ContactDatabase mDatabase) {
        mDatabase.onCreate(MyDatabase);

    }
}
