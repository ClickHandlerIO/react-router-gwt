package io.clickhandler.reactRouterGwt.client;

import io.clickhandler.reactGwt.client.react.ReactComponent;
import io.clickhandler.reactGwt.client.Reflection;

/**
 *
 */
public interface HasRouter {
    default Router getRouter(ReactComponent $this) {
        return Reflection.get($this.getProperty("context"), "router");
    }
}
