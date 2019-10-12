package camille.berthelot.prosthesis.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import camille.berthelot.prosthesis.Model.HapticModel;
import camille.berthelot.prosthesis.R;

public class HapticActivity extends AppCompatActivity {

    // Lien avec les paramètres du control mode
    private HapticModel hapticParameters;

    // Lien avec les vues liees au parametre de force
    private Button minusButton;
    private Button plusButton;
    private Button forceAffiche;

    // Lien avec les vues liees au parametre de frequence
    private Button minus2Button;
    private Button plus2Button;
    private Button frequenceAffiche;

    // Lien avec les vues liees au parametre de motif



    // Lien avec les vues liees aux boutons de bas de page
    private Button backButton;
    private Button resetButton;
    private Button applyButton;

    // Variables appliquees
    private int appliedForce;
    private int appliedFrequence;
    private int appliedMotif;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haptic);

        // Creation de l'instance paramètres de control et initialisation
        hapticParameters = new HapticModel();
        hapticParameters.setForce(0);
        hapticParameters.setFrequence(0);


        // Lien variables - vues du layout
        minusButton=(Button) findViewById(R.id.activity_haptic_minus_button);
        plusButton=(Button) findViewById(R.id.activity_haptic_plus_button);
        forceAffiche=(Button) findViewById(R.id.activity_haptic_force_textview);
        minus2Button = (Button) findViewById(R.id.activity_haptic_minus2_button);
        plus2Button = (Button) findViewById(R.id.activity_haptic_plus2_button);
        frequenceAffiche = (Button) findViewById(R.id.activity_haptic_freq_textview);
        backButton = (Button) findViewById(R.id.activity_haptic_back);
        resetButton = (Button) findViewById(R.id.activity_haptic_reset);
        applyButton = (Button) findViewById(R.id.activity_haptic_apply);


        // Onclick listeners pour la force
        minusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hapticParameters.getForce() > 9) {
                    hapticParameters.setForce(hapticParameters.getForce()-10);
                    forceAffiche.setText(hapticParameters.forcetoString());
                }
                else {
                    hapticParameters.setForce(0);
                    forceAffiche.setText(hapticParameters.forcetoString());}
            }
        });

        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hapticParameters.getForce() <90) {
                    hapticParameters.setForce(hapticParameters.getForce()+10);
                    forceAffiche.setText(hapticParameters.forcetoString());
                }
                else {
                    hapticParameters.setForce(100);
                    forceAffiche.setText(hapticParameters.forcetoString());

                }
            }
        });
        forceAffiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hapticParameters.getForce()<100)
                    hapticParameters.setForce(hapticParameters.getForce()+1);
                forceAffiche.setText(hapticParameters.forcetoString());

            }
        });


        // Onclick listeners pour la frequence
        minus2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hapticParameters.getFrequence()>9) {
                    hapticParameters.setFrequence(hapticParameters.getFrequence()-10);
                    frequenceAffiche.setText(hapticParameters.frequencetoString());
                }
                else {
                    hapticParameters.setFrequence(0);
                    frequenceAffiche.setText(hapticParameters.frequencetoString());
                }
            }
        });

        plus2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hapticParameters.getFrequence()<90) {
                    hapticParameters.setFrequence(hapticParameters.getFrequence()+10);
                    frequenceAffiche.setText(hapticParameters.frequencetoString());
                }
                else {
                    hapticParameters.setFrequence(100);
                    frequenceAffiche.setText(hapticParameters.frequencetoString());
                }
            }
        });
        frequenceAffiche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hapticParameters.getFrequence()<100)
                    hapticParameters.setFrequence(hapticParameters.getFrequence()+1);
                    frequenceAffiche.setText(hapticParameters.frequencetoString());

            }
        });


        // Onclick listeners pour les boutons de bas de page
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent debugActivityIntent = new Intent(HapticActivity.this, DebugActivity.class);
                startActivity(debugActivityIntent);
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapticParameters.setForce(0);
                hapticParameters.setFrequence(0);
                hapticParameters.setMotif(0);
                forceAffiche.setText(hapticParameters.forcetoString());
                frequenceAffiche.setText(hapticParameters.frequencetoString());
            }
        });
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appliedForce=hapticParameters.getForce();
                appliedFrequence=hapticParameters.getFrequence();
                appliedMotif=hapticParameters.getMotif();
                Toast AppliedChanges=Toast.makeText(getApplicationContext(),"YOUR CHANGES HAVE BEEN APPLIED",Toast.LENGTH_SHORT);
                AppliedChanges.setGravity(50,50,50);
                AppliedChanges.show();

            }
        });


    }

}
