/*Class Name: BIFS618 Fall2020
Homework Assignment4, Question1
File Name: DNA.java
Program Author: Yekaterina Unnikumaran
*/

import javax.lang.model.SourceVersion;

public class DNA {

private String ID;

private String sequence;

//Constructor

public DNA(String id,String sequence){

this.ID = id;

this.sequence =sequence;

}

//Getters and Setters

public String getID() {

return ID;

}

public void setID(String iD) {

ID = iD;

}

public String getSequence() {

return sequence;

}

public void setSequence(String sequence) {

this.sequence = sequence;

}

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}