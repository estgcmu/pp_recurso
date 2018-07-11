/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_er_8090301_8150277_recurso;

import static game.classes.CollisionDetectors.PolylineIntersection;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;

/**
 *
 * @author Tiago Pinto
 */
public class CollisionDetectors extends game.classes.CollisionDetectors{

    public CollisionDetectors() {
        super();
        PolylineIntersection(polyline, polyline);
        
    }
    
    
    Polyline polyline = new Polyline();
    
    
}
