package firebase.mychat.com.firebasechat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
    }
    public void LoginChat (View view)
    {
    Intent intent = new Intent(this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
