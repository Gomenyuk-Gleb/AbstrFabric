package fabrica.bankicng;

import fabrica.bankicng.website.WebSiteTeam;

public class SuperBank {
    public static void main(String[] args) {
        ProgectTeamFactory progectTeamFactory = new WebSiteTeam();
        progectTeamFactory.getDev().writeCode();
    }
}
