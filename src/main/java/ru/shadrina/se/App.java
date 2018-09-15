package ru.shadrina.se;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Course c = new Course(); // Создаем полосу препятствий
        Team team = new Team(); // Создаем команду
        c.passCourse(team); // Просим команду пройти полосу
        team.getFinishedPrticipants();
    }
}