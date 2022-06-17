/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play.inject;

import javax.inject.Named;

public final class Annotations {

  private Annotations() {}

  public static Named named(String value) {
    return new play.inject.NamedImpl(value);
  }
}
