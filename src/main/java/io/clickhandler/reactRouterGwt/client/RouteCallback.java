package io.clickhandler.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface RouteCallback {
    void run(Object error, Route routes);
}
