package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LruCacheUnit<K,V> implements LruCache<K,V> {
    private int numCell = 3;
    private Map<K,V> cache;
    private LinkedList<K> lList;

    public LruCacheUnit(){
        cache = new HashMap<K,V>();
        lList = new LinkedList<K>();
    }

    @Override
    public V get(K key){
        if ( !cache.containsKey(key)){
            return null;
        }
        lList.remove(key);
        lList.addLast(key);
        return cache.get(key);
    }

    @Override
    public void set(K key, V value) {
        if (cache.size() == numCell){
            K k = lList.getLast();
            cache.remove(k);
            lList.remove(k);
        }
        lList.addFirst(key);
        cache.put(key, value);
    }

    @Override
    public int getSize() {
        return cache.size();
    }

    @Override
    public int getLimit() {
        return numCell;
    }

    public void print(){
        for(K key : cache.keySet()){
            String sKey = key.toString();
            String sVal = cache.get(key).toString();
            System.out.println(sKey + ":" + sVal);
        }
    }

}
