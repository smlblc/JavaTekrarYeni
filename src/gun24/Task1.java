package gun24;

import java.util.HashSet;

public class Task1 {
    // create two set of member names, with duplicates
    //ex: team A: Dauke, Adilkhan, Shingis, Kuanish, Max
    //    team B: Ice, Max, Aydin, Damir, Shingis, Kuanish
    public static void main(String[] args) {
        HashSet<String> devs = new HashSet<>();
        fillSet(devs, new String[]{"Dauke", "Adilkhan", "John", "Alice", "Max"});

        HashSet<String> testers = new HashSet<>();
        fillSet(testers, new String[]{"Ice", "Max", "Aydin", "Damir", "John", "Alice"});

        int totalMembers = totalMembers(devs, testers).size();

        HashSet<String> multiFunctionalMembers = devsAndTesters(devs, testers);

        HashSet<String> singleTeamMembers = singleTeamMembers(devs, testers);

    }

    public static void fillSet(HashSet<String> team, String[] names) {
        for(String name : names) {
            team.add(name);
        }
    }

    // create method to find how many members we have in total
    public static HashSet<String> totalMembers(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> allMembers = new HashSet<>();
        allMembers.addAll(teamA);
        allMembers.addAll(teamB);

        return allMembers;
    }

    // create method to find who is working in two teams
    public static HashSet<String> devsAndTesters(HashSet<String> teamA, HashSet<String> teamB) {
        HashSet<String> result = new HashSet<>();
        result.addAll(teamA);
        result.retainAll(teamB);

        return result;
    }

    // create method to find who are assigned to only one team
    public static HashSet<String> singleTeamMembers(HashSet<String> teamA, HashSet<String> teamB) {
        //step 1. get all members
        HashSet<String> all = totalMembers(teamA, teamB);

        //step 2. get common members in two teams, or multiFunctionalMembers
        HashSet<String> common = devsAndTesters(teamA, teamB);

        //step 3. remove common members from all, this will give you singleTeam member
        all.removeAll(common);

        HashSet<String> singleTeamMembers = all;

        return singleTeamMembers;
    }

}
