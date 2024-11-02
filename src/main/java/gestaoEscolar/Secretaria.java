/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestaoEscolar;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexandre
 */
public class Secretaria implements Matriculavel{
    
    private List<Matricula> matriculas = new ArrayList<>();

    @Override
    public void matricular(Object aluno, Object turma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cancelarMatricula(Object aluno, Object turma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
