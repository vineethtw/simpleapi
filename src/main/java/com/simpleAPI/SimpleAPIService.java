package com.simpleAPI;

import com.simpleAPI.servlets.HealthServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class SimpleAPIService {
   public static void main( final String[] args ) throws Exception {
       final Server server = new Server(8081);

       ServletHandler servletHandler = new ServletHandler();
       server.setHandler( servletHandler );
       servletHandler.addServletWithMapping( HealthServlet.class, "/health" );
       server.dumpStdErr();

       server.start();
       server.join();
   }


}

