package io.clickhandler.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface ChildRoutesCallback {
    void call(Location location, RoutesCallback callback);
}
