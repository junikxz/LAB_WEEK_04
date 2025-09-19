package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lab_week_04.ListFragment.Companion.COFFEE_ID

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [CafeDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

private const val TAB_CONTENT = "TAB_CONTENT"
class CafeDetailFragment : Fragment() {
    private val cafeDesc: TextView?
        get() = view?.findViewById(R.id.content_description)

    private var titleRes: Int = 0
    private var descRes: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            titleRes = it.getInt(ARG_TITLE)
            descRes = it.getInt(ARG_DESC)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        cafeDesc?.setText(descRes)
    }

    companion object {
        private const val ARG_TITLE = "ARG_TITLE"
        private const val ARG_DESC = "ARG_DESC"

        fun newInstance(titleRes: Int, descRes: Int) =
            CafeDetailFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_TITLE, titleRes)
                    putInt(ARG_DESC, descRes)
                }
            }
    }
}
