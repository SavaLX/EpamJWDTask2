package com.epam.task2.entity;

/** Interface that is a text unit and defines common behavior for all types of text units*/
public interface TextElement {

    /** A method that is specific to any kind of text
     * unit and which returns the value of the text unit
     * @return the value of any kind of text unit
     * */
    StringBuilder getValue();
}
