package com.example.codingtrivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.json.JSONObject;

import android.widget.Toast;
import com.androidquery.*;
import com.androidquery.callback.*;

public class QuestionTest {
	private static List<questions> allquestions = new ArrayList<questions>();
	private static AQuery aq;
	
	public static void fillQuestions(){
        String url = "http://nodejs-devsung.rhcloud.com/mysql";
        //Fix this REST call
        /*aq.ajax(url, JSONObject.class, new AjaxCallback<JSONObject>() {
            @Override
            public void callback(String url, JSONObject json, AjaxStatus status) {                    
                if(json != null){                              
                    //successful ajax call, show status code and json content
                    Toast.makeText(aq.getContext(), status.getCode() + ":" + json.toString(), Toast.LENGTH_LONG).show();                
                }else{                  
                    //ajax error, show error code
                    Toast.makeText(aq.getContext(), "Error:" + status.getCode(), Toast.LENGTH_LONG).show();
                }
            }
        });*/
		if (allquestions.size()<=3){
			allquestions.add(new questions(0,"What is not a property of static classes", "Static classes can not be instantiated",
					"You can access static methods without instantiating class","You can't override static methods", "You can have a lone static class",
					"You can have a lone static class"));
			allquestions.add(new questions(1,"What does a void method return", "Does not return a value",
					"Returns an Int","Returns an object", "Returns a String",
					"Does not return a value"));
			allquestions.add(new questions(2,"What is abstract class", "Base class can not be instantiated only inherited from",
					"Base class can be instantiated","Classes can inherit from more than one abstract class", "A class that does not return a value",
					"Base class can not be instantiated only inherited from"));
		}
	}
	
	public static questions mixQuestions(){
		Collections.shuffle(allquestions);
		return allquestions.get(0);
	}
}
