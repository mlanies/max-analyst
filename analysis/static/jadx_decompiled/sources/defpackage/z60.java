package defpackage;

import android.media.MediaCodec;
import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.transformer.ExportException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class z60 extends yqc {
    public final y84 e;
    public final j60 f;
    public final p54 g;
    public final p54 h;
    public final u40 i;
    public final w40 j;
    public final qy5 k;
    public boolean l;
    public long m;

    public z60(qy5 qy5Var, qy5 qy5Var2, f1f f1fVar, lv4 lv4Var, zw6 zw6Var, yb9 yb9Var, v43 v43Var, hj9 hj9Var, x99 x99Var) {
        super(qy5Var, hj9Var);
        u40 u40Var = new u40(yb9Var, zw6Var);
        this.i = u40Var;
        this.k = qy5Var2;
        this.j = u40Var.i(lv4Var, qy5Var2);
        j60 j60Var = ((h60) u40Var.f).d;
        this.f = j60Var;
        fm9.k(!j60Var.equals(j60.e));
        ny5 ny5Var = new ny5();
        String str = f1fVar.b;
        if (str == null) {
            str = qy5Var.n;
            str.getClass();
        }
        ny5Var.m = ia9.l(str);
        ny5Var.B = j60Var.a;
        ny5Var.A = j60Var.b;
        ny5Var.C = j60Var.c;
        ny5Var.i = qy5Var2.j;
        qy5 qy5Var3 = new qy5(ny5Var);
        ny5 ny5VarA = qy5Var3.a();
        ny5VarA.m = ia9.l(yqc.i(qy5Var3, hj9Var.b.w(1)));
        y84 y84VarB = v43Var.b(new qy5(ny5VarA));
        this.e = y84VarB;
        this.g = new p54(0);
        this.h = new p54(0);
        qy5 qy5Var4 = y84VarB.c;
        if (!oaf.a(qy5Var3.n, qy5Var4.n)) {
            ty tyVarA = f1fVar.a();
            tyVarA.b(qy5Var4.n);
            f1fVar = tyVarA.a();
        }
        x99Var.m(f1fVar);
    }

    @Override // defpackage.yqc
    public final sf6 j(lv4 lv4Var, qy5 qy5Var, int i) {
        if (this.l) {
            return this.i.i(lv4Var, qy5Var);
        }
        this.l = true;
        fm9.k(qy5Var.equals(this.k));
        return this.j;
    }

    @Override // defpackage.yqc
    public final p54 k() {
        p54 p54Var = this.h;
        y84 y84Var = this.e;
        ByteBuffer byteBufferC = y84Var.c();
        p54Var.X = byteBufferC;
        if (byteBufferC == null) {
            return null;
        }
        MediaCodec.BufferInfo bufferInfo = y84Var.f(false) ? y84Var.a : null;
        bufferInfo.getClass();
        p54Var.Z = bufferInfo.presentationTimeUs;
        p54Var.b = 1;
        return p54Var;
    }

    @Override // defpackage.yqc
    public final qy5 l() throws ExportException {
        y84 y84Var = this.e;
        y84Var.f(false);
        return y84Var.j;
    }

    @Override // defpackage.yqc
    public final boolean m() {
        return this.e.d();
    }

    @Override // defpackage.yqc
    public final boolean n() throws MediaCodec.CryptoException, ExportException {
        boolean z;
        ByteBuffer byteBufferD;
        ByteBuffer byteBuffer;
        u40 u40Var = this.i;
        long j = -9223372036854775807L;
        if (u40Var.b) {
            z = true;
        } else {
            boolean z2 = u40Var.a;
            k74 k74Var = (k74) u40Var.e;
            if (!z2) {
                try {
                    k74Var.d((j60) u40Var.g);
                    u40Var.a = true;
                } catch (AudioProcessor$UnhandledAudioFormatException e) {
                    throw ExportException.b(e, "Error while configuring mixer");
                }
            }
            u40Var.b = true;
            int i = 0;
            while (true) {
                ArrayList arrayList = (ArrayList) u40Var.d;
                if (i >= arrayList.size()) {
                    break;
                }
                t40 t40Var = (t40) arrayList.get(i);
                if (t40Var.b == -1) {
                    w40 w40Var = t40Var.a;
                    try {
                        w40Var.l();
                        long j2 = w40Var.e.get();
                        if (j2 == -9223372036854775807L) {
                            u40Var.b = false;
                        } else if (j2 != Long.MIN_VALUE) {
                            t40Var.b = k74Var.a(w40Var.a, j2);
                        }
                    } catch (AudioProcessor$UnhandledAudioFormatException e2) {
                        throw ExportException.b(e2, "Unhandled format while adding source " + t40Var.b);
                    }
                }
                i++;
            }
            z = u40Var.b;
        }
        if (z) {
            if (!((k74) u40Var.e).e()) {
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) u40Var.d;
                    if (i2 >= arrayList2.size()) {
                        break;
                    }
                    t40 t40Var2 = (t40) arrayList2.get(i2);
                    int i3 = t40Var2.b;
                    k74 k74Var2 = (k74) u40Var.e;
                    k74Var2.c();
                    SparseArray sparseArray = k74Var2.c;
                    if (oaf.l(sparseArray, i3)) {
                        w40 w40Var2 = t40Var2.a;
                        if (!w40Var2.m() && w40Var2.d.isEmpty() && (w40Var2.l == j ? w40Var2.j || w40Var2.k : w40Var2.o && (w40Var2.j || w40Var2.k))) {
                            k74Var2.c();
                            long j3 = k74Var2.l;
                            SparseArray sparseArray2 = k74Var2.c;
                            fm9.j("Source not found.", oaf.l(sparseArray2, i3));
                            k74Var2.l = Math.max(j3, ((j74) sparseArray2.get(i3)).a);
                            sparseArray.delete(i3);
                            t40Var2.b = -1;
                            u40Var.c++;
                        } else {
                            try {
                                k74Var2.f(i3, w40Var2.l());
                            } catch (AudioProcessor$UnhandledAudioFormatException e3) {
                                throw ExportException.b(e3, "AudioGraphInput (sourceId=" + i3 + ") reconfiguration");
                            }
                        }
                    }
                    i2++;
                    j = -9223372036854775807L;
                }
            }
            if (!((ByteBuffer) u40Var.h).hasRemaining()) {
                k74 k74Var3 = (k74) u40Var.e;
                k74Var3.c();
                if (k74Var3.e()) {
                    byteBuffer = m60.a;
                } else {
                    long jMin = k74Var3.k;
                    if (k74Var3.c.size() == 0) {
                        jMin = Math.min(jMin, k74Var3.l);
                    }
                    for (int i4 = 0; i4 < k74Var3.c.size(); i4++) {
                        jMin = Math.min(jMin, ((j74) k74Var3.c.valueAt(i4)).a);
                    }
                    if (jMin <= k74Var3.j) {
                        byteBuffer = m60.a;
                    } else {
                        bu1 bu1Var = k74Var3.g[0];
                        long jMin2 = Math.min(jMin, bu1Var.b);
                        ByteBuffer byteBufferDuplicate = ((ByteBuffer) bu1Var.c).duplicate();
                        byteBufferDuplicate.position(((int) (k74Var3.j - bu1Var.a)) * k74Var3.e.d).limit(((int) (jMin2 - bu1Var.a)) * k74Var3.e.d);
                        ByteBuffer byteBufferOrder = byteBufferDuplicate.slice().order(ByteOrder.nativeOrder());
                        if (jMin2 == bu1Var.b) {
                            bu1[] bu1VarArr = k74Var3.g;
                            bu1 bu1Var2 = bu1VarArr[1];
                            bu1VarArr[0] = bu1Var2;
                            bu1VarArr[1] = k74Var3.b(bu1Var2.b);
                        }
                        k74Var3.j = jMin2;
                        k74Var3.i = Math.min(k74Var3.k, jMin2 + k74Var3.f);
                        byteBufferOrder.remaining();
                        LinkedHashMap linkedHashMap = d54.a;
                        synchronized (d54.class) {
                        }
                        byteBuffer = byteBufferOrder;
                    }
                }
                u40Var.h = byteBuffer;
            }
            if (((h60) u40Var.f).f()) {
                boolean zH = u40Var.h();
                h60 h60Var = (h60) u40Var.f;
                if (zH) {
                    h60Var.h();
                } else {
                    h60Var.i((ByteBuffer) u40Var.h);
                }
                byteBufferD = ((h60) u40Var.f).d();
            } else {
                byteBufferD = (ByteBuffer) u40Var.h;
            }
        } else {
            byteBufferD = m60.a;
        }
        if (!this.e.e(this.g)) {
            return false;
        }
        u40 u40Var2 = this.i;
        h60 h60Var2 = (h60) u40Var2.f;
        if (h60Var2.f() ? h60Var2.e() : u40Var2.h()) {
            d54.a();
            p54 p54Var = this.g;
            ByteBuffer byteBuffer2 = p54Var.X;
            byteBuffer2.getClass();
            fm9.k(byteBuffer2.position() == 0);
            long j4 = this.m;
            j60 j60Var = this.f;
            p54Var.Z = ((j4 / j60Var.d) * 1000000) / j60Var.a;
            p54Var.a(4);
            p54Var.y();
            this.e.g(p54Var);
            return false;
        }
        if (!byteBufferD.hasRemaining()) {
            return false;
        }
        p54 p54Var2 = this.g;
        ByteBuffer byteBuffer3 = p54Var2.X;
        byteBuffer3.getClass();
        int iLimit = byteBufferD.limit();
        byteBufferD.limit(Math.min(iLimit, byteBuffer3.capacity() + byteBufferD.position()));
        byteBuffer3.put(byteBufferD);
        long j5 = this.m;
        j60 j60Var2 = this.f;
        p54Var2.Z = ((j5 / j60Var2.d) * 1000000) / j60Var2.a;
        this.m = j5 + byteBuffer3.position();
        p54Var2.b = 0;
        p54Var2.y();
        byteBufferD.limit(iLimit);
        this.e.g(p54Var2);
        return true;
    }

    @Override // defpackage.yqc
    public final void o() {
        u40 u40Var;
        ArrayList arrayList;
        int i = 0;
        while (true) {
            u40Var = this.i;
            arrayList = (ArrayList) u40Var.d;
            if (i >= arrayList.size()) {
                break;
            }
            ((t40) arrayList.get(i)).a.h.j();
            i++;
        }
        arrayList.clear();
        k74 k74Var = (k74) u40Var.e;
        k74Var.c.clear();
        k74Var.d = 0;
        j60 j60Var = j60.e;
        k74Var.e = j60Var;
        k74Var.f = -1;
        k74Var.g = new bu1[0];
        k74Var.h = -9223372036854775807L;
        k74Var.i = -1L;
        k74Var.j = 0L;
        k74Var.k = Long.MAX_VALUE;
        k74Var.l = k74Var.a ? Long.MAX_VALUE : 0L;
        ((h60) u40Var.f).j();
        u40Var.c = 0;
        u40Var.h = m60.a;
        u40Var.g = j60Var;
        this.e.h();
    }

    @Override // defpackage.yqc
    public final void p() throws ExportException {
        this.e.i();
    }
}
