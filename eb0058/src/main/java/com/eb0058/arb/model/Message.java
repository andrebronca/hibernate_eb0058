package com.eb0058.arb.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 19/set/2022
 * @author andrebronca
 */
@Entity
public class Message implements Serializable {
  
  @Id
  @GeneratedValue
  private Long id;
  private String text;

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
  
  
}
