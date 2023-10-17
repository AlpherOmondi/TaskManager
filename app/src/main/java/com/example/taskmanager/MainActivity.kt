package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManager()
        }
    }
}

@Composable
fun TaskManager(


) {
    val completedTasksMessage = stringResource(id = R.string.completed_task_message)
    val completedTasksIcon = painterResource(id = R.drawable.ic_task_completed)
    val userEncouragementMessage = stringResource(id = R.string.user_encouragement_text)
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = completedTasksIcon, contentDescription = "Tick icon")
        Text(
            text = completedTasksMessage, fontWeight = FontWeight.Bold, modifier = Modifier.padding(
                top = 24.dp, bottom =
                8.dp
            )
        )
        Text(text = userEncouragementMessage)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTaskManager() {
    TaskManager()
}

