package com.git.ds.arrays;

public class Vector {

  private Object[] mem = new Object[8];
  private int i = 0;
  private int maxSize = 7;

  public int size() {
    return i;
  }

  private void resize() {
    Object[] newSpace = new Object[mem.length << 1];
    System.arraycopy(mem, 0, newSpace, 0, mem.length);
    mem = newSpace;
    maxSize = newSpace.length - 1;
  }

  public void add(Object ele) {
    if (i == maxSize) {
      resize();
    }
    mem[i++] = ele;
  }


  public Object get(int index) {
    if (isInValidIndex(index)) {
      new RuntimeException("not a valid index");
    }
    return mem[index];
  }

  private boolean isInValidIndex(int index) {
    return i < index || index < 0;
  }

  public void delete(int index) {
    if (isInValidIndex(index)) {
      new RuntimeException("not a valid index ");
    }
    if (index == i) {
      mem[index] = null;
      i--;
    } else {
      Object[] newSpace = new Object[mem.length];
      if (index == 0) {
        System.arraycopy(mem, 1, newSpace, 0, index);

      } else {
        System.arraycopy(mem, 0, newSpace, 0, index);
        System.arraycopy(mem, index + 1, newSpace, index, i);

      }
      mem = newSpace;
      i--;


    }
  }

}
