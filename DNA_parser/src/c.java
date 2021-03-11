/*Class Name: BIFS618 Fall2020
Homework Assignment4, Question1
File Name: c.java
Program Author: Yekaterina Unnikumaran
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class c {

static DNA[] dnaArray = new DNA[100];

public static void main(String[] args) {

readSequence();

//Prompting the user to enter the ID

Scanner scan = new Scanner(System.in);

boolean loop=true;

boolean found= false;

while(loop){

System.out.println("Please enter a sequence ID or Q to Quit");

String header = scan.nextLine();

if("Q".equalsIgnoreCase(header)){

loop = false;

}

else{

for(DNA dna : dnaArray){

if(null!=dna && header.equalsIgnoreCase(dna.getID())){

System.out.println("ID : "+dna.getID());

System.out.println("Sequence: "+dna.getSequence());

found =true;

break;

}

}

}

if(!found){

System.out.println("Not found!");

}

}

}

public static void readSequence(){

try{

BufferedReader readIn = new BufferedReader( new FileReader("dna.txt") );

String sb ="";

String line ="";

int counter =0;

String id ="";

boolean newFlag = false;

for(line = readIn.readLine().trim(); line != null; line = readIn.readLine() )

{

if( line.length()>0 && line.charAt( 0 ) == '>' )

{

if(counter>0){

DNA dna = new DNA(id, sb);

dnaArray[counter] =dna ;

sb ="";

}

int indexOfLast = line.indexOf("|");

id = line.substring(1,indexOfLast);

counter++;

} else {

sb = sb= sb+line;

}

}

DNA dna = new DNA(id, sb);

dnaArray[counter] =dna ;

}catch(IOException e)

{

System.out.println("Error when reading dna.txt");

e.printStackTrace();

}

}

}