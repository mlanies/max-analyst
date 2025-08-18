package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;

/* loaded from: classes.dex */
public final class r88 implements Handler.Callback {
    public final /* synthetic */ int a = 0;
    public final Handler b;
    public final /* synthetic */ Object c;

    public r88(s88 s88Var, r78 r78Var) {
        this.c = s88Var;
        Handler handlerM = maf.m(this);
        this.b = handlerM;
        r78Var.l(this, handlerM);
    }

    public void a(long j) {
        Surface surface;
        t88 t88Var = (t88) this.c;
        if (this != t88Var.u2 || t88Var.W0 == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            t88Var.J1 = true;
            return;
        }
        try {
            t88Var.y0(j);
            t88Var.E0(t88Var.p2);
            t88Var.L1.f++;
            cgf cgfVar = t88Var.V1;
            boolean z = cgfVar.e != 3;
            cgfVar.e = 3;
            cgfVar.l.getClass();
            cgfVar.g = oaf.S(SystemClock.elapsedRealtime());
            if (z && (surface = t88Var.d2) != null) {
                aab aabVar = t88Var.S1;
                Handler handler = (Handler) aabVar.a;
                if (handler != null) {
                    handler.post(new tb2(aabVar, surface, SystemClock.elapsedRealtime(), 8));
                }
                t88Var.g2 = true;
            }
            t88Var.g0(j);
        } catch (ExoPlaybackException e) {
            t88Var.K1 = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (message.what != 0) {
                    break;
                } else {
                    int i = message.arg1;
                    int i2 = message.arg2;
                    int i3 = maf.a;
                    long j = (i2 & 4294967295L) | ((i & 4294967295L) << 32);
                    s88 s88Var = (s88) this.c;
                    if (this == s88Var.x2) {
                        if (j == Long.MAX_VALUE) {
                            s88Var.J1 = true;
                            break;
                        } else {
                            try {
                                s88Var.q0(j);
                                s88Var.y0();
                                s88Var.L1.f++;
                                s88Var.x0();
                                s88Var.a0(j);
                                break;
                            } catch (com.google.android.exoplayer2.ExoPlaybackException e) {
                                s88Var.K1 = e;
                                return true;
                            }
                        }
                    }
                }
                break;
            default:
                if (message.what == 0) {
                    int i4 = message.arg1;
                    int i5 = message.arg2;
                    int i6 = oaf.a;
                    a((i5 & 4294967295L) | ((i4 & 4294967295L) << 32));
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    public r88(t88 t88Var, s78 s78Var) {
        this.c = t88Var;
        Handler handlerO = oaf.o(this);
        this.b = handlerO;
        s78Var.o(this, handlerO);
    }
}
