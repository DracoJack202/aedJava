package es.upm.aedlib.map;

import java.util.Iterator;
import es.upm.aedlib.Entry;
import es.upm.aedlib.InvalidKeyException;

/**
 * The Map interface specifies a map (a function) between 
 * keys and values.
 */
public interface Map<K,V> extends Iterable<Entry<K,V>> {

    /**
     * Returns the size of the map (the number of key-value mappings).
     * @return the size of the map.
     */
  public int size();

    /**
     * Returns true if the map is not empty, and false otherwise.
     * @return true if the map is not empty, and false otherwise.
     */
  public boolean isEmpty();

  /**
   * Returns true if the map contains an entry with the key argument,
   * and false otherwise.
   * @return true if the map contains an entry with the key argument,
   * and false otherwise.
   * @throws InvalidKeyException if the key is invalid (e.g., the null value).
   */
  public boolean containsKey(Object key) throws InvalidKeyException;

    /**
     * Adds a new key-value mapping to the map.
     * If the map previously contained a mapping for the key,
     * that old value is replaced by the new.
     * @return the old value if there was a previous mapping for the key,
     * and null otherwise.
     * @throws InvalidKeyException if the key is invalid (e.g., the null value).
     */
  public V put(K key, V value) throws InvalidKeyException;

    /**
     * Returns the value associated with the key argument,
     * or, if no mapping for the key exists, the null value.
     * @return the old value if there is a mapping for the key,
     * and null otherwise.
     * @throws InvalidKeyException if the key is invalid (e.g., the null value).
     */
  public V get(K key) throws InvalidKeyException;

    /**
     * Removes a new key-value mapping from the map.
     * @return the old value if there was a mapping for the key,
     * and null otherwise.
     * @throws InvalidKeyException if the key is invalid (e.g., the null value).
     */
  public V remove(K key) throws InvalidKeyException;

    /**
     * Returns an iterator over the keys in the key-value mappings.
     * @return an iterator over the keys in the key-value mappings.
     */
  public Iterable<K> keys();

    /**
     * Returns an iterator over the key-value mappings.
     * @return an iterator over the key-value mappings.
     */
  public Iterable<Entry<K,V>> entries();  
}
