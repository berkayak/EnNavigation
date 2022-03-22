package com.berkayak.ennavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.berkayak.ennavigation.model.Account
import com.berkayak.ennavigation.model.TransferType
import kotlinx.android.synthetic.main.fragment_sender_account_selection.*

class SenderAccountSelectionFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sender_account_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        account1.setOnClickListener(accountSelectionListener)
        account2.setOnClickListener(accountSelectionListener)
        account3.setOnClickListener(accountSelectionListener)
        account4.setOnClickListener(accountSelectionListener)
    }

    private val accountSelectionListener = View.OnClickListener { button ->
        val args: SenderAccountSelectionFragmentArgs by navArgs()
        var nextArgs = args.transferOperationData

        when(button.id) {
            R.id.account1 -> {
                nextArgs?.senderAccount = Account("1", "1", "TEST", "TEST")
            }
            R.id.account2 -> {
                nextArgs?.senderAccount = Account("2", "2", "TEST", "TEST")
            }
            R.id.account3 -> {
                nextArgs?.senderAccount = Account("3", "3", "TEST", "TEST")
            }
            R.id.account4 -> {
                nextArgs?.senderAccount = Account("4", "4", "TEST", "TEST")
            }
        }
        val action = SenderAccountSelectionFragmentDirections.toReceiverSelection(nextArgs)
        findNavController().navigate(action, getNavigationDefaultOptions())
    }

}