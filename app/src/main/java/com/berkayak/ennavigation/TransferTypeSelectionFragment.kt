package com.berkayak.ennavigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavArgs
import androidx.navigation.NavArgsLazy
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.navOptions
import com.berkayak.ennavigation.model.TransferOperationData
import com.berkayak.ennavigation.model.TransferType
import kotlinx.android.synthetic.main.fragment_transfer_type_selection.*

class TransferTypeSelectionFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_transfer_type_selection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonIban.setOnClickListener(typeSelectionListener)
        buttonAccount.setOnClickListener(typeSelectionListener)
        buttonKolas.setOnClickListener(typeSelectionListener)
    }

    private val typeSelectionListener = View.OnClickListener { button ->
        val transferOperationData = TransferOperationData()
        when(button.id) {
            R.id.buttonIban -> {
                transferOperationData.transferType = TransferType.IBAN
            }
            R.id.buttonAccount -> {
                transferOperationData.transferType = TransferType.ACCOUNT
            }
            R.id.buttonKolas -> {
                transferOperationData.transferType = TransferType.KOLAS
            }
        }

//        val args = SenderAccountSelectionFragmentArgs(transferOperationData)
        val action = TransferTypeSelectionFragmentDirections.toAccountSelection(transferOperationData)


        findNavController().navigate(action, getNavigationDefaultOptions())
    }

}