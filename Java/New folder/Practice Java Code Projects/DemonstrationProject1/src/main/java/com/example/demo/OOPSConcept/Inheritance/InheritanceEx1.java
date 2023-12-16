package com.example.demo.OOPSConcept.Inheritance;

import com.example.demo.OOPSConcept.Inheritance.HierarchicalInheritance.HirarchicalEx1;
import com.example.demo.OOPSConcept.Inheritance.MultilevelInheritance.MultilevelEx1;
import com.example.demo.OOPSConcept.Inheritance.MultipleInheritance.MultipleEx1;
import com.example.demo.OOPSConcept.Inheritance.SingleInheritance.SingleEx1;

public class InheritanceEx1 {
    public static void main(String args[]){
        System.out.println("\nInheritance.InheritanceEx1 started");
        SingleEx1.main(null);
        MultilevelEx1.main(null);
        HirarchicalEx1.main(null);
        MultipleEx1.main(null);
    }
}
