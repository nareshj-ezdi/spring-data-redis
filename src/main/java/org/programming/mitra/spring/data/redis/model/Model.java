/**
 * 
 */
package org.programming.mitra.spring.data.redis.model;

import java.io.Serializable;

/**
 * @author Naresh Joshi
 * @since 18-Feb-2016
 */

public interface Model extends Serializable {

	public String getHashKey();

	public String getKey();

}
