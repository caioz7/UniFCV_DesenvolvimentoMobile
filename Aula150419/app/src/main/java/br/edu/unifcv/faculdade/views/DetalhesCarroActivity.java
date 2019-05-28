package br.edu.unifcv.faculdade.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.widget.Button;
=======
import android.widget.ImageView;
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
import android.widget.TextView;

import br.edu.unifcv.faculdade.R;
import br.edu.unifcv.faculdade.constants.CarrosConstants;
import br.edu.unifcv.faculdade.mock.CarroMock;
import br.edu.unifcv.faculdade.model.Carro;

public class DetalhesCarroActivity extends AppCompatActivity {
<<<<<<< HEAD

    private ViewHolder mViewHolder = new ViewHolder();
    private Carro mCarro;
    private CarroMock mCarroMock;
=======
    // Variáveis da classe
    private ViewHolder mViewHolder = new ViewHolder();
    private CarroMock mCarMock;
    private Carro mCarro;
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes_carro);

<<<<<<< HEAD
        this.mCarroMock = new CarroMock();

        this.loadComponents();

        this.getDataFromActivity();

        this.setData();

    }

    private void setData() {
        this.mViewHolder.textModelo.setText(this.mCarro.getModelo());
        this.mViewHolder.textPotencia.setText(String.valueOf(this.mCarro.getPotencia()));
=======
        setTitle("Detalhe Carro");

        // Instancia variáveis
        this.mCarMock = new CarroMock(this);

        this.loadComponents();

        // Obtém o valor passado por parâmetro
        this.getDataFromActivity();

        // Atribui os valores aos elementos de interface
        this.setData();
    }

    private void setData() {
        this.mViewHolder.imgCarro.setImageDrawable(this.mCarro.getPicture());
        this.mViewHolder.textModelo.setText(this.mCarro.getModelo());
        this.mViewHolder.textFabricante.setText(this.mCarro.getFabricante());
        this.mViewHolder.textPotencia.setText(String.valueOf(this.mCarro.getPotecia()));
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
        this.mViewHolder.textPrice.setText("R$ " + String.valueOf(this.mCarro.getPreco()));
    }

    private void getDataFromActivity() {
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
<<<<<<< HEAD
           this.mCarro = this.mCarroMock.getCarro(extras.getInt(CarrosConstants.CARRO_ID, 0));
=======
            this.mCarro = this.mCarMock.getCarro(extras.getInt(CarrosConstants.CARRO_ID));
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
        }
    }

    private void loadComponents() {
<<<<<<< HEAD
        this.mViewHolder.textModelo = this.findViewById(R.id.text_modelo_carro);
        this.mViewHolder.textPotencia = this.findViewById(R.id.text_potencia_carro);
        this.mViewHolder.textPrice = this.findViewById(R.id.text_preco_carro);
    }

    private static class ViewHolder {
        TextView textModelo;
=======
        this.mViewHolder.imgCarro = this.findViewById(R.id.img_detalhe_carro);
        this.mViewHolder.textModelo = this.findViewById(R.id.text_detalhe_modelo);
        this.mViewHolder.textFabricante = this.findViewById(R.id.text_detalhe_fabricante);
        this.mViewHolder.textPotencia = this.findViewById(R.id.text_detalhe_potencia);
        this.mViewHolder.textPrice = this.findViewById(R.id.text_detalhe_preco);
    }

    /**
     * ViewHolder
     */
    private static class ViewHolder {
        ImageView imgCarro;
        TextView textModelo;
        TextView textFabricante;
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
        TextView textPotencia;
        TextView textPrice;
    }
}
