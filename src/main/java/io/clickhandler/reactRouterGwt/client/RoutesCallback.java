package io.clickhandler.reactRouterGwt.client;

import jsinterop.annotations.JsFunction;

/**
 *
 */
@JsFunction
public interface RoutesCallback {
    void run(Object error, Route[] routes);
}
