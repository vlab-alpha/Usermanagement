package com.compience.Usermanagement
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class Muster extends MusterVerticle {

    void settingsDidLoad(Settings settings) {

    }

    public void identifier(Events.ServiceInstance.Builder builder) {

    }


    @Override
    void listener(Events.Usermanagement.Muster.GetMyData_V1.Request request, Handler<AsyncResult<Events.Usermanagement.Muster.GetMyData_V1.Response>> handler) {
        // TODO: Implement
    }

}