/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import game.Contracts.PilotContract;
import javafx.scene.input.KeyCode;

/**
 *
 * @author Tiago Pinto
 */
public class Pilot implements PilotContract{
    
    private String name = "";
    private int id;
    private KeyCode UP = KeyCode.UP;
    private KeyCode DOWN = KeyCode.DOWN;
    private KeyCode LEFT = KeyCode.LEFT;
    private KeyCode RIGHT = KeyCode.RIGHT;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String string) {
        this.name = string;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int i) {
        this.id = i;
    }

    @Override
    public KeyCode getKeyUp() {
        return UP;
    }

    @Override
    public void setKeyUp(KeyCode kc) {
        this.UP = kc;
    }

    @Override
    public KeyCode getKeyDown() {
        return DOWN;
    }

    @Override
    public void setKeyDown(KeyCode kc) {
        this.DOWN = kc;
    }

    @Override
    public KeyCode getKeyLeft() {
        return KeyCode.LEFT;
    }

    @Override
    public void setKeyLeft(KeyCode kc) {
        this.LEFT = kc;
    }

    @Override
    public KeyCode getKeyRight() {
        return KeyCode.RIGHT;
    }

    @Override
    public void setKeyRight(KeyCode kc) {
        this.RIGHT = kc;
    }
    
}
