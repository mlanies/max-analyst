package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class ux implements ksd {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ ux(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ksd
    public final void N(bt0 bt0Var, long j) {
        switch (this.a) {
            case 0:
                hm9.g(bt0Var.b, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    k2d k2dVar = bt0Var.a;
                    while (true) {
                        if (j2 < 65536) {
                            j2 += k2dVar.c - k2dVar.b;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                k2dVar = k2dVar.f;
                            }
                        }
                    }
                    wx wxVar = (wx) this.b;
                    wxVar.i();
                    try {
                        ((ksd) this.c).N(bt0Var, j2);
                        if (wxVar.j()) {
                            throw wxVar.k(null);
                        }
                        j -= j2;
                    } catch (IOException e) {
                        if (!wxVar.j()) {
                            throw e;
                        }
                        throw wxVar.k(e);
                    } finally {
                        wxVar.j();
                    }
                }
            default:
                hm9.g(bt0Var.b, 0L, j);
                while (j > 0) {
                    ((oue) this.c).f();
                    k2d k2dVar2 = bt0Var.a;
                    int iMin = (int) Math.min(j, k2dVar2.c - k2dVar2.b);
                    ((OutputStream) this.b).write(k2dVar2.a, k2dVar2.b, iMin);
                    int i = k2dVar2.b + iMin;
                    k2dVar2.b = i;
                    long j3 = iMin;
                    j -= j3;
                    bt0Var.b -= j3;
                    if (i == k2dVar2.c) {
                        bt0Var.a = k2dVar2.a();
                        b3d.a(k2dVar2);
                    }
                }
                return;
        }
    }

    @Override // defpackage.ksd, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        switch (this.a) {
            case 0:
                wx wxVar = (wx) this.b;
                wxVar.i();
                try {
                    ((ksd) this.c).close();
                    if (wxVar.j()) {
                        throw wxVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!wxVar.j()) {
                        throw e;
                    }
                    throw wxVar.k(e);
                } finally {
                    wxVar.j();
                }
            default:
                ((OutputStream) this.b).close();
                return;
        }
    }

    @Override // defpackage.ksd, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.a) {
            case 0:
                wx wxVar = (wx) this.b;
                wxVar.i();
                try {
                    ((ksd) this.c).flush();
                    if (wxVar.j()) {
                        throw wxVar.k(null);
                    }
                    return;
                } catch (IOException e) {
                    if (!wxVar.j()) {
                        throw e;
                    }
                    throw wxVar.k(e);
                } finally {
                    wxVar.j();
                }
            default:
                ((OutputStream) this.b).flush();
                return;
        }
    }

    @Override // defpackage.ksd
    public final oue p() {
        switch (this.a) {
            case 0:
                return (wx) this.b;
            default:
                return (oue) this.c;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "AsyncTimeout.sink(" + ((ksd) this.c) + ')';
            default:
                return "sink(" + ((OutputStream) this.b) + ')';
        }
    }
}
