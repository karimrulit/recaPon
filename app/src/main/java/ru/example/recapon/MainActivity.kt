package ru.example.recapon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import ru.example.recapon.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = ZombeAdapter()
    private val imageIdList = listOf(
        R.drawable.mem1,
        R.drawable.mem2,
        R.drawable.mem3,
        R.drawable.mem4
    )

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.apply {
            listPon.layoutManager = LinearLayoutManager(this@MainActivity)
            listPon.adapter = adapter
            addButton.setOnClickListener {
                if (index > 3) index = 0
                val zombe = Pony(imageIdList[index], "Зомбитеельно но я $index")
                adapter.addZombe(zombe)
                index++
            }
        }
    }
}