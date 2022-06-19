package org.mightyfrog.android.customdialogfragmentsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.FrameLayout
import androidx.fragment.app.DialogFragment

class DialogFragmentOne : DialogFragment() {

    companion object {
        fun newInstance() = DialogFragmentOne()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val viewRoot = layoutInflater.inflate(R.layout.dialog_root, container, true)
        val containerDialog = viewRoot.findViewById<FrameLayout>(R.id.container)
        val viewSecond = layoutInflater.inflate(R.layout.dialog_one, containerDialog, true)
        // or viewRoot.add(viewSecond)
        val button = viewSecond.findViewById<Button>(R.id.button)
        button.setOnClickListener {
            dismiss()
        }
        return viewRoot
    }
}