/*
 * Copyright (c) 2005, 2010, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javax.xml.ws;

/**
 * Used to indicate whether a {@link Provider} implementation wishes to work
 * with entire protocol messages or just with protocol message payloads.
 *
 *  @since JAX-WS 2.0
**/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface ServiceMode {
  /**
   * Service mode. <code>PAYLOAD</code> indicates that the <code>Provider</code> implementation
   * wishes to work with protocol message payloads only. <code>MESSAGE</code> indicates
   * that the <code>Provider</code> implementation wishes to work with entire protocol
   * messages.
  **/
  public Service.Mode value() default Service.Mode.PAYLOAD;
}
