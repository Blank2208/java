package A02;

import java.util.ArrayList;

public class Stopwatch {
    float referenceTime;  // currentTime = Referenzzeit (aktuelle Zeit)
    ArrayList<Float> internList;

    public Stopwatch(){
        this.referenceTime = System.currentTimeMillis();    // Setzt bei Initialisierung den Wert direkt auf aktuelle ms
        this.internList =  new ArrayList<>();   // <> Zeigt, dass es eine generische Liste ist (also Platzhalter)
    }

    // Methoden fur Aufgabe 1b

    public float elapsedTime(){
        float currentTime = System.currentTimeMillis();
        return currentTime - referenceTime;
    }

    public void trackTime(){
        internList.add(elapsedTime());
    }


    public void reset(){
        this.referenceTime = System.currentTimeMillis();
    }


    public float averageTime(){
        if(this.internList.isEmpty()){
            throw new RuntimeException("List is empty");
        }

        float averageTime = 0;

        for(float times : this.internList){
            averageTime += times;    // Rechne aktuelle Zeit + bereits vorhandene averageTime
          }
        averageTime = averageTime / this.internList.size();

        return averageTime;
    }


    public float totalTime(){
        if(this.internList.isEmpty()){
            throw new RuntimeException("List is empty");
        }

        float totalTime = 0;

        for(float times : this.internList){
            totalTime += times;
        }

        return totalTime;
    }

}
