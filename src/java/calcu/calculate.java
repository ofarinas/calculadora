/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package calcu;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author usuario
 */
@WebService(serviceName = "calculate")
@Stateless()
public class calculate {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public double suma(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return num1+num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "resta")
    public double resta(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return num1-num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "division")
    public double division(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return num1/num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "multiplicacion")
    public double multiplicacion(@WebParam(name = "num1") double num1, @WebParam(name = "num2") double num2) {
        return num1*num2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "potencia")
    public int potencia(@WebParam(name = "base") double base, @WebParam(name = "exponente") double exponente) {
        return (int) Math.pow(base, exponente);
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "raiz")
    public double raiz(@WebParam(name = "num") double num) {
        return Math.sqrt(num);
    }
}
