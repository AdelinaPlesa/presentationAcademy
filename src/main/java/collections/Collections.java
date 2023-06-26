package collections;

import java.util.*;

public class Collections {

    public static void arrayListMethod() {
        ArrayList<String> listOfObjects = new ArrayList<String>();

        listOfObjects.add("chair");
        listOfObjects.add("TV");
        listOfObjects.add("table");

        //print the list of objects
        System.out.println(listOfObjects);

        //print each object from list
        for (String object : listOfObjects) {
            System.out.println("object: " + object);
        }

        //add an object on a specific position
        listOfObjects.add(1, "fridge");
        System.out.println(listOfObjects);

        //set an object on a specific position
        listOfObjects.set(2, "furniture");
        System.out.println(listOfObjects);

        //get an object from a specific position
        System.out.println(listOfObjects.get(3));

        //remove an object from a specific position
        listOfObjects.remove(3);
        System.out.println(listOfObjects);

        //print size of list
        System.out.println(listOfObjects.size());

        //clear list
        listOfObjects.clear();
        System.out.println(listOfObjects);
    }

    public static void setMethod() {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(32);
        numbers.add(4354);
        numbers.add(43);
        numbers.add(32);
        numbers.add(563);

        //print set
        System.out.println(numbers);

        //print set using for
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //search for a value in set
        if (numbers.contains(4354)) {
            System.out.println("The number 4354 is present in set");
        } else {
            System.out.println("The number 4354 is not part of the set");
        }

        //print size of set
        System.out.println(numbers.size());
    }
    public static void mapMethod() {
        Map<String, Integer> person = new HashMap<String, Integer>();

        person.put("Adelina", 3);
        person.put("Ion", 12);
        person.put("Maria", 0);

        //print map
        System.out.println(person);

        //print map using for
        for (Map.Entry m : person.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //search for an object in map
        if (person.containsKey("Adelina")) {
            System.out.println("Hello!");
        } else {
            System.out.println("There is no such a key in this map");
        }

        //get a value based on key
        System.out.println(person.get("Ion"));

        //verify if the map contains values
        if (person.isEmpty()) {
            System.out.println("The map is empty");
        } else {
            System.out.println("The map contains values");
        }

        //print size of map
        System.out.println(person.size());
    }

    public static void main(String[] args) {
//        arrayListMethod();
//        setMethod();
        mapMethod();
    }

}
