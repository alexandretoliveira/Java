package questions;

import java.util.*;

public class LogFile {

    public static void main(String[] args){
        LogFile logFile = new LogFile();
        logFile.Solution();

    }

    public void Solution(){

        List<String> logFile = Arrays.asList("zc1 1 2 3", "abc 3 4 2", "zd1 zb cd eg", "bc1 ab dd sa", "dc1 aa ss df", "ac1 aa ss df");

        List<String> lofOfNumber = new ArrayList<>();
        List<Line>   logOfStrings = new ArrayList<>();
        List<String> result = new ArrayList<>();
        for(String s : logFile){
            String id = s.substring(0, s.indexOf(" "));
            String log = s.substring(s.indexOf(" ")).trim();

            try{
                //string log
                Integer i = Integer.valueOf(log.substring(0, log.indexOf(" ")));
                lofOfNumber.add(s);

            }catch (NumberFormatException e){
                //not a number
                logOfStrings.add(new Line(id, log));
            }

        }
        Collections.sort(logOfStrings);

        for(Line s: logOfStrings){
            result.add(s.id + " " + s.log);
        }
        for(String s: lofOfNumber){
            result.add(s);
        }

        System.out.println(result);

    }

    class Line implements Comparable<Object>{

        String id;
        String log;

        public Line(String id, String log){
            this.id = id;
            this.log = log;
        }
        @Override
        public int compareTo(Object o) {
            if(((Line)o).log.compareTo(this.log) == 0){
                //in case of tie
                if(((Line)o).id.compareTo(this.id) > 0){
                    return -1;
                }
                else return 1;
            }
            if(((Line)o).log.compareTo(this.log) > 0)
                return -1;
            return 1;
        }

        public String toString(){
            return id + " " + log;
        }
    }
}
