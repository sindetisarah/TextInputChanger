package com.example.mycontacts

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Contacts_Activity : AppCompatActivity() {
    lateinit var contactList:List<Contacts>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        getContacts()
        //editText which takes in a Watcher to trigger the change
        var editText=findViewById<EditText>(R.id.editText)
        editText.addTextChangedListener(textWatcher)

    }
    fun getContacts()
    {
        var rvContacts=findViewById<RecyclerView>(R.id.rvContacts)
        //adapater expect a list of courses which we will need to create
         contactList= listOf(
            Contacts("Shadya Obuya","0723456790","shadi@gmail.com"),
            Contacts("Juliet Gisemba","0768790998","julie@gmail.com"),
            Contacts("Constant Kavaya","011178980","coni@gmail.com"),
            Contacts("Sarah Nash","0718298850","sindet@gmail.com"),
            Contacts("Tabitha Mutinda","0757909080","tabii@gmail.com"),
            Contacts("Trevor Noah","07895677890","trevornoah@gmail.com"),
            Contacts("Swift","07870709-09","swifty@gmail.com"),
            Contacts("Spinner","089675453","spiner@kotlin.jetbrains")
        )

        var coursesAdapter=ContactsAdapter(contactList)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter=coursesAdapter

    }
    private val textWatcher = object : TextWatcher {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

        }

        override fun afterTextChanged(s: Editable?) {
            filter(s.toString())
        }
    }
    fun filter(editText:String){
//
        var list2= mutableListOf<Contacts>()
        for(contacted in contactList){
            if (editText in contacted.name){
                list2.add(contacted)
                println(list2)

            }

        }

    }
}