/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlesoapclient;

/**
 *
 * @author AN515-43
 */
public class CircleSoapClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(calcircle(3.0));
    }
    
    public static double calcircle(double radius){
        services.CircleWebService_Service service = new services.CircleWebService_Service();
        services.CircleWebService port = service.getCircleWebServicePort();
     return port.calcirclearea(radius);
    }
}
