package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class vud implements m60 {
    public int b;
    public float c = 1.0f;
    public float d = 1.0f;
    public j60 e;
    public j60 f;
    public j60 g;
    public j60 h;
    public boolean i;
    public tud j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    public vud() {
        j60 j60Var = j60.e;
        this.e = j60Var;
        this.f = j60Var;
        this.g = j60Var;
        this.h = j60Var;
        ByteBuffer byteBuffer = m60.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
    }

    @Override // defpackage.m60
    public final ByteBuffer a() {
        tud tudVar = this.j;
        if (tudVar != null) {
            int i = tudVar.n;
            int i2 = tudVar.c;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.k.capacity() < i3) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
                    this.k = byteBufferOrder;
                    this.l = byteBufferOrder.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int iMin = Math.min(shortBuffer.remaining() / i2, tudVar.n);
                int i4 = iMin * i2;
                shortBuffer.put(tudVar.m, 0, i4);
                int i5 = tudVar.n - iMin;
                tudVar.n = i5;
                short[] sArr = tudVar.m;
                System.arraycopy(sArr, i4, sArr, 0, i5 * i2);
                this.o += i3;
                this.k.limit(i3);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = m60.a;
        return byteBuffer;
    }

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            tud tudVar = this.j;
            tudVar.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.n += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = tudVar.c;
            int i2 = iRemaining2 / i;
            short[] sArrC = tudVar.c(tudVar.k, tudVar.l, i2);
            tudVar.k = sArrC;
            shortBufferAsShortBuffer.get(sArrC, tudVar.l * i, ((i2 * i) * 2) / 2);
            tudVar.l += i2;
            tudVar.g();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // defpackage.m60
    public final void c() {
        tud tudVar = this.j;
        if (tudVar != null) {
            int i = tudVar.l;
            float f = tudVar.d;
            float f2 = tudVar.e;
            int i2 = tudVar.n + ((int) ((((i / (f / f2)) + tudVar.p) / (tudVar.f * f2)) + 0.5f));
            short[] sArr = tudVar.k;
            int i3 = tudVar.i * 2;
            tudVar.k = tudVar.c(sArr, i, i3 + i);
            int i4 = 0;
            while (true) {
                int i5 = tudVar.c;
                if (i4 >= i3 * i5) {
                    break;
                }
                tudVar.k[(i5 * i) + i4] = 0;
                i4++;
            }
            tudVar.l = i3 + tudVar.l;
            tudVar.g();
            if (tudVar.n > i2) {
                tudVar.n = i2;
            }
            tudVar.l = 0;
            tudVar.s = 0;
            tudVar.p = 0;
        }
        this.p = true;
    }

    @Override // defpackage.m60
    public final boolean d() {
        tud tudVar;
        return this.p && ((tudVar = this.j) == null || (tudVar.n * tudVar.c) * 2 == 0);
    }

    @Override // defpackage.m60
    public final j60 e(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (j60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
        }
        int i = this.b;
        if (i == -1) {
            i = j60Var.a;
        }
        this.e = j60Var;
        j60 j60Var2 = new j60(i, j60Var.b, 2);
        this.f = j60Var2;
        this.i = true;
        return j60Var2;
    }

    @Override // defpackage.m60
    public final long f(long j) {
        return g(j);
    }

    @Override // defpackage.m60
    public final void flush() {
        if (isActive()) {
            j60 j60Var = this.e;
            this.g = j60Var;
            j60 j60Var2 = this.f;
            this.h = j60Var2;
            if (this.i) {
                this.j = new tud(j60Var.a, j60Var.b, this.c, this.d, j60Var2.a, 1);
            } else {
                tud tudVar = this.j;
                if (tudVar != null) {
                    tudVar.l = 0;
                    tudVar.n = 0;
                    tudVar.p = 0;
                    tudVar.q = 0;
                    tudVar.r = 0;
                    tudVar.s = 0;
                    tudVar.t = 0;
                    tudVar.u = 0;
                    tudVar.v = 0;
                    tudVar.w = 0;
                }
            }
        }
        this.m = m60.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    public final long g(long j) {
        if (this.o < PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
            return (long) (j / this.c);
        }
        long j2 = this.n;
        this.j.getClass();
        long j3 = j2 - ((r3.l * r3.c) * 2);
        int i = this.h.a;
        int i2 = this.g.a;
        return i == i2 ? oaf.a0(j, this.o, j3, RoundingMode.FLOOR) : oaf.a0(j, this.o * i2, j3 * i, RoundingMode.FLOOR);
    }

    @Override // defpackage.m60
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    @Override // defpackage.m60
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        j60 j60Var = j60.e;
        this.e = j60Var;
        this.f = j60Var;
        this.g = j60Var;
        this.h = j60Var;
        ByteBuffer byteBuffer = m60.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
