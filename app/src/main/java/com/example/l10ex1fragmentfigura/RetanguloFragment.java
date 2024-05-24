package com.example.l10ex1fragmentfigura;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.l10ex1fragmentfigura.controller.RetanguloController;
import com.example.l10ex1fragmentfigura.model.Retangulo;

public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etBase;
    private EditText etAltura;
    private Button btnAreaRet;
    private Button btnPerRet;
    private TextView tvResRet;
    private RetanguloController rc;

    public RetanguloFragment() {
        super();
        rc = new RetanguloController();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etBase = view.findViewById(R.id.etBase);
        etAltura = view.findViewById(R.id.etAltura);
        btnAreaRet = view.findViewById(R.id.btnAreaRet);
        btnPerRet = view.findViewById(R.id.btnPerRet);
        tvResRet = view.findViewById(R.id.tvResRet);
        tvResRet.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);

        btnAreaRet.setOnClickListener(op -> calcArea());
        btnPerRet.setOnClickListener(op -> calcPerimetro());
        return view;
    }

    private void calcArea() {
        float altura = Float.parseFloat(etBase.getText().toString());
        float base = Float.parseFloat(etAltura.getText().toString());
        Retangulo r = new Retangulo(altura, base);
        String res = getString(R.string.arear)+rc.calcArea(r);
        tvResRet.setText(res);
        limpaCampos();
    }

    private void calcPerimetro() {
        float altura = Float.parseFloat(etBase.getText().toString());
        float base = Float.parseFloat(etAltura.getText().toString());
        Retangulo r = new Retangulo(altura, base);
        String res = getString(R.string.perimetror)+rc.calcPerimetro(r);
        tvResRet.setText(res);
        limpaCampos();
    }

    private void limpaCampos() {
        etBase.setText("");
        etAltura.setText("");
    }
}