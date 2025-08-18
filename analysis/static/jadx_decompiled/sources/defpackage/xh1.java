package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.io.IOException;
import org.webrtc.MediaStreamTrack;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class xh1 {
    public static final long[] h = {500, 535, 458, 535, 825};
    public final Context a;
    public final wh1 b;
    public final y7d c;
    public final khe d;
    public final khe e;
    public final khe f;
    public MediaPlayer g;

    public xh1(Context context, wh1 wh1Var, y7d y7dVar) {
        this.a = context;
        this.b = wh1Var;
        this.c = y7dVar;
        final int i = 0;
        this.d = new khe(new k56(this) { // from class: vh1
            public final /* synthetic */ xh1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    default:
                        qyc qycVar = (qyc) this.b.c;
                        qycVar.getClass();
                        return Boolean.valueOf(qycVar.n(PmsKey.f105reconnectcallringtone, false));
                }
            }
        });
        final int i2 = 1;
        this.e = new khe(new k56(this) { // from class: vh1
            public final /* synthetic */ xh1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    default:
                        qyc qycVar = (qyc) this.b.c;
                        qycVar.getClass();
                        return Boolean.valueOf(qycVar.n(PmsKey.f105reconnectcallringtone, false));
                }
            }
        });
        final int i3 = 2;
        this.f = new khe(new k56(this) { // from class: vh1
            public final /* synthetic */ xh1 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (AudioManager) this.b.a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                    case 1:
                        return (Vibrator) this.b.a.getSystemService("vibrator");
                    default:
                        qyc qycVar = (qyc) this.b.c;
                        qycVar.getClass();
                        return Boolean.valueOf(qycVar.n(PmsKey.f105reconnectcallringtone, false));
                }
            }
        });
    }

    public final void a(fd7 fd7Var, final boolean z) {
        hm9.n("RingtoneManagerTag", " start ringtone");
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected".toString());
        }
        hm9.n("RingtoneManagerTag", " stop ringtone");
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected".toString());
        }
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        this.g = null;
        try {
            c();
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            Context context = this.a;
            Integer num = (Integer) fd7Var.a;
            if (num != null) {
                try {
                    mediaPlayer2.setDataSource(context.getResources().openRawResourceFd(num.intValue()));
                } catch (IOException e) {
                    hm9.r("RingtoneManagerTag", e, e.getMessage(), new Object[0]);
                }
            }
            mediaPlayer2.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(0).build());
            mediaPlayer2.setLooping(z);
            mediaPlayer2.setOnPreparedListener(new th1());
            mediaPlayer2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: uh1
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer3) throws IllegalStateException {
                    if (z) {
                        return;
                    }
                    this.c();
                }
            });
            mediaPlayer2.prepareAsync();
            this.g = mediaPlayer2;
        } catch (IOException e2) {
            hm9.p("RingtoneManagerTag", "Got error during init player", e2);
        }
    }

    public final void b() {
        hm9.n("RingtoneManagerTag", " startVibrate");
        khe kheVar = this.e;
        if (((Vibrator) kheVar.getValue()).hasVibrator()) {
            ((Vibrator) kheVar.getValue()).cancel();
            ((Vibrator) kheVar.getValue()).vibrate(VibrationEffect.createWaveform(h, 0), new AudioAttributes.Builder().setContentType(4).setUsage(6).build());
        }
    }

    public final void c() throws IllegalStateException {
        hm9.n("RingtoneManagerTag", " stop all");
        hm9.n("RingtoneManagerTag", " stop ringtone");
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected".toString());
        }
        MediaPlayer mediaPlayer = this.g;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        this.g = null;
        hm9.n("RingtoneManagerTag", " stopVibrate");
        ((Vibrator) this.e.getValue()).cancel();
    }
}
