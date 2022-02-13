package com.example.musically2.ui.fragments

import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

//    lateinit var mainViewModel: MainViewModel
//
//    @Inject
//    lateinit var songAdapter: SongAdapter
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
//        setupRecyclerView()
//        subscribeToObservers()
//
//        songAdapter.setItemClickListener {
//            mainViewModel.playOrToggleSong(it)
//        }
//    }
//
//    private fun setupRecyclerView() = rvAllSongs.apply {
//        adapter = songAdapter
//        layoutManager = LinearLayoutManager(requireContext())
//    }
//
//    private fun subscribeToObservers() {
//        mainViewModel.mediaItems.observe(viewLifecycleOwner) { result ->
//            when(result.status) {
//                Status.SUCCESS -> {
//                    allSongsProgressBar.isVisible = false
//                    result.data?.let { songs ->
//                        songAdapter.songs = songs
//                    }
//                }
//                Status.ERROR -> Unit
//                Status.LOADING -> allSongsProgressBar.isVisible = true
//            }
//        }
//    }
}
















