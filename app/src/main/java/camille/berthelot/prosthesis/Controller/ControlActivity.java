package camille.berthelot.prosthesis.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import camille.berthelot.prosthesis.Model.ControlModel;
import camille.berthelot.prosthesis.R;


public class ControlActivity extends AppCompatActivity {

    // Lien avec les paramètres du control mode
    private ControlModel controlParameters;

    // Lien avec les vues liees au parametre d'intensite
    private Button minusButton;
    private Button plusButton;
    private TextView intensiteAfffiche;

    // Lien avec les vues liees au parametre de mouvement
    private Button minus2Button;
    private Button plus2Button;
    private TextView mouvementAffiche;
    private TextView type;

    // Variables incrementables
    private int inputIntensite;
    private int inputMouvement;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);

        // Creation de l'instance paramètres de control et initialisation
        controlParameters = new ControlModel();
        controlParameters.setIntensite(0);
        controlParameters.setMouvementType(1);

        // Initialisation des variables incrémentables
        inputIntensite=0;
        inputMouvement=1;

        // Lien variables - vues du layout
        minusButton=(Button) findViewById(R.id.activity_control_minus_button);
        plusButton=(Button) findViewById(R.id.activity_control_plus_button);
        intensiteAfffiche=(TextView) findViewById(R.id.activity_control_force_textview);
        minus2Button = (Button) findViewById(R.id.activity_control_minus2_button);
        plus2Button = (Button) findViewById(R.id.activity_control_plus2_button);
        mouvementAffiche = (TextView) findViewById(R.id.activity_control_mvt_textview);
        type = (TextView) findViewById(R.id.activity_control_mvt_type);


        // Onclick listeners pour l'intensite
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputIntensite > 0) {
                    inputIntensite--;
                    controlParameters.setIntensite(inputIntensite*10);
                    intensiteAfffiche.setText(controlParameters.intensitetoString());
                }
                else {}
            }
        });


        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputIntensite <10){
                inputIntensite ++;
                controlParameters.setIntensite(inputIntensite*10);
                intensiteAfffiche.setText(controlParameters.intensitetoString());
                }
                else{}
            }
        });

        // Onclick listeners pour le moouvement
        minus2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputMouvement>1){
                    inputMouvement--;
                    controlParameters.setMouvementType(inputMouvement);
                    mouvementAffiche.setText(controlParameters.mouvementtoString());
                    if(inputMouvement == 1){
                        type.setText("Mouvement1");
                    }
                    else if (inputMouvement == 2){
                        type.setText("Mouvement2");
                    }
                    else if (inputMouvement == 3){
                        type.setText("Mouvement3");
                    }
                    else if (inputMouvement == 4){
                        type.setText("Mouvement4");
                    }
                    else if (inputMouvement == 5){
                        type.setText("Mouvement5");
                    }
                }
            }
        });

        plus2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inputMouvement<5){
                    inputMouvement++;
                    controlParameters.setMouvementType(inputMouvement);
                    mouvementAffiche.setText(controlParameters.mouvementtoString());
                    if(inputMouvement == 1){
                        type.setText("Mouvement1");
                    }
                    else if (inputMouvement == 2){
                        type.setText("Mouvement2");
                    }
                    else if (inputMouvement == 3){
                        type.setText("Mouvement3");
                    }
                    else if (inputMouvement == 4){
                        type.setText("Mouvement4");
                    }
                    else if (inputMouvement == 5){
                        type.setText("Mouvement5");
                    }
                }
            }
        });





    }
}
