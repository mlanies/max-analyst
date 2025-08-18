package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class f9e {
    public final Handler a;
    public final n75 b;
    public final AudioManager c;
    public int d;
    public int e;
    public boolean f;

    public f9e(Context context, Handler handler, n75 n75Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = handler;
        this.b = n75Var;
        AudioManager audioManager = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        np8.g(audioManager);
        this.c = audioManager;
        this.d = 3;
        this.e = a(audioManager, 3);
        int i = this.d;
        this.f = maf.a >= 23 ? audioManager.isStreamMute(i) : a(audioManager, i) == 0;
        try {
            applicationContext.registerReceiver(new an(12, this), new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        } catch (RuntimeException e) {
            fm9.c("Error registering stream volume receiver", e);
        }
    }

    public static int a(AudioManager audioManager, int i) {
        try {
            return audioManager.getStreamVolume(i);
        } catch (RuntimeException e) {
            StringBuilder sb = new StringBuilder(60);
            sb.append("Could not retrieve stream volume for stream type ");
            sb.append(i);
            fm9.c(sb.toString(), e);
            return audioManager.getStreamMaxVolume(i);
        }
    }

    public final void b() {
        int i = this.d;
        AudioManager audioManager = this.c;
        int iA = a(audioManager, i);
        int i2 = this.d;
        boolean zIsStreamMute = maf.a >= 23 ? audioManager.isStreamMute(i2) : a(audioManager, i2) == 0;
        if (this.e == iA && this.f == zIsStreamMute) {
            return;
        }
        this.e = iA;
        this.f = zIsStreamMute;
        this.b.a.x0.i(30, new cl3(iA, zIsStreamMute));
    }
}
