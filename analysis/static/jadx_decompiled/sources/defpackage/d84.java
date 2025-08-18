package defpackage;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class d84 {
    public int A;
    public long B;
    public long C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public boolean H;
    public long I;
    public float J;
    public k60[] K;
    public ByteBuffer[] L;
    public ByteBuffer M;
    public int N;
    public ByteBuffer O;
    public byte[] P;
    public int Q;
    public int R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public int W;
    public pc0 X;
    public boolean Y;
    public long Z;
    public final s30 a;
    public boolean a0;
    public final cjg b;
    public boolean b0;
    public final boolean c;
    public final c42 d;
    public final y2f e;
    public final k60[] f;
    public final k60[] g;
    public final ConditionVariable h;
    public final n70 i;
    public final ArrayDeque j;
    public final boolean k;
    public final int l;
    public nw4 m;
    public final z74 n;
    public final z74 o;
    public final oz7 p;
    public i4b q;
    public w4d r;
    public t74 s;
    public t74 t;
    public AudioTrack u;
    public g30 v;
    public v74 w;
    public v74 x;
    public b3b y;
    public ByteBuffer z;

    public d84(r74 r74Var) {
        this.a = r74Var.a;
        cjg cjgVar = r74Var.b;
        this.b = cjgVar;
        int i = maf.a;
        this.c = i >= 21 && r74Var.c;
        this.k = i >= 23 && r74Var.d;
        this.l = i >= 29 ? r74Var.e : 0;
        this.p = r74Var.f;
        this.h = new ConditionVariable(true);
        this.i = new n70(new y8(this));
        c42 c42Var = new c42();
        this.d = c42Var;
        y2f y2fVar = new y2f();
        y2fVar.m = maf.f;
        this.e = y2fVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new cic(), c42Var, y2fVar);
        Collections.addAll(arrayList, (k60[]) cjgVar.a);
        this.f = (k60[]) arrayList.toArray(new k60[0]);
        this.g = new k60[]{new dn5()};
        this.J = 1.0f;
        this.v = g30.Z;
        this.W = 0;
        this.X = new pc0();
        b3b b3bVar = b3b.o;
        this.x = new v74(b3bVar, false, 0L, 0L);
        this.y = b3bVar;
        this.R = -1;
        this.K = new k60[0];
        this.L = new ByteBuffer[0];
        this.j = new ArrayDeque();
        this.n = new z74(0);
        this.o = new z74(0);
    }

    public static AudioFormat e(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2).setEncoding(i3).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair f(defpackage.oy5 r12, defpackage.s30 r13) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.f(oy5, s30):android.util.Pair");
    }

    public static boolean o(AudioTrack audioTrack) {
        return maf.a >= 29 && audioTrack.isOffloadedPlayback();
    }

    public final void a(long j) {
        b3b b3bVar;
        boolean z;
        boolean zU = u();
        cjg cjgVar = this.b;
        if (zU) {
            b3bVar = h().a;
            cjgVar.getClass();
            float f = b3bVar.a;
            uud uudVar = (uud) cjgVar.c;
            if (uudVar.c != f) {
                uudVar.c = f;
                uudVar.i = true;
            }
            float f2 = uudVar.d;
            float f3 = b3bVar.b;
            if (f2 != f3) {
                uudVar.d = f3;
                uudVar.i = true;
            }
        } else {
            b3bVar = b3b.o;
        }
        b3b b3bVar2 = b3bVar;
        int i = 0;
        if (u()) {
            z = h().b;
            ((kpd) cjgVar.b).m = z;
        } else {
            z = false;
        }
        this.j.add(new v74(b3bVar2, z, Math.max(0L, j), (j() * 1000000) / this.t.e));
        k60[] k60VarArr = this.t.i;
        ArrayList arrayList = new ArrayList();
        for (k60 k60Var : k60VarArr) {
            if (k60Var.isActive()) {
                arrayList.add(k60Var);
            } else {
                k60Var.flush();
            }
        }
        int size = arrayList.size();
        this.K = (k60[]) arrayList.toArray(new k60[size]);
        this.L = new ByteBuffer[size];
        while (true) {
            k60[] k60VarArr2 = this.K;
            if (i >= k60VarArr2.length) {
                break;
            }
            k60 k60Var2 = k60VarArr2[i];
            k60Var2.flush();
            this.L[i] = k60Var2.a();
            i++;
        }
        w4d w4dVar = this.r;
        if (w4dVar != null) {
            ph4 ph4Var = ((u78) w4dVar.b).R1;
            Handler handler = (Handler) ph4Var.a;
            if (handler != null) {
                handler.post(new u60(ph4Var, z, 0));
            }
        }
    }

    public final void b(oy5 oy5Var, int[] iArr) {
        int i;
        int iIntValue;
        k60[] k60VarArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        k60[] k60VarArr2;
        int iJ;
        int[] iArr2;
        boolean zEquals = "audio/raw".equals(oy5Var.w0);
        int i11 = oy5Var.K0;
        int i12 = oy5Var.J0;
        if (zEquals) {
            int i13 = oy5Var.L0;
            np8.d(maf.B(i13));
            int iV = maf.v(i13, i12);
            k60[] k60VarArr3 = (this.c && (i13 == 536870912 || i13 == 805306368 || i13 == 4)) ? this.g : this.f;
            int i14 = oy5Var.M0;
            y2f y2fVar = this.e;
            y2fVar.i = i14;
            y2fVar.j = oy5Var.N0;
            if (maf.a < 21 && i12 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i15 = 0; i15 < 6; i15++) {
                    iArr2[i15] = i15;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.i = iArr2;
            i60 i60Var = new i60(i11, i12, i13);
            for (k60 k60Var : k60VarArr3) {
                try {
                    i60 i60VarE = k60Var.e(i60Var);
                    if (k60Var.isActive()) {
                        i60Var = i60VarE;
                    }
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw new AudioSink$ConfigurationException(e, oy5Var);
                }
            }
            int i16 = i60Var.c;
            int i17 = i60Var.b;
            int iO = maf.o(i17);
            int iV2 = maf.v(i16, i17);
            i2 = i60Var.a;
            i3 = i16;
            k60VarArr = k60VarArr3;
            i = iV;
            i5 = iO;
            i6 = iV2;
            i4 = 0;
        } else {
            k60[] k60VarArr4 = new k60[0];
            i = -1;
            if (v(oy5Var, this.v)) {
                String str = oy5Var.w0;
                str.getClass();
                int iB = ha9.b(str, oy5Var.t0);
                iIntValue = maf.o(i12);
                k60VarArr = k60VarArr4;
                i2 = i11;
                i3 = iB;
                i4 = 1;
            } else {
                Pair pairF = f(oy5Var, this.a);
                if (pairF == null) {
                    String strValueOf = String.valueOf(oy5Var);
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 37);
                    sb.append("Unable to configure passthrough for: ");
                    sb.append(strValueOf);
                    throw new AudioSink$ConfigurationException(sb.toString(), oy5Var);
                }
                int iIntValue2 = ((Integer) pairF.first).intValue();
                iIntValue = ((Integer) pairF.second).intValue();
                k60VarArr = k60VarArr4;
                i2 = i11;
                i3 = iIntValue2;
                i4 = 2;
            }
            i5 = iIntValue;
            i6 = -1;
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i5, i3);
        np8.f(minBufferSize != -2);
        double d = this.k ? 8.0d : 1.0d;
        this.p.getClass();
        if (i4 != 0) {
            if (i4 == 1) {
                i7 = i4;
                iJ = s5c.l((50000000 * oz7.g(i3)) / 1000000);
            } else {
                if (i4 != 2) {
                    throw new IllegalArgumentException();
                }
                iJ = s5c.l(((i3 == 5 ? 500000 : 250000) * oz7.g(i3)) / 1000000);
                i7 = i4;
            }
            i8 = i;
            i9 = i2;
            i10 = i3;
            k60VarArr2 = k60VarArr;
        } else {
            i7 = i4;
            long j = i2;
            i8 = i;
            i9 = i2;
            long j2 = i6;
            i10 = i3;
            k60VarArr2 = k60VarArr;
            iJ = maf.j(minBufferSize * 4, s5c.l(((250000 * j) * j2) / 1000000), s5c.l(((750000 * j) * j2) / 1000000));
        }
        int iMax = (((Math.max(minBufferSize, (int) (iJ * d)) + i6) - 1) / i6) * i6;
        if (i10 == 0) {
            String strValueOf2 = String.valueOf(oy5Var);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 48);
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i7);
            sb2.append(") for: ");
            sb2.append(strValueOf2);
            throw new AudioSink$ConfigurationException(sb2.toString(), oy5Var);
        }
        if (i5 != 0) {
            this.a0 = false;
            t74 t74Var = new t74(oy5Var, i8, i7, i6, i9, i5, i10, iMax, k60VarArr2);
            if (n()) {
                this.s = t74Var;
                return;
            } else {
                this.t = t74Var;
                return;
            }
        }
        String strValueOf3 = String.valueOf(oy5Var);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 54);
        sb3.append("Invalid output channel config (mode=");
        sb3.append(i7);
        sb3.append(") for: ");
        sb3.append(strValueOf3);
        throw new AudioSink$ConfigurationException(sb3.toString(), oy5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c() throws java.lang.Exception {
        /*
            r9 = this;
            int r0 = r9.R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.R
            k60[] r5 = r9.K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.c()
        L1f:
            r9.q(r7)
            boolean r0 = r4.d()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.R
            int r0 = r0 + r1
            r9.R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            r9.w(r7, r0)
            java.nio.ByteBuffer r0 = r9.O
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.c():boolean");
    }

    public final void d() {
        if (n()) {
            this.B = 0L;
            this.C = 0L;
            this.D = 0L;
            this.E = 0L;
            this.b0 = false;
            this.F = 0;
            this.x = new v74(h().a, h().b, 0L, 0L);
            this.I = 0L;
            this.w = null;
            this.j.clear();
            this.M = null;
            this.N = 0;
            this.O = null;
            this.T = false;
            this.S = false;
            this.R = -1;
            this.z = null;
            this.A = 0;
            this.e.o = 0L;
            int i = 0;
            while (true) {
                k60[] k60VarArr = this.K;
                if (i >= k60VarArr.length) {
                    break;
                }
                k60 k60Var = k60VarArr[i];
                k60Var.flush();
                this.L[i] = k60Var.a();
                i++;
            }
            n70 n70Var = this.i;
            AudioTrack audioTrack = n70Var.c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.u.pause();
            }
            if (o(this.u)) {
                nw4 nw4Var = this.m;
                nw4Var.getClass();
                this.u.unregisterStreamEventCallback((b84) nw4Var.c);
                ((Handler) nw4Var.b).removeCallbacksAndMessages(null);
            }
            AudioTrack audioTrack2 = this.u;
            this.u = null;
            if (maf.a < 21 && !this.V) {
                this.W = 0;
            }
            t74 t74Var = this.s;
            if (t74Var != null) {
                this.t = t74Var;
                this.s = null;
            }
            n70Var.l = 0L;
            n70Var.w = 0;
            n70Var.v = 0;
            n70Var.m = 0L;
            n70Var.C = 0L;
            n70Var.F = 0L;
            n70Var.k = false;
            n70Var.c = null;
            n70Var.f = null;
            this.h.close();
            new n74(this, audioTrack2).start();
        }
        this.o.b = null;
        this.n.b = null;
    }

    public final int g(oy5 oy5Var) {
        if (!"audio/raw".equals(oy5Var.w0)) {
            return ((this.a0 || !v(oy5Var, this.v)) && f(oy5Var, this.a) == null) ? 0 : 2;
        }
        int i = oy5Var.L0;
        if (maf.B(i)) {
            return (i == 2 || (this.c && i == 4)) ? 2 : 1;
        }
        return 0;
    }

    public final v74 h() {
        v74 v74Var = this.w;
        if (v74Var != null) {
            return v74Var;
        }
        ArrayDeque arrayDeque = this.j;
        return !arrayDeque.isEmpty() ? (v74) arrayDeque.getLast() : this.x;
    }

    public final long i() {
        return this.t.c == 0 ? this.B / r0.b : this.C;
    }

    public final long j() {
        return this.t.c == 0 ? this.D / r0.d : this.E;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f5, code lost:
    
        if (r10.a() == 0) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c0 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(java.nio.ByteBuffer r25, long r26, int r28) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.k(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean l() {
        return n() && this.i.b(j());
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() throws com.google.android.exoplayer2.audio.AudioSink$InitializationException {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.m():void");
    }

    public final boolean n() {
        return this.u != null;
    }

    public final void p() {
        if (this.T) {
            return;
        }
        this.T = true;
        long j = j();
        n70 n70Var = this.i;
        n70Var.z = n70Var.a();
        n70Var.x = SystemClock.elapsedRealtime() * 1000;
        n70Var.A = j;
        this.u.stop();
        this.A = 0;
    }

    public final void q(long j) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.K.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.L[i - 1];
            } else {
                byteBuffer = this.M;
                if (byteBuffer == null) {
                    byteBuffer = k60.a;
                }
            }
            if (i == length) {
                w(j, byteBuffer);
            } else {
                k60 k60Var = this.K[i];
                if (i > this.R) {
                    k60Var.b(byteBuffer);
                }
                ByteBuffer byteBufferA = k60Var.a();
                this.L[i] = byteBufferA;
                if (byteBufferA.hasRemaining()) {
                    i++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i--;
            }
        }
    }

    public final void r() {
        d();
        for (k60 k60Var : this.f) {
            k60Var.reset();
        }
        for (k60 k60Var2 : this.g) {
            k60Var2.reset();
        }
        this.U = false;
        this.a0 = false;
    }

    public final void s(b3b b3bVar, boolean z) {
        v74 v74VarH = h();
        if (b3bVar.equals(v74VarH.a) && z == v74VarH.b) {
            return;
        }
        v74 v74Var = new v74(b3bVar, z, -9223372036854775807L, -9223372036854775807L);
        if (n()) {
            this.w = v74Var;
        } else {
            this.x = v74Var;
        }
    }

    public final void t(b3b b3bVar) {
        if (n()) {
            try {
                this.u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(b3bVar.a).setPitch(b3bVar.b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                fm9.c("Failed to set playback params", e);
            }
            b3bVar = new b3b(this.u.getPlaybackParams().getSpeed(), this.u.getPlaybackParams().getPitch());
            float f = b3bVar.a;
            n70 n70Var = this.i;
            n70Var.j = f;
            m70 m70Var = n70Var.f;
            if (m70Var != null) {
                m70Var.a();
            }
        }
        this.y = b3bVar;
    }

    public final boolean u() {
        if (!this.Y && "audio/raw".equals(this.t.a.w0)) {
            int i = this.t.a.L0;
            if (this.c) {
                int i2 = maf.a;
                if (i == 536870912 || i == 805306368 || i == 4) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean v(oy5 oy5Var, g30 g30Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i;
        int iO;
        int i2 = maf.a;
        if (i2 < 29 || (i = this.l) == 0) {
            return false;
        }
        String str = oy5Var.w0;
        str.getClass();
        int iB = ha9.b(str, oy5Var.t0);
        if (iB == 0 || (iO = maf.o(oy5Var.J0)) == 0) {
            return false;
        }
        AudioFormat audioFormatE = e(oy5Var.K0, iO, iB);
        AudioAttributes audioAttributesA = g30Var.a();
        int playbackOffloadSupport = i2 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributesA) : !AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributesA) ? 0 : (i2 == 30 && maf.d.startsWith("Pixel")) ? 2 : 1;
        if (playbackOffloadSupport == 0) {
            return false;
        }
        if (playbackOffloadSupport == 1) {
            return ((oy5Var.M0 != 0 || oy5Var.N0 != 0) && (i == 1)) ? false : true;
        }
        if (playbackOffloadSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(long r13, java.nio.ByteBuffer r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d84.w(long, java.nio.ByteBuffer):void");
    }
}
