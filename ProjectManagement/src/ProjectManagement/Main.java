/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectManagement;

/**
 *
 * @author Faishal Raihan
 */
public class Main {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("Faishal",10000," Web developer");
        Programmer p2 = new Programmer("Adhit",20000," Web developer");
        ManajerProyek m1 = new ManajerProyek("Ucok",300000,"pokew");
        ManajerProyek m2 = new ManajerProyek("Amir",400000,"dokew");
        Tugas t1 = new Tugas("OP",2,"Not done");
        Tugas t2 = new Tugas("OP",4,"done");
        
        t1.setPelaksana(p1);
        t1.setPelaksana(p2);
        
        t2.setPelaksana(p1);
        t2.setPelaksana(p2);
        
        //t1.viewTask();
        //t2.viewTask();
        //t1.changeStatus();
        //t1.viewTask();
       
    }
}
