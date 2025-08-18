package defpackage;

import java.util.zip.Deflater;

/* loaded from: classes.dex */
public final class gg4 implements ksd {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public final Object c;
    public final Object o;

    public gg4(bt0 bt0Var, Deflater deflater) {
        this.c = new x7c(bt0Var);
        this.o = deflater;
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) {
        Object obj = this.o;
        switch (this.a) {
            case 0:
                hm9.g(bt0Var.b, 0L, j);
                while (j > 0) {
                    k2d k2dVar = bt0Var.a;
                    int iMin = (int) Math.min(j, k2dVar.c - k2dVar.b);
                    ((Deflater) obj).setInput(k2dVar.a, k2dVar.b, iMin);
                    a(false);
                    long j2 = iMin;
                    bt0Var.b -= j2;
                    int i = k2dVar.b + iMin;
                    k2dVar.b = i;
                    if (i == k2dVar.c) {
                        bt0Var.a = k2dVar.a();
                        b3d.a(k2dVar);
                    }
                    j -= j2;
                }
                return;
            default:
                if (!(!this.b)) {
                    throw new IllegalStateException("closed".toString());
                }
                long j3 = bt0Var.b;
                byte[] bArr = naf.a;
                if (j < 0 || 0 > j3 || j3 < j) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                ((eu0) ((x8) obj).Y).N(bt0Var, j);
                return;
        }
    }

    public void a(boolean z) {
        k2d k2dVarR0;
        int iDeflate;
        eu0 eu0Var = (eu0) this.c;
        bt0 buffer = eu0Var.getBuffer();
        while (true) {
            k2dVarR0 = buffer.r0(1);
            Deflater deflater = (Deflater) this.o;
            byte[] bArr = k2dVarR0.a;
            if (z) {
                int i = k2dVarR0.c;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                int i2 = k2dVarR0.c;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                k2dVarR0.c += iDeflate;
                buffer.b += iDeflate;
                eu0Var.E();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (k2dVarR0.b == k2dVarR0.c) {
            buffer.a = k2dVarR0.a();
            b3d.a(k2dVarR0);
        }
    }

    @Override // defpackage.ksd, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws Throwable {
        switch (this.a) {
            case 0:
                Deflater deflater = (Deflater) this.o;
                if (this.b) {
                    return;
                }
                try {
                    deflater.finish();
                    a(false);
                    th = null;
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    deflater.end();
                } catch (Throwable th2) {
                    if (th == null) {
                        th = th2;
                    }
                }
                try {
                    ((eu0) this.c).close();
                } catch (Throwable th3) {
                    if (th == null) {
                        th = th3;
                    }
                }
                this.b = true;
                if (th != null) {
                    throw th;
                }
                return;
            default:
                if (this.b) {
                    return;
                }
                this.b = true;
                x8 x8Var = (x8) this.o;
                x8Var.getClass();
                t06 t06Var = (t06) this.c;
                oue oueVar = t06Var.e;
                t06Var.e = oue.d;
                oueVar.a();
                oueVar.b();
                x8Var.a = 3;
                return;
        }
    }

    @Override // defpackage.ksd, java.io.Flushable
    public final void flush() {
        switch (this.a) {
            case 0:
                a(true);
                ((eu0) this.c).flush();
                break;
            default:
                if (!this.b) {
                    ((eu0) ((x8) this.o).Y).flush();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ksd
    public final oue p() {
        switch (this.a) {
            case 0:
                return ((eu0) this.c).p();
            default:
                return (t06) this.c;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DeflaterSink(" + ((eu0) this.c) + ')';
            default:
                return super.toString();
        }
    }

    public gg4(x8 x8Var) {
        this.o = x8Var;
        this.c = new t06(((eu0) x8Var.Y).p());
    }
}
