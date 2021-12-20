// Player Class
// Carrigan Holt

public class Player {

    String id; // Identifier
    String fName; // First Name
    String lName; // Last name
    String pos1; // Primary Position
    String pos2; // Secondary Position
    double age; // Age
    String team; // Team
    double games; // Games Played
    double gamesStarted; // Games Started
    double minutesPlayed; // Minutes Played
    double fgm; // Field Goals Made
    double fga; // Field Goals Attempted
    double fgp; // Field Goal Percentage
    double threepa; // 3-Pointers Attempted
    double threepm; // 3-Pointers Made
    double threepp; // 3-Point Percentage
    double twopm; // 2-Pointers Made
    double twopa; // 2-Pointers Attempted
    double twopp; // 2-Point Percentage
    double ftm; // Free Throws Made
    double fta; // Free Throws Attempted
    double ftp; // Free Throw Percentage
    double orb; // Offensive Rebounds
    double drb; // Defensive Rebounds
    double trb; // Total Rebounds
    double ast; // Assists
    double stl; // Steals
    double blk; // Blocks
    double tov; // Turnovers
    double pf; // Personal Fouls
    double pts; // Points
    double ortg; // Offensive Rating
    double drtg; // Defensive Ratings
    double per; // Player Efficiency Rating
    double tsp; // True Shooting Percentage
    double threepar; // 3-Point Attempt Rate
    double ftr; // Free Throw rate
    double orbp; // Offensive Rebound Percentage
    double drbp; // Defensive Rebound Percentage
    double trbp; // Total Rebound Percentage
    double astp; // Assist Percentage
    double stlp; // Steal Percentage
    double blkp; // Block Percentage
    double tovp; // Turnover Percentage
    double usg; // Usage Rate
    double ows; // Offensive Win Shares
    double dws; // Defensive Win Shares
    double tws; // Total Win Shares
    double wsp; // Win Shares Per 48 Minutes
    double obpm; // Offensive Box Plus/Minus
    double dbpm; // Defensive Box Plus/Minus
    double bpm; // Box Plus/Minus
    double vorp; // Value Over Replacement
    double salary; // Salary

    Player(String id, String fName, String lName, String pos1, String pos2, double age, String team, double games, double gamesStarted, double minutesPlayed, double fgm, double fga, double fgp, double threepm, double threepa, double threepp, double twopm, double twopa, double twopp, double ftm, double fta, double ftp, double orb, double drb, double trb, double ast, double stl, double blk, double tov, double pf, double pts, double ortg, double drtg, double per, double tsp, double threepar, double ftr, double orbp, double drdp, double trdp, double astp, double stlp, double blkp, double tovp, double usg, double ows, double dws, double tws, double wsp, double obpm, double dbpm, double bpm, double vorp, double salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.pos1 = pos1;
        this.pos2 = pos2;
        this.age = age;
        this.team = team;
        this.games = games;
        this.gamesStarted = gamesStarted;
        this.minutesPlayed = minutesPlayed;
        this.fgm = fgm;
        this.fga = fga;
        this.fgp = fgp;
        this.threepm = threepm;
        this.threepa = threepa;
        this.threepp = threepp;
        this.twopm = twopm;
        this.twopa = twopa;
        this.twopp = twopp;
        this.ftm = ftm;
        this.fta = fta;
        this.ftp = ftp;
        this.orb = orb;
        this.drb = drb;
        this.trb = trb;
        this.ast = ast;
        this.stl = stl;
        this.blk = blk;
        this.tov = tov;
        this.pf = pf;
        this.pts = pts;
        this.ortg = ortg;
        this.drtg = drtg;
        this.per = per;
        this.tsp = tsp;
        this.threepar = threepar;
        this.ftr = ftr;
        this.orbp = orbp;
        this.drbp = drbp;
        this.trbp = trbp;
        this.astp = astp;
        this.stlp = stlp;
        this.blkp = blkp;
        this.tovp = tovp;
        this.usg = usg;
        this.ows = ows;
        this.dws = dws;
        this.tws = tws;
        this.wsp = wsp;
        this.obpm = obpm;
        this.dbpm = dbpm;
        this.bpm = bpm;
        this.vorp = vorp;
        this.salary = salary;
    }
}  