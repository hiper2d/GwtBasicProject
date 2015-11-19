package com.gwtbook.module.basic.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.gwtbook.module.basic.client.BasicService;

public class BasicServiceImpl extends RemoteServiceServlet implements BasicService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}