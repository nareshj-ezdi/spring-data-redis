/**
 * 
 */
package org.programming.mitra.spring.data.redis.repository;

import org.programming.mitra.spring.data.redis.model.Model;

/**
 * @author Naresh Joshi
 * @since 18-Feb-2016
 */

public interface Repository<T extends Model> {

	public void put(T object);

	public T get(T key);

	public void delete(T key);
}
