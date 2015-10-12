package Views;

import android.content.Context;

import DomainLayer.Contact;


public interface RegisterView {
     void  onInsertDatabase (Context context,Contact c);
}
