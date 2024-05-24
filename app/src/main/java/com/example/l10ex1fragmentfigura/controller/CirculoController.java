package com.example.l10ex1fragmentfigura.controller;

import com.example.l10ex1fragmentfigura.model.Circulo;

public class CirculoController implements IGeometriaController<Circulo> {

    @Override
    public float calcArea(Circulo circulo) {
        float raio = circulo.getRaio();
        return 3.14f * (raio * raio);
    }

    @Override
    public float calcPerimetro(Circulo circulo) {
        return 2 * circulo.getRaio() * 3.14f;
    }
}
