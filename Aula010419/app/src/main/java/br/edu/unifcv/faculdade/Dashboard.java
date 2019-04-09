package br.edu.unifcv.faculdade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Dashboard extends AppCompatActivity implements View.OnClickListener{

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        this.loadComponents();
        this.setEvents();
    }

    private void loadComponents() {
        this.mViewHolder.cardConversor = this.findViewById(R.id.card_conversor);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.card_conversor: {
                this.createConversor();
                break;
            }
        }
    }
    private void setEvents(){
        this.mViewHolder.cardConversor.setOnClickListener(this);
    }

    private void createConversor() {
        Intent intent = new Intent(this, ConversorActivity.class);
        startActivity(intent);

    }

    private static class ViewHolder{
        CardView cardConversor;
    }
}
