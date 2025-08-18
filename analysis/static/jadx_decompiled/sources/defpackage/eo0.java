package defpackage;

import android.util.Pair;
import com.facebook.fresco.middleware.HasExtraData;
import java.io.Closeable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class eo0 implements dab {
    public final HashMap a;
    public final dab b;
    public final boolean c;
    public final String d;
    public final String e;
    public final /* synthetic */ int f;
    public final o84 g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eo0(o84 o84Var, boolean z, dab dabVar) {
        this(dabVar, "EncodedCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_ENCODED_COUNT, z);
        this.f = 1;
        this.g = o84Var;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        vg9 vg9Var;
        int i;
        boolean z;
        try {
            f46.I();
            ((oj0) eabVar).c.j(eabVar, this.d);
            Pair pairD = d(eabVar);
            do {
                synchronized (this) {
                    synchronized (this) {
                        vg9Var = (vg9) this.a.get(pairD);
                    }
                }
                i = 1;
                if (vg9Var == null) {
                    synchronized (this) {
                        vg9Var = new vg9(this, pairD);
                        this.a.put(pairD, vg9Var);
                        z = true;
                    }
                } else {
                    z = false;
                }
            } while (!vg9Var.a(fi0Var, eabVar));
            if (z) {
                if (!((oj0) eabVar).g()) {
                    i = 2;
                }
                vg9Var.i(i);
            }
        } finally {
            f46.I();
        }
    }

    public final Closeable c(Closeable closeable) {
        switch (this.f) {
            case 0:
                return o43.o((o43) closeable);
            default:
                return g05.a((g05) closeable);
        }
    }

    public final Pair d(eab eabVar) {
        switch (this.f) {
            case 0:
                oj0 oj0Var = (oj0) eabVar;
                return Pair.create(this.g.b(oj0Var.a, oj0Var.o), oj0Var.X);
            default:
                oj0 oj0Var2 = (oj0) eabVar;
                wv6 wv6Var = oj0Var2.a;
                o84 o84Var = this.g;
                o84Var.getClass();
                return Pair.create(o84Var.d(wv6Var.b), oj0Var2.X);
        }
    }

    public final synchronized void e(Object obj, vg9 vg9Var) {
        if (this.a.get(obj) == vg9Var) {
            this.a.remove(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public eo0(o84 o84Var, fo0 fo0Var) {
        this(fo0Var, "BitmapMemoryCacheKeyMultiplexProducer", HasExtraData.KEY_MULTIPLEX_BITMAP_COUNT, false);
        this.f = 0;
        this.g = o84Var;
    }

    public eo0(dab dabVar, String str, String str2, boolean z) {
        this.b = dabVar;
        this.a = new HashMap();
        this.c = z;
        this.d = str;
        this.e = str2;
    }
}
