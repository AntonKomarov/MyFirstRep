package com.epam.collection.map;

import java.util.EnumMap;

enum GasStation{
    DT(50),
    A80(30),
    A92(30),
    A95(50),
    GAS(40);

    private Integer maxVolume;
    private GasStation(int maxVolume){
        this.maxVolume = maxVolume;
    }
    public Integer getMaxVolume(){
        return maxVolume;
    }
}
public class Gases {
    public static void main(String[] args) {
        EnumMap<GasStation, Integer> station1 = new EnumMap<GasStation, Integer>(GasStation.class);
        station1.put(GasStation.A80, 10);
        station1.put(GasStation.A92, 5);
        station1.put(GasStation.A95, 7);

        EnumMap<GasStation, Integer> station2 = new EnumMap<GasStation, Integer>(GasStation.class);
        station2.put(GasStation.DT, 19);
        station2.put(GasStation.GAS, 4);

        System.out.println(station1);
        System.out.println(station2);
    }
}
