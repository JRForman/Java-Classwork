package com.jrforman;


import java.util.List;

/**
 * Created by Administrator on 6/28/2016.
 */
public interface ISavable {
    List<String> write();
    void read(List<String> savedValues);

}
