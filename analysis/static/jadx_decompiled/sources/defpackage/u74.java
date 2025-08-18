package defpackage;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.AudioSink$InitializationException;

/* loaded from: classes.dex */
public final class u74 {
    public final qy5 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final h60 i;
    public final boolean j;
    public final boolean k;
    public final boolean l;

    public u74(qy5 qy5Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, h60 h60Var, boolean z, boolean z2, boolean z3) {
        this.a = qy5Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = h60Var;
        this.j = z;
        this.k = z2;
        this.l = z3;
    }

    public static AudioAttributes c(h30 h30Var, boolean z) {
        return z ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : (AudioAttributes) h30Var.b().a;
    }

    public final AudioTrack a(h30 h30Var, int i) {
        int i2 = this.c;
        try {
            AudioTrack audioTrackB = b(h30Var, i);
            int state = audioTrackB.getState();
            if (state == 1) {
                return audioTrackB;
            }
            try {
                audioTrackB.release();
            } catch (Exception unused) {
            }
            throw new AudioSink$InitializationException(state, this.e, this.f, this.h, this.a, i2 == 1, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new AudioSink$InitializationException(0, this.e, this.f, this.h, this.a, i2 == 1, e);
        }
    }

    public final AudioTrack b(h30 h30Var, int i) {
        char c;
        int i2 = oaf.a;
        char c2 = 0;
        boolean z = this.l;
        int i3 = this.e;
        int i4 = this.g;
        int i5 = this.f;
        if (i2 >= 29) {
            return new AudioTrack.Builder().setAudioAttributes(c(h30Var, z)).setAudioFormat(oaf.s(i3, i5, i4)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }
        if (i2 >= 21) {
            return new AudioTrack(c(h30Var, z), oaf.s(i3, i5, i4), this.h, 1, i);
        }
        int i6 = h30Var.c;
        if (i6 != 13) {
            switch (i6) {
                case 2:
                    break;
                case 3:
                    c = '\b';
                    break;
                case 4:
                    c = 4;
                    break;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    c = 5;
                    break;
                case 6:
                    c = 2;
                    break;
                default:
                    c = 3;
                    break;
            }
            c2 = c;
        } else {
            c2 = 1;
        }
        if (i == 0) {
            return new AudioTrack(c2, this.e, this.f, this.g, this.h, 1);
        }
        return new AudioTrack(c2, this.e, this.f, this.g, this.h, 1, i);
    }
}
