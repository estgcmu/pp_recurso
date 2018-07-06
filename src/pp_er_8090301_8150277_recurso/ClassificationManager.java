/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.collections.ClassificationManagementContract;
import java.util.Arrays;

/**
 *
 * @author Tiago Pinto
 */
public class ClassificationManager implements ClassificationManagementContract{

    private Object objects[];
    
    @Override
    public void sort() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void increaseSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void decreaseSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addObject(Object o) {
        int tam = this.size();

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
    
}
