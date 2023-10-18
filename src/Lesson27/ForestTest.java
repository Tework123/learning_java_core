package Lesson27;

import Lesson27.Forest.Squirell;
import Lesson27.Forest.Tree;

import java.util.Scanner;


public class ForestTest {
    private int id;

//    private - в пределах класса
//    default - в пределах пакета
//    protected - как default, но еще если класс наследуется от имеющего нужные методы
//    public - везде


    public static void main(String[] args) {
        Tree tree1 = new Tree();
        tree1.name = "baobab";

        Squirell squirt = new Squirell();
        Scanner sc = new Scanner(System.in);

    }


    private int getId() {

        return 1;
    }

}
