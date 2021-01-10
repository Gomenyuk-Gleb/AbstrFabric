package fabrica.bankicng.impl;

import fabrica.bankicng.Developer;
import fabrica.bankicng.ProgectTeamFactory;
import fabrica.bankicng.Test;

public class BankingTeamFactory implements ProgectTeamFactory {

    @Override
    public Developer getDev() {
        return new JavaDev();
    }

    @Override
    public PM getPM() {
        return new PM();
    }

    @Override
    public Test getTest() {
        return new QATest();
    }
}
