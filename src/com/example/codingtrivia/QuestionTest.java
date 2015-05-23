package com.example.codingtrivia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionTest {
	private static List<questions> allquestions = new ArrayList<questions>();
	
	public static void fillQuestions(){
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
