package com.frank.employeeregistrationproject.bootstrap;

import java.util.Arrays;
import java.util.List;

public class DataGenerator {

    public static List<String> getAllStates(){
        List<String> stateList = Arrays.asList("ON", "BC", "MB", "NW", "SC", "YK", "NF");
        return stateList;
    }
}
