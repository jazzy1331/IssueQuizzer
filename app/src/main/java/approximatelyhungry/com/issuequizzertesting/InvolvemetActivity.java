package approximatelyhungry.com.issuequizzertesting;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class InvolvemetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_involvemet);

//        TextView txt1 = (TextView) findViewById(R.id.textView4); //txt is object of TextView
//        txt1.setMovementMethod(LinkMovementMethod.getInstance());
//        txt1.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
//                browserIntent.setData(Uri.parse("https://resistancenearme.org/"));
//                startActivity(browserIntent);
//            }
//        });
//
//        TextView txt2 = (TextView) findViewById(R.id.textView2); //txt is object of TextView
//        txt2.setMovementMethod(LinkMovementMethod.getInstance());
//        txt2.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
//                browserIntent.setData(Uri.parse("http://www.rallylist.com/"));
//                startActivity(browserIntent);
//            }
//        });
//
//        TextView txt3 = (TextView) findViewById(R.id.textView); //txt is object of TextView
//        txt3.setMovementMethod(LinkMovementMethod.getInstance());
//        txt3.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
//                browserIntent.setData(Uri.parse("https://www.resistancecalendar.org/"));
//                startActivity(browserIntent);
//            }
//        });
    }

    public void firstEvent(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=1 Capitol Square Columbus, OH 43215")); //lat lng or address query
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void secondEvent(View view) {

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=59 E Mount St Columbus, OH 43215")); //lat lng or address query
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
