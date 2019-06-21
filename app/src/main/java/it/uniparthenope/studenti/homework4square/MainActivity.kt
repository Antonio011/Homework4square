package it.uniparthenope.studenti.homework4square

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    val ristoranti = Array(20) { arrayOfNulls<String>(2) }
    var valutazione : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var flag: Int
        ristoranti[0][0] = "Napoli"
        ristoranti[0][1] = "Pizzeria Sorbillo"
        ristoranti[1][0] = "Napoli"
        ristoranti[1][1] = "Starita"
        ristoranti[2][0] = "Napoli"
        ristoranti[2][1] = "'O Vesuvio"
        ristoranti[3][0] = "Napoli"
        ristoranti[3][1] = "Osteria Il Gobbetto"
        ristoranti[4][0] = "Roma"
        ristoranti[4][1] = "Il Panino Ingegnoso"
        ristoranti[5][0] = "Roma"
        ristoranti[5][1] = "Sushisen"
        ristoranti[6][0] = "Roma"
        ristoranti[6][1] = "Opulentia"
        ristoranti[7][0] = "Torino"
        ristoranti[7][1] = "Adonis Creperie"
        ristoranti[8][0] = "Torino"
        ristoranti[8][1] = "La capannina"
        ristoranti[9][0] = "Torino"
        ristoranti[9][1] = "Mulassano"
        ristoranti[10][0] = "Torino"
        ristoranti[10][1] = "Caffè Stratta"
        ristoranti[11][0] = "Milano"
        ristoranti[11][1] = "Piz"
        ristoranti[12][0] = "Milano"
        ristoranti[12][1] = "Il Capestrano"
        ristoranti[13][0] = "Milano"
        ristoranti[13][1] = "Trattoria del pescatore"
        ristoranti[14][0] = "Bari"
        ristoranti[14][1] = "La uascezze"
        ristoranti[15][0] = "Venezia"
        ristoranti[15][1] = "I tre mercanti"
        ristoranti[16][0] = "Venezia"
        ristoranti[16][1] = "La zucca"
        ristoranti[17][0] = "Cagliari"
        ristoranti[17][1] = "Pepe Rosa"
        ristoranti[18][0] = "Pescara"
        ristoranti[18][1] = "Rostelle&Co"
        ristoranti[19][0] = "Firenze"
        ristoranti[19][1] = "Trattoria Boboli"


        var localita: EditText = findViewById(R.id.localita) as EditText
        var risultati: TextView = findViewById(R.id.risultati) as TextView
        var ricerca: ImageView = findViewById(R.id.ricerca) as ImageView
        ricerca.setOnClickListener {
            risultati.text = "Risultati:\n"
            flag = 0
            for (i in 0..19) {

                if (localita.text.toString() == ristoranti[i][0]) {
                    risultati.append(ristoranti[i][1])
                    valutazione = (1 until 6).random()
                    risultati.append(" $valutazione★\n")
                    flag = 1
                }

        }

            if (flag == 0)
                risultati.text = "Nessun ristorante trovato."
        }
    }
}
