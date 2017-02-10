package com.jrforman;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jason on 8/2/2016.
 */
public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")){
            System.out.println("Java already exists");
        }else   {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Java", "a compiled high level, object-oriented, platform independent language");
        languages.put("Python", "an interpreted, object-oriented, high-level programming language with dynamic semantics");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC", "Beginners All Purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));

        if(languages.containsKey("Java")){
            System.out.println("java is already in the map");
        }else{
            languages.put("Java", "This course is about Java");
        }

        System.out.println("=====================================================");

 //       languages.remove("Lisp");
        if(languages.remove("Algol", "an algorithmic language")){
            System.out.println("Algol removed");
        }else{
            System.out.println("Algol not removed, key/value pair not found");
        }

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        }else{
            System.out.println("Lisp not replaced");
        }
        System.out.println(languages.replace("Scala", "this language does not exist"));

        for(String key: languages.keySet()){
            System.out.println(key + " : " + languages.get(key));
        }

    }
}
