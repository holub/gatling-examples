/**
 * Created with IntelliJ IDEA. User: jiny Date: 5/9/13 Time: 10:23 PM To change this template use
 * File | Settings | File Templates.
 */

package com.custom;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * The type Say hello.
 */
public class SayHello {

  /**
   * Echo void.
   *
   * @param printString the print string
   */
  public final void echo(final String printString, Map<?, ?> feed) {
    UUID uuid = UUID.randomUUID();
    System.out.println(" -- s: " + uuid);
    try {
      TimeUnit.SECONDS.sleep(5);
    } catch (InterruptedException e) {}

    System.out.println("Say:" + printString + " " + feed.get("username"));
    System.out.println(" -- e: " + uuid);
  }

}
