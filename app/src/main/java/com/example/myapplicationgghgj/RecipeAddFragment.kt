package com.example.myapplicationgghgj

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.provider.MediaStore
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_recipe_add.*
import java.util.jar.Manifest


class RecipeAddFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe_add, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        kaydetbutton.setOnClickListener {
            saveIt(it)
            // println("save clicked")

        }


        imageButton.setOnClickListener {
            saveImage(it)
            //println("image clicked")
        }


    }

    fun saveIt(view: View) {

    }


    fun saveImage(view: View) {

        activity?.let {
            if (ContextCompat.checkSelfPermission(it.applicationContext,android.Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
          //izin verilmedi izin istenecek
                requestPermissions(arrayOf(android.Manifest.permission.READ_EXTERNAL_STORAGE),1)
            } else {
                val galeryIntent = Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                startActivityForResult(galeryIntent,2)

                //izin verilmis izin istemeden galeriye git


            }


        }



    }


}


