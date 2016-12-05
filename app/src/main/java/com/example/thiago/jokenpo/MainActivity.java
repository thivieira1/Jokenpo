package com.example.thiago.jokenpo;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int placarJogador = 0;
    int placarComputador = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telainicial);
    }
    public void pedra (View View)
    {
        int escolhaComputador =(int) (Math.random()*3)+1;
        if(escolhaComputador == 1)
        {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);

            Toast.makeText(
                    MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();
        }
        else if (escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);

            placarComputador++;

            TextView pontos = (TextView) findViewById(R.id.placarcomputador);
            pontos.setText(String.valueOf(this.placarComputador));
        }
        else {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.pedra);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);

            placarJogador++;

            TextView pontos = (TextView) findViewById(R.id.placarjogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }
    }
    public void papel (View View)
    {
        int escolhaComputador =(int) (Math.random()*3)+1;
        if(escolhaComputador == 1)
        {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);

            placarJogador++;

            TextView pontos = (TextView) findViewById(R.id.placarjogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }
        else if (escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);

            Toast.makeText(
                    MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();
        }
        else {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.papel);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);

            placarComputador++;

            TextView pontos = (TextView) findViewById(R.id.placarcomputador);
            pontos.setText(String.valueOf(this.placarComputador));
        }
    }
    public void tesoura (View View)
    {
        int escolhaComputador =(int) (Math.random()*3)+1;
        if(escolhaComputador == 1)
        {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.pedra);

            placarComputador++;

            TextView pontos = (TextView) findViewById(R.id.placarcomputador);
            pontos.setText(String.valueOf(this.placarComputador));
        }
        else if (escolhaComputador == 2){
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.papel);

            placarJogador++;

            TextView pontos = (TextView) findViewById(R.id.placarjogador);
            pontos.setText(String.valueOf(this.placarJogador));
        }
        else {
            ImageView img = (ImageView) findViewById(R.id.jogador);
            img.setImageResource(R.drawable.tesoura);

            ImageView img2 = (ImageView) findViewById(R.id.computador);
            img2.setImageResource(R.drawable.tesoura);

            Toast.makeText(
                    MainActivity.this,
                    "Ops, deu empate!",
                    Toast.LENGTH_SHORT
            ).show();
        }
    }
}
