package edu.luc.cs271.arrayqueue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixedArrayQueue<E> implements SimpleQueue<E> {

  private final int capacity;

  private int size;

  private int front;

  private int rear;

  private final E[] data;

  // TODO why do we need an explicit constructor?

  @SuppressWarnings("unchecked")
  public FixedArrayQueue(final int capacity) {
    this.capacity = capacity;
    this.data = (E[]) new Object[capacity];
    this.size = 0;
    this.front = 0;
    this.rear = capacity - 1;
  }

  @Override
  public boolean offer(final E obj) {
    //not done yet 
   if(this.size<this.capacity) {
        this.data[this.size] = obj;
        this.size++;
    return true;
  }
  else {
      return false;
    }
}

  @Override
  public E peek() {
    //Done 
    if(this.size == 0) {
      return null;
    }
    else {
      return this.data[this.front];
     }
 }

  @Override
   public E poll() {
     //Done
     if (this.size == 0) {
      return null;
    } else {
      E result = data[front];
      front = (front + 1) % capacity;
      size--;
      return result;
    }
}
  @Override
  public boolean isEmpty() {
    //done
   if (this.size == 0) {
        return true;
    }
    else {
        return false;
}
  }

  @Override
  public int size() {
    return size;
  }

  @Override
    public List<E> asList() {
      // Done
    List<E> list = new ArrayList<>();
    for(int i = 0; i < this.size; i++)
    {
      list.add(this.data[i]);
    }
    return list;
  }
  
}
