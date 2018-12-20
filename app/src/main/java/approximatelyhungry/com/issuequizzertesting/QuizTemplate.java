package approximatelyhungry.com.issuequizzertesting;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class QuizTemplate extends AppCompatActivity {

    TextView quizTitleTextView;
    TextView quizQuestionTextView;
    RadioButton choice1TextView;
    RadioButton choice2TextView;
    RadioButton choice3TextView;
    RadioButton choice4TextView;
    RadioGroup radioGroup;
    String TOPIC_NAME;
    Button quizButton;
    int questionNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz_template);

        quizTitleTextView = (TextView) findViewById(R.id.quizTitle);
        quizQuestionTextView = (TextView) findViewById(R.id.quizQuestion);
        choice1TextView = (RadioButton) findViewById(R.id.choice1);
        choice2TextView = (RadioButton) findViewById(R.id.choice2);
        choice3TextView = (RadioButton) findViewById(R.id.choice3);
        choice4TextView = (RadioButton) findViewById(R.id.choice4);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        quizButton = (Button) findViewById(R.id.quizButton);
        questionNumber = 1;

        TOPIC_NAME = getIntent().getStringExtra("TOPIC_NAME");

        switch (TOPIC_NAME) {
            case "gun":
                gunViolence(questionNumber);
                break;

            case "war":
                middleEast(questionNumber);
                break;

            case "immigration":
                immigration(questionNumber);
                break;

            case "pay":
                payGap(questionNumber);
                break;

            case "drug":
                drugEpidemic(questionNumber);
                break;
        }

    }

    public void completeAction(View view) {

        switch (TOPIC_NAME) {
            case "gun":
                gunActions();
                break;

            case "war":
                middleEastActions();
                break;

            case "immigration":
                immigrationActions();
                break;

            case "pay":
                payActions();
                break;

            case "drug":
                drugActions();
                break;
        }

    }

    public void gunViolence(int questionNumber) {

        quizTitleTextView.setText("Gun Violence");
        String[] gunViolenceArrayQuestions = {"Approximately how many guns for every 100 people in the US?",
                "What is the weapon of choice for an assailant with the intent of chaos and casualties?",
                "Since late 2011, they found, mass shootings have occurred at a rate of 1 every how many days?",
                "11 Mass shootings in 2017 caused how many fatalities?",
                "One out of how many homes with kids have guns?"};

        radioGroup.clearCheck();

        switch (questionNumber) {
            case 1:
                String[] gunViolenceArrayQ1Choices = {"113 Guns to 100 People", "5 Guns to 100 People", "1,000,000 Guns to 100 People", "78 Guns to 100 People"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[0]);
                choice1TextView.setText(gunViolenceArrayQ1Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ1Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ1Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ1Choices[3]);
                break;

            case 2:
                String[] gunViolenceArrayQ2Choices = {"Nerf Gun", "Assault Style Weapons", "Cannons", "Pepper Spray"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[1]);
                choice1TextView.setText(gunViolenceArrayQ2Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ2Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ2Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ2Choices[3]);
                break;

            case 3:
                String[] gunViolenceArrayQ3Choices = {"1 Mass Shooting every 365 Days", "1 Mass Shooting every 1 Day", "1 Mass shooting every 100 Days", "1 Mass Shooting every 64 Days"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[2]);
                choice1TextView.setText(gunViolenceArrayQ3Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ3Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ3Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ3Choices[3]);
                break;

            case 4:
                String[] gunViolenceArrayQ4Choices = {"117 Fatalities", "5 Fatalities", "1000 Fatalities", "45 Fatalities"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[3]);
                choice1TextView.setText(gunViolenceArrayQ4Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ4Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ4Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ4Choices[3]);
                break;

            case 5:
                String[] gunViolenceArrayQ5Choices = {"1 out of 100", "1 out of 10", "1 out of 3", "1 out of 2"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[4]);
                choice1TextView.setText(gunViolenceArrayQ5Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ5Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ5Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ5Choices[3]);
                quizButton.setText("Finish+");
                break;
        }


    }

    public void gunActions() {
        switch (questionNumber) {
            case 1:
                if (choice1TextView.isChecked()) {
                    questionNumber = 2;
                    gunViolence(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 2:
                if (choice2TextView.isChecked()) {
                    questionNumber = 3;
                    gunViolence(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 3:
                if (choice4TextView.isChecked()) {
                    questionNumber = 4;
                    gunViolence(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 4:
                if (choice1TextView.isChecked()) {
                    questionNumber = 5;
                    gunViolence(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 5:
                if (choice3TextView.isChecked()) {
                    Intent intent = new Intent(this, ResultsActivity.class);
                    intent.putExtra("TOPIC_NAME", TOPIC_NAME);
                    startActivity(intent);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()
                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;
        }
    }

    public void drugEpidemic(int questionNumber) {

        quizTitleTextView.setText("Drug Epidemic");
        String[] gunViolenceArrayQuestions = {"The total cost of drug abuse to society is",
                "Choose the most commonly abused drug (Excluding alcohol)",
                "How many babies are born in the US addicted to cocaine due to their mothers addiction per year?\n",
                "How much Fentanyl does it take to kill a human?",
                "Approximately how many people who try heroin get addicted?"};

        radioGroup.clearCheck();

        switch (questionNumber) {
            case 1:
                String[] gunViolenceArrayQ1Choices = {"$1 Trillion", "$860 Million", "$190 Billion", "$40 Billion"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[0]);
                choice1TextView.setText(gunViolenceArrayQ1Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ1Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ1Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ1Choices[3]);
                break;

            case 2:
                String[] gunViolenceArrayQ2Choices = {"Heroin", "Marijuana", "Opioids", "Ibuprofen"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[1]);
                choice1TextView.setText(gunViolenceArrayQ2Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ2Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ2Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ2Choices[3]);
                break;

            case 3:
                String[] gunViolenceArrayQ3Choices = {"6", "100", "80,000", "Over 100,000"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[2]);
                choice1TextView.setText(gunViolenceArrayQ3Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ3Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ3Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ3Choices[3]);
                break;

            case 4:
                String[] gunViolenceArrayQ4Choices = {".25 Milligrams", "1 Kilogram", "1 Gram", "260 Grams"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[3]);
                choice1TextView.setText(gunViolenceArrayQ4Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ4Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ4Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ4Choices[3]);
                break;

            case 5:
                String[] gunViolenceArrayQ5Choices = {"1/2", "1/4", "1/100", "1/25"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[4]);
                choice1TextView.setText(gunViolenceArrayQ5Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ5Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ5Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ5Choices[3]);
                quizButton.setText("Finish+");
                break;
        }


    }

    public void drugActions() {
        switch (questionNumber) {
            case 1:
                if (choice3TextView.isChecked()) {
                    questionNumber = 2;
                    drugEpidemic(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 2:
                if (choice2TextView.isChecked()) {
                    questionNumber = 3;
                    drugEpidemic(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 3:
                if (choice4TextView.isChecked()) {
                    questionNumber = 4;
                    drugEpidemic(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 4:
                if (choice1TextView.isChecked()) {
                    questionNumber = 5;
                    drugEpidemic(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 5:
                if (choice2TextView.isChecked()) {
                    Intent intent = new Intent(this, ResultsActivity.class);
                    intent.putExtra("TOPIC_NAME", TOPIC_NAME);
                    startActivity(intent);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()
                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;
        }
    }

    public void payGap(int questionNumber) {

        quizTitleTextView.setText("Unequal Pay Gap");
        String[] gunViolenceArrayQuestions = {"How much do women earn for every dollar men earn?",
                "The wage gap in women affects which race the most?",
                "The wage gap does what for women as they age?",
                "What percent of women were the sole providers or co-providers for there families?",
                "In how many Congresses has a bill for equal pay been killed since 1997?"};

        radioGroup.clearCheck();

        switch (questionNumber) {
            case 1:
                String[] gunViolenceArrayQ1Choices = {"$1.03", "$0.96", "$0.58", "$0.79"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[0]);
                choice1TextView.setText(gunViolenceArrayQ1Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ1Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ1Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ1Choices[3]);
                break;

            case 2:
                String[] gunViolenceArrayQ2Choices = {"Asian", "White", "African American and Latino", "Other"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[1]);
                choice1TextView.setText(gunViolenceArrayQ2Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ2Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ2Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ2Choices[3]);
                break;

            case 3:
                String[] gunViolenceArrayQ3Choices = {"Decreases", "Increases", "Stays the same", "Fluctuates too much"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[2]);
                choice1TextView.setText(gunViolenceArrayQ3Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ3Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ3Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ3Choices[3]);
                break;

            case 4:
                String[] gunViolenceArrayQ4Choices = {"63.3 Percent", "51 Percent", "27.3 Percent", "81.1 Percent"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[3]);
                choice1TextView.setText(gunViolenceArrayQ4Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ4Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ4Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ4Choices[3]);
                break;

            case 5:
                String[] gunViolenceArrayQ5Choices = {"It's never been in Congress", "Only the last two Congresses", "Four Congresses", "Every Congress since 1997"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[4]);
                choice1TextView.setText(gunViolenceArrayQ5Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ5Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ5Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ5Choices[3]);
                quizButton.setText("Finish+");
                break;
        }


    }

    public void payActions() {
        switch (questionNumber) {
            case 1:
                if (choice4TextView.isChecked()) {
                    questionNumber = 2;
                    payGap(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 2:
                if (choice3TextView.isChecked()) {
                    questionNumber = 3;
                    payGap(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 3:
                if (choice2TextView.isChecked()) {
                    questionNumber = 4;
                    payGap(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 4:
                if (choice1TextView.isChecked()) {
                    questionNumber = 5;
                    payGap(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 5:
                if (choice4TextView.isChecked()) {
                    Intent intent = new Intent(this, ResultsActivity.class);
                    intent.putExtra("TOPIC_NAME", TOPIC_NAME);
                    startActivity(intent);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()
                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;
        }
    }

    public void immigration(int questionNumber) {

        quizTitleTextView.setText("Immigration");
        String[] gunViolenceArrayQuestions = {"How many foreign-born people live in the United States?",
                "What is currently happening to the population of Mexican immigrants in the United States?",
                "What describes most unauthorized immigrants’ situation the best?",
                "What percent of refugees world wide do developing countries host?",
                "How many refugees are there world wide?"};

        radioGroup.clearCheck();

        switch (questionNumber) {
            case 1:
                String[] gunViolenceArrayQ1Choices = {"43.3 Million", "102 Million", "78,000", "1.01 Billion"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[0]);
                choice1TextView.setText(gunViolenceArrayQ1Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ1Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ1Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ1Choices[3]);
                break;

            case 2:
                String[] gunViolenceArrayQ2Choices = {"Increasing", "Decreasing", "Staying the same", "Fluctuating too much"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[1]);
                choice1TextView.setText(gunViolenceArrayQ2Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ2Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ2Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ2Choices[3]);
                break;

            case 3:
                String[] gunViolenceArrayQ3Choices = {"They sneaked across the border", "They came here legally, until a new law made them illegal immigrants", "They come to the US legally, but overstay their visa", "They're in Prison"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[2]);
                choice1TextView.setText(gunViolenceArrayQ3Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ3Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ3Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ3Choices[3]);
                break;

            case 4:
                String[] gunViolenceArrayQ4Choices = {"35 Percent", "12 Percent", "50 Percent", "80 Percent"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[3]);
                choice1TextView.setText(gunViolenceArrayQ4Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ4Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ4Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ4Choices[3]);
                break;

            case 5:
                String[] gunViolenceArrayQ5Choices = {"16.7 Million", "10 Million", "120 Million", "5 Million"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[4]);
                choice1TextView.setText(gunViolenceArrayQ5Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ5Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ5Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ5Choices[3]);
                quizButton.setText("Finish+");
                break;
        }


    }

    public void immigrationActions() {
        switch (questionNumber) {
            case 1:
                if (choice1TextView.isChecked()) {
                    questionNumber = 2;
                    immigration(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 2:
                if (choice2TextView.isChecked()) {
                    questionNumber = 3;
                    immigration(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 3:
                if (choice3TextView.isChecked()) {
                    questionNumber = 4;
                    immigration(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 4:
                if (choice4TextView.isChecked()) {
                    questionNumber = 5;
                    immigration(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 5:
                if (choice1TextView.isChecked()) {
                    Intent intent = new Intent(this, ResultsActivity.class);
                    intent.putExtra("TOPIC_NAME", TOPIC_NAME);
                    startActivity(intent);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()
                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;
        }
    }

    public void middleEast(int questionNumber) {

        quizTitleTextView.setText("Middle East");
        String[] gunViolenceArrayQuestions = {"What is the main source of conflict in the Middle East?\n",
                "When did the major conflict we see today start?",
                "How many Jewish countries are there in the middle east?",
                "How many countries have a democracy in the Middle East?",
                "How many Arab countries allow Jews into their country?"};

        radioGroup.clearCheck();

        switch (questionNumber) {
            case 1:
                String[] gunViolenceArrayQ1Choices = {"US involvements", "ISIS", "Food Shortages", "Multiple religious groups claiming the same land in Israel"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[0]);
                choice1TextView.setText(gunViolenceArrayQ1Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ1Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ1Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ1Choices[3]);
                break;

            case 2:
                String[] gunViolenceArrayQ2Choices = {"2001", "1948", "1982", "1918"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[1]);
                choice1TextView.setText(gunViolenceArrayQ2Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ2Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ2Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ2Choices[3]);
                break;

            case 3:
                String[] gunViolenceArrayQ3Choices = {"1: Israel", "2: Israel, Iraq", "3: Israel, Iraq, Pakistan", "None"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[2]);
                choice1TextView.setText(gunViolenceArrayQ3Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ3Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ3Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ3Choices[3]);
                break;

            case 4:
                String[] gunViolenceArrayQ4Choices = {"1: Israel", "2: Israel, Iraq", "3: Israel, Iraq, Pakistan", "None"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[3]);
                choice1TextView.setText(gunViolenceArrayQ4Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ4Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ4Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ4Choices[3]);
                break;

            case 5:
                String[] gunViolenceArrayQ5Choices = {"1", "2", "3", "None"};
                quizQuestionTextView.setText(gunViolenceArrayQuestions[4]);
                choice1TextView.setText(gunViolenceArrayQ5Choices[0]);
                choice2TextView.setText(gunViolenceArrayQ5Choices[1]);
                choice3TextView.setText(gunViolenceArrayQ5Choices[2]);
                choice4TextView.setText(gunViolenceArrayQ5Choices[3]);
                quizButton.setText("Finish+");
                break;
        }


    }

    public void middleEastActions() {
        switch (questionNumber) {
            case 1:
                if (choice4TextView.isChecked()) {
                    questionNumber = 2;
                    middleEast(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 2:
                if (choice2TextView.isChecked()) {
                    questionNumber = 3;
                    middleEast(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 3:
                if (choice1TextView.isChecked()) {
                    questionNumber = 4;
                    middleEast(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 4:
                if (choice1TextView.isChecked()) {
                    questionNumber = 5;
                    middleEast(questionNumber);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()

                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;

            case 5:
                if (choice4TextView.isChecked()) {
                    Intent intent = new Intent(this, ResultsActivity.class);
                    intent.putExtra("TOPIC_NAME", TOPIC_NAME);
                    startActivity(intent);
                    break;
                } else {
                    // 1. Instantiate an AlertDialog.Builder with its constructor
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    // 2. Chain together various setter methods to set the dialog characteristics
                    builder.setMessage("That's the wrong answer, please try again!")
                            .setTitle("Wrong Answer");
                    // 3. Get the AlertDialog from create()
                    AlertDialog alertDialog = builder.create();
                    builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            // User clicked OK button
                        }
                    });
                    AlertDialog dialog = builder.create();
                    dialog.show();
                }
                break;
        }
    }

}
