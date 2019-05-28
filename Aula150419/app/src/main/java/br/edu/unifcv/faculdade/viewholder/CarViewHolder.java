package br.edu.unifcv.faculdade.viewholder;

<<<<<<< HEAD
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
=======
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
import android.widget.TextView;

import br.edu.unifcv.faculdade.R;
import br.edu.unifcv.faculdade.listener.OnListClickInteractionListener;
import br.edu.unifcv.faculdade.model.Carro;

<<<<<<< HEAD
public class CarViewHolder extends RecyclerView.ViewHolder {

    private TextView mTextModel;

    public CarViewHolder(View itemView) {
        super(itemView);
        this.mTextModel = itemView.findViewById(R.id.text_modelo);
    }

    public void bindData(final Carro carro, final OnListClickInteractionListener listener) {
        this.mTextModel.setText(carro.getModelo());
        this.mTextModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
=======
/**
 * Responsável por fazer as manipulações de elementos de interface
 */
public class CarViewHolder extends RecyclerView.ViewHolder {

    // Elemento de interface
    private ImageView mImgCarPicture;
    private TextView mTextCarModel;
    private TextView mTextViewDetails;


    /**
     * Construtor
     */
    public CarViewHolder(View itemView) {
        super(itemView);
        this.mImgCarPicture = itemView.findViewById(R.id.img_foto_carro);
        this.mTextCarModel = itemView.findViewById(R.id.text_modelo_carro);
        this.mTextViewDetails = itemView.findViewById(R.id.text_ver_detalhe);
    }

    /**
     * Atribui valores aos elementos
     */
    public void bindData(final Carro carro, final OnListClickInteractionListener listener) {

        // Altera valor
        this.mTextCarModel.setText(carro.getModelo());
        this.mImgCarPicture.setImageDrawable(carro.picture);

        // Adciona evento de click
        this.mTextViewDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
                listener.onClick(carro.getId());
            }
        });
    }
<<<<<<< HEAD
}
=======

}
>>>>>>> ca1ec749b09f6284e00c7323a7b25f6be5e42b72
