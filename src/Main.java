// EMIRHAN ERSOY
// 22118080001

// OOP DÖNEM SONU ÖDEVİ



import java.util.Scanner;

public class Main { // main class

	public static void main(String[] args) { // main fonksiyon
		
	
		Functions 	functions = new Functions();  // bazı sistemsel fonksiyonlar için oluşturulan classtan nesne türetilmesi
		Scanner 	scan = new Scanner(System.in);  // kullanıcı girişini almak için gerekli nesne
		User 		user = new User();				// Kullanıcı bilgilerinin bulunduğu classtan üretilen nesne
		
		
		Monday		mon = new Monday();				// Haftanın günlerinden oluşan classlardan nesne türetilmesi
		Tuesday		tue = new Tuesday();
		Wednesday 	wed = new Wednesday();
		Thursday 	thu = new Thursday();
		Friday 		fri = new Friday();
		Saturday	sat = new Saturday();
		Sunday		sun	= new Sunday();
		
		System.out.println("Welcome to the getting to know me bot...");
		functions.delayInSeconds(0.4);
		System.out.println("First of all... Can you tell me your name? ");
		
		user.setName(scan.nextLine());
		functions.delayInSeconds(0.4);
		System.out.println("Can you tell me your age? ");
		
		user.setAge();

        
        functions.delayInSeconds(1);
        
        if(user.getAge()>21) {
        	System.out.println("You are older than me. You are exactly "+ (user.getAge()-21) +" years older than me.");
        }
        if(user.getAge()==21){
        	System.out.println("We are at the same age...");
        }
        else{
        	System.out.println("I am older than you. I am exactly "+ (21-user.getAge()) + " years older than you. " );
        }
	
        functions.delayInSeconds(0.5);
        
	  System.out.println("Anyway... Nice to meet you " + user.getName() + ". Shall we start to conversation about me?");
	
	  	
	  int userChoice = -1; // kullanıcıdan yapmak istediği eylemin switch case yapısının ilk bileşeni

      System.out.println("1. Yes");
      System.out.println("2. No");
      
      
      userChoice = scan.nextInt();

      if (userChoice == 1) {

          while (userChoice != 0) { // kullanıcı 0 girene kadar bu döngü devam edecek.
        	  
              System.out.println("Choose an activity to get to know me?");
              System.out.println("1. My daily which includes my last week.");
              System.out.println("2. Chat");
              System.out.println("0. Exit");
              
              userChoice = scan.nextInt();
              scan.nextLine(); // Dummy read to consume the newline character
              
              functions.delayInSeconds(1);
              
              
              switch(userChoice) { // ilk seçenek yani daily aktivitesi seçilirse 7 günü de soran yapı
              
              case 1:
            	  
            	  int selectDay;
            	  
            	  functions.delayInSeconds(0.5);
            	  

            	  
                  System.out.println("Choose an day to get to know me?");
                  System.out.println("1. Monday");
                  System.out.println("2. Tuesday");
                  System.out.println("3. Wednesday");
                  System.out.println("4. Thursday");
                  System.out.println("5. Friday");
                  System.out.println("6. Saturday");
                  System.out.println("7. Sunday");
                 
                  selectDay = scan.nextInt();
                  scan.nextLine();
                  
                  
                  switch(selectDay) { 
                  
                  case 1: // Her gün için günlerin içindeki metotların çağırılması.
                	  
                	  if(Monday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Monday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Monday.count++;
                  
                	  mon.wakeUp(); functions.delayInSeconds(0.8);
                	  mon.brushTeeth(); functions.delayInSeconds(0.8);
                	  mon.takeShower(); functions.delayInSeconds(0.8);
                	  mon.haveBreakfast();functions.delayInSeconds(0.8);
                	  mon.goingSchool();functions.delayInSeconds(0.8);
                	  mon.selectSubject();functions.delayInSeconds(0.8);
                	  mon.takeNotes();functions.delayInSeconds(0.8);
                	  mon.chatting();functions.delayInSeconds(0.8);
                	  mon.talk();functions.delayInSeconds(0.8);
                	  mon.haveLunch();functions.delayInSeconds(0.8);
                	  mon.meetFriend();functions.delayInSeconds(0.8);
                	  mon.attendEvent();functions.delayInSeconds(0.8);
                	  mon.goingHome();functions.delayInSeconds(0.8);
                	  mon.listenMusic();functions.delayInSeconds(0.8);
                	  mon.changeClothes();functions.delayInSeconds(0.8);
                	  mon.meditate();functions.delayInSeconds(0.8);
                	  mon.rest();functions.delayInSeconds(0.8);
                	  mon.stretch();functions.delayInSeconds(0.8);
                	  mon.startStudy();functions.delayInSeconds(0.8);
                	  mon.stopStudy();functions.delayInSeconds(0.8);
                	  mon.haveDinner();functions.delayInSeconds(0.8);
                	  mon.snack();functions.delayInSeconds(0.8);
                	  mon.drinkTea();functions.delayInSeconds(0.8);
                	  mon.drinkCoffee();functions.delayInSeconds(0.8);
                	  mon.startExercise();functions.delayInSeconds(0.8);
                	  mon.stopExercise();functions.delayInSeconds(0.8);
                	  mon.readMaterial();functions.delayInSeconds(0.8);
                	  mon.solveQuestions();functions.delayInSeconds(0.8);
                	  mon.research();functions.delayInSeconds(0.8);
                	  mon.watchMovie();functions.delayInSeconds(0.8);
                	  mon.watchSeries();functions.delayInSeconds(0.8);
                	  mon.watchMatch();functions.delayInSeconds(0.8);
                	  mon.surfingAtInternet();functions.delayInSeconds(0.8);
                	  mon.sleep();functions.delayInSeconds(0.8);

                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Monday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");
                	  
                	  break;
                	  
                  case 2:
                	  
                	  if(Tuesday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Tuesday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Tuesday.count++;
                	  

                	  
                	  tue.wakeUp(); functions.delayInSeconds(0.8);
                	  tue.brushTeeth(); functions.delayInSeconds(0.8);
                	  tue.takeShower(); functions.delayInSeconds(0.8);
                	  tue.haveBreakfast();functions.delayInSeconds(0.8);
                	  tue.goingSchool();functions.delayInSeconds(0.8);
                	  tue.selectSubject();functions.delayInSeconds(0.8);
                	  tue.takeNotes();functions.delayInSeconds(0.8);
                	  tue.chatting();functions.delayInSeconds(0.8);
                	  tue.talk();functions.delayInSeconds(0.8);
                	  tue.haveLunch();functions.delayInSeconds(0.8);
                	  tue.meetFriend();functions.delayInSeconds(0.8);
                	  tue.attendEvent();functions.delayInSeconds(0.8);
                	  tue.goingHome();functions.delayInSeconds(0.8);
                	  tue.listenMusic();functions.delayInSeconds(0.8);
                	  tue.changeClothes();functions.delayInSeconds(0.8);
                	  tue.meditate();functions.delayInSeconds(0.8);
                	  tue.rest();functions.delayInSeconds(0.8);
                	  tue.stretch();functions.delayInSeconds(0.8);
                	  tue.startStudy();functions.delayInSeconds(0.8);
                	  tue.stopStudy();functions.delayInSeconds(0.8);
                	  tue.haveDinner();functions.delayInSeconds(0.8);
                	  tue.snack();functions.delayInSeconds(0.8);
                	  tue.drinkTea();functions.delayInSeconds(0.8);
                	  tue.drinkCoffee();functions.delayInSeconds(0.8);
                	  tue.startExercise();functions.delayInSeconds(0.8);
                	  tue.stopExercise();functions.delayInSeconds(0.8);
                	  tue.readMaterial();functions.delayInSeconds(0.8);
                	  tue.solveQuestions();functions.delayInSeconds(0.8);
                	  tue.research();functions.delayInSeconds(0.8);
                	  tue.watchMovie();functions.delayInSeconds(0.8);
                	  tue.watchSeries();functions.delayInSeconds(0.8);
                	  tue.watchMatch();functions.delayInSeconds(0.8);
                	  tue.surfingAtInternet();functions.delayInSeconds(0.8);
                	  tue.sleep();functions.delayInSeconds(0.8);

                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Tuesday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");
                	  
                	  break;
                	  
                	  
                  case 3:
                	  
                	  
                	  if(Wednesday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Wednesday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Wednesday.count++;

                	  wed.wakeUp(); functions.delayInSeconds(0.8);
                	  wed.brushTeeth(); functions.delayInSeconds(0.8);
                	  wed.takeShower(); functions.delayInSeconds(0.8);
                	  wed.haveBreakfast();functions.delayInSeconds(0.8);
                	  wed.goingSchool();functions.delayInSeconds(0.8);
                	  wed.selectSubject();functions.delayInSeconds(0.8);
                	  wed.takeNotes();functions.delayInSeconds(0.8);
                	  wed.chatting();functions.delayInSeconds(0.8);
                	  wed.talk();functions.delayInSeconds(0.8);
                	  wed.haveLunch();functions.delayInSeconds(0.8);
                	  wed.meetFriend();functions.delayInSeconds(0.8);
                	  wed.attendEvent();functions.delayInSeconds(0.8);
                	  wed.goingHome();functions.delayInSeconds(0.8);
                	  wed.listenMusic();functions.delayInSeconds(0.8);
                	  wed.changeClothes();functions.delayInSeconds(0.8);
                	  wed.meditate();functions.delayInSeconds(0.8);
                	  wed.rest();functions.delayInSeconds(0.8);
                	  wed.stretch();functions.delayInSeconds(0.8);
                	  wed.startStudy();functions.delayInSeconds(0.8);
                	  wed.stopStudy();functions.delayInSeconds(0.8);
                	  wed.haveDinner();functions.delayInSeconds(0.8);
                	  wed.snack();functions.delayInSeconds(0.8);
                	  wed.drinkTea();functions.delayInSeconds(0.8);
                	  wed.drinkCoffee();functions.delayInSeconds(0.8);
                	  wed.startExercise();functions.delayInSeconds(0.8);
                	  wed.stopExercise();functions.delayInSeconds(0.8);
                	  wed.readMaterial();functions.delayInSeconds(0.8);
                	  wed.solveQuestions();functions.delayInSeconds(0.8);
                	  wed.research();functions.delayInSeconds(0.8);
                	  wed.watchMovie();functions.delayInSeconds(0.8);
                	  wed.watchSeries();functions.delayInSeconds(0.8);
                	  wed.watchMatch();functions.delayInSeconds(0.8);
                	  wed.surfingAtInternet();functions.delayInSeconds(0.8);
                	  wed.sleep();functions.delayInSeconds(0.8);

                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Wednesday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");
                	  
                	  break;
                	  
                  case 4:
                	  
                	  if(Wednesday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Thursday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Wednesday.count++;
                	  
                	  thu.wakeUp(); functions.delayInSeconds(0.8);
                	  thu.brushTeeth(); functions.delayInSeconds(0.8);
                	  thu.takeShower(); functions.delayInSeconds(0.8);
                	  thu.haveBreakfast();functions.delayInSeconds(0.8);
                	  thu.goingSchool();functions.delayInSeconds(0.8);
                	  thu.selectSubject();functions.delayInSeconds(0.8);
                	  thu.takeNotes();functions.delayInSeconds(0.8);
                	  thu.chatting();functions.delayInSeconds(0.8);
                	  thu.talk();functions.delayInSeconds(0.8);
                	  thu.haveLunch();functions.delayInSeconds(0.8);
                	  thu.meetFriend();functions.delayInSeconds(0.8);
                	  thu.attendEvent();functions.delayInSeconds(0.8);
                	  thu.goingHome();functions.delayInSeconds(0.8);
                	  thu.listenMusic();functions.delayInSeconds(0.8);
                	  thu.changeClothes();functions.delayInSeconds(0.8);
                	  thu.meditate();functions.delayInSeconds(0.8);
                	  thu.rest();functions.delayInSeconds(0.8);
                	  thu.stretch();functions.delayInSeconds(0.8);
                	  thu.startStudy();functions.delayInSeconds(0.8);
                	  thu.stopStudy();functions.delayInSeconds(0.8);
                	  thu.haveDinner();functions.delayInSeconds(0.8);
                	  thu.snack();functions.delayInSeconds(0.8);
                	  thu.drinkTea();functions.delayInSeconds(0.8);
                	  thu.drinkCoffee();functions.delayInSeconds(0.8);
                	  thu.startExercise();functions.delayInSeconds(0.8);
                	  thu.stopExercise();functions.delayInSeconds(0.8);
                	  thu.readMaterial();functions.delayInSeconds(0.8);
                	  thu.solveQuestions();functions.delayInSeconds(0.8);
                	  thu.research();functions.delayInSeconds(0.8);
                	  thu.watchMovie();functions.delayInSeconds(0.8);
                	  thu.watchSeries();functions.delayInSeconds(0.8);
                	  thu.watchMatch();functions.delayInSeconds(0.8);
                	  thu.surfingAtInternet();functions.delayInSeconds(0.8);
                	  thu.sleep();functions.delayInSeconds(0.8);

                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Thursday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");
                	  
                	  
                	  break;
                	  
                  case 5:
                	  
                	  if(Friday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Friday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Friday.count++;
                	  
                	  fri.wakeUp(); functions.delayInSeconds(0.8);
                	  fri.brushTeeth(); functions.delayInSeconds(0.8);
                	  fri.takeShower(); functions.delayInSeconds(0.8);
                	  fri.haveBreakfast();functions.delayInSeconds(0.8);
                	  fri.goingSchool();functions.delayInSeconds(0.8);
                	  fri.selectSubject();functions.delayInSeconds(0.8);
                	  fri.takeNotes();functions.delayInSeconds(0.8);
                	  fri.chatting();functions.delayInSeconds(0.8);
                	  fri.talk();functions.delayInSeconds(0.8);
                	  fri.haveLunch();functions.delayInSeconds(0.8);
                	  fri.meetFriend();functions.delayInSeconds(0.8);
                	  fri.attendEvent();functions.delayInSeconds(0.8);
                	  fri.goingHome();functions.delayInSeconds(0.8);
                	  fri.listenMusic();functions.delayInSeconds(0.8);
                	  fri.changeClothes();functions.delayInSeconds(0.8);
                	  fri.meditate();functions.delayInSeconds(0.8);
                	  fri.rest();functions.delayInSeconds(0.8);
                	  fri.stretch();functions.delayInSeconds(0.8);
                	  fri.startStudy();functions.delayInSeconds(0.8);
                	  fri.stopStudy();functions.delayInSeconds(0.8);
                	  fri.haveDinner();functions.delayInSeconds(0.8);
                	  fri.snack();functions.delayInSeconds(0.8);
                	  fri.drinkTea();functions.delayInSeconds(0.8);
                	  fri.drinkCoffee();functions.delayInSeconds(0.8);
                	  fri.startExercise();functions.delayInSeconds(0.8);
                	  fri.stopExercise();functions.delayInSeconds(0.8);
                	  fri.readMaterial();functions.delayInSeconds(0.8);
                	  fri.solveQuestions();functions.delayInSeconds(0.8);
                	  fri.research();functions.delayInSeconds(0.8);
                	  fri.watchMovie();functions.delayInSeconds(0.8);
                	  fri.watchSeries();functions.delayInSeconds(0.8);
                	  fri.watchMatch();functions.delayInSeconds(0.8);
                	  fri.surfingAtInternet();functions.delayInSeconds(0.8);
                	  fri.sleep();functions.delayInSeconds(0.8);

                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Friday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");

                	  
                	  break;

                  case 6:
                	  
                	  if(Saturday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Saturday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Saturday.count++;

                	  
                	  sat.wakeUp(); functions.delayInSeconds(0.8);
                	  sat.brushTeeth(); functions.delayInSeconds(0.8);
                	  sat.takeShower(); functions.delayInSeconds(0.8);
                	  sat.haveBreakfast();functions.delayInSeconds(0.8);
                	  sat.goingSchool();functions.delayInSeconds(0.8);
                	  sat.selectSubject();functions.delayInSeconds(0.8);
                	  sat.takeNotes();functions.delayInSeconds(0.8);
                	  sat.chatting();functions.delayInSeconds(0.8);
                	  sat.talk();functions.delayInSeconds(0.8);
                	  sat.haveLunch();functions.delayInSeconds(0.8);
                	  sat.meetFriend();functions.delayInSeconds(0.8);
                	  sat.attendEvent();functions.delayInSeconds(0.8);
                	  sat.goingHome();functions.delayInSeconds(0.8);
                	  sat.listenMusic();functions.delayInSeconds(0.8);
                	  sat.changeClothes();functions.delayInSeconds(0.8);
                	  sat.meditate();functions.delayInSeconds(0.8);
                	  sat.rest();functions.delayInSeconds(0.8);
                	  sat.stretch();functions.delayInSeconds(0.8);
                	  sat.startStudy();functions.delayInSeconds(0.8);
                	  sat.stopStudy();functions.delayInSeconds(0.8);
                	  sat.haveDinner();functions.delayInSeconds(0.8);
                	  sat.snack();functions.delayInSeconds(0.8);
                	  sat.drinkTea();functions.delayInSeconds(0.8);
                	  sat.drinkCoffee();functions.delayInSeconds(0.8);
                	  sat.startExercise();functions.delayInSeconds(0.8);
                	  sat.stopExercise();functions.delayInSeconds(0.8);
                	  sat.readMaterial();functions.delayInSeconds(0.8);
                	  sat.solveQuestions();functions.delayInSeconds(0.8);
                	  sat.research();functions.delayInSeconds(0.8);
                	  sat.watchMovie();functions.delayInSeconds(0.8);
                	  sat.watchSeries();functions.delayInSeconds(0.8);
                	  sat.watchMatch();functions.delayInSeconds(0.8);
                	  sat.surfingAtInternet();functions.delayInSeconds(0.8);
                	  sat.sleep();functions.delayInSeconds(0.8);

                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Saturday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");
                	  
                	  break;
                	  
                	  
                  case 7:
                	  
                	  if(Sunday.count==0) {
                    	  System.out.println("Okay, I'm telling you what I did last Sunday right away.");
                	  }else {
                		  System.out.println("You've already asked me this... It seems like your memory isn't very good, so I'll tell you again. ");
                	  }
                	  
                	  Sunday.count++;
                	  
                	  
                	  sun.wakeUp(); functions.delayInSeconds(0.8);
                	  sun.brushTeeth(); functions.delayInSeconds(0.8);
                	  sun.takeShower(); functions.delayInSeconds(0.8);
                	  sun.haveBreakfast();functions.delayInSeconds(0.8);
                	  sun.goingSchool();functions.delayInSeconds(0.8);
                	  sun.selectSubject();functions.delayInSeconds(0.8);
                	  sun.takeNotes();functions.delayInSeconds(0.8);
                	  sun.chatting();functions.delayInSeconds(0.8);
                	  sun.talk();functions.delayInSeconds(0.8);
                	  sun.haveLunch();functions.delayInSeconds(0.8);
                	  sun.meetFriend();functions.delayInSeconds(0.8);
                	  sun.attendEvent();functions.delayInSeconds(0.8);
                	  sun.goingHome();functions.delayInSeconds(0.8);
                	  sun.listenMusic();functions.delayInSeconds(0.8);
                	  sun.changeClothes();functions.delayInSeconds(0.8);
                	  sun.meditate();functions.delayInSeconds(0.8);
                	  sun.rest();functions.delayInSeconds(0.8);
                	  sun.stretch();functions.delayInSeconds(0.8);
                	  sun.startStudy();functions.delayInSeconds(0.8);
                	  sun.stopStudy();functions.delayInSeconds(0.8);
                	  sun.haveDinner();functions.delayInSeconds(0.8);
                	  sun.snack();functions.delayInSeconds(0.8);
                	  sun.drinkTea();functions.delayInSeconds(0.8);
                	  sun.drinkCoffee();functions.delayInSeconds(0.8);
                	  sun.startExercise();functions.delayInSeconds(0.8);
                	  sun.stopExercise();functions.delayInSeconds(0.8);
                	  sun.readMaterial();functions.delayInSeconds(0.8);
                	  sun.solveQuestions();functions.delayInSeconds(0.8);
                	  sun.research();functions.delayInSeconds(0.8);
                	  sun.watchMovie();functions.delayInSeconds(0.8);
                	  sun.watchSeries();functions.delayInSeconds(0.8);
                	  sun.watchMatch();functions.delayInSeconds(0.8);
                	  sun.surfingAtInternet();functions.delayInSeconds(0.8);
                	  sun.sleep();functions.delayInSeconds(0.8);
                	  
                	  functions.delayInSeconds(0.7);
                	  
                	  System.out.println("Here's how my Sunday went...");
                	  System.out.println("");
                	  System.out.println("");
                	  System.out.println("");
                	  
                	  
                	  break;	
                	  
                  	default: System.out.println("Invalid day...");
                  	break; 
                  	
                  		}
                  break;
                  
              case 2: // Kullanıcı another aktivitesini girerse karılaşacağı yapı
            	  
            	  System.out.println("Choose an activity to talk with me...");
            	  
            	  functions.delayInSeconds(1);
            	  
            	  System.out.println("1. Games");
                  System.out.println("2. Argument");
                  System.out.println("3. Entertainment");
                  System.out.println("4. Food");
                  System.out.println("5. Shopping");
                  
                  int anotherActivity = scan.nextInt();
                  scan.nextLine();
                  
                  switch(anotherActivity) {
                  case 1:
                      System.out.println("I rarely play games, and I don't particularly enjoy playing them. Do you play games?");
                      
                      functions.delayInSeconds(0.7);
                      System.out.println("1. Yes");
                      System.out.println("2. No");
                      
                      int isplayGame = scan.nextInt();
                      scan.nextLine();
                      
                      if(isplayGame==1) {
                    	  System.out.println("What type of games do you play? ");
                    	  System.out.println("1. Action");
                    	  System.out.println("2. Simulation");
                    	  System.out.println("3. Strategy");
                    	  System.out.println("4. Sport");
                    	  

                    	  int typeofGame = scan.nextInt();
                    	  scan.nextLine();

                    	  switch (typeofGame) {
                    	      case 1:
                    	          System.out.println("Action games can be an exhilarating experience, filled with intense moments and thrilling scenarios. While I used to indulge in action-packed adventures like GTA and Call of Duty, the demands of life have led me to a point where finding time for such games has become challenging.");
                    	          
                    	          System.out.println("Choosing between single-player and multiplayer action games often depends on the mood. For me, single-player games provide a more immersive escape into a storyline, while multiplayer games offer a chance to engage with friends. What's your preference?");
                    	          
                    	          int actionGamePreference = scan.nextInt();
                    	          scan.nextLine();
                    	          
                    	          if (actionGamePreference == 1) {
                    	              System.out.println("There's something special about the depth of a single-player game. Do you have a favorite single-player action game?");
                    	              String favoriteSinglePlayerGame = scan.nextLine();
                    	              System.out.println("Nice choice! What aspects of " + favoriteSinglePlayerGame + " do you find most captivating?");
                    	          } else if (actionGamePreference == 2) {
                    	              System.out.println("Multiplayer games inject a social element into the gaming experience. Which multiplayer action game resonates with you the most?");
                    	              String favoriteMultiplayerGame = scan.nextLine();
                    	              System.out.println("Fantastic! What draws you to play " + favoriteMultiplayerGame + " regularly?");
                    	              String favoriteMpDraw= scan.nextLine();
                    	              System.out.println("Hmmm impressive. "+ favoriteMpDraw +" is unspecific choice.");
                    	          } else {
                    	              System.out.println("It seems like you're exploring various gaming experiences. That's great!");
                    	          }
                    	          break;

                    	      case 2:
                    	          System.out.println("Simulation games offer a unique opportunity to delve into realistic scenarios and activities. Whether it's managing a virtual city or piloting a flight simulator, the immersive nature of simulation games is truly fascinating.");
                    	          
                    	          System.out.println("Do you have a go-to simulation game that captures your interest? Perhaps something like The Sims or a more specialized simulation?");
                    	          String favoriteSimulationGame = scan.nextLine();
                    	          System.out.println("Interesting choice! What specific aspects of " + favoriteSimulationGame + " make it stand out for you?");
                    	          break;

                    	      case 3:
                    	          System.out.println("Strategy games demand sharp thinking, planning, and the ability to adapt to changing circumstances. The thrill of outsmarting opponents and devising winning strategies adds a unique dimension to gaming.");
                    	          
                    	          System.out.println("Is there a strategy game that you find particularly engaging? Whether it's a classic like Age of Empires or a modern title?");
                    	          String favoriteStrategyGame = scan.nextLine();
                    	          System.out.println("Impressive choice! What strategies or tactics have proven most effective for you in " + favoriteStrategyGame + "?");
                    	          break;

                    	      case 4:
                    	          System.out.println("Sports games provide an exciting way to experience the thrill of competition from the comfort of your own home. Whether you're into football, basketball, or racing, sports games capture the essence of the real thing.");
                    	          
                    	          System.out.println("Do you have a favorite sports game that you enjoy playing? Maybe something like FIFA, NBA 2K, or a racing simulation?");
                    	          System.out.println("Can you tell me your favorite sports game?");
                    	          String favoriteSportGame = scan.nextLine();
                    	          System.out.println("Cool choice! When playing " + favoriteSportGame + ", do you usually support a specific team or player?");
                    	          String favoriteSportTeam = scan.nextLine();
                    	          System.out.println("Yes... I know " + favoriteSportTeam +" football club. Good choice!...");
                    	          System.out.println("Let me tell you a story. When I was little, I had just gotten my first computer, and I installed the FIFA 12 game. I played matches controlling various teams in the game, and my favorite team was Derby County. What is your favorite team?");
                    	          String favoriteTeam = scan.nextLine();
                    	          System.out.println("I am glad that your favorite team is " + favoriteTeam);
                    	         
                    	          break;

                    	      default:
                    	          System.out.println("It seems like you have diverse interests in gaming genres. That's fantastic! If you ever want to explore new games or discuss your gaming experiences, feel free to share!");
                    	          break;
                    	          
                    	  }
            	  
                    	 break;
            	  
                  }
                      
                      
                  case 2: System.out.println("Welcome to the enchanting world of Thursday afternoons, a day where the hustle and bustle takes a backseat, and I find solace in the cozy ambiance of Starbucks in Bahçeli. It's become a cherished tradition, a delightful interlude amidst the weekly routine.");

                  	functions.delayInSeconds(1);

                  					System.out.println("The prospect of sharing this serene experience with you crossed my mind. How about making Thursday afternoons a tad more special together?");

                  					System.out.println("1. Yes, absolutely! I'd love to join you.");
                  					System.out.println("2. No, I have other commitments.");

                  					int argChoice = scan.nextInt();
                  						scan.nextLine();

                  							switch (argChoice) {
                  						case 1:
                  								System.out.println("Marvelous! Your presence is sure to add a touch of brilliance to our Starbucks escapade.");
                  								functions.delayInSeconds(1);
                  								System.out.println("Before we rendezvous, let's delve into the nuances. Is there a particular elixir from Starbucks that tantalizes your taste buds?");
                  								String favoriteStarbucksDrink = scan.nextLine();
                  								System.out.println("Ah, a lover of " + favoriteStarbucksDrink + "! I'll make a mental note to indulge your palate when we meet.");
                  								functions.delayInSeconds(1);
                  								System.out.println("Our upcoming Starbucks adventure is filled with promise!");

                  								System.out.println("On a related note, do you have any preferred conversation topics or genres that tickle your intellectual fancy?");
                  								String favoriteConversationTopic = scan.nextLine();
                  								System.out.println("Splendid choice! I'm eagerly anticipating engaging in discussions about " + favoriteConversationTopic + " as we savor our Starbucks brew.");

                  								System.out.println("Looking forward to our soon-to-be tradition at Starbucks!");
                  								

                  								break;

                  								case 2:
                  								System.out.println("Understandable! Commitments are commitments, and Thursdays are a canvas awaiting your presence whenever the time is right.");
                  								functions.delayInSeconds(1);
                  								System.out.println("Should your schedule ever grant you a Thursday reprieve or if the allure of Starbucks beckons, the invitation stands open!");
                  								break;

                  								default:
                  									System.out.println("Hmm, there seems to be a slight confusion. Let's assume there's a whirlwind of activity on your end this time.");
                  									functions.delayInSeconds(1);
                  									System.out.println("Whenever you feel like weaving a Thursday afternoon into your tapestry, whether for a Starbucks indulgence or a casual chat, the offer remains extended!");
                  									break;
                  							}
                	  
                  							break;
                	  
                	  
                  case 3:System.out.println("Embarking on a journey through the diverse realms of entertainment is an exhilarating venture. Let's delve into the fascinating world of your entertainment preferences!");

                  			System.out.println("1. Cinema");
                  			System.out.println("2. Theatre");
                  			System.out.println("3. Concerts");
                  			System.out.println("4. Watching Football");
                  			System.out.println("5. Art");
                  			System.out.println("6. Reading");
                  			System.out.println("7. Outdoor Activities");
                  			
                  			int entertainmentChoice = scan.nextInt();
                  			scan.nextLine();

switch (entertainmentChoice) {
    case 1:
        functions.delayInSeconds(1);
        System.out.println("Cinema, a magical canvas where stories unfold in vivid hues. While I don't frequent the cinema as much, there's a certain allure. Do you find joy in the cinematic experience?");

        System.out.println("1. Yes");
        System.out.println("2. No");

        int cinemaDecision = scan.nextInt();

        if (cinemaDecision == 1) {
            System.out.println("Marvelous! The cinematic journey is enriched by individual preferences. Any favorite genre or director that beckons you to the silver screen?");
            System.out.println("Feel free to share your cinematic delights!");
            functions.delayInSeconds(2);
            System.out.println("Ah, " + scan.nextLine() + "! A fantastic choice indeed. Your cinematic tastes add a unique flavor to the narrative.");
        } else if (cinemaDecision == 2) {
            System.out.println("Ah, I see. Not everyone is captivated by the cinematic allure. It's comforting to know I'm not alone in this cinematic contemplation.");
        } else {
            System.out.println("Let's adhere to the rules of the game. Your response adds an air of mystery!");
        }

        break;

    case 2:
        System.out.println("The theater, a sanctuary where stories come alive through the magic of performance. Though my visits have become infrequent, high school days were a golden era. Have you experienced the enchantment of the theater?");

        System.out.println("1. Yes");
        System.out.println("2. No");

        int theatreDecision = scan.nextInt();

        if (theatreDecision == 1) {
            System.out.println("Impressive! The theater's tapestry is woven with diverse stories. What's the name of your favorite play, and how has it left an indelible mark on you?");
            functions.delayInSeconds(1);
            System.out.println("Ah, " + scan.nextLine() + "! A hidden gem indeed. Your theatrical choices are like chapters in a captivating drama.");
        } else if (theatreDecision == 2) {
            System.out.println("That's unfortunate. The theater, with its dramatic tapestry, holds a unique charm. Drama-themed plays, in particular, offer an unmatched experience. I hope the theater's embrace finds you soon.");
        } else {
            System.out.println("Let's adhere to the rules of the game. Your response adds an intriguing layer!");
        }

        break;

    case 3:
        System.out.println("Concerts, pulsating with energy and melodies. Despite the excitement, I find the crowds a bit overwhelming. Do concerts find a harmonious place in your diverse palette of entertainment?");

        System.out.println("1. Yes");
        System.out.println("2. No");

        int concertDecision = scan.nextInt();

        if (concertDecision == 1) {
            System.out.println("Live concerts are a vibrant experience, each note carrying a unique story. Who's your favorite artist, and how has their music resonated with your soul?");
            functions.delayInSeconds(1);
            System.out.println("Impressive choice! If " + scan.nextLine() + " claims the throne as your favorite, count me in as a fellow admirer.");
        } else if (concertDecision == 2) {
            System.out.println("Indeed, the allure of concerts is undeniable, but the effort can be quite daunting. It's reassuring to find resonance in our perspectives on the concert-going experience.");
        } else {
            System.out.println("Let's adhere to the rules of the game. Your response adds a layer of mystery!");
        }

        break;

    case 4:
        System.out.println("Football, a timeless passion that resonates across generations. Since childhood, I've been an avid follower, particularly of Derby County. Does the symphony of football captivate your interest too?");

        System.out.println("1. Yes");
        System.out.println("2. No");

        int footballDecision = scan.nextInt();

        if (footballDecision == 1) {
            System.out.println("Fantastic! If I had a favorite team, it would undoubtedly be the one that brings joy and excitement to its fans. Any particular team holds the key to your football allegiance?");
            System.out.println("Please share the team's name");
            functions.delayInSeconds(1);
            System.out.println("Great choice! I'll be keeping a keen eye on " + scan.nextLine() + " and reveling in the thrill of their matches.");
            functions.delayInSeconds(1);
        } else if (footballDecision == 2) {
            System.out.println("That's intriguing! Football's embrace isn't universal, and I respect your unique perspective on sports and entertainment.");
            functions.delayInSeconds(1);
        } else {
            System.out.println("Let's adhere to the rules of the game. Your response adds a layer of mystery!");
        }

        break;
    case 5:
        System.out.println("Art, a realm that transcends time and space. Museums offer a unique journey through history and creativity. Have you ever visited an art museum?");
        
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        int artDecision = scan.nextInt();
        
        if (artDecision == 1) {
            System.out.println("Marvelous! Art museums are treasure troves of inspiration. What era or style of art captivates you the most?");
            System.out.println("Feel free to share your artistic preferences!");
            functions.delayInSeconds(2);
            System.out.println("Ah, " + scan.nextLine() + "! A splendid choice. Your affinity for art adds a brushstroke of sophistication to our conversation.");
        } else if (artDecision == 2) {
            System.out.println("That's alright! Art museums might not be everyone's cup of tea, but they hold incredible stories within their walls.");
        } else {
            System.out.println("Let's adhere to the rules of the game. Your response adds an air of mystery to our artistic exploration!");
        }

        break;

    case 6:
        System.out.println("Books, gateways to other worlds and perspectives. Do you enjoy reading?");

        System.out.println("1. Yes");
        System.out.println("2. No");

        int bookDecision = scan.nextInt();

        if (bookDecision == 1) {
            System.out.println("Fantastic! Reading is a delightful journey. What genre or author resonates with your literary soul?");
            System.out.println("Feel free to share your literary favorites!");
            functions.delayInSeconds(2);
            System.out.println("Ah, " + scan.nextLine() + "! An excellent choice. Your literary preferences add a layer of depth to our conversation.");
        } else if (bookDecision == 2) {
            System.out.println("That's alright! Not everyone finds solace in books, but they have a unique way of shaping perspectives.");
        } else {
            System.out.println("Let's adhere to the rules of the game. Your response adds a touch of mystery to our literary exploration!");
        }

        break;

    case 7:
        System.out.println("Exploring the outdoors is a rejuvenating experience. Do you have a favorite outdoor activity?");

        System.out.println("1. Hiking");
        System.out.println("2. Cycling");
        System.out.println("3. Picnics");
        System.out.println("4. Gardening");

        int outdoorDecision = scan.nextInt();

        switch (outdoorDecision) {
            case 1:
                System.out.println("Hiking, a communion with nature's grandeur. Have you embarked on any memorable hiking trails?");
                functions.delayInSeconds(1);
                System.out.println("1. Yes");
                System.out.println("2. No");

                int hikingExperience = scan.nextInt();

                if (hikingExperience == 1) {
                    System.out.println("How enchanting! Share the details of your most memorable hiking adventure. The beauty of nature has a way of etching itself into our hearts.");
                    functions.delayInSeconds(2);
                    System.out.println("Ah, " + scan.nextLine() + "! An awe-inspiring journey indeed. Your love for hiking paints a vivid landscape in our conversation.");
                } else if (hikingExperience == 2) {
                    System.out.println("That's alright! Hiking may not be everyone's cup of tea, but the allure of untouched landscapes is truly magical.");
                } else {
                    System.out.println("Let's adhere to the rules of the game. Your response adds a layer of mystery to our hiking exploration!");
                }

                break;

            case 2:
                System.out.println("Cycling, a rhythmic dance with the wind. Do you have a favorite cycling route or a memorable cycling adventure?");
                functions.delayInSeconds(1);
                System.out.println("1. Yes");
                System.out.println("2. No");

                int cyclingExperience = scan.nextInt();

                if (cyclingExperience == 1) {
                    System.out.println("How exhilarating! Share the details of your most memorable cycling escapade. The freedom of the open road carries a special charm.");
                    functions.delayInSeconds(2);
                    System.out.println("Ah, " + scan.nextLine() + "! A thrilling journey indeed. Your passion for cycling adds a burst of energy to our conversation.");
                } else if (cyclingExperience == 2) {
                    System.out.println("That's alright! Cycling may not be everyone's preferred mode of exploration, but the wind in your hair creates a unique connection with nature.");
                } else {
                    System.out.println("Let's adhere to the rules of the game. Your response adds a touch of mystery to our cycling exploration!");
                }

                break;

            case 3:
                System.out.println("Picnics, a delightful rendezvous with nature's bounty. Do you have a favorite spot or a cherished memory from a picnic?");
                functions.delayInSeconds(1);
                System.out.println("1. Yes");
                System.out.println("2. No");

                int picnicExperience = scan.nextInt();

                if (picnicExperience == 1) {
                    System.out.println("How charming! Share the details of your most cherished picnic experience. The simple joys of outdoor dining create enduring memories.");
                    functions.delayInSeconds(2);
                    System.out.println("Ah, " + scan.nextLine() + "! A delightful experience indeed. Your fondness for picnics adds a touch of warmth to our conversation.");
                } else if (picnicExperience == 2) {
                    System.out.println("That's alright! Picnics may not be everyone's go-to leisure activity, but the connection between food and nature is truly special.");
                } else {
                    System.out.println("Let's adhere to the rules of the game. Your response adds a layer of mystery to our picnic exploration!");
                }

                break;

            case 4:
                System.out.println("Gardening, a serene dance with the earth. Do you have a green thumb, and if so, what's your favorite plant or flower?");
                functions.delayInSeconds(1);
                System.out.println("1. Yes");
                System.out.println("2. No");

                int gardeningExperience = scan.nextInt();

                if (gardeningExperience == 1) {
                    System.out.println("How therapeutic! Share the details of your gardening journey. The nurturing of life in the form of plants is a profound experience.");
                    functions.delayInSeconds(2);
                    System.out.println("Ah, " + scan.nextLine() + "! An enriching endeavor indeed. Your affinity for gardening adds a touch of natural beauty to our conversation.");
                } else if (gardeningExperience == 2) {
                    System.out.println("That's alright! Gardening may not be everyone's chosen form of relaxation, but the bond between humans and plants is a timeless connection.");
                } else {
                    System.out.println("Let's adhere to the rules of the game. Your response adds a touch of mystery to our gardening exploration!");
                }

                break;

            default:
                System.out.println("Invalid choice. Let's adhere to the rules of the game and explore other avenues of conversation.");
                break;
        }

        break;
       
    default:
        System.out.println("Invalid choice. Let's adhere to the rules");
        break;
        
        } //Entertainment Choose        

                  case 4:	
                	  
                	  System.out.println("The world of cuisine is vast and enchanting! Let's embark on a culinary journey. What type of food tantalizes your taste buds today?");
                	  System.out.println("1. Meat Dishes");
                	  System.out.println("2. Vegetable Dishes");
                	  System.out.println("3. Appetizers");
                	  System.out.println("4. Sweets");
                	  System.out.println("5. Culinary Curiosity");
                	  System.out.println("6. Beverages");

                  int foodChoice = scan.nextInt();
                  scan.nextLine(); // To consume the newline character after the integer input

                  switch (foodChoice) {
                      case 1:
                          System.out.println("Ah, the succulent world of meat dishes! A feast for the senses. Do you have a cherished favorite among the array of meaty delights?");
                          System.out.println("1. Yes");
                          System.out.println("2. No");

                          int favoriteMeatDish = scan.nextInt();
                          scan.nextLine();

                          if (favoriteMeatDish == 1) {
                              System.out.println("Absolutely splendid! Share with me the name of your ultimate favorite. Is it a classic like a perfectly seared steak, or perhaps something more exotic and adventurous?");
                              functions.delayInSeconds(2);
                              System.out.println("Ah, " + scan.nextLine() + "! My imaginary taste buds are already savoring the delightful flavors. What a choice!");
                          } else if (favoriteMeatDish == 2) {
                              System.out.println("No worries! Exploring the diverse world of meat dishes is an adventure in itself. Is there a particular cuisine or cultural dish that captivates you?");
                          } else {
                              System.out.println("Let's adhere to the rules of our culinary conversation. Your unique taste preferences add an intriguing flavor to our discussion!");
                          }

                          break;

                      case 2:
                          System.out.println("Vegetable dishes, a celebration of freshness and colors! Do you have a favorite vegetable dish that you find irresistible?");
                          System.out.println("1. Yes");
                          System.out.println("2. No");

                          int favoriteVegetableDish = scan.nextInt();
                          scan.nextLine();

                          if (favoriteVegetableDish == 1) {
                              System.out.println("Fantastic! Share the name of your favorite veggie delight. Is it a classic like a Mediterranean salad, or do you prefer something more elaborate?");
                              functions.delayInSeconds(2);
                              System.out.println("Oh, " + scan.nextLine() + "! A symphony of flavors indeed. Your choice adds a burst of freshness to our culinary conversation!");
                          } else if (favoriteVegetableDish == 2) {
                              System.out.println("No problem! The world of vegetables offers a plethora of options. Is there a specific cuisine's vegetable dishes that you find intriguing?");
                          } else {
                              System.out.println("Let's play by the rules. Your vegetable preferences bring a delightful green touch to our culinary dialogue!");
                          }

                          break;
                          
                      case 3:
                    	    System.out.println("Appetizers, the prelude to a delightful meal! Are you a fan of appetizers?");
                    	    System.out.println("1. Yes");
                    	    System.out.println("2. No");

                    	    int likeAppetizers = scan.nextInt();
                    	    scan.nextLine();

                    	    if (likeAppetizers == 1) {
                    	        System.out.println("Excellent choice! What's your go-to appetizer when dining out? Something classic like bruschetta, or perhaps something more adventurous?");
                    	        functions.delayInSeconds(2);
                    	        System.out.println("Ah, " + scan.nextLine() + "! Your taste in appetizers adds a flavorful twist to our culinary conversation!");
                    	    } else if (likeAppetizers == 2) {
                    	        System.out.println("No worries! Appetizers may not be everyone's preference, but they certainly bring variety to the dining experience.");
                    	    } else {
                    	        System.out.println("Let's play by the rules. Your appetizer preferences are a delightful addition to our culinary dialogue!");
                    	    }

                    	    break;

                    	case 4:
                    	    System.out.println("Sweets, the symphony of sugar and bliss! Do you have a sweet tooth?");
                    	    System.out.println("1. Yes");
                    	    System.out.println("2. No");

                    	    int sweetTooth = scan.nextInt();
                    	    scan.nextLine();

                    	    if (sweetTooth == 1) {
                    	        System.out.println("Wonderful! Share with me your favorite sweet treat. Is it a classic like chocolate cake, or perhaps a unique dessert from a specific cuisine?");
                    	        functions.delayInSeconds(2);
                    	        System.out.println("Mmm, " + scan.nextLine() + "! Your choice of sweets is a delightful melody to our culinary conversation!");
                    	    } else if (sweetTooth == 2) {
                    	        System.out.println("No problem! Not everyone has a sweet tooth, but desserts do have a magical way of adding joy to life.");
                    	    } else {
                    	        System.out.println("Let's adhere to the rules. Your sweet preferences sweeten our culinary dialogue!");
                    	    }

                    	    break;

                    	case 5:
                    	    System.out.println("Other, a mysterious realm of culinary delights! What unique or specific food category intrigues you?");
                    	    System.out.println("Feel free to share your culinary curiosity!");

                    	    String otherFoodCategory = scan.nextLine();
                    	    functions.delayInSeconds(1);
                    	    System.out.println("Ah, " + otherFoodCategory + "! An intriguing choice indeed. Your culinary curiosity adds a unique flavor to our conversation.");

                    	    break;
                    	    
                    	case 6:
                    	    System.out.println("Beverages, the liquid companions of our meals! What's your favorite beverage?");
                    	    System.out.println("1. Tea");
                    	    System.out.println("2. Coffee");
                    	    System.out.println("3. Juice");
                    	    System.out.println("4. Soft Drinks");
                    	    System.out.println("5. Other");

                    	    int beverageChoice = scan.nextInt();
                    	    scan.nextLine();

                    	    switch (beverageChoice) {
                    	        case 1:
                    	            System.out.println("Tea, a soothing and timeless beverage! How do you prefer your tea?");
                    	            System.out.println("1. Black Tea");
                    	            System.out.println("2. Green Tea");
                    	            System.out.println("3. Herbal Tea");
                    	            System.out.println("4. With Milk");
                    	            System.out.println("5. Other");

                    	            int teaPreference = scan.nextInt();
                    	            scan.nextLine();

                    	            if (teaPreference == 1) {
                    	                System.out.println("Classic choice! Black tea has a rich and robust flavor. Do you have a preferred time of day for enjoying your cup of black tea?");
                    	                functions.delayInSeconds(2);
                    	                System.out.println("Ah, the simplicity of enjoying black tea in " + scan.nextLine() + "! A delightful ritual indeed.");
                    	            } else if (teaPreference == 2) {
                    	                System.out.println("Green tea, a refreshing choice! How do you usually prepare your green tea?");
                    	                System.out.println("1. Loose leaves");
                    	                System.out.println("2. Tea bags");
                    	                System.out.println("3. With honey");
                    	                System.out.println("4. Other");
                    	                
                    	                int greenTeaPreference = scan.nextInt();
                    	                scan.nextLine();

                    	                if (greenTeaPreference == 1) {
                    	                    System.out.println("Loose leaves, a traditional and authentic way to enjoy green tea! Do you have a preferred type of loose leaves?");
                    	                    functions.delayInSeconds(2);
                    	                    System.out.println("Exploring different types of loose leaves adds a delightful variety to your green tea experience.");
                    	                } else if (greenTeaPreference == 2) {
                    	                    System.out.println("Tea bags, a convenient choice for a quick cup of green tea! Do you have a favorite brand of green tea bags?");
                    	                    functions.delayInSeconds(2);
                    	                    System.out.println("Discovering new tea bag flavors can be a delightful adventure.");
                    	                } else if (greenTeaPreference == 3) {
                    	                    System.out.println("With honey, a sweet and flavorful addition to green tea! How do you like the balance between the tea and honey?");
                    	                    functions.delayInSeconds(2);
                    	                    System.out.println("Finding the perfect harmony between green tea and honey can be a delightful journey.");
                    	                } else if (greenTeaPreference == 4) {
                    	                    System.out.println("Other, a unique and personalized way to enjoy green tea! What's your special twist to your green tea?");
                    	                    functions.delayInSeconds(2);
                    	                    System.out.println("Exploring unique variations of green tea is a journey of self-discovery.");
                    	                } else {
                    	                    System.out.println("Let's adhere to the rules. Your green tea preferences contribute to the richness of our beverage conversation!");
                    	                }
                    	                
                    	            } else {
                    	                System.out.println("Let's adhere to the rules. Your tea preferences add a comforting warmth to our beverage discussion!");
                    	            }

                    	            break;

                    	        case 2:
                    	            System.out.println("Ah, coffee, the aromatic elixir of the morning! How do you take your coffee?");
                    	            System.out.println("1. Black");
                    	            System.out.println("2. With Milk");
                    	            System.out.println("3. With Sugar");
                    	            System.out.println("4. Iced Coffee");
                    	            System.out.println("5. Other");

                    	            int coffeePreference = scan.nextInt();
                    	            scan.nextLine();

                    	            if (coffeePreference == 1) {
                    	                System.out.println("Black coffee, a bold and classic choice! How do you like the intensity of black coffee?");
                    	                functions.delayInSeconds(2);
                    	                System.out.println("Exploring the rich flavors of black coffee can be an invigorating experience.");
                    	            } else if (coffeePreference == 2) {
                    	                System.out.println("With milk, a creamy and comforting addition to coffee! Do you have a preferred type of milk for your coffee?");
                    	                functions.delayInSeconds(2);
                    	                System.out.println("Experimenting with different types of milk can add a delightful twist to your coffee routine.");
                    	            } else if (coffeePreference == 3) {
                    	                System.out.println("With sugar, a sweet and indulgent way to enjoy coffee! How do you find the perfect balance between sweetness and bitterness?");
                    	                functions.delayInSeconds(2);
                    	                System.out.println("Discovering the ideal sugar-to-coffee ratio can make each cup a sweet delight.");
                    	            } else if (coffeePreference == 4) {
                    	                System.out.println("Iced coffee, a refreshing choice for warmer days! Do you prefer your iced coffee with any additional flavors?");
                    	                functions.delayInSeconds(2);
                    	                System.out.println("Exploring different flavor additions to iced coffee can be a cool and delightful experience.");
                    	            } else if (coffeePreference == 5) {
                    	                System.out.println("Other, a unique and personalized way to enjoy coffee! What's your special twist to your coffee?");
                    	                functions.delayInSeconds(2);
                    	                System.out.println("Creating your unique coffee concoction is an art in itself.");
                    	            } else {
                    	                System.out.println("Let's adhere to the rules. Your coffee preferences add a delightful buzz to our beverage discussion!");
                    	            }

                    	            break;

                    	        default:
                    	            System.out.println("Invalid choice. Let's adhere to the rules of the game and explore another aspect of delightful beverages!");
                    	            break;
                    	    }

                    	    break;

                    	default:
                    	    System.out.println("Invalid choice. Let's adhere to the rules of the game and explore another avenue of culinary wonders!");
                    	    break;
                          
                  }
                	  
			
						








                  

}  // Another Activity           
} // Switch userChoice
}// While function.
}// First User Choice which include 1. daily routines 2. another 0. exit
      
      scan.close(); 
      System.out.println("See you later...");
}// Main function
}// For main class
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

