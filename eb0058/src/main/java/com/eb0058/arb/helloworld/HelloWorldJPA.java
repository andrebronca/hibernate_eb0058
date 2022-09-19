package com.eb0058.arb.helloworld;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 19/set/2022
 * @author andrebronca
 */
public class HelloWorldJPA {
  EntityManagerFactory emf = Persistence.createEntityManagerFactory("HelloWorldPU");
  
}
