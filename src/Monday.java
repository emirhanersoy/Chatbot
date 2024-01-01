public class Monday implements DailyRoutines,EatingAndDrinking,Exercise,Socialize,Study{
	
	// Birden fazla interface implement eden klasik bir pazartesi classı
	
	public static int count =0;
	
	
	
	@Override
	public void wakeUp() {
		System.out.println("Since I forgot to set an alarm the previous night, I woke up late. It was approaching 12:00 PM.");
		
	}
	
	@Override
	public void sleep() {
		System.out.println("After eating a bowl of yogurt, I felt quite sleepy, and around 02:00, I went to bed and fell asleep.");

		
	}
	
	public void brushTeeth() {
		System.out.println("I brushed my teeth twice a day, once in the morning after waking up and once in the evening before going to bed.");

		
	}
	
	@Override
	public void takeShower() {
		System.out.println("Around 12:15, I went to the bathroom. I shaved, and took a shower.");

		
	}
	


	@Override
	public void haveBreakfast() {
		System.out.println("I went to the kitchen to have breakfast. I immediately prepared my drip coffee and waited for it to brew.");
        System.out.println("In the meantime, I boiled an egg and prepared my meal with some cheese and olives. Around 1:00 PM, I finished my breakfast and cleaned up the kitchen.");
		
	}
	
	@Override
	public void haveLunch() {
		System.out.println("Since I already had breakfast very late, I skipped lunch and had a snack instead.");

		
	}

	@Override
	public void haveDinner() {
		System.out.println("At 10:00 PM, we had dinner with my family.");

		
	}
	
	@Override
	public void snack() {
		System.out.println("I took a break while studying Data Structures and had a snack.");
		System.out.println("Around 2:00 AM, I had a bowl of yogurt, brushed my teeth, and went to sleep.");

		
	}
	
	@Override
	public void drinkTea() {
		 System.out.println("At around 5:00 PM, I had tea with my family.");
		
	}
	
	@Override
	public void drinkWater() {
		System.out.println("Upon waking up, I started drinking water, and I drank water at every moment it came to my mind. I consumed approximately 1.5 liters of water.");
		
	}

	@Override
	public void drinkCoffee() {
		System.out.println("In the morning, I had coffee during breakfast, and in the evening at school, I drank coffee while chatting with my friends.");

		
	}
	
	
	@Override
	public void meditate() {
		System.out.println("I didn't meditate today.");
		
	}
	
	@Override
	public void startExercise() {
		System.out.println("Today, I started exercising around 1:00 PM in the morning and around 11:30 PM in the evening.");

		
	}

	@Override
	public void stopExercise() {
		 System.out.println("Around 1:30 PM, I completed my morning exercise. Around 12:30 AM, I finished my evening exercise.");
		
	}
	
	
	@Override
	public void stretch() {
		System.out.println("Before the morning breakfast and right before the evening exercise I do before going to bed, I performed warm-up exercises.");

		
	}
	
	@Override
	public void rest() {
		System.out.println("After having breakfast in the morning and exercising before going to bed at night, I took a rest.");

		
	}
	
	@Override
	public void startStudy() {
		System.out.println("I studied in the afternoon. Around 4 PM");
		
	}
	
	@Override
	public void stopStudy() {
		System.out.println("I finished my study session and got ready to go to school.");

	}

	@Override
	public void goingSchool() {
		System.out.println("At 4:00 PM, I left home. I took the bus and went to school. When I arrived at school, it was around 5:00 PM.");
		
	}

	@Override
	public void goingHome() {
		System.out.println("The class ended around 7:30 PM. After the class, I took the bus back home. Waiting for the bus and commuting took almost an hour, and I arrived home around 8:30 PM.");

		
	}


	
	@Override
	public void selectSubject() {
		System.out.println("Today, I only studied for the Data Structures class.");

		
	}

	@Override
	public void readMaterial() {
		System.out.println("Today, I only read the documents for the Data Structures class.");

		
	}

	@Override
	public void solveQuestions() {
		System.out.println("Today, I didn't solve any questions related to any of my classes.");

		
	}

	@Override
	public void takeNotes() {
		System.out.println("Today, I didn't take any notes related to any of my classes.");

	}
	
	@Override
	public void research() {
		System.out.println("I didn't conduct a new research today.");

	}


	@Override
	public void chatting() {
		System.out.println("I chatted with my friends at school. In the evening, while having dinner with my family, I also chatted while drinking tea.");

		
	}

	@Override
	public void talk() {
		System.out.println("I talked with my teachers and friends at school, and with my family at home.");

		
	}

	@Override
	public void meetFriend() {
		System.out.println("When I went to school, I met with my friends. We had coffee together and chatted.");

		
	}

	
	@Override
	public void attendEvent() {
		System.out.println("Today, I did my usual exercises, studied, and went to and from school. I didn't engage in any different activities.");

		
	}

	
	@Override
	public void watchMovie() {
		System.out.println("I didn't watch any movie today.");

		
	}

	@Override
	public void watchSeries() {
		System.out.println("I didn't watch any series today.");

		
	}

	@Override
	public void watchMatch() {
		System.out.println("I didn't watch any matches today.");

		
	}

	@Override
	public void listenMusic() {
		System.out.println("Throughout the day, I listened to music while going to and from school and exercising at home in the evening.");

		
	}

	@Override
	public void surfingAtInternet() {
		System.out.println("Upon waking up in the morning, during my midday study break, and around midnight, I browsed the internet and followed social media.");

	}

	@Override
	public void changeClothes() {
		System.out.println("After waking up in the morning and before going to bed at night, I changed my clothes.");

		
	}













}




