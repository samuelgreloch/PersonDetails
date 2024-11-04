package com.zipcodewilmington;

import org.w3c.dom.css.Counter;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...

    public String whileLoop() {


        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            String currentPerson = "";
            currentPerson = personArray[counter].toString();
            result = result.concat(currentPerson);
            counter++;

        }


    // create a `counter`
    // while `counter` is less than length of array
    // begin loop
        /*int counter = 0;
        for (int i=0;i<5;i++);
        counter = counter +1;
        while (counter < personArray.length)*/
    // use `counter` to identify the `current Person` in the array
    // get `string Representation` of `currentPerson`
    // append `stringRepresentation` to `result` variable

    // end loop
        return result;
}



    public String forLoop() {

        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            String currentPerson = "";
            currentPerson = personArray[counter].toString();
            result = result.concat(currentPerson);
            counter++;
//for (int=0; i < personArray.length;i++ {
           // String current = personArray[i]

        }
        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {


        String result = "";
        int counter = 0;
        while (counter < personArray.length) {
            String currentPerson = "";
            currentPerson = personArray[counter].toString();
            result = result.concat(currentPerson);
            counter++;
        }
        // identify array's type
        // identify array's variable-name
     //for (Person person: personArray){
       //  String current = "";
         //current = person.toString();
         //result = result.concat(current);
     //}
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
