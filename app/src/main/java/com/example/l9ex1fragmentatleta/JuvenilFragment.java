package com.example.l9ex1fragmentatleta;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.l9ex1fragmentatleta.model.Juvenil;

public class JuvenilFragment extends Fragment {

    private View view;
    private EditText etNomeJv;
    private EditText etDataJv;
    private EditText etBairroJv;
    private EditText etAnos;
    private Button btnCadastroJv;

    public JuvenilFragment() {
        super();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_juvenil, container, false);
        etNomeJv = view.findViewById(R.id.etNomeJv);
        etDataJv = view.findViewById(R.id.etDataJv);
        etBairroJv = view.findViewById(R.id.etBairroJv);
        etAnos = view.findViewById(R.id.etAnos);
        btnCadastroJv = view.findViewById(R.id.btnCadastroJv);

        btnCadastroJv.setOnClickListener(op -> cadastro());
        return view;
    }

    private void cadastro() {
        String nome = etNomeJv.getText().toString();
        String data = etDataJv.getText().toString();
        String bairro = etBairroJv.getText().toString();
        int anos = Integer.parseInt(etAnos.getText().toString());

        Juvenil jv = new Juvenil(nome, data, bairro, anos);

        Toast.makeText(view.getContext(), jv.toString(), Toast.LENGTH_LONG).show();
        limpaCampos();
    }

    private void limpaCampos() {
        etNomeJv.setText("");
        etDataJv.setText("");
        etBairroJv.setText("");
        etAnos.setText("");
    }

}