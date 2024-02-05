//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Spacer
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.height
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.material3.Snackbar
//import androidx.compose.material3.SnackbarHost
//import androidx.compose.material3.SnackbarHostState
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.rememberCoroutineScope
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import kotlinx.coroutines.launch
//import androidx.compose.material3.ExperimentalMaterial3Api

//@OptIn(ExperimentalMaterial3Api::class)
//val snackBarHostState = remember { SnackbarHostState() }
//var textFieldVal by remember { mutableStateOf("") }
//val scope = rememberCoroutineScope()
//Scaffold { padding ->

//    Column(
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally,
//        modifier = Modifier
//            .fillMaxSize()
//            .padding(padding)
//    ) {
//
//        TextField(
//            value = textFieldVal,
//            label = { Text(text = "Enter text here") },
//            onValueChange = {
//                textFieldVal = it
//            },
//
//            singleLine = true,
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(16.dp),
//        )
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        Button(onClick = {
//            scope.launch {
//                snackBarHostState.showSnackbar(textFieldVal)
//            }
//        }) {
//            Text(text = "Greet")
//
//        }
//
//
//    }
//}
//Box(
//contentAlignment = BottomStart,
//modifier=Modifier.fillMaxSize()
//) {
//    SnackbarHost(snackBarHostState) { _ ->
//        Snackbar {
//            Text(text = textFieldVal)
//        }
//
//    }
//}

//}

//}