package com.company.towerofhanoi;

public class TowerOfHanoiTest {


    private static void tower(int size,String source_tower,String destination_tower, String aux_tower){
        if(size==1){
            System.out.println("Plates Move 1 From Source "+source_tower+" To Destination "+destination_tower);
            return;
        }
        tower(size-1,source_tower,aux_tower,destination_tower);
        System.out.println("Plates Move "+ size +" From Source "+source_tower+" To Destination "+destination_tower);
        tower(size-1,aux_tower,destination_tower,source_tower);
    }


    public static void main(String[] args) {
       int size =3;
       tower(3,"A","C","B");
    }
}
