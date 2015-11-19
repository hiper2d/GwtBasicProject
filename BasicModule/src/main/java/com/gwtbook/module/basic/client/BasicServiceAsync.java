package com.gwtbook.module.basic.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface BasicServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
