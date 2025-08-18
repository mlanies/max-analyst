package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class w40 implements sf6 {
    public final j60 a;
    public final ConcurrentLinkedQueue b;
    public final ConcurrentLinkedQueue c;
    public final ConcurrentLinkedQueue d;
    public final AtomicLong e;
    public adb f;
    public p54 g;
    public h60 h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;

    public w40(j60 j60Var, lv4 lv4Var, qy5 qy5Var) throws AudioProcessor$UnhandledAudioFormatException {
        j60 j60Var2 = new j60(qy5Var);
        fm9.e(j60Var2, (j60Var2.c == -1 || j60Var2.a == -1 || j60Var2.b == -1) ? false : true);
        this.b = new ConcurrentLinkedQueue();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());
        for (int i = 0; i < 10; i++) {
            p54 p54Var = new p54(2);
            p54Var.X = byteBufferOrder;
            this.b.add(p54Var);
        }
        this.c = new ConcurrentLinkedQueue();
        this.d = new ConcurrentLinkedQueue();
        this.f = new adb(j60Var2);
        h60 h60VarK = k(lv4Var, qy5Var, j60Var2, j60Var);
        this.h = h60VarK;
        h60VarK.b();
        j60 j60Var3 = this.h.d;
        this.a = j60Var3;
        fm9.e(j60Var3, j60Var3.c == 2);
        this.e = new AtomicLong(-9223372036854775807L);
        this.l = -9223372036854775807L;
    }

    public static h60 k(lv4 lv4Var, qy5 qy5Var, j60 j60Var, j60 j60Var2) throws AudioProcessor$UnhandledAudioFormatException {
        int i;
        f99 f99Var;
        ww6 ww6Var = new ww6(4);
        if (lv4Var.d && qy5Var != null && (f99Var = qy5Var.k) != null) {
            ww6Var.a(new qvd(new xjc(f99Var)));
        }
        ww6Var.e(lv4Var.g.a);
        int i2 = j60Var2.a;
        if (i2 != -1) {
            vud vudVar = new vud();
            vudVar.b = i2;
            ww6Var.a(vudVar);
        }
        int i3 = j60Var2.b;
        if (i3 == 1 || i3 == 2) {
            e42 e42Var = new e42();
            f42 f42VarA = f42.a(1, i3);
            SparseArray sparseArray = e42Var.i;
            sparseArray.put(f42VarA.a, f42VarA);
            f42 f42VarA2 = f42.a(2, i3);
            sparseArray.put(f42VarA2.a, f42VarA2);
            ww6Var.a(e42Var);
        }
        h60 h60Var = new h60(ww6Var.j());
        j60 j60VarA = h60Var.a(j60Var);
        if ((i2 == -1 || i2 == j60VarA.a) && ((i3 == -1 || i3 == j60VarA.b) && ((i = j60Var2.c) == -1 || i == j60VarA.c))) {
            return h60Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException("Audio can not be modified to match downstream format", j60Var);
    }

    @Override // defpackage.q3a
    public final void b(lv4 lv4Var, long j, qy5 qy5Var, boolean z) {
        if (qy5Var == null) {
            fm9.j("Could not generate silent audio because duration is unknown.", j != -9223372036854775807L);
        } else {
            fm9.k(ia9.h(qy5Var.n));
            j60 j60Var = new j60(qy5Var);
            if (j60Var.c != -1 && j60Var.a != -1 && j60Var.b != -1) {
                z = true;
            }
            fm9.j(j60Var, z);
        }
        this.d.add(new v40(lv4Var, j, qy5Var, z));
    }

    @Override // defpackage.wqc
    public final p54 d() {
        if (this.d.isEmpty()) {
            return (p54) this.b.peek();
        }
        return null;
    }

    @Override // defpackage.wqc
    public final boolean f() {
        fm9.k(this.d.isEmpty());
        p54 p54Var = (p54) this.b.remove();
        this.c.add(p54Var);
        this.e.compareAndSet(-9223372036854775807L, p54Var.Z);
        return true;
    }

    public final void i() {
        adb adbVar = this.f;
        long j = this.l;
        long j2 = this.m;
        long jY = j - oaf.Y(((j60) adbVar.a).a, j2 / r5.d);
        j60 j60Var = (j60) adbVar.a;
        ((AtomicLong) adbVar.c).addAndGet(j60Var.d * oaf.a0(jY, j60Var.a, 1000000L, RoundingMode.CEILING));
        this.n = true;
        if (this.o) {
            this.k = true;
        }
    }

    public final void j(p54 p54Var) {
        p54Var.v();
        p54Var.Z = 0L;
        this.b.add(p54Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.nio.ByteBuffer l() {
        /*
            Method dump skipped, instructions count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w40.l():java.nio.ByteBuffer");
    }

    public final boolean m() {
        ByteBuffer byteBuffer;
        if (!this.i) {
            return false;
        }
        p54 p54Var = this.g;
        if ((p54Var == null || (byteBuffer = p54Var.X) == null || !byteBuffer.hasRemaining()) && !this.f.s() && this.c.isEmpty()) {
            return this.h.f() && !this.h.e();
        }
        return true;
    }

    public final boolean n() {
        if (!this.n) {
            long j = this.l;
            if (j != -9223372036854775807L) {
                long j2 = this.m;
                if (j - oaf.Y(((j60) this.f.a).a, j2 / r6.d) > 2000) {
                    return true;
                }
            }
        }
        return false;
    }
}
