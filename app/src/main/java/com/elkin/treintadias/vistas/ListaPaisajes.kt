package com.elkin.treintadias.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.elkin.treintadias.R
import com.elkin.treintadias.model.Paisaje
import com.elkin.treintadias.ui.theme.TreintaDiasTheme

@Composable
fun ListaItemsPaisajes(
    paisajes: List<Paisaje>
) {
    LazyColumn(modifier = Modifier.padding(top = 80.dp)) {
        items(paisajes) {
            PaisajesPantalla(paisaje = it)

        }
    }
}

@Composable
fun PaisajesPantalla(
    paisaje: Paisaje,
    modifier: Modifier = Modifier
) {
    var mostrarDescripcion by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(id = R.dimen.paddin_small))
            .clickable { mostrarDescripcion = !mostrarDescripcion }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            )
            {
                Image(
                    painter = painterResource(paisaje.imagen),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )
            }
            Titulo(nombre = paisaje.nombre)
            if (mostrarDescripcion) DescripcionPaisaje(descripcion = paisaje.descripcion)
        }
    }
}

@Composable
fun Titulo(nombre: Int) {
    Text(
        text = stringResource(nombre),
        style = MaterialTheme.typography.displayLarge
    )
}

@Composable
fun DescripcionPaisaje(descripcion: Int) {
    Text(
        text = stringResource(id = descripcion),
        style = MaterialTheme.typography.bodyLarge
    )
}

@Preview(showBackground = true)
@Composable
fun PrevieLista() {
    val paisaje = Paisaje(R.string.paisaje1, R.string.descripcion1, R.drawable.imagen1)
    TreintaDiasTheme {
        //PaisajesPantalla(paisaje = paisaje)

    }
}