package com.berkayak.ennavigation

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.berkayak.ennavigation.model.Account
import kotlinx.android.synthetic.main.fragment_receiver_account.*

class ReceiverAccountSelectionFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_receiver_account, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val args: ReceiverAccountSelectionFragmentArgs by navArgs()
//        val a = args.transferOperationData
//        Log.d("BERKAY", a?.senderAccount?.IBAN ?: "null")

        buttonNext.setOnClickListener {
            val iban = edittextIban.text.toString()
            val owner = edittextReceiverName.text.toString()
            Account(null, iban, owner, null)



        }
    }
}