package pckg_zd4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Robot flyingRobot = new Robot(1,"flyingR");
        Robot cleaningRobot = new Robot(2, "cleaningR");
        Robot thinkingRobot = new Robot(3, "thinkingR");
        Robot humorousRobot = new Robot(4, "humorousR");
        Robot friendlyRobot = new Robot(5, "friendlyR");
        Robot weirdRobot = new Robot(6, "weirdR");

        Set<Robot> robotSet = new LinkedHashSet<>();
        Map<Robot, Integer> robotMap = new LinkedHashMap<>();

        robotSet.add(flyingRobot);
        robotSet.add(cleaningRobot);
        robotSet.add(thinkingRobot);
        robotSet.add(humorousRobot);
        robotSet.add(friendlyRobot);
        robotSet.add(weirdRobot);
        robotSet.add(friendlyRobot);


        robotMap.put(flyingRobot, 100);
        robotMap.put(cleaningRobot, 200);
        robotMap.put(thinkingRobot, 300);
        robotMap.put(humorousRobot, 400);
        robotMap.put(friendlyRobot, 500);
        robotMap.put(weirdRobot, 600);
        robotMap.put(friendlyRobot, 700);



        System.out.println("********** SET **********");
        for (Robot robot : robotSet){
            System.out.println(robot);
        }
        System.out.println("\n********* MAP *********");
        for (Map.Entry<Robot, Integer> entry : robotMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


    }
}
