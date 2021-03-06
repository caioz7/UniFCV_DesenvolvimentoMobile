package br.edu.unifcv.faculdade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Insere o layout na activity
        setContentView(R.layout.activity_main);

        // Busca os elementos da interface
        this.loadComponents();
        // Limpa os valores iniciais
        this.clearValues();

        // Adiciona evento de click no elemento
        this.setEventsOnButtons();

    }

    private void setEventsOnButtons() {
        this.mViewHolder.buttonCalculate.setOnClickListener(this);
        this.mViewHolder.buttonLimpar.setOnClickListener(this);
    }

    private void loadComponents() {
        this.mViewHolder.editReal = (EditText) this.findViewById(R.id.edit_valor);
        this.mViewHolder.editCotDollar = (EditText) this.findViewById(R.id.edit_cot_dollar);
        this.mViewHolder.editCotEuro = (EditText) this.findViewById(R.id.edit_cot_euro);

        this.mViewHolder.textDollar = (TextView) this.findViewById(R.id.txt_dollar);
        this.mViewHolder.textEuro = (TextView) this.findViewById(R.id.txt_euro);

        this.mViewHolder.buttonCalculate = (Button) this.findViewById(R.id.btn_calcular);
        this.mViewHolder.buttonLimpar = (Button) this.findViewById(R.id.btn_limpar);

    }

    @Override
    public void onClick(View view) {
        // Verifica se o elemento clicado é o que nos interessa
        switch (view.getId()) {
            case R.id.btn_calcular: {
                calculateValues();
                break;
            }
            case R.id.btn_limpar: {
                clearValues();
                break;
            }
        }
    }

    private void calculateValues() {
        if (isDadosValidos()) {
            // Obtém o valor do EditText
            Double mReal = Double.valueOf(this.mViewHolder.editReal.getText().toString());
            Double mCotacaoDolar_ = Double.valueOf(this.mViewHolder.editCotDollar.getText().toString());
            Double mCotacaoEuro_ = Double.valueOf(this.mViewHolder.editCotEuro.getText().toString());

            // Converte valores
            this.mViewHolder.textDollar.setText(String.format("%.2f", mReal / mCotacaoDolar_));
            this.mViewHolder.textEuro.setText(String.format("%.2f", mReal / mCotacaoEuro_));
        }
    }

    private boolean isDadosValidos() {
        if (this.mViewHolder.editReal.getText().toString().trim().isEmpty()) {
            showToast("Informe o valor que deseja converter");
            this.mViewHolder.editReal.requestFocus();
            return false;
        } else if (this.mViewHolder.editCotDollar.getText().toString().trim().isEmpty()) {
            showToast("Informe a cotação do dollar");
            this.mViewHolder.editCotDollar.requestFocus();
            return false;
        } else if (this.mViewHolder.editCotEuro.getText().toString().trim().isEmpty()) {
            showToast("Informe a cotação do euro");
            this.mViewHolder.editCotEuro.requestFocus();
            return false;
        } else if (isZeroCotacoesValues()) {
            return false;
        }
        return true;
    }

    private boolean isZeroCotacoesValues() {
        if (Double.parseDouble(this.mViewHolder.editCotDollar.getText().toString()) <= 0) {
            showToast("O valor da cotação do 'dólar' deve ser maior que ZERO");
            this.mViewHolder.editCotDollar.requestFocus();
            return true;
        } else if (Double.parseDouble(this.mViewHolder.editCotEuro.getText().toString()) <= 0) {
            showToast("O valor da cotação do 'euro' deve ser maior que ZERO");
            this.mViewHolder.editCotEuro.requestFocus();
            return true;
        }
        return false;
    }

    private void showToast(final String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }

    /**
     * Limpa os valores iniciais
     */
    private void clearValues() {
        this.mViewHolder.textDollar.setText("");
        this.mViewHolder.textEuro.setText("");
    }

    private static class ViewHolder {
        private EditText editReal;
        private EditText editCotEuro;
        private EditText editCotDollar;
        private TextView textDollar;
        private TextView textEuro;
        private Button buttonCalculate;
        private Button buttonLimpar;
    }

}
