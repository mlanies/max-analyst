package defpackage;

import androidx.media3.decoder.DecoderException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class vn0 implements dbe, m54 {
    public final hka a;
    public final Object b;
    public final ArrayDeque c;
    public final ArrayDeque d;
    public final p54[] e;
    public final q54[] f;
    public int g;
    public int h;
    public p54 i;
    public DecoderException j;
    public boolean k;
    public boolean l;
    public long m;
    public final /* synthetic */ int n;
    public final Object o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vn0(obe obeVar) {
        this(new ibe[2], new kbe[2]);
        this.n = 1;
        int i = this.g;
        p54[] p54VarArr = this.e;
        fm9.k(i == p54VarArr.length);
        for (p54 p54Var : p54VarArr) {
            p54Var.x(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
        this.o = obeVar;
    }

    @Override // defpackage.m54
    public final void a(long j) {
        synchronized (this.b) {
            try {
                fm9.k(this.g == this.e.length || this.k);
                this.m = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.dbe
    public void b(long j) {
    }

    public final p54 e() {
        switch (this.n) {
            case 0:
                return new p54(1);
            default:
                return new ibe(1);
        }
    }

    @Override // defpackage.m54
    public final Object f() {
        p54 p54Var;
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                fm9.k(this.i == null);
                int i = this.g;
                if (i == 0) {
                    p54Var = null;
                } else {
                    p54[] p54VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    p54Var = p54VarArr[i2];
                }
                this.i = p54Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p54Var;
    }

    @Override // defpackage.m54
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                p54 p54Var = this.i;
                if (p54Var != null) {
                    p54Var.v();
                    int i = this.g;
                    this.g = i + 1;
                    this.e[i] = p54Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    p54 p54Var2 = (p54) this.c.removeFirst();
                    p54Var2.v();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = p54Var2;
                }
                while (!this.d.isEmpty()) {
                    ((q54) this.d.removeFirst()).w();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final q54 g() {
        switch (this.n) {
            case 0:
                return new tn0(this);
            default:
                return new z02(this);
        }
    }

    public final DecoderException h(Throwable th) {
        switch (this.n) {
            case 0:
                return new ImageDecoderException("Unexpected decode error", th);
            default:
                return new SubtitleDecoderException("Unexpected decode error", th);
        }
    }

    public final DecoderException i(p54 p54Var, q54 q54Var, boolean z) {
        switch (this.n) {
            case 0:
                tn0 tn0Var = (tn0) q54Var;
                try {
                    ByteBuffer byteBuffer = p54Var.X;
                    byteBuffer.getClass();
                    fm9.k(byteBuffer.hasArray());
                    fm9.f(byteBuffer.arrayOffset() == 0);
                    un0 un0Var = (un0) this.o;
                    byte[] bArrArray = byteBuffer.array();
                    int iRemaining = byteBuffer.remaining();
                    un0Var.getClass();
                    tn0Var.X = un0.c(iRemaining, bArrArray);
                    tn0Var.c = p54Var.Z;
                    return null;
                } catch (ImageDecoderException e) {
                    return e;
                }
            default:
                ibe ibeVar = (ibe) p54Var;
                kbe kbeVar = (kbe) q54Var;
                try {
                    ByteBuffer byteBuffer2 = ibeVar.X;
                    byteBuffer2.getClass();
                    byte[] bArrArray2 = byteBuffer2.array();
                    int iLimit = byteBuffer2.limit();
                    obe obeVar = (obe) this.o;
                    if (z) {
                        obeVar.reset();
                    }
                    bbe bbeVarN = obeVar.n(0, bArrArray2, iLimit);
                    long j = ibeVar.Z;
                    long j2 = ibeVar.v0;
                    kbeVar.c = j;
                    kbeVar.X = bbeVarN;
                    if (j2 != Long.MAX_VALUE) {
                        j = j2;
                    }
                    kbeVar.Y = j;
                    kbeVar.o = false;
                    return null;
                } catch (SubtitleDecoderException e2) {
                    return e2;
                }
        }
    }

    public final boolean j() {
        boolean z;
        DecoderException decoderExceptionH;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            p54 p54Var = (p54) this.c.removeFirst();
            q54[] q54VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            q54 q54Var = q54VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (p54Var.f(4)) {
                q54Var.a(4);
            } else {
                q54Var.c = p54Var.Z;
                if (p54Var.f(134217728)) {
                    q54Var.a(134217728);
                }
                long j = p54Var.Z;
                synchronized (this.b) {
                    long j2 = this.m;
                    z = j2 == -9223372036854775807L || j >= j2;
                }
                if (!z) {
                    q54Var.o = true;
                }
                try {
                    decoderExceptionH = i(p54Var, q54Var, z2);
                } catch (OutOfMemoryError e) {
                    decoderExceptionH = h(e);
                } catch (RuntimeException e2) {
                    decoderExceptionH = h(e2);
                }
                if (decoderExceptionH != null) {
                    synchronized (this.b) {
                        this.j = decoderExceptionH;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k || q54Var.o) {
                        q54Var.w();
                    } else {
                        this.d.addLast(q54Var);
                    }
                    p54Var.v();
                    int i2 = this.g;
                    this.g = i2 + 1;
                    this.e[i2] = p54Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.m54
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final q54 c() {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (q54) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m54
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void d(p54 p54Var) {
        synchronized (this.b) {
            try {
                DecoderException decoderException = this.j;
                if (decoderException != null) {
                    throw decoderException;
                }
                fm9.f(p54Var == this.i);
                this.c.addLast(p54Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(q54 q54Var) {
        synchronized (this.b) {
            q54Var.v();
            int i = this.h;
            this.h = i + 1;
            this.f[i] = q54Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }

    @Override // defpackage.m54
    public final void release() throws InterruptedException {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public vn0(p54[] p54VarArr, q54[] q54VarArr) {
        this.b = new Object();
        this.m = -9223372036854775807L;
        this.c = new ArrayDeque();
        this.d = new ArrayDeque();
        this.e = p54VarArr;
        this.g = p54VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = e();
        }
        this.f = q54VarArr;
        this.h = q54VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = g();
        }
        hka hkaVar = new hka(2, this);
        this.a = hkaVar;
        hkaVar.start();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public vn0(un0 un0Var) {
        this(new p54[1], new tn0[1]);
        this.n = 0;
        this.o = un0Var;
    }
}
