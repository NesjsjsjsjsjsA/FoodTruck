package com.pdmtaller.A00133723_NestorAyala.Activity.Lyouts

import android.R.attr.title
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(title: String = "Hola")
{
    TopAppBar(

        title = { Text(text = title) }

    )
}

@Preview (showBackground = true)
@Composable
fun See(){

    TopBar()
}