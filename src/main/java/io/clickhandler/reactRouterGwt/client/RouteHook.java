package io.clickhandler.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface RouteHook {
    String call(Location nextLocation);
}
