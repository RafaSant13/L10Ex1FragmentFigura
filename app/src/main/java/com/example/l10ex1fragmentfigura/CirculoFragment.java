package com.example.l10ex1fragmentfigura;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.l10ex1fragmentfigura.controller.CirculoController;
import com.example.l10ex1fragmentfigura.model.Circulo;


public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRaio;
    private TextView tvResCirculo;
    private Button btnAreaCirculo;
    private Button btnPerCirculo;
    private CirculoController cc;

    public CirculoFragment() {
        super();
        cc = new CirculoController();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaio = view.findViewById(R.id.etRaio);
        tvResCirculo = view.findViewById(R.id.tvResCirculo);
        tvResCirculo.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
        btnAreaCirculo = view.findViewById(R.id.btnAreaCirculo);
        btnPerCirculo = view.findViewById(R.id.btnPerCirculo);

        btnAreaCirculo.setOnClickListener(op -> calcArea());
        btnPerCirculo.setOnClickListener(op -> calcPerimetro());
        return view;
    }

    private void calcArea() {
        float raio = Float.parseFloat(etRaio.getText().toString());
        Circulo c = new Circulo(raio);
        String res = getString(R.string.areac) + cc.calcArea(c);
        tvResCirculo.setText(res);
        limpaCampos();
    }

    private void calcPerimetro() {
        float raio = Float.parseFloat(etRaio.getText().toString());
        Circulo c = new Circulo(raio);
        String res = getString(R.string.perimetroc) + cc.calcPerimetro(c);
        tvResCirculo.setText(res);
        limpaCampos();
    }

    private void limpaCampos() {
        etRaio.setText("");
    }
}