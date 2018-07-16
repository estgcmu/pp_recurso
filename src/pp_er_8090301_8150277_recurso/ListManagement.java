/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.collections.ListManagementContract;
import java.util.Arrays;

/**
 *
 * @author Tiago Pinto
 */
public class ListManagement implements ListManagementContract{

    private Object objects[];
    private int numberOfobjects;
    
    public ListManagement() {
        super();
    }

    public ListManagement(Object[] objects) {
        this.objects = objects;
    }
    
    
    @Override
    public boolean addObject(Object o) {
        int tam = ListManagement.DEFAULT_SIZE;

        if (tam == this.objects.length){
            return false;

        }else{

            this.objects[tam] = new Object();
            return true;
        }
    }

    @Override
    public Object removeObject(int i) {
        int size = objects.length;

        Object elemDel = 5;

        for (i = 0; i < size; i++) {

            if (objects[i] == elemDel) {
                
                Arrays.toString(objects);
            }
        }

        return true;
    }

    @Override
    public Object getObject(int i) {
        return i;
    }

    @Override
    public int findObject(Object o) {
        for (int i = 0; i<this.size(); i++) {

            if (this.objects[i].equals(o)) {

                return i;
            }
        }

        return -1;
    }

    private int size() {
        return numberOfobjects;
    }
    
}
