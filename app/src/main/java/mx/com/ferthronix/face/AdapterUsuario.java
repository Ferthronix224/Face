package mx.com.ferthronix.face;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterUsuario extends RecyclerView.Adapter<AdapterUsuario.UsuarioViewHolder> {

    private List<Usuario> listaUsuarios;

    public AdapterUsuario(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    @NonNull
    @Override
    public UsuarioViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.user_card_view, viewGroup, false);
        return new UsuarioViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UsuarioViewHolder usuarioViewHolder, int i) {
        usuarioViewHolder.img.setImageResource(listaUsuarios.get(i).getImagen());
        usuarioViewHolder.lblUsuario.setText(listaUsuarios.get(i).getUsuario());
        usuarioViewHolder.lblHora.setText(listaUsuarios.get(i).getHora());
        usuarioViewHolder.lblDescripcion.setText(listaUsuarios.get(i).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaUsuarios.size();
    }

    public class UsuarioViewHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView lblUsuario, lblHora, lblDescripcion;

        public UsuarioViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img);
            lblUsuario = itemView.findViewById(R.id.lblUsuario);
            lblHora = itemView.findViewById(R.id.lblHora);
            lblDescripcion = itemView.findViewById(R.id.lblDescripcion);
        }
    }
}

