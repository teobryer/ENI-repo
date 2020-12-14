package TP_rpg;

import java.util.ArrayList;

public class TeamBattle {

    private String name;
    private  ArrayList<GameCharacter> fighterList;
    private  ArrayList<GameCharacter> aliveFighterList;
    private ArrayList<TeamBattle> enemyTeamList;

    public void addEnnemyTeam(TeamBattle tm){
        enemyTeamList.add(tm) ; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<GameCharacter> getFighterList() {
        return fighterList;
    }

    public GameCharacter getFighterList(int index) {
        return this.fighterList.get(index);
    }

    public ArrayList<TeamBattle> getEnemyTeamList() {
        return enemyTeamList;
    }



    public ArrayList<GameCharacter> getAllCharacterEnnemies(){
     ArrayList<GameCharacter> allCharactersEnemy =  new ArrayList<GameCharacter>();
        for ( TeamBattle t :  this.enemyTeamList){
            for ( GameCharacter g : t.getAliveFighterList()){
                allCharactersEnemy.add(g);
            }
        }
        return  allCharactersEnemy;
    }

    public void DisplayAllCharacterEnemies(){
        int cpt = 0;
        for ( GameCharacter g : getAllCharacterEnnemies()){
            System.out.println(cpt + ": " + g.getName());
            cpt++;
        }
    }

    public void setEnemyTeamList(ArrayList<TeamBattle> enemyTeamList) {
        this.enemyTeamList = enemyTeamList;
    }

    public TeamBattle(ArrayList<GameCharacter> fighterList, String name, boolean isTeamBot) {
        this.fighterList = fighterList;
        this.aliveFighterList =  fighterList;
        this.name = name;
        this.enemyTeamList = new ArrayList<TeamBattle>();

            for ( GameCharacter g : fighterList) {
                g.setTeam(this);
                if (isTeamBot){
                g.setBot(true);}

            }

    }

    public GameCharacter getFighterList(int index, boolean  aliveOnly) {
        if( aliveOnly ){
            return this.aliveFighterList.get(index);
        }
        else{
            return this.fighterList.get(index);
        }
    }

    public int CountNbFighter(){
        return fighterList.size();
    }

    public int CountNbAliveFighter(){
        return aliveFighterList.size();
    }

    public void setFighterList(ArrayList<GameCharacter> fighterList) {
        this.fighterList = fighterList;
    }

    public boolean teamIsDead(){
        return (aliveFighterList.stream().count() == 0);
    }
    public ArrayList<GameCharacter> getAliveFighterList() {
        return aliveFighterList;
    }

    public void setAliveFighterList(ArrayList<GameCharacter> aliveFighterList) {
        this.aliveFighterList = aliveFighterList;
    }

    public void afficherEquipe(){
        System.out.println("###############################"  +  " TEAM " + this.name + " ###############################");
        for (GameCharacter gm : fighterList)
             {
                 System.out.println(gm);
              }
        System.out.println("###############################"  +  " TEAM " + this.name + " ###############################");

    }
}
