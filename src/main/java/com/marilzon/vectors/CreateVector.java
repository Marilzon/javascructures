package com.marilzon.vectors;

import java.util.Arrays;

/**
 *
 * @author marilzon
 */
public class CreateVector {

    public static void main(String[] args) throws Exception {
        CreateVector myVector = new CreateVector(3);

        try {
            myVector.AddValueInVector("marilzon");
            myVector.AddValueInVector("de");
            myVector.AddValueInVector("sousa");

        } catch (Exception e) {
            throw new Exception("Internal Exception error! ", e);
        }

        System.out.println(myVector);
        System.out.println(myVector.SizeOfThis());

        System.out.println(myVector.getVectorValue(0));
        System.out.println(myVector.getVectorValue(1));
        System.out.println(myVector.getVectorValue(2));
        
        System.out.println(myVector.IndexOfInVector("marilzon"));
        System.out.println(myVector.IndexOfInVector("de"));
        System.out.println(myVector.IndexOfInVector("s"));
    }

    public String[] elements;
    public int sizeOfVector;

    public CreateVector(int size) {
        this.elements = new String[size];
        this.sizeOfVector = 0;
    }

    public void AddValueInVector(String element) {
        if (element == null) {
            return;
        }

        if (this.sizeOfVector < this.elements.length) {
            this.elements[this.sizeOfVector] = element;
            this.sizeOfVector++;
        } else {
            System.out.printf("This %s should not add in vector, vector has been full! %n", element);
        }
    }

    public int SizeOfThis() {
        return this.sizeOfVector;
    }

    public String getVectorValue(int index) {
        
        if (index < 0 || index >= sizeOfVector) {
            throw new IllegalArgumentException("This index does not exists!");
        }
        return (index + ": " + elements[index]);
    }
    
    public int IndexOfInVector(String element) {
        for (int i = 0; i < this.sizeOfVector; i++) {
            if (this.elements[i].equalsIgnoreCase(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
