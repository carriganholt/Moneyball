// Team Class
// Carrigan Holt

public class Team {

    Player player1;
    Player player2;
    Player player3;
    Player player4;
    Player player5;
    Player player6;
    Player player7;
    Player player8;
    Player player9;
    Player player10;

    // 9-Player Team Constructor
    Team(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8, Player p9) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        this.player5 = p5;
        this.player6 = p6;
        this.player7 = p7;
        this.player8 = p8;
        this.player9 = p9;
        this.player10 = null;
    }

    // 8-Player Team Constructor
    Team(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        this.player5 = p5;
        this.player6 = p6;
        this.player7 = p7;
        this.player8 = p8;
        this.player9 = null;
        this.player10 = null;
    }

    // 7-Player Team Constructor
    Team(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        this.player5 = p5;
        this.player6 = p6;
        this.player7 = p7;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 6-Player Team Constructor
    Team(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        this.player5 = p5;
        this.player6 = p6;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 5-Player Team Constructor
    Team(Player p1, Player p2, Player p3, Player p4, Player p5) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        this.player5 = p5;
        this.player6 = null;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 4-Player Team Constructor
    Team(Player p1, Player p2, Player p3, Player p4) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = p4;
        this.player5 = null;
        this.player6 = null;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 3-Player Team Constructor
    Team(Player p1, Player p2, Player p3) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = p3;
        this.player4 = null;
        this.player5 = null;
        this.player6 = null;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 2-Player Team Constructor
    Team(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
        this.player3 = null;
        this.player4 = null;
        this.player5 = null;
        this.player6 = null;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 1-Player Team Constructor
    Team(Player p1) {
        this.player1 = p1;
        this.player2 = null;
        this.player3 = null;
        this.player4 = null;
        this.player5 = null;
        this.player6 = null;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    // 1-Player Team Constructor
    Team() {
        this.player1 = null;
        this.player2 = null;
        this.player3 = null;
        this.player4 = null;
        this.player5 = null;
        this.player6 = null;
        this.player7 = null;
        this.player8 = null;
        this.player9 = null;
        this.player10 = null;
    }

    //Checks to see if the team is full
    public boolean isFull(){
        if(player1 == null || player2 == null || player3 == null || player4 == null || player5 == null || player6 == null || player7 == null || player9 == null || player10 == null) return false;
        else return true;

    }

    //Prints the team
    public void print(){
        System.out.println("1. " + player1.fName + " " + player1.lName + " 2. " + player2.fName + " " + player2.lName + " 3. " + player3.fName + " " + player3.lName + " 4. " + player4.fName + " " + player4.lName +
                            " 5. " + player5.fName + " " + player5.lName + " 6. " + player6.fName + " " + player6.lName + " 7. " + player7.fName + " " + player7.lName + " 8. " + player8.fName + " " + player8.lName +
                            " 9. " + player9.fName + " " + player9.lName + " 10. " + player10.fName + " " + player10.lName);
    }

    //Checks to see if a given player is already on the team
    public boolean isOnTeam(Player p){
        if(player1 != null) if(p.id == player1.id) return true;
        if(player2 != null) if(p.id == player2.id) return true;
        if(player3 != null) if(p.id == player3.id) return true;
        if(player4 != null) if(p.id == player4.id) return true;
        if(player5 != null) if(p.id == player5.id) return true;
        if(player6 != null) if(p.id == player6.id) return true;
        if(player7 != null) if(p.id == player7.id) return true;
        if(player8 != null) if(p.id == player8.id) return true;
        if(player9 != null) if(p.id == player9.id) return true;
        if(player10 != null) if(p.id == player10.id) return true;
        return false;
    }
}