package org.example.springCore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.*;

//@Component
public class ClassicalMusic implements Music{
    @Override
    public List<String> _getSong_() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add("Classical Music " + i);
        }
        return list;
    }

//    private ClassicalMusic(){}
//
//    /**
//     * This method replaces the operator new - factory method
//     * @return new ClassicalMusic class
//     */
//    public static ClassicalMusic _getClassicalMusic_(){
//        return new ClassicalMusic();
//    }
    @PostConstruct
    public void _doMyInit_(){
        System.out.println("Doing my initialization");
    }
  @PreDestroy
    public void _doMyDestroy_(){
        System.out.println("Doing my destruction");
    }
}
