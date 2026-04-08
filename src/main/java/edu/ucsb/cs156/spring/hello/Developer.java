package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Hrithik";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "Hrithik-M";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("s26-03");
        team.addMember("Kalyan");
        team.addMember("Brian L.");
        team.addMember("Hrithik");
        team.addMember("Raymond Xie");
        team.addMember("Alexandru");
        team.addMember("Alex L.");
        return team;
    }
}
