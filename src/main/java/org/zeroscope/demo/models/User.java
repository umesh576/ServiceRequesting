package org.zeroscope.demo.models;

public class User {

  private int id;
  private String name;
  private String address;

  public User(int id, String name, String address) {
    this.id = id;
    this.address = address;
    this.name = name;
  }

  public User() {}

  public int getUser() {
    return id;
  }
}
