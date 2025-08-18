package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class k74 {
    public final boolean a;
    public final boolean b;
    public int d;
    public long j;
    public long l;
    public final SparseArray c = new SparseArray();
    public j60 e = j60.e;
    public int f = -1;
    public bu1[] g = new bu1[0];
    public long h = -9223372036854775807L;
    public long i = -1;
    public long k = Long.MAX_VALUE;

    public k74(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        if (z) {
            this.l = Long.MAX_VALUE;
        }
    }

    public final int a(j60 j60Var, long j) throws AudioProcessor$UnhandledAudioFormatException {
        c();
        c();
        j60 j60Var2 = this.e;
        if (j60Var.a != j60Var2.a || !j1e.h(j60Var) || !j1e.h(j60Var2)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not add source. MixerFormat=" + this.e, j60Var);
        }
        long jA0 = oaf.a0(j - this.h, j60Var.a, 1000000L, RoundingMode.CEILING);
        int i = this.d;
        this.d = i + 1;
        this.c.append(i, new j74(this, j60Var, f42.a(j60Var.b, this.e.b), jA0));
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        return i;
    }

    public final bu1 b(long j) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(this.f * this.e.d).order(ByteOrder.nativeOrder());
        byteBufferOrder.mark();
        bu1 bu1Var = new bu1();
        bu1Var.c = byteBufferOrder;
        bu1Var.a = j;
        bu1Var.b = this.f + j;
        return bu1Var;
    }

    public final void c() {
        fm9.j("Audio mixer is not configured.", !this.e.equals(j60.e));
    }

    public final void d(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        fm9.j("Audio mixer already configured.", this.e.equals(j60.e));
        if (!j1e.h(j60Var)) {
            throw new AudioProcessor$UnhandledAudioFormatException("Can not mix to this AudioFormat.", j60Var);
        }
        this.e = j60Var;
        this.f = (500 * j60Var.a) / 1000;
        this.h = 0L;
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        this.g = new bu1[]{b(0L), b(this.f)};
        this.i = Math.min(this.k, this.j + this.f);
    }

    public final boolean e() {
        c();
        long j = this.j;
        return j >= this.k || (j >= this.l && this.c.size() == 0);
    }

    public final void f(int i, ByteBuffer byteBuffer) {
        int i2;
        k74 k74Var = this;
        c();
        if (byteBuffer.hasRemaining()) {
            SparseArray sparseArray = k74Var.c;
            fm9.j("Source not found.", oaf.l(sparseArray, i));
            j74 j74Var = (j74) sparseArray.get(i);
            if (j74Var.a >= k74Var.i) {
                return;
            }
            long jMin = Math.min(j74Var.a + (byteBuffer.remaining() / j74Var.b.d), k74Var.i);
            if (j74Var.c.d) {
                j74Var.a(jMin, byteBuffer);
                return;
            }
            long j = j74Var.a;
            long j2 = k74Var.j;
            if (j < j2) {
                j74Var.a(Math.min(jMin, j2), byteBuffer);
                if (j74Var.a == jMin) {
                    return;
                }
            }
            bu1[] bu1VarArr = k74Var.g;
            int length = bu1VarArr.length;
            int i3 = 0;
            while (i3 < length) {
                bu1 bu1Var = bu1VarArr[i3];
                long j3 = j74Var.a;
                if (j3 >= bu1Var.b) {
                    i2 = i3;
                } else {
                    int i4 = ((int) (j3 - bu1Var.a)) * k74Var.e.d;
                    ByteBuffer byteBuffer2 = (ByteBuffer) bu1Var.c;
                    byteBuffer2.position(byteBuffer2.position() + i4);
                    long jMin2 = Math.min(jMin, bu1Var.b);
                    j60 j60Var = k74Var.e;
                    fm9.f(jMin2 >= j74Var.a);
                    i2 = i3;
                    j1e.B(byteBuffer, j74Var.b, (ByteBuffer) bu1Var.c, j60Var, j74Var.c, (int) (jMin2 - j74Var.a), true, j74Var.d.b);
                    j74Var.a = jMin2;
                    byteBuffer2.reset();
                    if (j74Var.a == jMin) {
                        return;
                    }
                }
                i3 = i2 + 1;
                k74Var = this;
            }
        }
    }
}
