package denis.musicplayer.ui.main.album

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import denis.musicplayer.R
import denis.musicplayer.data.media.model.Album
import denis.musicplayer.ui.main.base.MainBaseAdapter
import denis.musicplayer.ui.main.base.MainBaseFragment
import denis.musicplayer.ui.main.base.MainBaseViewHolder
import kotlinx.android.synthetic.main.fragment_main.*
import javax.inject.Inject

/**
 * Created by denis on 01/01/2018.
 */
class AlbumFragment : MainBaseFragment(), AlbumMvpView {

    companion object {
        fun newInstance(): AlbumFragment {
            val args = Bundle()
            val fragment = AlbumFragment()
            fragment.arguments = args
            return fragment
        }
    }

    @Inject lateinit var presenter: AlbumMvpPresenter<AlbumMvpView>

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        activityComponent?.inject(this)
        presenter.onAttach(this)

        return view
    }

    override fun setUp(view: View?) {

    }
}