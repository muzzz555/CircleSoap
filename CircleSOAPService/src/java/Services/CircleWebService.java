/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author AN515-43
 */
@WebService(serviceName = "CircleWebService")
public class CircleWebService {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "calcirclearea")
    public double calcirclearea(@WebParam(name = "radius") double radius) {
        double r = Math.PI*(radius*radius);
        return r;
    }
        @WebMethod(operationName = "calcircumference")
    public double calcircumference(@WebParam(name = "radius") double radius) {
        double r = 2*Math.PI*radius;
        return r;
    }
}
