package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Contacts_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacts)
        getContacts()
    }
    fun getContacts()
    {
        var rvContacts=findViewById<RecyclerView>(R.id.rvContacts)
        //adapater expect a list of courses which we will need to create
        var contactList= listOf(
            Contacts("Shadya Obuya","0723456790","shadi@gmail.com"),
            Contacts("Juliet Gisemba","0768790998","julie@gmail.com"),
            Contacts("Constant Kavaya","011178980","coni@gmail.com"),
            Contacts("Sarah Nash","0718298850","sindet@gmail.com"),
            Contacts("Tabitha Mutinda","0757909080","tabii@gmail.com")






        )
        var coursesAdapter=ContactsAdapter(contactList)
        rvContacts.layoutManager= LinearLayoutManager(baseContext)
        rvContacts.adapter=coursesAdapter

    }
}