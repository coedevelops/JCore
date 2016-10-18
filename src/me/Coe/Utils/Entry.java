package me.Coe.Utils;

import java.util.Map;

public final class Entry<K, V> implements Map.Entry<K, V>{
	protected final K Key;
	protected       V Value;
	public Entry(K Key, V Value){
		this.Key   = Key;
		this.Value = Value;
	}
	public K getKey(){
		return Key;
	}
	public V getValue(){
		return Value;
	}
	public V setValue(V Value){
		V Old = this.Value;
		this.Value = Value;
		return Old;
	}
}