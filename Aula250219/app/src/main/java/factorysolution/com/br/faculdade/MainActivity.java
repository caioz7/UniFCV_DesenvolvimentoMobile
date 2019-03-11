package factorysolution.com.br.faculdade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editReal;
    private TextView textDollar;
    private TextView textEuro;
    private Button buttonCalculate;
    private Button buttonClear;
    private EditText editDolar;
    private EditText editEuro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Insere o layout na activity
        setContentView(R.layout.activity_main);

        // Busca os elementos da interface
        this.editReal = (EditText) this.findViewById(R.id.edit_valor);
        this.editDolar= (EditText) this.findViewById(R.id.edit_dolar);
        this.editEuro= (EditText) this.findViewById(R.id.edit_euro);
        this.textDollar = (TextView) this.findViewById(R.id.txt_dollar);
        this.textEuro = (TextView) this.findViewById(R.id.txt_euro);
        this.buttonCalculate = (Button) this.findViewById(R.id.btn_calcular);
        this.buttonClear= (Button) this.findViewById(R.id.btn_clear);

        // Limpa os valores iniciais
        this.clearValues();

        // Adiciona evento de click no elemento
        this.buttonCalculate.setOnClickListener(this);
        this.buttonClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        // Verifica se o elemento clicado é o que nos interessa
        if (view.getId() == R.id.btn_calcular) {

            if(this.editReal.getText().length() >=  1 && this.editEuro.getText().length() >= 1 && this.editDolar.getText().length() >= 1){
                Double mReal = Double.valueOf(this.editReal.getText().toString());
                Double mDolar = Double.valueOf(this.editDolar.getText().toString());
                Double mEuro = Double.valueOf(this.editEuro.getText().toString());

                // Converte valores
                this.textDollar.setText(String.format("%.2f", mReal * mDolar));
                this.textEuro.setText(String.format("%.2f", mReal * mEuro));
            }else {
                Toast.makeText(this, "Preencha todos os campos!!",Toast.LENGTH_SHORT).show();
            }
        }//Limpa os campos se pressionar o botao "Limpar"
        else if(view.getId() == R.id.btn_clear){
            this.clearValues();
        }
    }

    /**
     * Limpa os valores iniciais
     */
    private void clearValues() {
        this.editEuro.setText("");
        this.editReal.setText("");
        this.editDolar.setText("");
        this.textDollar.setText("");
        this.textEuro.setText("");
    }


}

