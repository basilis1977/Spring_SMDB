package gr.SMDB.app.Transfer;

import lombok.Value;

@Value
public class KeyValue<K, V> {
	K key;
	V value;
}
