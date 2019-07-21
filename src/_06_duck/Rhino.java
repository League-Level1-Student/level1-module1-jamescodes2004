package _06_duck;

public class Rhino {
int numberOfKills;
String favoriteBush;
void charge() {
	System.out.println("Get out my way fooo");
}
void grumble() {
	System.out.println("Argggg");
}
Rhino(String favoriteBush, int numberOfKills){
	this.favoriteBush = favoriteBush;
	this.numberOfKills = numberOfKills;
}
}
