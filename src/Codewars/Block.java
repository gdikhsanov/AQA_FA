package Codewars;

import java.lang.reflect.Array;

public class Block {

    private int width;
    private int length;
    private int height;

    //private int[] block = {width, length, height};


    Block(int[] arr){

        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }
    public int getHeight() {
        return height;
    }
    public int getVolume() {
        return height * width * length;
    }
    public int getSurfaceArea() {
        return (height * length + height * width + width * length) * 2;
    }

    public static void main(String[] args) {

        Block b = new Block(new int[]{2,4,6});

        System.out.println(b.getWidth()); // -> 2

        System.out.println(b.getLength()); // -> 4

        System.out.println(b.getHeight()); // -> 6

        System.out.println(b.getVolume()); // -> 48

        System.out.println(b.getSurfaceArea()); // -> 88
    }


}

