package defpackage;

import android.media.AudioTrack;
import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class m70 {
    public final /* synthetic */ int a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final Object g;

    public m70(AudioTrack audioTrack, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.g = new l70(audioTrack);
                a();
                break;
            default:
                if (maf.a < 19) {
                    this.g = null;
                    b(3);
                    break;
                } else {
                    this.g = new k70(audioTrack);
                    a();
                    break;
                }
        }
    }

    public final void a() {
        switch (this.a) {
            case 0:
                if (((k70) this.g) != null) {
                    b(0);
                    break;
                }
                break;
            default:
                if (((l70) this.g) != null) {
                    b(0);
                    break;
                }
                break;
        }
    }

    public final void b(int i) {
        switch (this.a) {
            case 0:
                this.b = i;
                if (i == 0) {
                    this.e = 0L;
                    this.f = -1L;
                    this.c = System.nanoTime() / 1000;
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                }
                if (i == 1) {
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                }
                if (i == 2 || i == 3) {
                    this.d = 10000000L;
                    return;
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    this.d = 500000L;
                    return;
                }
            default:
                this.b = i;
                if (i == 0) {
                    this.e = 0L;
                    this.f = -1L;
                    this.c = System.nanoTime() / 1000;
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                }
                if (i == 1) {
                    this.d = WorkRequest.MIN_BACKOFF_MILLIS;
                    return;
                }
                if (i == 2 || i == 3) {
                    this.d = 10000000L;
                    return;
                } else {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    this.d = 500000L;
                    return;
                }
        }
    }
}
