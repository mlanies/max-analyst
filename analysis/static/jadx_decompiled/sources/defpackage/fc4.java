package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import org.apache.http.entity.ContentLengthStrategy;

/* loaded from: classes.dex */
public final class fc4 implements pn7 {
    public final n64 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final HashMap j;
    public long k;

    public fc4(n64 n64Var, int i, int i2, int i3, int i4, boolean z) {
        l("bufferForPlaybackMs", i3, 0, "0");
        l("bufferForPlaybackAfterRebufferMs", i4, 0, "0");
        l("minBufferMs", i, i3, "bufferForPlaybackMs");
        l("minBufferMs", i, i4, "bufferForPlaybackAfterRebufferMs");
        l("maxBufferMs", i2, i, "minBufferMs");
        l("backBufferDurationMs", 0, 0, "0");
        this.a = n64Var;
        this.b = oaf.S(i);
        this.c = oaf.S(i2);
        this.d = oaf.S(i3);
        this.e = oaf.S(i4);
        this.f = -1;
        this.g = z;
        this.h = oaf.S(0);
        this.i = false;
        this.j = new HashMap();
        this.k = -1L;
    }

    public static void l(String str, int i, int i2, String str2) {
        fm9.e(str + " cannot be less than " + str2, i >= i2);
    }

    @Override // defpackage.pn7
    public final boolean a() {
        return this.i;
    }

    @Override // defpackage.pn7
    public final void c(j4b j4bVar) {
        if (this.j.remove(j4bVar) != null) {
            boolean zIsEmpty = this.j.isEmpty();
            n64 n64Var = this.a;
            if (zIsEmpty) {
                synchronized (n64Var) {
                    if (n64Var.b) {
                        n64Var.c(0);
                    }
                }
            } else {
                n64Var.c(m());
            }
        }
        if (this.j.isEmpty()) {
            this.k = -1L;
        }
    }

    @Override // defpackage.pn7
    public final void d(j4b j4bVar) {
        if (this.j.remove(j4bVar) != null) {
            boolean zIsEmpty = this.j.isEmpty();
            n64 n64Var = this.a;
            if (!zIsEmpty) {
                n64Var.c(m());
                return;
            }
            synchronized (n64Var) {
                if (n64Var.b) {
                    n64Var.c(0);
                }
            }
        }
    }

    @Override // defpackage.pn7
    public final long f() {
        return this.h;
    }

    @Override // defpackage.pn7
    public final void g(j4b j4bVar) {
        long id = Thread.currentThread().getId();
        long j = this.k;
        fm9.j("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        this.k = id;
        HashMap map = this.j;
        if (!map.containsKey(j4bVar)) {
            map.put(j4bVar, new dc4());
        }
        dc4 dc4Var = (dc4) map.get(j4bVar);
        dc4Var.getClass();
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        dc4Var.b = i;
        dc4Var.a = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.pn7
    public final void h(j4b j4bVar, vj0[] vj0VarArr, n85[] n85VarArr) {
        dc4 dc4Var = (dc4) this.j.get(j4bVar);
        dc4Var.getClass();
        int iMax = this.f;
        if (iMax == -1) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int i3 = 13107200;
                if (i < vj0VarArr.length) {
                    if (n85VarArr[i] != null) {
                        switch (vj0VarArr[i].b) {
                            case ContentLengthStrategy.CHUNKED /* -2 */:
                                i3 = 0;
                                i2 += i3;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i3 = 144310272;
                                i2 += i3;
                                break;
                            case 1:
                                i2 += i3;
                                break;
                            case 2:
                                i3 = 131072000;
                                i2 += i3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i3 = 131072;
                                i2 += i3;
                                break;
                        }
                    }
                    i++;
                } else {
                    iMax = Math.max(13107200, i2);
                }
            }
        }
        dc4Var.b = iMax;
        boolean zIsEmpty = this.j.isEmpty();
        n64 n64Var = this.a;
        if (!zIsEmpty) {
            n64Var.c(m());
            return;
        }
        synchronized (n64Var) {
            if (n64Var.b) {
                n64Var.c(0);
            }
        }
    }

    @Override // defpackage.pn7
    public final boolean i(on7 on7Var) {
        dc4 dc4Var = (dc4) this.j.get(on7Var.a);
        dc4Var.getClass();
        boolean z = true;
        boolean z2 = this.a.a() >= m();
        float f = on7Var.c;
        long j = this.c;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(oaf.A(f, jMin), j);
        }
        long jMax = Math.max(jMin, 500000L);
        long j2 = on7Var.b;
        if (j2 < jMax) {
            if (!this.g && z2) {
                z = false;
            }
            dc4Var.a = z;
            if (!z && j2 < 500000) {
                z04.c0("Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= j || z2) {
            dc4Var.a = false;
        }
        return dc4Var.a;
    }

    @Override // defpackage.pn7
    public final n64 j() {
        return this.a;
    }

    @Override // defpackage.pn7
    public final boolean k(on7 on7Var) {
        long jE = oaf.E(on7Var.c, on7Var.b);
        long jMin = on7Var.d ? this.e : this.d;
        long j = on7Var.e;
        if (j != -9223372036854775807L) {
            jMin = Math.min(j / 2, jMin);
        }
        return jMin <= 0 || jE >= jMin || (!this.g && this.a.a() >= m());
    }

    public final int m() {
        Iterator it = this.j.values().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((dc4) it.next()).b;
        }
        return i;
    }
}
