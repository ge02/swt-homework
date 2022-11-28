package hw_7_task2;

public class Main {
	
	Leaf Taekwando = new Leaf("Woman's Taekwando Team", 5, 2);
	Leaf Waterpolo = new Leaf("Woman's Waterpolo Team", 10, 0);
	Leaf ArtisticGymnastics = new Leaf("Woman's Artistic Gymnastics", 12, 4);
	Leaf Shooting = new Leaf("Men's Shooting", 8, 0);
	Leaf Cycling = new Leaf("Woman's Cycling", 15, 3);
	Leaf Tennis = new Leaf("Woman's Tennis", 9, 1);
	Leaf TableTennis = new Leaf("Men's Table Tennis", 9, 4);
	Leaf Football = new Leaf("Men's Football", 25, 5);
	
	Composite Olympic = new Composite("Olympic Teams");
	Composite Asia = new Composite("Team Asia");
	Composite Europe = new Composite("Team Europe");
	
	Composite China = new Composite("Team China");
	Composite Germany = new Composite("Team Germany");
	Composite Italy = new Composite("Team Italy");
	
	Composite CW = new Composite("China's Woman Team");
	Composite CM = new Composite("China's Men Team");
	
	Composite GW = new Composite("Germany's Woman Team");
 	Composite GM = new Composite("Germany's Men Team");
 	
	Composite IW = new Composite("Italy's Woman Team");
	Composite IM = new Composite("Italy's Men Team");
	
	Olympic.addComponent(Asia);
	Olympic.addComponent(Europe);
	Olympic.addComponent(Africa);
	Olympic.addComponent(South_america);


}
