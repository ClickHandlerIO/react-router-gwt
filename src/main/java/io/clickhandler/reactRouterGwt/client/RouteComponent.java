package io.clickhandler.reactRouterGwt.client;

import io.clickhandler.reactGwt.client.react.Component;
import io.clickhandler.reactGwt.client.react.React;
import io.clickhandler.reactGwt.client.react.ReactComponent;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 *
 */
public abstract class RouteComponent<R extends RouteProxy<A>, A, P extends RouteProps, S> extends Component<P, S> implements HasRouter {
    private Provider<R> routeProxyProvider;
    private R routeProxy;

    public RouteComponent() {
    }

    public Provider<R> getRouteProxyProvider() {
        log.trace("getRouteProxyProvider", routeProxyProvider);
        return routeProxyProvider;
    }

    @Inject
    public void setRouteProxyProvider(Provider<R> routeProxyProvider) {
        log.trace("setRouteProxyProvider", routeProxyProvider, routeProxyProvider.get());
        this.routeProxyProvider = routeProxyProvider;
        this.routeProxy = routeProxyProvider.get();
    }

    @Override
    protected void addContextTypes(ContextTypes contextTypes) {
        contextTypes.set("router", React.PropTypes.object(true));
    }

    @Override
    protected void componentDidMount(ReactComponent<P, S> $this) {
        super.componentDidMount($this);

        // Set Route Leave Hook.
        getRouter($this).setRouteLeaveHook(
                $this.getProps().getRoute(),
                nextLocation -> routerWillLeave($this, nextLocation)
        );
    }

    protected String routerWillLeave(ReactComponent<P, S> $this, Location nextLocation) {
        return null;
    }
}
