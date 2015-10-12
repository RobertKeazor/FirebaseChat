package firebase.mychat.com.firebasechat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import DomainLayer.Contact;
import Views.RegisterViewImplementation;
import butterknife.Bind;
import butterknife.ButterKnife;

public class RegisterActivity extends AppCompatActivity {

    @Bind(R.id.reg_fullname)
    EditText regFullname;
    @Bind(R.id.reg_email)
    EditText regEmail;
    @Bind(R.id.reg_password)
    EditText regPassword;
    @Bind(R.id.btnRegister)
    Button btnRegister;
    @Bind(R.id.link_to_login)
    TextView linkToLogin;
    Contact contact;
    RegisterViewImplementation registerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        registerView=new RegisterViewImplementation();
        ButterKnife.bind(this);

    }

    public void LoginChat(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish();
    }

    public void onClickRegister (View view)
    {
        contact=new Contact(regFullname.getText().toString(),regPassword.getText().toString());
        registerView.onInsertDatabase(this,contact);
    }
}
