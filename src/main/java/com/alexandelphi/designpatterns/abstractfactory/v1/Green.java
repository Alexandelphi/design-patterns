package com.alexandelphi.designpatterns.abstractfactory.v1;

public class Green implements Color {

  @Override
  public void fill() {
    System.out.println("Inside " + this.getClass().getSimpleName() + "::fill() method.");
  }
}
