import java.util.Scanner;

public class Mbti {

	public static void main(String...args){

		Scanner deji = new Scanner(System.in);

		System.out.print("What is your name: ");

		String name = deji.nextLine();

		int counter1 = 0;
		int counter2 =0;



		String [] Question1 = {
		
		"A. expend energy, enjoy groups	,	B. conserve energy, enjoy one on one",

		"A. more outgoing , think out loud,	B. more reserved , think to yourself",

		"A. seek many tasks, public activities, interactionwith otthers		B. seek private, solarity activities with quiet to concentrate",

		"A. external, communicative, express yourself,		B. internal, reticent, keep to yourself",

		"A. active, initiate,		B. reflective, deliberate"
		};
		for(String dee : Question1){
		System.out.println(dee);
		char response = deji.next().charAt(0);

		if (response == 'A' || response == 'a'){
			counter1++;
		}else if (response == 'B'|| response == 'b'){
			counter2++;
			
		}else{
			System.out.print("Expected A or B as Response");
		}

		}
		System.out.println("number of A is: " + counter1);
		System.out.println("number of B is: " + counter2);



		String [] Question2 = {
		"A. interpret literally,	B. look for meaning and possibilities",
		
		"A. practical, realistic, experiential,		B. imaginative, innovative, theoretical",

		"A. standard, usaul, conventional,	B. different, novel, unique",

		"A. focus on here-and-now,	B. look at the future, global persepective, big picture",

		"A. facts, things, what is ,	B. ideals, dreams, what could be, philosophical",
		};

		for(String dee : Question2){
		System.out.println(dee);
		char response = deji.next().charAt(0);

		if (response == 'A' || response == 'a'){
			counter1++;
		}else if (response == 'B'|| response == 'b'){
			counter2++;
			
		}else{
			System.out.print("Expected A or B as Response");
		}

		}
		System.out.println("number of A is: " + counter1);
		System.out.println("number of B is: " + counter2);

		
		String [] Question3 = {
		"A. logical, thinking,questioning,	B. empathetic, feeling, accommodting",

		"A. candid, straight forward, frank,	B. tactful, kind, encouraging",

		"A. firm tend to criticize, hold the line,	B. gentle, tend to appreciate, conciliate",

		"A. tough-minded, just		B. tender- hearted, merciful",

		"A. matter of fact, issue-oriented,	B. sentitive, people-oriented, compassionate",
		};

		for(String dee: Question3){
		System.out.println(dee);
		char response = deji.next().charAt(0);

		if (response == 'A' || response == 'a'){
			counter1++;
		}else if (response == 'B'|| response == 'b'){
			counter2++;
			
		}else{
			System.out.print("Expected A or B as Response");
		}

		}
		System.out.println("number of A is: " + counter1);
		System.out.println("number of B is: " + counter2);


		String [] Question4 = {

		"A. organised, orderly,		B. flexible, adaptable",

		"A. plan, schedule,	B. unplanned, spontaneous",

		"A. regulated, structured,	B. easy-going, live and let live",

		"A. preparation, plan ahead,	B. go with the flow, adapt as you go",

		"A. control, govern,	B. latitude, freedom",
		};

		for(String dee : Question4){
		System.out.println(dee);
		char response = deji.next().charAt(0);

		if (response == 'A' || response == 'a'){
			counter1++;
		}else if (response == 'B'|| response == 'b'){
			counter2++;
			
		}else{
			System.out.print("Expected A or B as Response");
		}

		}
		System.out.println("number of A is: " + counter1);
		System.out.println("number of B is: " + counter2);
		printINFP();


	}



 public static void  printINFP(){
String prompt = """

Healer
The Thoughhtful Idealist(MBTI)
The Mediator (16Personalities)

The INFP Personalty Type
  INFPs are imaginative idealists, guided by their own core values and beliefs. To a Healer, possibilities are paramount; the realism of the anount is only of passing concern. They see potential for a better future, and pursue truth and meaning with their ouw individual flair.
  INFPs aresensitive, caring, and compassionate , and are deeply concerned with the personal growth of themselves and others. Individualistic and nonjudgement, INFPs believe that each person must find their own path. They enjoy spending time exploring their own ideas and values, and are gently encouraging to others to do the same .INFPs are creative and often artistic; they enjoy finding new outlets for self-expression.

What does INFP stand for/
  INFP is one of the sixteen personalty types created by Katharine Briggs and Isabel Myers, creators of the Myer=Briggs Type Indication (MBTI). INFP stands for Introverion, iNtuition, Feeling, and Preceiving, which are four core personalty traits based on the work of psychologist C.G. Jung. Each of the four letters of the INFP code signifies a key personality traits of this type. INFPs are energized by time alone (Intoverted), focus on ideals and concepts rather than facts and details (iNtuitive), make decisions based on feeloings and values (Feeling), and prefer to be spontaneous and flexible rather than planned and organized (perceiving). 

""";
System.out.println(prompt);

}

}