/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Shagy
 */
public class MapClasses {

    //Creating map of Books    
    Map<Integer, Classes> map = new HashMap<Integer, Classes>();
    //Creating Books    
    Classes class1 = new Classes(101, "English", "Elementary", new Date(117, 5, 15), "12 Week");
    Classes class2 = new Classes(102, "English", "Beginer", new Date(117, 5, 15), "8 Week");
    Classes class3 = new Classes(103, "English", "Pre-Intermediate", new Date(117, 5, 15), "7 Week");
    Classes class4 = new Classes(104, "English", "Intermediate", new Date(117, 5, 15), "6 Week");
    Classes class5 = new Classes(105, "English", "Advanced", new Date(117, 5, 15), "4 Week");

    public void addClasses() {
        //Adding Books to map   
        map.put(1, class1);
        map.put(2, class2);
        map.put(3, class3);
        map.put(4, class4);
        map.put(5, class5);

        //Traversing map  
        for (Map.Entry<Integer, Classes> entry
                : map.entrySet()) {
            int key = entry.getKey();
            Classes cl = entry.getValue();
            System.out.println(key + " Details:");
            if(cl.getLevel().equals("Advanced")){
                Classes search = new Classes(map.get(key).getId(), map.get(key).getName(), 
                        map.get(key).getLevel(), map.get(key).getBeginDate(), map.get(key).getPeriod());
                System.out.println("model.MapClasses.addClasses()" + map.get(key).getLevel());
                System.out.println("model.MapClasses.addClasses()" + search);
            }
            System.out.println(cl.getId() + " " + cl.getName() + " " + cl.getLevel()
                    + " " + cl.getBeginDate() + " " + cl.getPeriod());
        }
    }

}
