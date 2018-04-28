package my.edu.tarc.sciencepark;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.twizo.TwizoFactory;
import com.twizo.Twizo;
import com.twizo.controllers.verification.VerificationController;
import com.twizo.dataaccess.Node;
import com.twizo.dataaccess.jsonparams.VerificationParams;
import com.twizo.exceptions.TwizoException;
import com.twizo.models.Verification;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    String apiKey = null;
    Node apiNode = null;


    TextView ttView;
    EditText usernameet;
    EditText passwordet;
    Button loginbutton;
    String username;
    String password;

    private static Twizo twizo;
    private static VerificationExample verificationExample;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiKey="Qi63uK7bx_xWFEIRvBKeVJ-YiGJDAdR9tNg_fvyoUDuHd2I1";
        apiNode=Node.ASIA;
        try {
            twizo= new TwizoFactory(apiKey, apiNode);
        } catch (TwizoException e) {
            e.printStackTrace();
        }
        verificationExample=new VerificationExample(twizo);
        usernameet = (EditText)findViewById(R.id.usernameet);
        passwordet = (EditText)findViewById(R.id.passwordet);


        loginbutton = (Button)findViewById(R.id.loginbutton);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String messageid = null;
                String token = null;
                String phonenumber ="601111931731";

                username = usernameet.getText().toString();
                password = passwordet.getText().toString();

                Intent mainmenu = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(mainmenu);
            }
        });
    }

}
