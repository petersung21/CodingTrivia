package com.example.codingtrivia;

public class questions {
	private int ID;
	private String Question;
	private String Opt1;
	private String Opt2;
	private String Opt3;
	private String Opt4;
	private String Answer;
	
	//Empty Question
	public questions(){
		ID = 0;
		Question = "";
		Opt1 = "";
		Opt2 = "";
		Opt3 = "";
		Opt4 = "";
		Answer = "";
	}
	
	//Question Constructor
	public questions(int id, String question, String opt1, String opt2, String opt3, String opt4, String answer){
		ID = id;
		Question = question;
		Opt1 = opt1;
		Opt2 = opt2;
		Opt3 = opt3;
		Opt4 = opt4;
		Answer = answer;
	}
	
	public int getID(){
		return ID;
	}
	public String getQuestion(){
		return Question;
	}
	public String getOpt1(){
		return Opt1;
	}
	public String getOpt2(){
		return Opt2;
	}
	public String getOpt3(){
		return Opt3;
	}
	public String getOpt4(){
		return Opt4;
	}
	public String getAnswer(){
		return Answer;
	}
	public void setID(int id){
		this.ID = id;
	}
	public void setQuestion(String question){
		this.Question = question;
	}
	public void setOpt1(String opt1){
		this.Opt1 = opt1;
	}
	public void setOpt2(String opt2){
		this.Opt2 = opt2;
	}
	public void setOpt3(String opt3){
		this.Opt3 = opt3;
	}
	public void setOpt4(String opt4){
		this.Opt4 = opt4;
	}
	public void setAnswer(String answer){
		this.Answer = answer;
	}

}
