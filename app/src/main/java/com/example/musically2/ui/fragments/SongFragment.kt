package com.example.musically2.ui.fragments

import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SongFragment : Fragment() {

//    @Inject
//    lateinit var glide: RequestManager
//
//    private lateinit var mainViewModel: MainViewModel
//    private val songViewModel: SongViewModel by viewModels()
//
//    private var curPlayingSong: Song? = null
//
//    private var playbackState: PlaybackStateCompat? = null
//
//    private var shouldUpdateSeekbar = true
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//        mainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
//        subscribeToObservers()
//
//        ivPlayPauseDetail.setOnClickListener {
//            curPlayingSong?.let {
//                mainViewModel.playOrToggleSong(it, true)
//            }
//        }
//
//        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
//            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
//                if(fromUser) {
//                    setCurPlayerTimeToTextView(progress.toLong())
//                }
//            }
//
//            override fun onStartTrackingTouch(seekBar: SeekBar?) {
//                shouldUpdateSeekbar = false
//            }
//
//            override fun onStopTrackingTouch(seekBar: SeekBar?) {
//                seekBar?.let {
//                    mainViewModel.seekTo(it.progress.toLong())
//                    shouldUpdateSeekbar = true
//                }
//            }
//        })
//
//        ivSkipPrevious.setOnClickListener {
//            mainViewModel.skipToPreviousSong()
//        }
//
//        ivSkip.setOnClickListener {
//            mainViewModel.skipToNextSong()
//        }
//    }
//
//    private fun updateTitleAndSongImage(song: Song) {
//        val title = "${song.title} - ${song.subtitle}"
//        tvSongName.text = title
//        glide.load(song.imageUrl).into(ivSongImage)
//    }
//
//    private fun subscribeToObservers() {
//        mainViewModel.mediaItems.observe(viewLifecycleOwner) {
//            it?.let { result ->
//                when(result.status) {
//                    SUCCESS -> {
//                        result.data?.let { songs ->
//                            if(curPlayingSong == null && songs.isNotEmpty()) {
//                                curPlayingSong = songs[0]
//                                updateTitleAndSongImage(songs[0])
//                            }
//                        }
//                    }
//                    else -> Unit
//                }
//            }
//        }
//        mainViewModel.curPlayingSong.observe(viewLifecycleOwner) {
//            if(it == null) return@observe
//            curPlayingSong = it.toSong()
//            updateTitleAndSongImage(curPlayingSong!!)
//        }
//        mainViewModel.playbackState.observe(viewLifecycleOwner) {
//            playbackState = it
//            ivPlayPauseDetail.setImageResource(
//                if(playbackState?.isPlaying == true) R.drawable.ic_pause else R.drawable.ic_play
//            )
//            seekBar.progress = it?.position?.toInt() ?: 0
//        }
//        songViewModel.curPlayerPosition.observe(viewLifecycleOwner) {
//            if(shouldUpdateSeekbar) {
//                seekBar.progress = it.toInt()
//                setCurPlayerTimeToTextView(it)
//            }
//        }
//        songViewModel.curSongDuration.observe(viewLifecycleOwner) {
//            seekBar.max = it.toInt()
//            val dateFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
//            tvSongDuration.text = dateFormat.format(it)
//        }
//    }
//
//    private fun setCurPlayerTimeToTextView(ms: Long) {
//        val dateFormat = SimpleDateFormat("mm:ss", Locale.getDefault())
//        tvCurTime.text = dateFormat.format(ms)
//    }
}





















