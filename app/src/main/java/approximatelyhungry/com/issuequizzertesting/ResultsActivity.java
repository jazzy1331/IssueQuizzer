package approximatelyhungry.com.issuequizzertesting;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ResultsActivity extends AppCompatActivity {

    private String SP_NAME = "issuequizzerpref";
    private SharedPreferences sp;
    private TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        sp = getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);
        message = (TextView) findViewById(R.id.resultsText);
        message.setText("HI!!!");
        Context context = getApplicationContext();

        String topic = "";
        String TOPIC_NAME = getIntent().getStringExtra("TOPIC_NAME");
        SharedPreferences.Editor editor = sp.edit();

        switch (TOPIC_NAME) {
            case "gun":
                topic = "You have earned the 'Complete Gun Violence Quiz' Achievement!";
                message.setText("You have successfully completed the Gun Violence Quiz!!");
                editor.putString("gunViolence", "y");
                editor.apply();
                break;

            case "war":
                topic = "You have earned the 'Complete Middle East Quiz' Achievement!";
                message.setText("You have successfully completed the Middle East Quiz!!");
                editor.putString("war", "y");
                editor.apply();
                break;

            case "immigration":
                topic = "You have earned the 'Complete Immigration/Refugees Quiz' Achievement!";
                message.setText("You have successfully completed the Immigration/Refugees Quiz!!");
                editor.putString("immigration", "y");
                editor.apply();
                break;

            case "pay":
                topic = "You have earned the 'Complete Pay Gap Quiz' Achievement!";
                message.setText("You have successfully completed the Pay Gap Quiz!!");
                editor.putString("payGap", "y");
                editor.apply();
                break;

            case "drug":
                topic = "You have earned the 'Complete Drug Epidemic Quiz' Achievement!";
                message.setText("You have successfully completed the Drug Epidemic Quiz!!");
                editor.putString("drugEpidemic", "y");
                editor.apply();
                break;
        }

        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, topic, duration);
        toast.show();

        editor.apply();

    }

    public void goToMainMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
