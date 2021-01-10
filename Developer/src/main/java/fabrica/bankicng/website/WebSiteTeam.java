package fabrica.bankicng.website;

import fabrica.bankicng.Developer;
import fabrica.bankicng.PM;
import fabrica.bankicng.ProgectTeamFactory;
import fabrica.bankicng.Test;

public class WebSiteTeam implements ProgectTeamFactory {

    @Override
    public Developer getDev() {
        return new PhPDev();
    }

    @Override
    public PM getPM() {
        return new fabrica.bankicng.website.PM();
    }

    @Override
    public Test getTest() {
        return new QATest();
    }
}
