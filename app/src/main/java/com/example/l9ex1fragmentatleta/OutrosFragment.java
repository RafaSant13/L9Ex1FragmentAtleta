package com.example.l9ex1fragmentatleta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.l9ex1fragmentatleta.model.Outros;


public class OutrosFragment extends Fragment {

    private View view;
    private EditText etNomeOutros;
    private EditText etDataOutros;
    private EditText etBairroOutros;
    private EditText etAcademia;
    private EditText etRecorde;
    private Button btnCadastroOutros;

    public OutrosFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_outros, container, false);
        etNomeOutros = view.findViewById(R.id.etNomeOutros);
        etDataOutros = view.findViewById(R.id.etDataOutros);
        etBairroOutros = view.findViewById(R.id.etBairroOutros);
        etAcademia = view.findViewById(R.id.etAcademia);
        etRecorde = view.findViewById(R.id.etRecorde);
        btnCadastroOutros = view.findViewById(R.id.btnCadastroOutros);

        btnCadastroOutros.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        String nome = etNomeOutros.getText().toString();
        String data = etDataOutros.getText().toString();
        String bairro = etBairroOutros.getText().toString();
        String academia = etAcademia.getText().toString();
        int recorde = Integer.parseInt(etRecorde.getText().toString());

        Outros out = new Outros(nome, data, bairro, academia, recorde);

        Toast.makeText(view.getContext(), out.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeOutros.setText("");
        etDataOutros.setText("");
        etBairroOutros.setText("");
        etAcademia.setText("");
        etRecorde.setText("");
    }
}