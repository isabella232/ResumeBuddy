package com.google.sps.data;

public class Pair<K, V> {
  private final K key;
  private final V val;

  public Pair(K key, V val) {
    this.key = key;
    this.val = val;
  }

  public K getKey() {
    return key;
  }

  public V getVal() {
    return val;
  }

  @Override
  public boolean equals(Object o) {
    Pair<K, V> that = (Pair<K, V>) o;
    if (this.key.equals(that.getKey()) && this.val.equals(that.getVal())) {
      return true;
    }

    return false;
  }
}
