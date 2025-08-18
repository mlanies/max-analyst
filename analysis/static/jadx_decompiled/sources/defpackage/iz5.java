package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class iz5 implements qza {
    public final Set a;
    public final d06 b;
    public final x3c c;
    public final Long d;
    public final boolean e;
    public final Context f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final q0e m;
    public final w7c n;
    public List o;
    public final kld p;
    public final v7c q;
    public final h7b r;
    public final q0e s;
    public final w7c t;
    public final je7 u;
    public final je7 v;
    public sx3 w;
    public boolean x;

    public iz5(Set set, d06 d06Var, x3c x3cVar, Long l, boolean z, Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = set;
        this.b = d06Var;
        this.c = x3cVar;
        this.d = l;
        this.e = z;
        this.f = context;
        this.g = je7Var;
        this.h = je7Var2;
        this.i = je7Var3;
        this.j = je7Var4;
        this.k = je7Var5;
        this.l = je7Var6;
        q0e q0eVarA = r0e.a(null);
        this.m = q0eVarA;
        this.n = new w7c(q0eVarA);
        this.o = nz4.a;
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 2, 1);
        this.p = kldVarB;
        this.q = new v7c(kldVarB);
        this.r = new h7b(17);
        q0e q0eVarA2 = r0e.a(Boolean.TRUE);
        this.s = q0eVarA2;
        this.t = new w7c(q0eVarA2);
        final int i = 0;
        this.u = tu0.r(3, new k56(this) { // from class: ez5
            public final /* synthetic */ iz5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Drawable drawableB = kt3.b(this.b.f, woc.L1);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    default:
                        Drawable drawableB2 = kt3.b(this.b.f, woc.M1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        });
        final int i2 = 1;
        this.v = tu0.r(3, new k56(this) { // from class: ez5
            public final /* synthetic */ iz5 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Drawable drawableB = kt3.b(this.b.f, woc.L1);
                        if (drawableB != null) {
                            return drawableB;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    default:
                        Drawable drawableB2 = kt3.b(this.b.f, woc.M1);
                        if (drawableB2 != null) {
                            return drawableB2;
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                }
            }
        });
        if (!(!set.isEmpty())) {
            throw new IllegalStateException("You must specify messages to forward!".toString());
        }
    }

    @Override // defpackage.qza
    public final void a() {
        this.w = null;
    }

    @Override // defpackage.qza
    public final void b(gza gzaVar) {
        ((AtomicReference) this.c.Y).updateAndGet(new iz0(9, gzaVar));
    }

    @Override // defpackage.qza
    public final void c(sx3 sx3Var) {
        this.w = sx3Var;
        j47.T(sx3Var, ((w9a) ((kke) this.g.getValue())).b(), null, new hz5(this, null), 2);
    }

    @Override // defpackage.qza
    public final void d() {
        ((AtomicReference) this.c.Y).updateAndGet(new oe2(10));
    }

    @Override // defpackage.qza
    public final void e(long j) {
        ((AtomicReference) this.c.Y).updateAndGet(new v79(j, 3));
    }

    public final void f() {
        je7 je7Var = this.l;
        if (((t33) ((q33) je7Var.getValue())).g.getBoolean("app.onboarding.author_visibility", false)) {
            return;
        }
        this.p.g(mz5.a);
        ((t33) ((q33) je7Var.getValue())).j("app.onboarding.author_visibility", true);
    }

    public final Drawable g() {
        return ((Boolean) this.s.getValue()).booleanValue() ? (Drawable) this.u.getValue() : (Drawable) this.v.getValue();
    }

    public final void h(CharSequence charSequence, Set set, boolean z) {
        Object next;
        if (set.isEmpty() || this.x) {
            return;
        }
        boolean z2 = true;
        this.x = true;
        Object objF0 = x53.f0(set);
        ((Number) objF0).longValue();
        if (set.size() != 1) {
            objF0 = null;
        }
        Long l = (Long) objF0;
        if (l != null && !z) {
            this.p.g(new jz5(l, this.a, this.d, this.e, null, 16));
            return;
        }
        if (l != null) {
            Iterator it = ((Set) ((AtomicReference) this.c.Y).get()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((gza) next).a == l.longValue()) {
                        break;
                    }
                }
            }
            gza gzaVar = (gza) next;
            if ((gzaVar != null ? gzaVar.b : null) != fza.a && this.d == null) {
                z2 = false;
            }
        }
        boolean z3 = z2;
        sx3 sx3Var = this.w;
        if (sx3Var != null) {
            j47.S(sx3Var, xq9.a.plus(((w9a) ((kke) this.g.getValue())).a()), vx3.c, new gz5(this, charSequence, set, z3, l, null));
        }
    }
}
