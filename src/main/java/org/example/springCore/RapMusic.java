package org.example.springCore;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component("rap")
public class RapMusic implements Music{
    public void _doMyInit_(){
        System.out.println("Doing my initialization");
    }
    public void _doMyDestroy_(){
        System.out.println("Doing my destruction");
    }
    @Override
    public List<String> _getSong_() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add("Rap Music " + i);
        }

        return list;
    }
}
