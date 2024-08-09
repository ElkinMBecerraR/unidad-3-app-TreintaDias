package com.elkin.treintadias

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.elkin.treintadias.data.ListaPaisajes
import com.elkin.treintadias.ui.theme.TreintaDiasTheme
import com.elkin.treintadias.vistas.ListaItemsPaisajes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TreintaDiasTheme {
                Scaffold(
                    topBar = {
                        AppBarPersonalizada()
                    }, modifier = Modifier
                        .fillMaxSize()
                ) { innerPadding ->
                    Paisajes(
                        modifier = Modifier.padding(innerPadding.calculateTopPadding())
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBarPersonalizada(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(title = {
        Text(text = stringResource(id = R.string.app_name))
    }, modifier = modifier)
}

@Composable
fun Paisajes(modifier: Modifier = Modifier) {
    val paisajes = ListaPaisajes.listaPaisajes
    ListaItemsPaisajes(paisajes = paisajes)
}

@Preview(showBackground = true)
@Composable
fun PaisajesPreview() {
    TreintaDiasTheme {
        Paisajes()
    }
}