package Views;

import android.content.Context;
import android.widget.Toast;

import DomainLayer.Contact;


public class LoginViewImplementation implements LoginView {


    @Override
    public void buttonSubmit(Context c, Contact contact) {
        Toast.makeText(c, "SubmitClickWorks", Toast.LENGTH_SHORT).show();
    }

}
