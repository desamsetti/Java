package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("Tim",500);
        //System.out.println("New score is "+newScore);
        //calculateScore(75);
        //calculateScore();

        //System.out.println(calcFeetAdnInchesToCentimeters(6,0));
        //System.out.println(calcFeetAdnInchesToCentimeters(100));
        //System.out.println(getDurationString(61,0));
        System.out.println(getDurationString(3600));
    }

    public static int calculateScore(String playerName,int score){
        System.out.println("Player "+playerName + "scored "+ score+ " points");
        return score*1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+ score+ " points");
        return score*1000;
    }
    public static int calculateScore(){
        System.out.println("No player name, no player score. ");
        return 0;
    }

    public static double calcFeetAdnInchesToCentimeters(double feet, double inches){
        double centimeter = 0d;
        if(feet>=0 && (inches>=0 && inches<=12)){
            //centimeter = feet*30.48 + inches*2.54;
            centimeter = (feet*12)*2.54;
            centimeter += inches*2.54;
            System.out.println(feet+ " Feet"+ inches +" inches = "+ centimeter +" cm");
        }
        else{
            return -1;
        }
        return centimeter;
    }

    public static double calcFeetAdnInchesToCentimeters(int inches){
        double centimeter = 0d;
        double feet = 0d;

        if( inches>=0){
            feet = (int)inches/12;
            double remainingInches = (int)inches%12;
            System.out.println(inches + " inches is equal to "+feet+" feet and "+remainingInches+" inches");
            return calcFeetAdnInchesToCentimeters(feet,remainingInches);
        }
        else{
            return -1;
        }
    }

    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 || (seconds<0 || seconds>59)){
            return "Invalid Value";
        }else{
            String hoursString = "";
            String minutesString = "";
            String secondsString = "";
            String s ="";
            if(minutes>=60){
                int hours = minutes/60+seconds/3600;
                if(hours<10){
                    hoursString = "0"+hours+"h ";
                }
                else{
                    hoursString = hours+"h";
                }
                int remainingMinutes = minutes%60;
                if(remainingMinutes<10){
                    minutesString = "0"+remainingMinutes+"m ";
                }else{
                    minutesString = remainingMinutes+"m ";
                }
                int remainingSeconds = seconds%60;
                if(remainingSeconds<10){
                    secondsString = "0"+remainingSeconds+"s";
                }else{
                    secondsString = remainingSeconds+"s";
                }
                s = hoursString+minutesString+secondsString;
            }
            return s;
        }
    }


    public static String getDurationString(int seconds){
        if(seconds<0){
            return "Invalid value";
        }
        else{
            int minutes = seconds/60;
            int remainingSeconds = (int)seconds%60;
            return getDurationString(minutes,remainingSeconds);

        }

    }


}