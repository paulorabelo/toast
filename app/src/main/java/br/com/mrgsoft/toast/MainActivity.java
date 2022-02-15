package br.com.mrgsoft.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view){

        //Criando um Custom Toast
        ImageView imagem = new ImageView( getApplicationContext() );
        imagem.setImageResource( android.R.drawable.star_big_off );//Usando uma imagem

        TextView textView = new TextView( getApplicationContext() );
        textView.setBackgroundResource(R.color.teal_200);//Mudando a cor de fundo --> como mudar a cor da fonte?
        textView.setText("Olá Toast");//Usando um texto

        Toast toast = new Toast( getApplicationContext() );
        toast.setDuration( Toast.LENGTH_LONG );
        //toast.setView( imagem );
        toast.setView( textView );
        toast.show();

        /*
        Toast.makeText(
                getApplicationContext(),
                "Ação realizada com sucesso!",
                Toast.LENGTH_LONG
        ).show();
         */
        
    }

}