package approximatelyhungry.com.issuequizzertesting;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AchievementsActivity extends AppCompatActivity {

    //Creates a Shared Preferences variable to store whether the user has completed each quiz or not
    private String SP_NAME = "issuequizzerpref";
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievements);

        setAchievements();
    }

    /*
     * The setAchievements method checks the sp variable every time it starts up to determine
     * if it needs to set an achievement to yes or if it can leave it at a no. All achievements
     * are defaulted to no.
     */
    public void setAchievements() {
        //Gets shared preferences up to date

        // Sets variable 'sp' to the App's SharedPreferences of the device (data stash)
        sp = getSharedPreferences(SP_NAME, Context.MODE_PRIVATE);

        // Pulls a value from app data using a key, getting a specific value or a default "n" if not value is not set.
        // The value obtained is checked if it meets our requirement, if it is "y"
        if (sp.getString("gunViolence", "n").equalsIgnoreCase("y")) {

            // Assigns TextView to a dynamic variable
            TextView t = findViewById(R.id.booleanGun);
            // Sets text of TextView to "Yes"
            t.setText("Yes");
            // Sets Color of TextView to green
            t.setTextColor(0xff00ff00);
        }

        if (sp.getString("drugEpidemic", "n").equalsIgnoreCase("y")) {
            //Sets the text view to say "yes" if the user has completed this quiz. Also changes color to green
            TextView t = findViewById(R.id.booleanDrug);
            t.setText("Yes");
            t.setTextColor(0xff00ff00);
        }
        if (sp.getString("payGap", "n").equalsIgnoreCase("y")) {
            TextView t = findViewById(R.id.booleanPay);
            t.setText("Yes");
            t.setTextColor(0xff00ff00);
        }
        if (sp.getString("immigration", "n").equalsIgnoreCase("y")) {
            TextView t = findViewById(R.id.booleanImmigration);
            t.setText("Yes");
            t.setTextColor(0xff00ff00);
        }
        if (sp.getString("war", "n").equalsIgnoreCase("y")) {
            TextView t = findViewById(R.id.booleanMiddleEast);
            t.setText("Yes");
            t.setTextColor(0xff00ff00);
        }
    }
}

