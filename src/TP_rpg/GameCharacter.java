package TP_rpg;

public class GameCharacter {
    private String name;
    private int hp;
    private int mp;
    private int def; // % de réduction de l'attaque ( 0% = entierté des dégats subits |  100% = aucun dégats subits )
    private int atk;
    private boolean alive;
    private boolean isBot;
    private TeamBattle team;

    public TeamBattle getTeam() {
        return team;
    }

    public void setTeam(TeamBattle team) {
        this.team = team;
    }

    public boolean isBot() {
        return isBot;
    }

    public void setBot(boolean bot) {
        isBot = bot;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public GameCharacter(String name, int hp, int mp, int def, int atk) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.def = def;
        this.atk = atk;
        this.alive = true;
        this.isBot = false;
    }

    public String getName() {
        return name;
    }

    public void looseHp(int dmg){
        this.hp -= dmg * ( (100-def)/100.0);
        if (hp <= 0){
            this.hp = 0 ;
            this.onDead();
            this.alive = false;
            this.getTeam().getAliveFighterList().remove(this);
        }

    }
    public void attaquer(GameCharacter player){
        player.looseHp(atk);
    }

    public void onDead(){
        System.out.println("C'est la mort du joueur français : " + this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String afficherInfos(){
        return "NAME : " + name + " HP : " + hp + " DEF : " + def + "% MP : " + mp + " ATK : " + atk +  " En vie : "
                + ((alive) ? "Oui" : "Non" ) + " BOT : " +   ((isBot) ? "Oui" : "Non" );
    }

    @Override
    public String toString() {
        return afficherInfos();
    }
}
