package fabrica.bankicng;

public interface ProgectTeamFactory {
    Developer getDev();

    PM getPM();

    Test getTest();
}
