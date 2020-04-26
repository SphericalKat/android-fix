package dev.smoketrees.haxorswarezhaus

import android.app.Application
import com.topjohnwu.superuser.Shell

class App: Application() {
    companion object {
        init {
            Shell.Config.setFlags(Shell.FLAG_REDIRECT_STDERR);
            Shell.Config.verboseLogging(BuildConfig.DEBUG);
            Shell.Config.setTimeout(10);
        }
    }

    override fun onCreate() {
        super.onCreate()
    }
}