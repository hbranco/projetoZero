/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *
 * @author aluno
 */
@Controller
public class PrimeiroControlador {
    
    @RequestMapping("/teste")
    public String executar(){
        System.out.println("asddadadsadasdsadsadsaddaas");
        return "pagina";
    }
    
    
    
    
}
