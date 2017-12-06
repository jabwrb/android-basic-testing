package cc.somkiat.basicunittesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import cc.somkiat.basicunittesting.validation.validator.EmailValidator;
import cc.somkiat.basicunittesting.validation.validator.NameValidator;

public class MainActivity extends AppCompatActivity {

    private EditText userNameInput, emailInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        userNameInput = findViewById(R.id.userNameInput);
        emailInput = findViewById(R.id.emailInput);
    }

    public void onSaveClick(View view) {
        NameValidator nameValidator = new NameValidator();
        EmailValidator emailValidator = new EmailValidator();

        try {
            nameValidator.validate(userNameInput.getText().toString());
            emailValidator.validate(emailInput.getText().toString());
            Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
        } catch (IllegalArgumentException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void onRevertClick(View view) {
        userNameInput.setText("");
        emailInput.setText("");

        Toast.makeText(this, "Reverted", Toast.LENGTH_SHORT).show();
    }
}
