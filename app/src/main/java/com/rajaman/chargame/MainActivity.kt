package com.rajaman.chargame

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity(), OnItemSelectedListener {
    var Friends =
        arrayOf<String?>("Aman", "Aftab", "Aryan", "Jahanvi", "Alok")
    var Friends1 =
        arrayOf<String?>("Hardworking", "Smiles", "Professonal", "Smart", "Bueatiful","Kind hearted","Helping","Master","cute","beautiful","gorgeous","pritty","Understanding")



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Getting the instance of Spinner and applying OnItemSelectedListener on it
        val spin = findViewById<View>(R.id.spinner) as Spinner
        spin.onItemSelectedListener = this

        //Creating the ArrayAdapter instance having the country list
        val aa: ArrayAdapter<*> =
            ArrayAdapter<Any?>(this, android.R.layout.simple_spinner_item, Friends)
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //Setting the ArrayAdapter data on the Spinner
        spin.adapter = aa
    }

    //Performing action onItemSelected and onNothing selected
    override fun onItemSelected(
        arg0: AdapterView<*>?,
        arg1: View,
        position: Int,
        id: Long
    ) {
        if (position.equals(1)) {
            Toast.makeText(
                this,
                "Coder Guy ,Now Guess some Habbits of${Friends[position]} ",
                Toast.LENGTH_LONG
            ).show()
            button_01.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_01.setText(Friends1[r])
            }
            button_02.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_02.setText(Friends1[r])
            }
            button_03.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_03.setText(Friends1[r])
            }
            button_11.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_11.setText(Friends1[r])
            }
            button_12.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_12.setText(Friends1[r])
            }
            button_13.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_13.setText(Friends1[r])
            }
        }
            button_31.setOnClickListener {
                var r = Random.nextInt(0,3)
                button_31.setText(Friends1[r])
            }
            button_32.setOnClickListener {
                var r = Random.nextInt(0,3)
                button_32.setText(Friends1[r])
            }
            button33.setOnClickListener {
                var r = Random.nextInt(0,3)
                button33.setText(Friends1[r])
            }

                if (position.equals(2)) {
                    android.widget.Toast.makeText(
                        this,
                        "Coder Guy ,Now Guess some Habbits of${Friends[position]} ",
                        android.widget.Toast.LENGTH_LONG
                    ).show()
                    button_01.setOnClickListener {
                        var r = kotlin.random.Random.nextInt(0, 3)
                        button_01.setText(Friends1[r])
                    }
                    button_02.setOnClickListener {
                        var r = kotlin.random.Random.nextInt(0, 3)
                        button_02.setText(Friends1[r])
                    }
                    button_03.setOnClickListener {
                        var r = kotlin.random.Random.nextInt(0, 3)
                        button_03.setText(Friends1[r])
                    }
                    button_11.setOnClickListener {
                        var r = kotlin.random.Random.nextInt(0, 3)
                        button_11.setText(Friends1[r])
                    }
                    button_12.setOnClickListener {
                        var r = kotlin.random.Random.nextInt(0, 3)
                        button_12.setText(Friends1[r])
                    }
                    button_13.setOnClickListener {
                        var r = kotlin.random.Random.nextInt(0, 3)
                        button_13.setText(Friends1[r])
                    }
                }
                button_31.setOnClickListener {
                    var r = kotlin.random.Random.nextInt(0,3)
                    button_31.setText(Friends1[r])
                }
                button_32.setOnClickListener {
                    var r = kotlin.random.Random.nextInt(0,3)
                    button_32.setText(Friends1[r])
                }
                button33.setOnClickListener {
                    var r = kotlin.random.Random.nextInt(0,3)
                    button33.setText(Friends1[r])
                }
        if (position.equals(3)) {
            Toast.makeText(
                this,
                "Coder Guy ,Now Guess some Habbits of${Friends[position]} ",
                Toast.LENGTH_LONG).show()

            button_01.setOnClickListener {
                var r = Random.nextInt(10, 13)
                button_01.setText(Friends1[r])
            }
            button_02.setOnClickListener {
                var r = Random.nextInt(10, 13)
                button_02.setText(Friends1[r])
            }
            button_03.setOnClickListener {
                var r = Random.nextInt(10, 13)
                button_03.setText(Friends1[r])
            }
            button_11.setOnClickListener {
                var r = Random.nextInt(10, 13)
                button_11.setText(Friends1[r])
            }
            button_12.setOnClickListener {
                var r = Random.nextInt(10, 13)
                button_12.setText(Friends1[r])
            }
            button_13.setOnClickListener {
                var r = Random.nextInt(10, 13)
                button_13.setText(Friends1[r])
            }
        }
        button_31.setOnClickListener {
            var r = Random.nextInt(10,13)
            button_31.setText(Friends1[r])
        }
        button_32.setOnClickListener {
            var r = Random.nextInt(10,13)
            button_32.setText(Friends1[r])
        }
        button33.setOnClickListener {
            var r = Random.nextInt(10,13)
            button33.setText(Friends1[r])
        }
        if (position.equals(0)) {
            Toast.makeText(
                this,
                "Coder Guy ,Now Guess some Habbits of${Friends[position]} ",
                Toast.LENGTH_LONG).show()

            button_01.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_01.setText(Friends1[r])
            }
            button_02.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_02.setText(Friends1[r])
            }
            button_03.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_03.setText(Friends1[r])
            }
            button_11.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_11.setText(Friends1[r])
            }
            button_12.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_12.setText(Friends1[r])
            }
            button_13.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_13.setText(Friends1[r])
            }
        }
        button_31.setOnClickListener {
            var r = Random.nextInt(0,3)
            button_31.setText(Friends1[r])
        }
        button_32.setOnClickListener {
            var r = Random.nextInt(0,3)
            button_32.setText(Friends1[r])
        }
        button33.setOnClickListener {
            var r = Random.nextInt(0,3)
            button33.setText(Friends1[r])
        }
        if (position.equals(1)) {
            Toast.makeText(
                this,
                "Coder Guy ,Now Guess some Habbits of${Friends[position]} ",
                Toast.LENGTH_LONG).show()

            button_01.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_01.setText(Friends1[r])
            }
            button_02.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_02.setText(Friends1[r])
            }
            button_03.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_03.setText(Friends1[r])
            }
            button_11.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_11.setText(Friends1[r])
            }
            button_12.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_12.setText(Friends1[r])
            }
            button_13.setOnClickListener {
                var r = Random.nextInt(0, 3)
                button_13.setText(Friends1[r])
            }
        }
        button_31.setOnClickListener {
            var r = Random.nextInt(0,3)
            button_31.setText(Friends1[r])
        }
        button_32.setOnClickListener {
            var r = Random.nextInt(0,3)
            button_32.setText(Friends1[r])
        }
        button33.setOnClickListener {
            var r = Random.nextInt(0,3)
            button33.setText(Friends1[r])
        }






    }



    override fun onNothingSelected(arg0: AdapterView<*>?) {
        // TODO Auto-generated method stub

    }
}