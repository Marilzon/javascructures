package com.datastructuries;

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
    }

    public String[] elements;
    public int sizeOfVector;

    public CreateVector(int size) {
        this.elements = new String[size];
        this.sizeOfVector = 0;
    }

    public void AddValueInVector(String element) {
        if (this.sizeOfVector < this.elements.length) {
            this.elements[this.sizeOfVector] = element;
            this.sizeOfVector++;
        } else {
            System.out.printf("This %s should not add in vector, vector has been full! %n", element);
        }
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(elements);
    }
}
