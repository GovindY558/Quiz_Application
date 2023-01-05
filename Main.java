package QuizAppliction;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Quiz q=new Quiz();
	        q.logic();
		

	}

}

// Create class as Quize and in it we create
class Quiz{
    Scanner sc=new Scanner(System.in);
    int correctAnsCount=0;
    int wrongAnsCount=0;
    public void logic(){
    	
    	System.out.println("   " + ":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");
    	System.out.println("        " + ":There is Total 10 Random Questions:");
    	System.out.println("   " + ":-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:-:");

    	System.out.println("");
        Questions q1 = new Questions("\n1. Which statement is true about Java?",
        		"   " + "A. Java is a sequence-dependent programming language ",
        		"   " + "B. Java is a code dependent programming language ",
        		"   " + "C. Java is a platform-dependent programming language ", 
        		"   " + "D. Java is a platform-independent programming language ");
       
        Questions q2 = new Questions("\n2. What is the extension of java code files?",
        		"   " + "A. .txt",
        		 "   " + "B. .pdf",
        		 "   " + "C. .sql",
        		 "   " + "D. .java");
        
        Questions q3 = new Questions("\n3. Who invented Java Programming?",
        		"   " +  "A. Guido van Rossum",
        		 "   " + "B. James Gosling",
        		 "   " + "C. Dennis Ritchie",
        		 "   " + "D. Bjarne Stroustrup");
        
        Questions q4 = new Questions("\n4. Which one of the following is not a Java feature?",
        		"   " + "A. Object-oriented",
        		 "   " + "B. Use of pointers",
        		 "   " + "C. Portable",
        		 "   " + "D. Dynamic and Extensible");
       
        Questions q5 = new Questions("\n5. Which of these cannot be used for a variable name in Java?",
        		"   " + "A. identifier & keyword",
        		 "   " + "B. identifier",
        		 "   " + "C. Keyword",
        		 "   " + "D. none of the mentioned");
        
        Questions q6 = new Questions("\n6. \n"
        		+ "Automatic type conversion is possible in which of the possible cases?",
        		"   " + "A. Byte to int",
        		 "   " + "B. Int to long",
        		 "   " + "C. Long to int",
        		 "   " + "D. Short to int");
        
        Questions q7 = new Questions("\n7. Find the value of A[1] after execution of the following program.?\n "
        		+ "   int[] A = {0,2,4,1,3};\r\n"
        		+ "   for(int i = 0; i < a.length; i++){\r\n"
        		+ "    a[i] = a[(a[i] + 3) % a.length];\r\n"
        		+ "    }\n",
        		"   " + "A. 0",
        		 "   " + "B. 1",
        		 "   " + "C. 2",
        		 "   " + "D. 3");
        
        Questions q8 = new Questions("\n8. Arrays in java are?",
        		"   " + "A. Object references",
        		 "   " + "B. Objects",
        		 "   " + "C. Primitive data type",
        		 "   " + "D. None");
        
        Questions q9 = new Questions("\n9.  \n"
        		+ "Identify the corrected definition of a package?",
        		"   " + "A. A package is a collection of editing tools",
        		 "   " + "B. A package is a collection of classes",
        		 "   " + "C. A package is a collection of classes and interfaces",
        		 "   " + "D. A package is a collection of interfaces");
        
        Questions q10 = new Questions("\n10. Identify the output of the following program?\n"
        		+ "\n"
        		+ "   String str = “abcde”;\n"
        		+ "   System.out.println(str.substring(1, 3));?",
        		"   " + "A. abc",
        		 "   " + "B. bc",
        		 "   " + "C. bcd",
        		 "   " + "D. cd");

        Map<Questions,Character> hmap=new HashMap<>();
        hmap.put(q1,'D');
        hmap.put(q2,'D');
        hmap.put(q3,'B');
        hmap.put(q4,'B');
        hmap.put(q5,'C');
        hmap.put(q6,'B');
        hmap.put(q7,'B');
        hmap.put(q8,'B');
        hmap.put(q9,'C');
        hmap.put(q10,'B');

        for(Map.Entry<Questions,Character> map:hmap.entrySet()){
            System.out.println(map.getKey().getQuestion());
            System.out.println(map.getKey().getOption1());
            System.out.println(map.getKey().getOption2());
            System.out.println(map.getKey().getOption3());
            System.out.println(map.getKey().getOption4());

            System.out.print("Enter Your Answer: ");
            Character ans=sc.next().charAt(0);

            int cans=Character.compare(ans,map.getValue());
            if(cans==0){
            	System.out.println("   " + "-----------");
                System.out.println("   " + "  Correct");
                System.out.println("   " + "-----------");
                correctAnsCount++;
            }
            else{
            	System.out.println("   " + "---------");
                System.out.println("   " + "  Wrong");
                System.out.println("   " + "---------");
                wrongAnsCount++;
            }

        }

        System.out.println();
        System.out.println("                                     "
        		+ "   " +"**********************");
        System.out.println("                                     "
        		+ "   " +"   ***  Result  ***    ");
        System.out.println("                                     "
        		+ "   " +"**********************");
        System.out.println("");
        System.out.println("                                     "
        		+ "   " +"Total Questions: "+hmap.size());
        
        System.out.println("                                     "
        		+ "   " +"Correct Answered Questions : "+correctAnsCount);
        
        System.out.println("                                     "
        		+ "   " +"Wrong Answered Questions : "+wrongAnsCount);
        int percentage=(100*correctAnsCount)/hmap.size();
        
        System.out.println("                                     "
        		+ "   " +"Percentage : "+percentage);
        
        if(percentage>95){
            System.out.println("                                     "
            		+ "   " +"Performance : Very Good");
        }
        else if(percentage<35){
            System.out.println("                                     "
            		+ "   " +"Performance : Very Low");
        }
        else{
            System.out.println("                                     "
            		+ "   " +"Performance : Medium");
        }


    }
}