package day28.baseball.controller;

public interface Program {
	void printMenu();
	void run();
	void runMenu(int menu);
	void save(String fileName);
	void load(String fileName);
}
