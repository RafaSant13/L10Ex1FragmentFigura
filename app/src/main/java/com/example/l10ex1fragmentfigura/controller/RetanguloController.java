package com.example.l10ex1fragmentfigura.controller;

import com.example.l10ex1fragmentfigura.model.Retangulo;

public class RetanguloController implements IGeometriaController<Retangulo> {
    @Override
    public float calcArea(Retangulo retangulo) {
        return retangulo.getBase() * retangulo.getAltura();
    }

    @Override
    public float calcPerimetro(Retangulo retangulo) {
        return 2 * (retangulo.getBase()+ retangulo.getAltura());
    }
}
