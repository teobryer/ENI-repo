package TP_rpg;

import java.util.*;
import java.util.concurrent.ExecutionException;

public class Partie {

    public static void main(String[] args) throws InterruptedException {
        GameCharacter gc1 = new GameCharacter("Player1", 100, 10, 10, 10);
        GameCharacter gc2 = new GameCharacter("Player2", 100, 10, 10, 10);
        GameCharacter gc3 = new GameCharacter("Player3", 15, 10, 10, 10);
        GameCharacter gc4 = new GameCharacter("Player4", 15, 10, 10, 10);

        ArrayList<GameCharacter> team1 = new ArrayList<GameCharacter>() {
            {
                add(gc1);
                add(gc2);

            } };
        ArrayList<GameCharacter> team2 = new ArrayList<GameCharacter>() {
            {

                add(gc3);
                add(gc4);
            } };

        TeamBattle team1B = new TeamBattle(team1, "ROUGE", false);
        TeamBattle team2B = new TeamBattle(team2, "JAUNE", true);

        team1B.addEnnemyTeam(team2B);
        team2B.addEnnemyTeam(team1B);

        team1B.afficherEquipe();
        team2B.afficherEquipe();

        List<GameCharacter> listTPT = ListeOrdonneeTourParTour(team2B, team1B);
        System.out.println("###############################"  +  " ORDRES DES TOURS DE JEU" + " ###############################");
        for (GameCharacter  c :listTPT) {
            System.out.println(c.afficherInfos() );       }

        StartGame(team1B, team2B, listTPT);

    }

    public static List<GameCharacter> ListeOrdonneeTourParTour(TeamBattle t1, TeamBattle t2) {
        int totalPlayers = t1.CountNbFighter() + t2.CountNbFighter();
        GameCharacter[] arrayTPT = new GameCharacter[totalPlayers];
        int cptteam1 = 0;
        int cptteam2 = 0;
        for (int i = 0; i < totalPlayers; i++) {
            if (i % 2 == 0) { /// si i est paire
                try {
                    arrayTPT[i] = t1.getFighterList(cptteam1);
                    cptteam1++;
                } catch (Exception e) {
                    arrayTPT[i] = t2.getFighterList(cptteam2);
                    cptteam2++;
                }
            } else {    ///  si i  est impaire

                try {
                    arrayTPT[i] = t2.getFighterList(cptteam2);
                    cptteam2++;
                } catch (Exception e) {
                    arrayTPT[i] = t1.getFighterList(cptteam1);
                    cptteam1++;
                }



            }
        }
        return Arrays.asList(arrayTPT);
    }

    public static void Loading(String message) throws InterruptedException {

        TimerTask repeatedTask = new TimerTask() {
            public void run() {
                System.out.print("-");
            }
        };
        Timer timer = new Timer("Timer");

        long delay  = 0;
        long period = 200;
        timer.scheduleAtFixedRate(repeatedTask, delay, period);

        Thread.sleep(1500);
        timer.cancel();
        System.out.println();
        System.out.println(message);
    }

    public static void StartGame(TeamBattle t1, TeamBattle t2, List<GameCharacter> listeOrdonnee) throws InterruptedException {
        Loading("Début du jeu");
        int cpt = 0;
        GameCharacter selectedEnemy = null;
        while(!t1.teamIsDead() && !t2.teamIsDead()){
            for (GameCharacter actualPlayer : listeOrdonnee){

                if(!actualPlayer.isAlive()){
                    Loading("Le tour de " + actualPlayer.getName() + " est passé car il n'a plus aucun HP");
                }
                else{
                    Loading("Au tour de " + actualPlayer.getName());

                    if(!actualPlayer.isBot()){
                        System.out.println("Qui voulez vous attaquer ? : ");
                        actualPlayer.getTeam().DisplayAllCharacterEnemies();

                        Scanner scanner = new Scanner( System.in );
                        int a = scanner.nextInt();
                        selectedEnemy = actualPlayer.getTeam().getAllCharacterEnnemies().get(a);





                    }
                    if( actualPlayer.isBot()){

                        int randomEnemy = (int) Math.random() * (  (actualPlayer.getTeam().getAllCharacterEnnemies().size()-1) - 0 );
                        selectedEnemy = actualPlayer.getTeam().getAllCharacterEnnemies().get(randomEnemy);
                    }
                    actualPlayer.attaquer(selectedEnemy);
                    System.out.println(actualPlayer.getName() + " a attaqué " + selectedEnemy.getName());
                    System.out.println("Points de vies de " + selectedEnemy.getName() + " : " +  selectedEnemy.getHp());

                    if (t1.teamIsDead() || t2.teamIsDead()) {
                        break;
                    }
                }

            }
        }
        Loading("VICTOIRE DE LA TEAM.....");
        System.out.println(((t1.teamIsDead()) ? t2.getName() : t1.getName()) );
    }

}

