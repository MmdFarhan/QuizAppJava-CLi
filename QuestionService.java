package org.main;

import java.util.Scanner;

public class QuestionService {
		
		Question[] ques = new Question[5];
		Scanner sc= new Scanner(System.in);
		public QuestionService() {
			ques[0]=new Question(1,"Which your First Programming Language","Java","Python","C++","JavaScript","Java");
			ques[1]=new Question(2,"Java is Famous for?","Oops","Spring","DynamicTyped","coffee","OOps");
			ques[2]=new Question(3,"Where are arrays Stored?","Ram","Stack","Heap","pool","Heap");
			ques[3]=new Question(4,"Which Db is the most popular","Mysql","postgres","oracle","mongoDb","MySql");
			ques[4]=new Question(5,"Which is a library of js","js","react","angular","vue","react");
			
		}
		
		public void DisplayWork() {
			
			String[] Uans = new String[5] ;
			String[] ans= new String[5];
			int Score=0;
			int i=0;
			for(Question q: ques) {
				System.out.println("Question No" + q.getId());
				System.out.println("The Question is "+q.getQuestion());
				System.out.println("The OPtions are : 1."+q.getOpt1()+" 2."+q.getOpt2()+" 3."+q.getOpt3()+" 4."+q.getOpt4());
				
				Uans[i]=sc.nextLine();
				i++;
			}
			for(int j=0;j<5;j++) {
				Question q = ques[j];
				String an = q.getAnswer();
				String uan = Uans[j];
				if(an.equals(uan)) {
					Score++;
				}
			}
		    System.out.println("Your Score Out of 5 is"+Score);
		}
		
	
	
	}
	
