package approximatelyhungry.com.issuequizzertesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    

    public void gunViolence(View view) {
        Intent intent = new Intent(this, QuizTemplate.class);
        intent.putExtra("TOPIC_NAME", "gun");
        startActivity(intent);
    }

    public void involved(View view) {
        Intent intent = new Intent(this, InvolvemetActivity.class);
        startActivity(intent);
    }

    public void war(View view) {
        Intent intent = new Intent(this, QuizTemplate.class);
        intent.putExtra("TOPIC_NAME", "war");
        startActivity(intent);
    }

    public void immigration(View view) {
        Intent intent = new Intent(this, QuizTemplate.class);
        intent.putExtra("TOPIC_NAME", "immigration");
        startActivity(intent);
    }

    public void payGap(View view) {
        Intent intent = new Intent(this, QuizTemplate.class);
        intent.putExtra("TOPIC_NAME", "pay");
        startActivity(intent);
    }

    public void drugEpidemic(View view) {
        Intent intent = new Intent(this, QuizTemplate.class);
        intent.putExtra("TOPIC_NAME", "drug");
        startActivity(intent);
    }

    public void achievements(View view) {
        Intent intent = new Intent(this, AchievementsActivity.class);
        startActivity(intent);
    }
}