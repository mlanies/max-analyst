package defpackage;

import android.os.Looper;
import androidx.media3.transformer.ExportException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e6d implements xt, wt {
    public static final qy5 z;
    public final zw6 a;
    public final boolean b;
    public final boolean c;
    public final vt d;
    public final md3 e;
    public final wt f;
    public final bie g;
    public final HashMap h;
    public final HashMap i;
    public final ww6 j;
    public final AtomicInteger k;
    public final AtomicInteger l;
    public boolean m;
    public int n;
    public xt o;
    public boolean p;
    public boolean q;
    public boolean r;
    public int s;
    public int t;
    public volatile boolean u;
    public volatile long v;
    public volatile long w;
    public volatile long x;
    public volatile boolean y;

    static {
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l("audio/mp4a-latm");
        ny5Var.B = 44100;
        ny5Var.A = 2;
        z = ny5Var.a();
    }

    public e6d(mv4 mv4Var, boolean z2, vt vtVar, md3 md3Var, k1f k1fVar, she sheVar, Looper looper) {
        zw6 zw6Var = mv4Var.a;
        this.a = zw6Var;
        this.b = mv4Var.b;
        this.c = z2;
        this.d = vtVar;
        this.e = md3Var;
        this.f = k1fVar;
        this.g = sheVar.a(looper, null);
        this.h = new HashMap();
        this.i = new HashMap();
        this.j = new ww6(4);
        this.k = new AtomicInteger();
        this.l = new AtomicInteger();
        this.m = true;
        this.o = vtVar.B((lv4) zw6Var.get(0), looper, this, md3Var);
    }

    @Override // defpackage.xt
    public final int a(fm5 fm5Var) {
        if (this.b) {
            return 3;
        }
        int iA = this.o.a(fm5Var);
        int size = this.a.size();
        if (size == 1 || iA == 0) {
            return iA;
        }
        int i = (this.n * 100) / size;
        if (iA == 2) {
            i += fm5Var.b / size;
        }
        fm5Var.b = i;
        return 2;
    }

    @Override // defpackage.wt
    public final void b(int i) {
        this.k.set(i);
        this.l.set(i);
    }

    @Override // defpackage.wt
    public final wqc c(qy5 qy5Var) {
        d6d d6dVar;
        int iW = np8.w(qy5Var.n);
        oaf.H(iW);
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        if (this.m) {
            wqc wqcVarC = this.f.c(qy5Var);
            if (wqcVarC == null) {
                return null;
            }
            d6dVar = new d6d(this, wqcVarC, iW);
            this.h.put(Integer.valueOf(iW), d6dVar);
            if (this.c && this.k.get() == 1 && iW == 2) {
                wt wtVar = this.f;
                ny5 ny5VarA = z.a();
                ny5VarA.m = ia9.l("audio/raw");
                ny5VarA.C = 2;
                wqc wqcVarC2 = wtVar.c(new qy5(ny5VarA));
                fm9.l(wqcVarC2);
                this.h.put(1, new d6d(this, wqcVarC2, iW));
            }
        } else {
            fm9.j("Inputs with no video track are not supported when the output contains a video track", !(this.k.get() == 1 && iW == 1 && this.h.size() == 2));
            d6dVar = (d6d) this.h.get(Integer.valueOf(iW));
            Locale locale = Locale.US;
            fm9.m(d6dVar, "The preceding MediaItem does not contain any track of type " + iW + ". If the Composition contains a sequence that starts with items without audio tracks (like images), followed by items with audio tracks, Composition.Builder.experimentalSetForceAudioTrack() needs to be set to true.");
        }
        i(iW, qy5Var);
        if (this.k.get() == 1 && this.h.size() == 2) {
            Iterator it = this.h.entrySet().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) ((Map.Entry) it.next()).getKey()).intValue();
                if (iW != iIntValue) {
                    i(iIntValue, null);
                }
            }
        }
        return d6dVar;
    }

    @Override // defpackage.wt
    public final void d(ExportException exportException) {
        this.f.d(exportException);
    }

    @Override // defpackage.xt
    public final cx6 e() {
        return this.o.e();
    }

    @Override // defpackage.wt
    public final void f(long j) {
        fm9.e("Could not retrieve required duration for EditedMediaItem " + this.n, j != -9223372036854775807L || this.n == this.a.size() - 1);
        this.w = ((lv4) this.a.get(this.n)).b(j);
        this.v = j;
        if (this.a.size() != 1 || this.b) {
            return;
        }
        this.f.f(this.w);
    }

    @Override // defpackage.wt
    public final boolean g(int i, qy5 qy5Var) {
        int i2 = 0;
        boolean z2 = np8.w(qy5Var.n) == 1;
        LinkedHashMap linkedHashMap = d54.a;
        synchronized (d54.class) {
        }
        if (!this.m) {
            return z2 ? this.q : this.r;
        }
        if (this.c && this.k.get() == 1 && !z2) {
            i2 = 1;
        }
        if (!this.p) {
            this.f.b(this.k.get() + i2);
            this.p = true;
        }
        boolean zG = this.f.g(i, qy5Var);
        if (z2) {
            this.q = zG;
        } else {
            this.r = zG;
        }
        if (i2 != 0) {
            this.f.g(2, z);
            this.q = true;
        }
        return zG;
    }

    public final void h() {
        int i = this.s;
        zw6 zw6Var = this.a;
        int size = zw6Var.size() * i;
        int i2 = this.n;
        if (size + i2 >= this.t) {
            tb8 tb8Var = ((lv4) zw6Var.get(i2)).a;
            cx6 cx6VarE = this.o.e();
            this.j.a(new u85((String) cx6VarE.get(1), (String) cx6VarE.get(2)));
            this.t++;
        }
    }

    public final void i(int i, qy5 qy5Var) {
        q3a q3aVar = (q3a) this.i.get(Integer.valueOf(i));
        if (q3aVar == null) {
            return;
        }
        q3aVar.b((lv4) this.a.get(this.n), (i == 1 && this.b && this.q) ? -9223372036854775807L : this.v, qy5Var, this.n == this.a.size() - 1);
    }

    public final void j(long j, boolean z2) {
        this.x = j;
        this.y = z2;
    }

    @Override // defpackage.xt
    public final void release() {
        this.o.release();
        this.u = true;
    }

    @Override // defpackage.xt
    public final void start() {
        this.o.start();
        if (this.a.size() > 1 || this.b) {
            this.f.f(-9223372036854775807L);
        }
    }
}
