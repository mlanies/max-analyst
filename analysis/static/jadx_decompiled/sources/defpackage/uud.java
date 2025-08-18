package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class uud implements k60 {
    public int b;
    public float c;
    public float d;
    public i60 e;
    public i60 f;
    public i60 g;
    public i60 h;
    public boolean i;
    public tud j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // defpackage.k60
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
        this.m = k60.a;
        return byteBuffer;
    }

    @Override // defpackage.k60
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

    @Override // defpackage.k60
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

    @Override // defpackage.k60
    public final boolean d() {
        tud tudVar;
        return this.p && ((tudVar = this.j) == null || (tudVar.n * tudVar.c) * 2 == 0);
    }

    @Override // defpackage.k60
    public final i60 e(i60 i60Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (i60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(i60Var);
        }
        int i = this.b;
        if (i == -1) {
            i = i60Var.a;
        }
        this.e = i60Var;
        i60 i60Var2 = new i60(i, i60Var.b, 2);
        this.f = i60Var2;
        this.i = true;
        return i60Var2;
    }

    @Override // defpackage.k60
    public final void flush() {
        if (isActive()) {
            i60 i60Var = this.e;
            this.g = i60Var;
            i60 i60Var2 = this.f;
            this.h = i60Var2;
            if (this.i) {
                this.j = new tud(i60Var.a, i60Var.b, this.c, this.d, i60Var2.a, 0);
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
        this.m = k60.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // defpackage.k60
    public final boolean isActive() {
        return this.f.a != -1 && (Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a);
    }

    @Override // defpackage.k60
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        i60 i60Var = i60.e;
        this.e = i60Var;
        this.f = i60Var;
        this.g = i60Var;
        this.h = i60Var;
        ByteBuffer byteBuffer = k60.a;
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
