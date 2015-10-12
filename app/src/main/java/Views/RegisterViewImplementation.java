package Views;

import android.content.Context;

import DomainLayer.Contact;
import DomainLayer.ContactDatabase;

public class RegisterViewImplementation implements RegisterView {

    ContactDatabase db;
    @Override
    public void onInsertDatabase(Context context,Contact c)
    {
        db = new ContactDatabase (context);
        db.insertEntry(c);

    }
}
