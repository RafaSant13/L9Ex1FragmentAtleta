package com.example.l9ex1fragmentatleta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.l9ex1fragmentatleta.model.Senior;

public class SeniorFragment extends Fragment {

    private View view;
    private EditText etNomeSr;
    private EditText etDataSr;
    private EditText etBairroSr;
    private CheckBox cbProblema;
    private Button btnCadastroSr;

    public SeniorFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_senior, container, false);
        etNomeSr = view.findViewById(R.id.etNomeSr);
        etDataSr = view.findViewById(R.id.etDataSr);
        etBairroSr = view.findViewById(R.id.etBairroSr);
        cbProblema = view.findViewById(R.id.cbProblema);
        btnCadastroSr = view.findViewById(R.id.btnCadastroSr);

        btnCadastroSr.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        String nome = etNomeSr.getText().toString();
        String data = etDataSr.getText().toString();
        String bairro = etBairroSr.getText().toString();
        boolean problema;
        if (cbProblema.isChecked()){
            problema = true;
        } else {
            problema = false;
        }

        Senior sr = new Senior(nome, data, bairro, problema);

        Toast.makeText(view.getContext(), sr.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeSr.setText("");
        etDataSr.setText("");
        etBairroSr.setText("");
        cbProblema.setChecked(false);
    }
}