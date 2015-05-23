package com.example.codingtrivia;

import android.app.Activity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends Activity {
	
	private questions QuestionAsked;
	private static TextView txtQuestion;
	private static RadioButton choiceA;
	private static RadioButton choiceB;
	private static RadioButton choiceC;
	private static RadioButton choiceD;
	private static Button butNext;
	private static String Answer;
	private static RadioButton clickedAnswer;
	private OnClickListener checkAnswer;
	private static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        QuestionTest.fillQuestions();
        txtQuestion=(TextView)findViewById(R.id.textView1);
        choiceA=(RadioButton)findViewById(R.id.radio0);
        choiceB=(RadioButton)findViewById(R.id.radio1);
        choiceC=(RadioButton)findViewById(R.id.radio2);
        choiceD=(RadioButton)findViewById(R.id.radio3);
        butNext=(Button)findViewById(R.id.button1);
        setQuestionView();
        checkAnswer = new OnClickListener(){
        	@Override
        	public void onClick(View v){
    	    	RadioGroup grp = (RadioGroup)findViewById(R.id.radioGroup1);
        		clickedAnswer = (RadioButton)findViewById(grp.getCheckedRadioButtonId());
        		if (Answer.equals(clickedAnswer.getText())){
        			Toast toast = Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT);
        			toast.show();
        			score++;
        		} else {
        			Toast toast = Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT);
        			toast.show();
        		}
        		setQuestionView();
        	}
        };
        butNext.setOnClickListener(checkAnswer);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    private void setQuestionView(){
    	QuestionAsked = QuestionTest.mixQuestions();
    	txtQuestion.setText(QuestionAsked.getQuestion());
    	choiceA.setText(QuestionAsked.getOpt1());
    	choiceB.setText(QuestionAsked.getOpt2());
    	choiceC.setText(QuestionAsked.getOpt3());
    	choiceD.setText(QuestionAsked.getOpt4());
    	Answer = QuestionAsked.getAnswer();
    }
    
    


}
