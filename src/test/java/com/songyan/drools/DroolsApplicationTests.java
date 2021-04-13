package com.songyan.drools;

import com.songyan.drools.model.Student;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

class DroolsApplicationTests {

    public static void main(String[] args) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kieContainer = ks.getKieClasspathContainer();
        Student student = new Student("张三",8);
        Student student2 = new Student("李四",9);
        Student student3 = new Student("王五",10);
        KieSession kieSession = kieContainer.newKieSession("rulesSession");
        kieSession.insert(student);
        kieSession.insert(student2);
        kieSession.insert(student3);
        kieSession.fireAllRules();
        kieSession.dispose();
        System.out.println("******************************");
        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println("******************************");
    }

}
