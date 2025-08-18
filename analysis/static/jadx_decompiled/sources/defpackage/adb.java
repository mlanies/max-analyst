package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class adb implements e15, s78 {
    public Object a;
    public Object b;
    public Object c;

    public /* synthetic */ adb(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // defpackage.s78
    public void a(long j, int i, int i2, int i3) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueInputBuffer(i, 0, i2, j, i3);
    }

    public boolean b(String str) {
        qi3 qi3Var;
        boolean z;
        synchronized (this.c) {
            try {
                qi3[] qi3VarArr = (qi3[]) this.b;
                int length = qi3VarArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        qi3Var = qi3VarArr[i];
                        Object obj = qi3Var.d;
                        if (obj != null && qi3Var.b(obj) && qi3Var.c.contains(str)) {
                            break;
                        }
                        i++;
                    } else {
                        qi3Var = null;
                        break;
                    }
                }
                if (qi3Var != null) {
                    a14.u().n(f7g.a, "Work " + str + " constrained by " + qi3Var.getClass().getSimpleName());
                }
                z = qi3Var == null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public fp1 c() {
        Objects.requireNonNull((bg1) this.a);
        Objects.requireNonNull((olf) this.b);
        return new fp1(this);
    }

    @Override // defpackage.s78
    public void d(int i, long j) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.s78
    public int e() {
        return ((MediaCodec) this.a).dequeueInputBuffer(0L);
    }

    public sba f(String str) {
        return (sba) ((ConcurrentHashMap) ((je7) this.c).getValue()).computeIfAbsent(str, new di(13, new ga(this, 24, str)));
    }

    @Override // defpackage.s78
    public void flush() {
        ((MediaCodec) this.a).flush();
    }

    @Override // defpackage.s78
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            MediaCodec mediaCodec = (MediaCodec) this.a;
            iDequeueOutputBuffer = mediaCodec.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && oaf.a < 21) {
                this.c = mediaCodec.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.s78
    public ByteBuffer getInputBuffer(int i) {
        return oaf.a >= 21 ? ((MediaCodec) this.a).getInputBuffer(i) : ((ByteBuffer[]) this.b)[i];
    }

    @Override // defpackage.s78
    public ByteBuffer getOutputBuffer(int i) {
        return oaf.a >= 21 ? ((MediaCodec) this.a).getOutputBuffer(i) : ((ByteBuffer[]) this.c)[i];
    }

    @Override // defpackage.s78
    public MediaFormat getOutputFormat() {
        return ((MediaCodec) this.a).getOutputFormat();
    }

    @Override // defpackage.s78
    public void h(int i) {
        ((MediaCodec) this.a).setVideoScalingMode(i);
    }

    @Override // defpackage.s78
    public void i(int i, rz3 rz3Var, long j, int i2) throws MediaCodec.CryptoException {
        ((MediaCodec) this.a).queueSecureInputBuffer(i, 0, (MediaCodec.CryptoInfo) rz3Var.i, j, i2);
    }

    @Override // defpackage.s78
    public void j(Surface surface) {
        ((MediaCodec) this.a).setOutputSurface(surface);
    }

    public ByteBuffer l() {
        AtomicLong atomicLong = (AtomicLong) this.c;
        long j = atomicLong.get();
        ByteBuffer byteBuffer = (ByteBuffer) this.b;
        if (!byteBuffer.hasRemaining()) {
            byteBuffer.clear();
            if (j < byteBuffer.capacity()) {
                byteBuffer.limit((int) j);
            }
            atomicLong.addAndGet(-byteBuffer.remaining());
        }
        return byteBuffer;
    }

    @Override // defpackage.e15
    public boolean m(int i) {
        return ((e15) this.a).m(i) && p(i) != null;
    }

    @Override // defpackage.e15
    public f15 n(int i) {
        return p(i);
    }

    @Override // defpackage.s78
    public void o(r88 r88Var, Handler handler) {
        ((MediaCodec) this.a).setOnFrameRenderedListener(new xx(this, r88Var, 3), handler);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.f15 p(int r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.c
            java.util.HashMap r2 = (java.util.HashMap) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            boolean r3 = r2.containsKey(r3)
            if (r3 == 0) goto L1d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r0 = r2.get(r0)
            f15 r0 = (defpackage.f15) r0
            return r0
        L1d:
            java.lang.Object r3 = r0.a
            e15 r3 = (defpackage.e15) r3
            boolean r4 = r3.m(r1)
            if (r4 == 0) goto Ldb
            f15 r3 = r3.n(r1)
            java.util.Objects.requireNonNull(r3)
            java.lang.Object r0 = r0.b
            bj6 r0 = (defpackage.bj6) r0
            java.lang.Class<androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk> r4 = androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk.class
            java.util.ArrayList r0 = r0.f(r4)
            java.util.Iterator r0 = r0.iterator()
        L3c:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L72
            java.lang.Object r4 = r0.next()
            androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk r4 = (androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk) r4
            if (r4 == 0) goto L3c
            r0 = 4
            if (r1 == r0) goto L68
            r0 = 5
            if (r1 == r0) goto L5e
            r0 = 6
            if (r1 == r0) goto L54
            goto L72
        L54:
            android.util.Size r0 = new android.util.Size
            r4 = 1440(0x5a0, float:2.018E-42)
            r6 = 1080(0x438, float:1.513E-42)
            r0.<init>(r4, r6)
            goto L73
        L5e:
            android.util.Size r0 = new android.util.Size
            r4 = 960(0x3c0, float:1.345E-42)
            r6 = 720(0x2d0, float:1.009E-42)
            r0.<init>(r4, r6)
            goto L73
        L68:
            android.util.Size r0 = new android.util.Size
            r4 = 640(0x280, float:8.97E-43)
            r6 = 480(0x1e0, float:6.73E-43)
            r0.<init>(r4, r6)
            goto L73
        L72:
            r0 = 0
        L73:
            if (r0 != 0) goto L77
            r5 = r3
            goto Ldc
        L77:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r6 = r3.d()
            java.util.Iterator r6 = r6.iterator()
        L84:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lc3
            java.lang.Object r7 = r6.next()
            ha0 r7 = (defpackage.ha0) r7
            int r9 = r7.a
            int r13 = r0.getWidth()
            int r14 = r0.getHeight()
            ha0 r15 = new ha0
            int r12 = r7.i
            int r11 = r7.j
            java.lang.String r10 = r7.b
            int r8 = r7.c
            int r5 = r7.d
            r19 = r0
            int r0 = r7.g
            int r7 = r7.h
            r16 = r8
            r8 = r15
            r18 = r11
            r11 = r16
            r17 = r12
            r12 = r5
            r5 = r15
            r15 = r0
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.add(r5)
            r0 = r19
            goto L84
        Lc3:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lca
            goto Ldb
        Lca:
            int r0 = r3.a()
            int r5 = r3.b()
            java.util.List r3 = r3.c()
            ga0 r5 = defpackage.ga0.e(r0, r5, r3, r4)
            goto Ldc
        Ldb:
            r5 = 0
        Ldc:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            r2.put(r0, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adb.p(int):f15");
    }

    public String q(int i) {
        hm9.m("adb", "getVcfByPhoneContactId: phoneContactId %d", Integer.valueOf(i));
        try {
            String str = (String) mqd.r((Context) this.a, Collections.singletonList(Integer.valueOf(i)), (o45) this.c).get(i);
            if (!oag.t(str)) {
                return str;
            }
            hm9.q("adb", "getVcfByPhoneContactId: vCard is empty for phoneContactId %d", Integer.valueOf(i));
            return null;
        } catch (Exception e) {
            Locale locale = Locale.ENGLISH;
            hm9.p("adb", "getVcfByPhoneContactId: exception for phoneContactId " + i, e);
            return null;
        }
    }

    public boolean r() throws IOException {
        String strTrim;
        if (((String) this.c) != null) {
            return true;
        }
        Queue queue = (Queue) this.b;
        if (!queue.isEmpty()) {
            String str = (String) queue.poll();
            str.getClass();
            this.c = str;
            return true;
        }
        do {
            String line = ((BufferedReader) this.a).readLine();
            this.c = line;
            if (line == null) {
                return false;
            }
            strTrim = line.trim();
            this.c = strTrim;
        } while (strTrim.isEmpty());
        return true;
    }

    @Override // defpackage.s78
    public void release() {
        MediaCodec mediaCodec = (MediaCodec) this.a;
        this.b = null;
        this.c = null;
        try {
            int i = oaf.a;
            if (i >= 30 && i < 33) {
                mediaCodec.stop();
            }
        } finally {
            mediaCodec.release();
        }
    }

    @Override // defpackage.s78
    public void releaseOutputBuffer(int i, boolean z) {
        ((MediaCodec) this.a).releaseOutputBuffer(i, z);
    }

    public boolean s() {
        return ((ByteBuffer) this.b).hasRemaining() || ((AtomicLong) this.c).get() > 0;
    }

    @Override // defpackage.s78
    public void setParameters(Bundle bundle) {
        ((MediaCodec) this.a).setParameters(bundle);
    }

    public boolean t(int i, hj3 hj3Var, dob dobVar) {
        int[] iArr = hj3Var.p0;
        int i2 = iArr[0];
        xk0 xk0Var = (xk0) this.b;
        xk0Var.b = i2;
        xk0Var.d = iArr[1];
        xk0Var.e = hj3Var.q();
        xk0Var.f = hj3Var.k();
        xk0Var.k = false;
        xk0Var.j = i;
        boolean z = xk0Var.b == 3;
        boolean z2 = xk0Var.d == 3;
        boolean z3 = z && hj3Var.W > 0.0f;
        boolean z4 = z2 && hj3Var.W > 0.0f;
        int[] iArr2 = hj3Var.t;
        if (z3 && iArr2[0] == 4) {
            xk0Var.b = 1;
        }
        if (z4 && iArr2[1] == 4) {
            xk0Var.d = 1;
        }
        dobVar.c(hj3Var, xk0Var);
        hj3Var.O(xk0Var.g);
        hj3Var.L(xk0Var.h);
        hj3Var.E = xk0Var.c;
        hj3Var.I(xk0Var.i);
        xk0Var.j = 0;
        return xk0Var.k;
    }

    public String u() {
        if (!r()) {
            throw new NoSuchElementException();
        }
        String str = (String) this.c;
        this.c = null;
        return str;
    }

    public void v(JSONObject jSONObject) {
        o61 o61Var;
        gk3 gk3Var = (gk3) this.b;
        gk3Var.getClass();
        djb djbVar = null;
        try {
            o61 o61VarK = jSONObject.has("decorativeExternalParticipantId") ? f46.k(jSONObject) : null;
            bg1 bg1VarA = bg1.a(jSONObject.getString("participantId"));
            String strT = f8.t(jSONObject, "decorativeParticipantId");
            if (strT != null) {
                bg1.a(strT);
            }
            djbVar = new djb(bg1VarA, o61VarK, false, 4);
        } catch (JSONException e) {
            gk3Var.a.logException("ContactCallParser", "Can't parse decorative-id-changed info", e);
        }
        if (djbVar == null || (o61Var = (o61) djbVar.c) == null) {
            return;
        }
        kg1 kg1Var = (kg1) this.a;
        bg1 bg1Var = (bg1) djbVar.b;
        if (kg1Var.j(bg1Var) == null) {
            return;
        }
        if (kg1Var.j(bg1Var) != null) {
            zad zadVarC = kg1Var.c(bg1Var);
            List listSingletonList = Collections.singletonList((fg1) kg1Var.a(new dqa(bg1Var, new pq9(), new pq9(), new pq9(), new pq9(), new wmc(o61Var, false), new pq9()), zadVarC).c);
            boolean zF = tpa.f(zadVarC, kg1Var.k);
            id1 id1Var = kg1Var.b;
            if (zF) {
                id1Var.a.onActiveParticipantsDeAnonimized(new wy0(listSingletonList, kg1Var.d(kg1Var.k).values()));
            }
            id1Var.c.onCallParticipantsDeAnonimized(new ng1(listSingletonList));
        }
        ((s31) this.c).onDecorativeParticipantIdChanged(new q31(bg1Var));
    }

    public void w(Iterable iterable) {
        synchronized (this.c) {
            try {
                for (qi3 qi3Var : (qi3[]) this.b) {
                    if (qi3Var.e != null) {
                        qi3Var.e = null;
                        qi3Var.d(null, qi3Var.d);
                    }
                }
                for (qi3 qi3Var2 : (qi3[]) this.b) {
                    qi3Var2.c(iterable);
                }
                for (qi3 qi3Var3 : (qi3[]) this.b) {
                    if (qi3Var3.e != this) {
                        qi3Var3.e = this;
                        qi3Var3.d(this, qi3Var3.d);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x() {
        synchronized (this.c) {
            for (qi3 qi3Var : (qi3[]) this.b) {
                ArrayList arrayList = qi3Var.b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    qi3Var.a.n(qi3Var);
                }
            }
        }
    }

    public void y(ij3 ij3Var, int i, int i2, int i3) {
        int i4 = ij3Var.b0;
        int i5 = ij3Var.c0;
        ij3Var.b0 = 0;
        ij3Var.c0 = 0;
        ij3Var.O(i2);
        ij3Var.L(i3);
        if (i4 < 0) {
            ij3Var.b0 = 0;
        } else {
            ij3Var.b0 = i4;
        }
        if (i5 < 0) {
            ij3Var.c0 = 0;
        } else {
            ij3Var.c0 = i5;
        }
        ij3 ij3Var2 = (ij3) this.c;
        ij3Var2.t0 = i;
        ij3Var2.U();
    }

    public void z(ij3 ij3Var) {
        ArrayList arrayList = (ArrayList) this.a;
        arrayList.clear();
        int size = ij3Var.q0.size();
        for (int i = 0; i < size; i++) {
            hj3 hj3Var = (hj3) ij3Var.q0.get(i);
            int[] iArr = hj3Var.p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(hj3Var);
            }
        }
        ij3Var.s0.a = true;
    }

    public adb(int i) {
        switch (i) {
            case 6:
                Bitmap[] bitmapArr = new Bitmap[25];
                for (int i2 = 0; i2 < 25; i2++) {
                    bitmapArr[i2] = null;
                }
                this.a = bitmapArr;
                Integer num = 50;
                this.b = new bo0(tu0.F(num.doubleValue() * 1048576), 0);
                this.c = new mw7(100);
                break;
            default:
                this.b = olf.a;
                break;
        }
    }

    public adb(j60 j60Var) {
        this.a = j60Var;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(j60Var.d * LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY).order(ByteOrder.nativeOrder());
        this.b = byteBufferOrder;
        byteBufferOrder.flip();
        this.c = new AtomicLong();
    }

    public adb(c8d c8dVar, e7g e7gVar) {
        hl0 hl0Var = new hl0((ej3) c8dVar.a, 0);
        hl0 hl0Var2 = new hl0((il0) c8dVar.b, 1);
        hl0 hl0Var3 = new hl0((ej3) c8dVar.o, 4);
        ej3 ej3Var = (ej3) c8dVar.c;
        qi3[] qi3VarArr = {hl0Var, hl0Var2, hl0Var3, new hl0(ej3Var, 2), new hl0(ej3Var, 3), new wn9(ej3Var), new vn9(ej3Var)};
        this.a = e7gVar;
        this.b = qi3VarArr;
        this.c = new Object();
    }

    public adb(ArrayDeque arrayDeque, BufferedReader bufferedReader) {
        this.b = arrayDeque;
        this.a = bufferedReader;
    }
}
