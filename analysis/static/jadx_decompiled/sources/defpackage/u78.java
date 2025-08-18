package defpackage;

import android.content.Context;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import com.google.android.exoplayer2.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class u78 extends f88 implements l78 {
    public final Context Q1;
    public final ph4 R1;
    public final d84 S1;
    public int T1;
    public boolean U1;
    public oy5 V1;
    public long W1;
    public boolean X1;
    public boolean Y1;
    public boolean Z1;
    public v75 a2;

    public u78(Context context, p78 p78Var, xw0 xw0Var, Handler handler, n75 n75Var, d84 d84Var) {
        super(1, p78Var, xw0Var, 44100.0f);
        this.Q1 = context.getApplicationContext();
        this.S1 = d84Var;
        this.R1 = new ph4(handler, n75Var);
        d84Var.r = new w4d(18, this);
    }

    public static zw6 s0(xw0 xw0Var, oy5 oy5Var, boolean z, d84 d84Var) {
        String str = oy5Var.w0;
        if (str == null) {
            ls5 ls5Var = zw6.b;
            return ffc.X;
        }
        if (d84Var.g(oy5Var) != 0) {
            List listE = o88.e("audio/raw", false, false);
            x78 x78Var = listE.isEmpty() ? null : (x78) listE.get(0);
            if (x78Var != null) {
                return zw6.n(x78Var);
            }
        }
        xw0Var.getClass();
        List listE2 = o88.e(str, z, false);
        String strB = o88.b(oy5Var);
        if (strB == null) {
            return zw6.j(listE2);
        }
        List listE3 = o88.e(strB, z, false);
        ww6 ww6VarI = zw6.i();
        ww6VarI.e(listE2);
        ww6VarI.e(listE3);
        return ww6VarI.j();
    }

    @Override // defpackage.f88
    public final r54 D(x78 x78Var, oy5 oy5Var, oy5 oy5Var2) {
        r54 r54VarB = x78Var.b(oy5Var, oy5Var2);
        int iR0 = r0(x78Var, oy5Var2);
        int i = this.T1;
        int i2 = r54VarB.e;
        if (iR0 > i) {
            i2 |= 64;
        }
        int i3 = i2;
        return new r54(x78Var.a, oy5Var, oy5Var2, i3 != 0 ? 0 : r54VarB.d, i3);
    }

    @Override // defpackage.f88
    public final float N(float f, oy5[] oy5VarArr) {
        int iMax = -1;
        for (oy5 oy5Var : oy5VarArr) {
            int i = oy5Var.K0;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // defpackage.f88
    public final ArrayList O(xw0 xw0Var, oy5 oy5Var, boolean z) {
        zw6 zw6VarS0 = s0(xw0Var, oy5Var, z, this.S1);
        Pattern pattern = o88.a;
        ArrayList arrayList = new ArrayList(zw6VarS0);
        Collections.sort(arrayList, new ca3(4, new z16(19, oy5Var)));
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    @Override // defpackage.f88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.n78 Q(defpackage.x78 r12, defpackage.oy5 r13, android.media.MediaCrypto r14, float r15) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.Q(x78, oy5, android.media.MediaCrypto, float):n78");
    }

    @Override // defpackage.f88
    public final void V(Exception exc) {
        fm9.c("Audio codec error", exc);
        ph4 ph4Var = this.R1;
        Handler handler = (Handler) ph4Var.a;
        if (handler != null) {
            handler.post(new x60(ph4Var, exc, 0));
        }
    }

    @Override // defpackage.f88
    public final void W(long j, String str, long j2) {
        ph4 ph4Var = this.R1;
        Handler handler = (Handler) ph4Var.a;
        if (handler != null) {
            handler.post(new v60(ph4Var, str, j, j2, 0));
        }
    }

    @Override // defpackage.f88
    public final void X(String str) {
        ph4 ph4Var = this.R1;
        Handler handler = (Handler) ph4Var.a;
        if (handler != null) {
            handler.post(new c(ph4Var, 6, str));
        }
    }

    @Override // defpackage.f88
    public final r54 Y(imc imcVar) {
        r54 r54VarY = super.Y(imcVar);
        oy5 oy5Var = (oy5) imcVar.c;
        ph4 ph4Var = this.R1;
        Handler handler = (Handler) ph4Var.a;
        if (handler != null) {
            handler.post(new f5(ph4Var, oy5Var, r54VarY, 2));
        }
        return r54VarY;
    }

    @Override // defpackage.f88
    public final void Z(oy5 oy5Var, MediaFormat mediaFormat) throws ExoPlaybackException {
        int i;
        oy5 oy5Var2 = this.V1;
        int[] iArr = null;
        if (oy5Var2 != null) {
            oy5Var = oy5Var2;
        } else if (this.U0 != null) {
            int iU = "audio/raw".equals(oy5Var.w0) ? oy5Var.L0 : (maf.a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? maf.u(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            my5 my5Var = new my5();
            my5Var.k = "audio/raw";
            my5Var.z = iU;
            my5Var.A = oy5Var.M0;
            my5Var.B = oy5Var.N0;
            my5Var.x = mediaFormat.getInteger("channel-count");
            my5Var.y = mediaFormat.getInteger("sample-rate");
            oy5 oy5Var3 = new oy5(my5Var);
            if (this.U1 && oy5Var3.J0 == 6 && (i = oy5Var.J0) < 6) {
                iArr = new int[i];
                for (int i2 = 0; i2 < i; i2++) {
                    iArr[i2] = i2;
                }
            }
            oy5Var = oy5Var3;
        }
        try {
            this.S1.b(oy5Var, iArr);
        } catch (AudioSink$ConfigurationException e) {
            throw e(e, e.a, false, 5001);
        }
    }

    @Override // defpackage.uj0, defpackage.p4b
    public final void a(int i, Object obj) {
        d84 d84Var = this.S1;
        if (i == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (d84Var.J != fFloatValue) {
                d84Var.J = fFloatValue;
                if (d84Var.n()) {
                    if (maf.a >= 21) {
                        d84Var.u.setVolume(d84Var.J);
                        return;
                    }
                    AudioTrack audioTrack = d84Var.u;
                    float f = d84Var.J;
                    audioTrack.setStereoVolume(f, f);
                }
                return;
            }
            return;
        }
        if (i == 3) {
            g30 g30Var = (g30) obj;
            if (d84Var.v.equals(g30Var)) {
                return;
            }
            d84Var.v = g30Var;
            if (d84Var.Y) {
                return;
            }
            d84Var.d();
            return;
        }
        if (i == 6) {
            pc0 pc0Var = (pc0) obj;
            if (d84Var.X.equals(pc0Var)) {
                return;
            }
            pc0Var.getClass();
            if (d84Var.u != null) {
                d84Var.X.getClass();
            }
            d84Var.X = pc0Var;
            return;
        }
        switch (i) {
            case 9:
                d84Var.s(d84Var.h().a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (d84Var.W != iIntValue) {
                    d84Var.W = iIntValue;
                    d84Var.V = iIntValue != 0;
                    d84Var.d();
                    break;
                }
                break;
            case 11:
                this.a2 = (v75) obj;
                break;
        }
    }

    @Override // defpackage.f88
    public final void b0() {
        this.S1.G = true;
    }

    @Override // defpackage.f88
    public final void c0(o54 o54Var) {
        if (!this.X1 || o54Var.f(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(o54Var.Y - this.W1) > 500000) {
            this.W1 = o54Var.Y;
        }
        this.X1 = false;
    }

    @Override // defpackage.l78
    public final b3b d() {
        d84 d84Var = this.S1;
        return d84Var.k ? d84Var.y : d84Var.h().a;
    }

    @Override // defpackage.f88
    public final boolean e0(long j, long j2, r78 r78Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, oy5 oy5Var) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.V1 != null && (i2 & 2) != 0) {
            r78Var.getClass();
            r78Var.releaseOutputBuffer(i, false);
            return true;
        }
        d84 d84Var = this.S1;
        if (z) {
            if (r78Var != null) {
                r78Var.releaseOutputBuffer(i, false);
            }
            this.L1.g += i3;
            d84Var.G = true;
            return true;
        }
        try {
            if (!d84Var.k(byteBuffer, j3, i3)) {
                return false;
            }
            if (r78Var != null) {
                r78Var.releaseOutputBuffer(i, false);
            }
            this.L1.f += i3;
            return true;
        } catch (AudioSink$InitializationException e) {
            throw e(e, e.b, e.a, 5001);
        } catch (AudioSink$WriteException e2) {
            throw e(e2, oy5Var, e2.a, 5002);
        }
    }

    @Override // defpackage.uj0
    public final l78 h() {
        return this;
    }

    @Override // defpackage.f88
    public final void h0() throws ExoPlaybackException {
        try {
            d84 d84Var = this.S1;
            if (!d84Var.S && d84Var.n() && d84Var.c()) {
                d84Var.p();
                d84Var.S = true;
            }
        } catch (AudioSink$WriteException e) {
            throw e(e, e.b, e.a, 5002);
        }
    }

    @Override // defpackage.uj0
    public final String i() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.f88, defpackage.uj0
    public final boolean k() {
        if (this.H1) {
            d84 d84Var = this.S1;
            if (!d84Var.n() || (d84Var.S && !d84Var.l())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.f88, defpackage.uj0
    public final boolean l() {
        return this.S1.l() || super.l();
    }

    @Override // defpackage.uj0
    public final void m() {
        ph4 ph4Var = this.R1;
        this.Z1 = true;
        try {
            this.S1.d();
            try {
                this.L0 = null;
                this.M1 = -9223372036854775807L;
                this.N1 = -9223372036854775807L;
                this.O1 = 0;
                K();
            } finally {
            }
        } catch (Throwable th) {
            try {
                this.L0 = null;
                this.M1 = -9223372036854775807L;
                this.N1 = -9223372036854775807L;
                this.O1 = 0;
                K();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.f88
    public final boolean m0(oy5 oy5Var) {
        return this.S1.g(oy5Var) != 0;
    }

    @Override // defpackage.uj0
    public final void n(boolean z, boolean z2) {
        n54 n54Var = new n54(0);
        this.L1 = n54Var;
        ph4 ph4Var = this.R1;
        Handler handler = (Handler) ph4Var.a;
        if (handler != null) {
            handler.post(new y60(ph4Var, n54Var, 0));
        }
        kgc kgcVar = this.c;
        kgcVar.getClass();
        boolean z3 = kgcVar.a;
        d84 d84Var = this.S1;
        if (z3) {
            d84Var.getClass();
            np8.f(maf.a >= 21);
            np8.f(d84Var.V);
            if (!d84Var.Y) {
                d84Var.Y = true;
                d84Var.d();
            }
        } else if (d84Var.Y) {
            d84Var.Y = false;
            d84Var.d();
        }
        i4b i4bVar = this.X;
        i4bVar.getClass();
        d84Var.q = i4bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
    
        if ((r4.isEmpty() ? null : (defpackage.x78) r4.get(0)) != null) goto L30;
     */
    @Override // defpackage.f88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int n0(defpackage.xw0 r11, defpackage.oy5 r12) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.n0(xw0, oy5):int");
    }

    @Override // defpackage.f88, defpackage.uj0
    public final void o(long j, boolean z) {
        super.o(j, z);
        this.S1.d();
        this.W1 = j;
        this.X1 = true;
        this.Y1 = true;
    }

    @Override // defpackage.uj0
    public final void p() {
        d84 d84Var = this.S1;
        try {
            try {
                F();
                g0();
                er4 er4Var = this.O0;
                if (er4Var != null) {
                    er4Var.f(null);
                }
                this.O0 = null;
            } catch (Throwable th) {
                er4 er4Var2 = this.O0;
                if (er4Var2 != null) {
                    er4Var2.f(null);
                }
                this.O0 = null;
                throw th;
            }
        } finally {
            if (this.Z1) {
                this.Z1 = false;
                d84Var.r();
            }
        }
    }

    @Override // defpackage.uj0
    public final void q() throws IllegalStateException {
        d84 d84Var = this.S1;
        d84Var.U = true;
        if (d84Var.n()) {
            m70 m70Var = d84Var.i.f;
            m70Var.getClass();
            m70Var.a();
            d84Var.u.play();
        }
    }

    @Override // defpackage.uj0
    public final void r() throws IllegalStateException {
        t0();
        d84 d84Var = this.S1;
        d84Var.U = false;
        if (d84Var.n()) {
            n70 n70Var = d84Var.i;
            n70Var.l = 0L;
            n70Var.w = 0;
            n70Var.v = 0;
            n70Var.m = 0L;
            n70Var.C = 0L;
            n70Var.F = 0L;
            n70Var.k = false;
            if (n70Var.x == -9223372036854775807L) {
                m70 m70Var = n70Var.f;
                m70Var.getClass();
                m70Var.a();
                d84Var.u.pause();
            }
        }
    }

    public final int r0(x78 x78Var, oy5 oy5Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(x78Var.a) || (i = maf.a) >= 24 || (i == 23 && maf.C(this.Q1))) {
            return oy5Var.x0;
        }
        return -1;
    }

    @Override // defpackage.l78, defpackage.m78
    public final long t() {
        if (this.Y == 2) {
            t0();
        }
        return this.W1;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c3 A[Catch: Exception -> 0x01c9, TRY_LEAVE, TryCatch #0 {Exception -> 0x01c9, blocks: (B:90:0x019d, B:92:0x01c3), top: B:164:0x019d }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t0() {
        /*
            Method dump skipped, instructions count: 897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u78.t0():void");
    }

    @Override // defpackage.l78
    public final void u(b3b b3bVar) {
        d84 d84Var = this.S1;
        d84Var.getClass();
        b3b b3bVar2 = new b3b(maf.i(b3bVar.a, 0.1f, 8.0f), maf.i(b3bVar.b, 0.1f, 8.0f));
        if (!d84Var.k || maf.a < 23) {
            d84Var.s(b3bVar2, d84Var.h().b);
        } else {
            d84Var.t(b3bVar2);
        }
    }
}
