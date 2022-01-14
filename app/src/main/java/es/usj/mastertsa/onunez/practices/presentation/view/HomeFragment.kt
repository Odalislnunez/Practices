package es.usj.mastertsa.onunez.practices.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import es.usj.mastertsa.onunez.practices.R
import es.usj.mastertsa.onunez.practices.databinding.FragmentHomeBinding
import es.usj.mastertsa.onunez.practices.presentation.view.HomeState.Failure
import es.usj.mastertsa.onunez.practices.presentation.view.HomeState.Loading
import es.usj.mastertsa.onunez.practices.presentation.view.HomeState.Success
import es.usj.mastertsa.onunez.practices.presentation.viewModel.HomeViewModel
import es.usj.mastertsa.onunez.practices.presentation.viewModel.HomeViewModelFactory
import kotlinx.coroutines.flow.collect

class HomeFragment : Fragment() {

    private val viewModel: HomeViewModel by viewModels {
        HomeViewModelFactory()
   }

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewLifecycleOwner.lifecycleScope.launchWhenStarted {
            viewModel.practiceStateFlow.collect { homeState ->
                setState(homeState)
            }
        }
        viewModel.getData()
    }

    private fun setState(homeState: HomeState) {
        when (homeState) {
            is Failure -> {
                binding.loadingProgressBar.isVisible = false
                    Toast.makeText(requireContext(), "Failure", Toast.LENGTH_SHORT).show()
                }
                Loading -> binding.loadingProgressBar.isVisible = true
                is Success -> {
                    binding.loadingProgressBar.isVisible = false
                    binding.homeTextView.text = homeState.practiceData.name
                }
            }
        }

        companion object {
            fun newInstance() = HomeFragment()
        }
    }