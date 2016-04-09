package io.clickhandler.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface GetComponentCallback {
    void call(Location location, ComponentCallback callback);
}
