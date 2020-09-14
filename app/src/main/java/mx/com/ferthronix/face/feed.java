package mx.com.ferthronix.face;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class feed extends AppCompatActivity {

    List<Usuario> listaUsuarios;

    private RecyclerView rvUsuarios;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        rvUsuarios = findViewById(R.id.rvUsuarios);

        listaUsuarios = new ArrayList<Usuario>();

        listaUsuarios.add(new Usuario(R.drawable.m, "Fernando Adolfo", "Hace un momento", "This is the best app"));
        listaUsuarios.add(new Usuario(R.drawable.m2, "Bill Gates", "Ayer, 03:04 pm", "Do you know Windows?"));
        listaUsuarios.add(new Usuario(R.drawable.m3, "Stefan Salvatore", "01/09/2020, 04:07 pm", "Difficult decisions in life"));
        listaUsuarios.add(new Usuario(R.drawable.m4, "Elon Musk", "11/09/2020, 03:56 am", "The Cybertruck is unbreakable"));
        listaUsuarios.add(new Usuario(R.drawable.m5, "Bruce Wayne", "24/05/2020, 08:11 pm", "Because i'm Batman"));
        listaUsuarios.add(new Usuario(R.drawable.m6, "Peter Parker", "23/08/2020, 11:58 pm", "Hi everyone"));
        listaUsuarios.add(new Usuario(R.drawable.m7, "Benito Juarez", "26/08/2020, 11:54 pm", "Hi\nI enjoy this app\n\nFernando Adolfo is the best!"));
        listaUsuarios.add(new Usuario(R.drawable.m8, "Victor Van Helsing", "13/06/2020 12:00 am", "Any vampire here?\n\nPd: How are you doing?"));
        listaUsuarios.add(new Usuario(R.drawable.m9, "Rick Smith", "05:45 am", "Fernando Adolfo, add Morty please"));
        listaUsuarios.add(new Usuario(R.drawable.m10, "Peña Nieto", "05:45 am", "It's truth"));
        

        rvUsuarios.setHasFixedSize(true);

        lManager = new LinearLayoutManager(this);
        rvUsuarios.setLayoutManager(lManager);

        adapter = new AdapterUsuario(listaUsuarios);
        rvUsuarios.setAdapter(adapter);
    }
}