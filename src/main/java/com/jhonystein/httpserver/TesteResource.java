/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jhonystein.httpserver;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author jhony.pereira
 */
@Path("/teste")
public class TesteResource {
    
    @GET
    public String hello() {
        return "Eu sou um teste";
    }
    
}
