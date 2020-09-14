package mx.com.ferthronix.face;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import mx.com.ferthronix.face.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnFeed;
    EditText txtUser;
    EditText txtPassword;
    private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        
        btnFeed = binding.btnLogin.findViewById(R.id.btnLogin);
        txtUser = binding.txtUser.findViewById(R.id.txtUser);
        txtPassword = binding.txtPassword.findViewById(R.id.txtPassword);

        btnFeed.setOnClickListener(this);
        btnFeed.setEnabled(false);

        txtUser.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (charSequence.toString().equals("")){
                    btnFeed.setEnabled(false);
                }
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                if (txtUser.getText().toString().equals("")){
                    btnFeed.setEnabled(false);
                }
                else if(txtPassword.getText().toString().equals("")){
                    btnFeed.setEnabled(false);
                }else{
                    btnFeed.setEnabled(true);
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.toString().equals("")){
                    btnFeed.setEnabled(false);
                }
            }
        });

            txtPassword.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (charSequence.toString().equals("")){
                        btnFeed.setEnabled(false);
                    }
                }
                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    if (txtUser.getText().toString().equals("")){
                        btnFeed.setEnabled(false);
                    }
                    else if(txtPassword.getText().toString().equals("")){
                        btnFeed.setEnabled(false);
                    }else{
                        btnFeed.setEnabled(true);
                    }
                }
                @Override
                public void afterTextChanged(Editable editable) {
                    if (editable.toString().equals("")){
                        btnFeed.setEnabled(false);
                    }else if (txtUser.getText().toString().equals("")){
                        btnFeed.setEnabled(false);
                    }else{
                        btnFeed.setEnabled(true);
                    }
                }
            });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLogin:
                if(txtPassword.getText().toString().equals("fer") && txtUser.getText().toString().equals("fer")){
                    Intent intentFeed = new Intent(MainActivity.this, feed.class);
                    startActivity(intentFeed);
                } else {
                    Toast toast1 = Toast.makeText(getApplicationContext(), "Incorrect credentials. Please try again.", Toast.LENGTH_SHORT);
                    toast1.show();
                    txtUser.setText("");
                    txtPassword.setText("");
                }
                break;
        }
    }
}