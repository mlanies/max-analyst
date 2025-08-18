package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class n40 {
    public final AudioManager b;
    public int c;
    public int d;
    public AudioFocusRequest f;
    public final AudioManager.OnAudioFocusChangeListener g;
    public Object h;
    public Object i;
    public final /* synthetic */ int a = 0;
    public float e = 1.0f;

    public n40(Context context, Handler handler, n75 n75Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.b = audioManager;
        this.h = n75Var;
        this.g = new m40(0, handler, this);
        this.c = 0;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                if (this.c != 0) {
                    int i = maf.a;
                    AudioManager audioManager = this.b;
                    if (i >= 26) {
                        AudioFocusRequest audioFocusRequest = this.f;
                        if (audioFocusRequest != null) {
                            audioManager.abandonAudioFocusRequest(audioFocusRequest);
                        }
                    } else {
                        audioManager.abandonAudioFocus((m40) this.g);
                    }
                    c(0);
                    break;
                }
                break;
            default:
                int i2 = this.c;
                if (i2 != 1 && i2 != 0) {
                    int i3 = oaf.a;
                    AudioManager audioManager2 = this.b;
                    if (i3 < 26) {
                        audioManager2.abandonAudioFocus((m40) this.g);
                        break;
                    } else {
                        AudioFocusRequest audioFocusRequest2 = this.f;
                        if (audioFocusRequest2 != null) {
                            audioManager2.abandonAudioFocusRequest(audioFocusRequest2);
                            break;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.h30 r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.i
            h30 r0 = (defpackage.h30) r0
            boolean r0 = defpackage.oaf.a(r0, r6)
            if (r0 != 0) goto L3b
            r5.i = r6
            r0 = 0
            r1 = 1
            if (r6 != 0) goto L12
        L10:
            r2 = r0
            goto L2f
        L12:
            r2 = 3
            r3 = 2
            int r4 = r6.c
            switch(r4) {
                case 0: goto L29;
                case 1: goto L27;
                case 2: goto L25;
                case 3: goto L10;
                case 4: goto L25;
                case 5: goto L2f;
                case 6: goto L2f;
                case 7: goto L2f;
                case 8: goto L2f;
                case 9: goto L2f;
                case 10: goto L2f;
                case 11: goto L21;
                case 12: goto L2f;
                case 13: goto L2f;
                case 14: goto L27;
                case 15: goto L19;
                case 16: goto L1f;
                default: goto L19;
            }
        L19:
            java.lang.String r6 = "Unidentified audio usage: "
            defpackage.ey8.k(r4, r6)
            goto L10
        L1f:
            r2 = 4
            goto L2f
        L21:
            int r6 = r6.a
            if (r6 != r1) goto L2f
        L25:
            r2 = r3
            goto L2f
        L27:
            r2 = r1
            goto L2f
        L29:
            java.lang.String r6 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.z04.c0(r6)
            goto L27
        L2f:
            r5.d = r2
            if (r2 == r1) goto L35
            if (r2 != 0) goto L36
        L35:
            r0 = r1
        L36:
            java.lang.String r5 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.fm9.e(r5, r0)
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n40.b(h30):void");
    }

    public final void c(int i) {
        switch (this.a) {
            case 0:
                if (this.c != i) {
                    this.c = i;
                    float f = i == 3 ? 0.2f : 1.0f;
                    if (this.e != f) {
                        this.e = f;
                        n75 n75Var = (n75) this.h;
                        if (n75Var != null) {
                            t75 t75Var = n75Var.a;
                            t75Var.k2(1, 2, Float.valueOf(t75Var.e1 * t75Var.I0.e));
                            break;
                        }
                    }
                }
                break;
            default:
                if (this.c != i) {
                    this.c = i;
                    float f2 = i == 4 ? 0.2f : 1.0f;
                    if (this.e != f2) {
                        this.e = f2;
                        o75 o75Var = (o75) this.h;
                        if (o75Var != null) {
                            u75 u75Var = o75Var.a;
                            u75Var.n2(1, 2, Float.valueOf(u75Var.h1 * u75Var.N0.e));
                            break;
                        }
                    }
                }
                break;
        }
    }

    public final int d(int i, boolean z) {
        int iRequestAudioFocus;
        int iRequestAudioFocus2;
        switch (this.a) {
            case 0:
                int i2 = 1;
                if (i == 1 || this.d != 1) {
                    a();
                    if (!z) {
                        i2 = -1;
                    }
                } else {
                    if (!z) {
                        return -1;
                    }
                    if (this.c != 1) {
                        int i3 = maf.a;
                        AudioManager audioManager = this.b;
                        m40 m40Var = (m40) this.g;
                        if (i3 >= 26) {
                            AudioFocusRequest audioFocusRequest = this.f;
                            if (audioFocusRequest == null) {
                                AudioFocusRequest.Builder builder = audioFocusRequest == null ? new AudioFocusRequest.Builder(this.d) : new AudioFocusRequest.Builder(this.f);
                                g30 g30Var = (g30) this.i;
                                boolean z2 = g30Var != null && g30Var.a == 1;
                                g30Var.getClass();
                                this.f = builder.setAudioAttributes(g30Var.a()).setWillPauseWhenDucked(z2).setOnAudioFocusChangeListener(m40Var).build();
                            }
                            iRequestAudioFocus = audioManager.requestAudioFocus(this.f);
                        } else {
                            g30 g30Var2 = (g30) this.i;
                            g30Var2.getClass();
                            iRequestAudioFocus = audioManager.requestAudioFocus(m40Var, maf.x(g30Var2.c), this.d);
                        }
                        if (iRequestAudioFocus == 1) {
                            c(1);
                        } else {
                            c(0);
                            i2 = -1;
                        }
                    }
                }
                return i2;
            default:
                int i4 = 0;
                z = false;
                boolean z3 = false;
                if (i == 1 || this.d != 1) {
                    a();
                    c(0);
                    return 1;
                }
                if (!z) {
                    int i5 = this.c;
                    if (i5 != 1) {
                        return i5 != 3 ? 1 : 0;
                    }
                } else {
                    if (this.c == 2) {
                        return 1;
                    }
                    int i6 = oaf.a;
                    AudioManager audioManager2 = this.b;
                    m40 m40Var2 = (m40) this.g;
                    if (i6 >= 26) {
                        AudioFocusRequest audioFocusRequest2 = this.f;
                        if (audioFocusRequest2 == null) {
                            AudioFocusRequest.Builder builder2 = audioFocusRequest2 == null ? new AudioFocusRequest.Builder(this.d) : new AudioFocusRequest.Builder(this.f);
                            h30 h30Var = (h30) this.i;
                            if (h30Var != null && h30Var.a == 1) {
                                z3 = true;
                            }
                            h30Var.getClass();
                            this.f = builder2.setAudioAttributes((AudioAttributes) h30Var.b().a).setWillPauseWhenDucked(z3).setOnAudioFocusChangeListener(m40Var2).build();
                        }
                        iRequestAudioFocus2 = audioManager2.requestAudioFocus(this.f);
                    } else {
                        h30 h30Var2 = (h30) this.i;
                        h30Var2.getClass();
                        int i7 = h30Var2.c;
                        if (i7 != 13) {
                            switch (i7) {
                                case 2:
                                    break;
                                case 3:
                                    i4 = 8;
                                    break;
                                case 4:
                                    i4 = 4;
                                    break;
                                case 5:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                    i4 = 5;
                                    break;
                                case 6:
                                    i4 = 2;
                                    break;
                                default:
                                    i4 = 3;
                                    break;
                            }
                        } else {
                            i4 = 1;
                        }
                        iRequestAudioFocus2 = audioManager2.requestAudioFocus(m40Var2, i4, this.d);
                    }
                    if (iRequestAudioFocus2 == 1) {
                        c(2);
                        return 1;
                    }
                    c(1);
                }
                return -1;
        }
    }

    public n40(Context context, Handler handler, o75 o75Var) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.b = audioManager;
        this.h = o75Var;
        this.g = new m40(1, handler, this);
        this.c = 0;
    }
}
