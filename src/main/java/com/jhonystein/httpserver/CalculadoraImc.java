package com.jhonystein.httpserver;

import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("imc")
public class CalculadoraImc {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response calcularImc(
            @QueryParam("peso") Double peso, 
            @QueryParam("altura") Double altura) {
        Map<String, String> dados = new HashMap<>();
        
        Double imc = peso / (altura * altura);
        dados.put("message", String
                .format("Seu IMC é %.2f", imc));
        return Response.ok(dados).build();
    }
    
}
