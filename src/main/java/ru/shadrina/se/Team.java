package ru.shadrina.se;

public class Team {
    private String name;
    private String[] participants;

    public void team(String name, String member1, String member2, String member3, String member4) {
        this.name = name;
        this.participants = new String[]{member1, member2, member3, member4};
    }

    public String[] getParticipants() {
        return participants;
    }

    public String[] getFinishedPrticipants() {
        String[] finished = null;
        return finished;
    }

}
