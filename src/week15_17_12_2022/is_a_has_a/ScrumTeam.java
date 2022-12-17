package week15_17_12_2022.is_a_has_a;

public class ScrumTeam {
    //we have tester
    // we have developer

    // Scrum team has a tester
    Tester tester;
    // Scrum team has a developer
    Developer developer;

    public ScrumTeam(Tester tester, Developer developer) {
        this.tester = tester;
        this.developer = developer;
    }
}
