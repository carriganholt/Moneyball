import java.io.File;
import java.util.*;

public class Main {

    private static final double SALARY_WEIGHT = -0.0000001;
    private static final double FIRST_WEIGHT = 0.6;
    private static final double SECOND_WEIGHT = 0.3;
    private static final double THIRD_WEIGHT = 0.7;
    private static final double FOURTH_WEIGHT = 0.2;

    public static void main(String[] args) {

        //Creates All Players
        ArrayList<Player> players = loadPlayers();

        Player p;
        Player[] choices = new Player[20];

        Team team = new Team();
        while(!team.isFull()){
            for(int i = 0; i < choices.length; i++){
                choices[i] = players.get((int) (Math.random() * players.size()));
            }

            p = choices[0];
            while(team.isOnTeam(p)){
                p = players.get((int) (Math.random() * players.size()));
            }

            for(int i = 1; i < choices.length; i++){
                if(getScore(p) < getScore(choices[i]) && !team.isOnTeam(choices[i])) p = choices[i];
            }
            System.out.println();

            if(team == null) team.player1 = p;
            else if(team.player1 == null) team.player1 = p;
            else if(team.player2 == null) team.player2 = p;
            else if(team.player3 == null) team.player3 = p;
            else if(team.player4 == null) team.player4 = p;
            else if(team.player5 == null) team.player5 = p;
            else if(team.player6 == null) team.player6 = p;
            else if(team.player7 == null) team.player7 = p;
            else if(team.player8 == null) team.player8 = p;
            else if(team.player9 == null) team.player9 = p;
            else if(team.player10 == null) team.player10 = p;
        }

        team.print();

    }

    //Generates a score based on weights
    public static double getScore(Player p){
        return p.salary * SALARY_WEIGHT + p.threepm * FIRST_WEIGHT + p.twopm * SECOND_WEIGHT + p.pts * THIRD_WEIGHT + p.ftm * FOURTH_WEIGHT;
    }

    //Loads the players into an arraylist
    public static ArrayList<Player> loadPlayers() {

        ArrayList<Player> list = new ArrayList<>();

        try {
            Scanner file = new Scanner(new File("2020_Stats.csv"));
            String player;
            String info[];
            file.nextLine();

            while(file.hasNextLine()) {
                player = file.nextLine();
                info = player.split(",");
                list.add(new Player(info[0], info[1], info[2], info[3], info[4], Double.valueOf(info[5]), info[6], Double.valueOf(info[7]), Double.valueOf(info[8]), Double.valueOf(info[9]), Double.valueOf(info[10]), Double.valueOf(info[11]), Double.valueOf(info[12]), Double.valueOf(info[13]), Double.valueOf(info[14]), Double.valueOf(info[15]), Double.valueOf(info[16]), Double.valueOf(info[17]), Double.valueOf(info[18]), Double.valueOf(info[19]), Double.valueOf(info[20]), Double.valueOf(info[21]), Double.valueOf(info[22]), Double.valueOf(info[23]), Double.valueOf(info[24]), Double.valueOf(info[25]), Double.valueOf(info[26]), Double.valueOf(info[27]), Double.valueOf(info[28]), Double.valueOf(info[29]), Double.valueOf(info[30]), Double.valueOf(info[31]), Double.valueOf(info[32]), Double.valueOf(info[33]), Double.valueOf(info[34]), Double.valueOf(info[35]), Double.valueOf(info[36]), Double.valueOf(info[37]), Double.valueOf(info[38]), Double.valueOf(info[39]), Double.valueOf(info[40]), Double.valueOf(info[41]), Double.valueOf(info[42]), Double.valueOf(info[43]), Double.valueOf(info[44]), Double.valueOf(info[45]), Double.valueOf(info[46]), Double.valueOf(info[47]), Double.valueOf(info[48]), Double.valueOf(info[49]), Double.valueOf(info[50]), Double.valueOf(info[51]), Double.valueOf(info[52]), Double.valueOf(info[53])));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }

        return list;
    }

    // FIX AMOUNT OF PLAYERS
    // 9-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8, Player p9) {
        Team team = new Team(p1, p2, p3, p4, p5, p6, p7, p8, p9);

        return null;
    }

    // 8-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8) {
        Team team = new Team(p1, p2, p3, p4, p5, p6, p7, p8);

        return null;
    }

    // 7-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7) {
        Team team = new Team(p1, p2, p3, p4, p5, p6, p7);

        return null;
    }

    // 6-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6) {
        Team team = new Team(p1, p2, p3, p4, p5, p6);

        return null;
    }

    // 5-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3, Player p4, Player p5) {
        Team team = new Team(p1, p2, p3, p4, p5);

        return null;
    }

    // 4-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3, Player p4) {
        Team team = new Team(p1, p2, p3, p4);

        return null;
    }

    // 3-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2, Player p3) {
        Team team = new Team(p1, p2, p3);

        return null;
    }

    // 2-Player Team Finder Function
    public static Team findPlayers(Player p1, Player p2) {
        Team team = new Team(p1, p2);

        return null;
    }

    // 1-Player Team Finder Function
    public static Team findPlayers(Player p1) {
        Team team = new Team(p1);

        return null;
    }


}
