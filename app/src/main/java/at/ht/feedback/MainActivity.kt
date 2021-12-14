package at.ht.feedback

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(R.id.nav_host_fragment)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.nav_host_fragment)
        return navController.navigateUp()
    }

    public fun rateButtonClicked(view: View) {
        val rating = Integer.parseInt(view.tag.toString())
        Toast.makeText(this, "Rating: $rating", Toast.LENGTH_LONG).show()
        view.findNavController()
            .navigate(QuestionFragmentDirections.actionQuestionFragmentToSummaryFragment(rating))
    }
}