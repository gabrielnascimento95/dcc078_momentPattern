/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package momentopattern;

/**
 *
 * @author gabri
 */
public class AlunoEstadoAtivo implements AlunoEstado{

    @Override
    public String getNome() {
        return "Ativo";
    }

    @Override
    public String matricular() {
        return "Matricula realizada";
    }
    
}
