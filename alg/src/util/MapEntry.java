package util;

import java.util.Map;

/**
 * Created by aristark on 4/6/16.\
 * A simple Map.Entry for sample Map inplementation
 */
public class MapEntry<K,V> implements Map.Entry<K,V> {
    private K key;
    private V value;

    public MapEntry(K key,V value){
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        V result = this.value;
        this.value = value;
        return result;
    }

    public int hashCode(){
        return (key==null? 0: key.hashCode()) ^ (value==null? 0: value.hashCode());
    }

    public boolean equals(Object o){
        MapEntry me = (MapEntry) o;
        if (!(o instanceof MapEntry)){
            return false;
        }
        return (key==null? me.getKey()==null:key.equals(me.getKey()))
                &&(value==null?me.getValue()==null:value.equals(me.getValue()));
    }

    public String toString(){
        return key+" = "+value;
    }
}
