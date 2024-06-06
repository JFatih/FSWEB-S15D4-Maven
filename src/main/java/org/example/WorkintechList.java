package org.example;

import java.util.*;

public class WorkintechList extends ArrayList{

    @Override
    public boolean add(Object data) {
        if(!this.contains(data)){
            super.add(data);
        }
        return false;
    }


    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object data) {
        sort();
        return super.remove(data);
    }
}
