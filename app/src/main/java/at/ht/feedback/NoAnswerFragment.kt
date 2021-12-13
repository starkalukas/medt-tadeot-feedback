package at.ht.feedback

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import at.ht.feedback.databinding.FragmentNoAnswerBinding
import at.ht.feedback.databinding.FragmentQuestionBinding

/**
 * A simple [Fragment] subclass.
 * Use the [NoAnswerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class NoAnswerFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentNoAnswerBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_no_answer, container, false
        )
        binding.button2.setOnClickListener {
                view ->
            view.findNavController().navigate(R.id.action_noAnswerFragment_to_questionFragment)
        }
        binding.button4.setOnClickListener {
                view ->
            view.findNavController().navigate(R.id.action_noAnswerFragment_to_welcomeFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }
}