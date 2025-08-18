package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class wpe extends uj0 implements Handler.Callback {
    public final imc A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public int E0;
    public oy5 F0;
    public cbe G0;
    public hbe H0;
    public jbe I0;
    public jbe J0;
    public int K0;
    public long L0;
    public final Handler x0;
    public final n75 y0;
    public final vu4 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wpe(n75 n75Var, Looper looper) {
        Handler handler;
        super(3);
        vu4 vu4Var = vu4.X;
        this.y0 = n75Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = maf.a;
            handler = new Handler(looper, this);
        }
        this.x0 = handler;
        this.z0 = vu4Var;
        this.A0 = new imc(19);
        this.L0 = -9223372036854775807L;
    }

    @Override // defpackage.uj0
    public final int A(oy5 oy5Var) {
        this.z0.getClass();
        String str = oy5Var.w0;
        if ("text/vtt".equals(str) || "text/x-ssa".equals(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-subrip".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/cea-708".equals(str) || "application/dvbsubs".equals(str) || "application/pgs".equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return uj0.b(oy5Var.P0 == 0 ? 4 : 2, 0, 0);
        }
        return ha9.i(oy5Var.w0) ? uj0.b(1, 0, 0) : uj0.b(0, 0, 0);
    }

    public final long C() {
        if (this.K0 == -1) {
            return Long.MAX_VALUE;
        }
        this.I0.getClass();
        if (this.K0 >= this.I0.u()) {
            return Long.MAX_VALUE;
        }
        return this.I0.i(this.K0);
    }

    public final void D(SubtitleDecoderException subtitleDecoderException) {
        String strValueOf = String.valueOf(this.F0);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 39);
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(strValueOf);
        fm9.c(sb.toString(), subtitleDecoderException);
        List listEmptyList = Collections.emptyList();
        Handler handler = this.x0;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            t75 t75Var = this.y0.a;
            t75Var.getClass();
            t75Var.x0.i(27, new z72(4, listEmptyList));
        }
        F();
        cbe cbeVar = this.G0;
        cbeVar.getClass();
        cbeVar.release();
        this.G0 = null;
        this.E0 = 0;
        E();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wpe.E():void");
    }

    public final void F() {
        this.H0 = null;
        this.K0 = -1;
        jbe jbeVar = this.I0;
        if (jbeVar != null) {
            jbeVar.v();
            this.I0 = null;
        }
        jbe jbeVar2 = this.J0;
        if (jbeVar2 != null) {
            jbeVar2.v();
            this.J0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        List list = (List) message.obj;
        t75 t75Var = this.y0.a;
        t75Var.getClass();
        t75Var.x0.i(27, new z72(4, list));
        return true;
    }

    @Override // defpackage.uj0
    public final String i() {
        return "TextRenderer";
    }

    @Override // defpackage.uj0
    public final boolean k() {
        return this.C0;
    }

    @Override // defpackage.uj0
    public final boolean l() {
        return true;
    }

    @Override // defpackage.uj0
    public final void m() {
        this.F0 = null;
        this.L0 = -9223372036854775807L;
        List listEmptyList = Collections.emptyList();
        Handler handler = this.x0;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            t75 t75Var = this.y0.a;
            t75Var.getClass();
            t75Var.x0.i(27, new z72(4, listEmptyList));
        }
        F();
        cbe cbeVar = this.G0;
        cbeVar.getClass();
        cbeVar.release();
        this.G0 = null;
        this.E0 = 0;
    }

    @Override // defpackage.uj0
    public final void o(long j, boolean z) {
        List listEmptyList = Collections.emptyList();
        Handler handler = this.x0;
        if (handler != null) {
            handler.obtainMessage(0, listEmptyList).sendToTarget();
        } else {
            t75 t75Var = this.y0.a;
            t75Var.getClass();
            t75Var.x0.i(27, new z72(4, listEmptyList));
        }
        this.B0 = false;
        this.C0 = false;
        this.L0 = -9223372036854775807L;
        if (this.E0 == 0) {
            F();
            cbe cbeVar = this.G0;
            cbeVar.getClass();
            cbeVar.flush();
            return;
        }
        F();
        cbe cbeVar2 = this.G0;
        cbeVar2.getClass();
        cbeVar2.release();
        this.G0 = null;
        this.E0 = 0;
        E();
    }

    @Override // defpackage.uj0
    public final void s(oy5[] oy5VarArr, long j, long j2) {
        this.F0 = oy5VarArr[0];
        if (this.G0 != null) {
            this.E0 = 1;
        } else {
            E();
        }
    }

    @Override // defpackage.uj0
    public final void w(long j, long j2) {
        boolean z;
        imc imcVar = this.A0;
        if (this.v0) {
            long j3 = this.L0;
            if (j3 != -9223372036854775807L && j >= j3) {
                F();
                this.C0 = true;
            }
        }
        if (this.C0) {
            return;
        }
        if (this.J0 == null) {
            cbe cbeVar = this.G0;
            cbeVar.getClass();
            cbeVar.b(j);
            try {
                cbe cbeVar2 = this.G0;
                cbeVar2.getClass();
                this.J0 = cbeVar2.c();
            } catch (SubtitleDecoderException e) {
                D(e);
                return;
            }
        }
        if (this.Y != 2) {
            return;
        }
        if (this.I0 != null) {
            long jC = C();
            z = false;
            while (jC <= j) {
                this.K0++;
                jC = C();
                z = true;
            }
        } else {
            z = false;
        }
        jbe jbeVar = this.J0;
        if (jbeVar != null) {
            if (jbeVar.f(4)) {
                if (!z && C() == Long.MAX_VALUE) {
                    if (this.E0 == 2) {
                        F();
                        cbe cbeVar3 = this.G0;
                        cbeVar3.getClass();
                        cbeVar3.release();
                        this.G0 = null;
                        this.E0 = 0;
                        E();
                    } else {
                        F();
                        this.C0 = true;
                    }
                }
            } else if (jbeVar.c <= j) {
                jbe jbeVar2 = this.I0;
                if (jbeVar2 != null) {
                    jbeVar2.v();
                }
                this.K0 = jbeVar.g(j);
                this.I0 = jbeVar;
                this.J0 = null;
                z = true;
            }
        }
        if (z) {
            this.I0.getClass();
            List listP = this.I0.p(j);
            Handler handler = this.x0;
            if (handler != null) {
                handler.obtainMessage(0, listP).sendToTarget();
            } else {
                t75 t75Var = this.y0.a;
                t75Var.getClass();
                t75Var.x0.i(27, new z72(4, listP));
            }
        }
        if (this.E0 == 2) {
            return;
        }
        while (!this.B0) {
            try {
                hbe hbeVar = this.H0;
                if (hbeVar == null) {
                    cbe cbeVar4 = this.G0;
                    cbeVar4.getClass();
                    hbeVar = (hbe) cbeVar4.f();
                    if (hbeVar == null) {
                        return;
                    } else {
                        this.H0 = hbeVar;
                    }
                }
                if (this.E0 == 1) {
                    hbeVar.b = 4;
                    cbe cbeVar5 = this.G0;
                    cbeVar5.getClass();
                    cbeVar5.l(hbeVar);
                    this.H0 = null;
                    this.E0 = 2;
                    return;
                }
                int iV = v(imcVar, hbeVar, 0);
                if (iV == -4) {
                    if (hbeVar.f(4)) {
                        this.B0 = true;
                        this.D0 = false;
                    } else {
                        oy5 oy5Var = (oy5) imcVar.c;
                        if (oy5Var == null) {
                            return;
                        }
                        hbeVar.u0 = oy5Var.A0;
                        hbeVar.y();
                        this.D0 &= !hbeVar.f(1);
                    }
                    if (!this.D0) {
                        cbe cbeVar6 = this.G0;
                        cbeVar6.getClass();
                        cbeVar6.l(hbeVar);
                        this.H0 = null;
                    }
                } else if (iV == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e2) {
                D(e2);
                return;
            }
        }
    }
}
