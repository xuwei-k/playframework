/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play.inject;

import javax.inject.Named;
import play.cache.NamedCache;
import play.cache.NamedCacheImpl;
import play.db.NamedDatabase;
import play.db.NamedDatabaseImpl;

public final class Annotations {

  private Annotations(){}

  public static Named named(String value) {
    return new play.inject.NamedImpl(value);
  }

  public static NamedDatabase namedDatabase(String value) {
    return new NamedDatabaseImpl(value);
  }

  public static NamedCache namedCache(String value) {
    return new NamedCacheImpl(value);
  }
}
