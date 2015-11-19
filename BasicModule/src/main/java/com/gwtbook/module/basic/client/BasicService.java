package com.gwtbook.module.basic.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("BasicService")
public interface BasicService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use BasicService.App.getInstance() to access static instance of BasicServiceAsync
     */
    public static class App {
        private static BasicServiceAsync ourInstance = GWT.create(BasicService.class);

        public static synchronized BasicServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
