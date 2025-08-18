package androidx.work.impl;

import defpackage.a8g;
import defpackage.ana;
import defpackage.d34;
import defpackage.die;
import defpackage.ea9;
import defpackage.h7b;
import defpackage.i8g;
import defpackage.ilc;
import defpackage.k8g;
import defpackage.ktf;
import defpackage.l0f;
import defpackage.ph4;
import defpackage.qfa;
import defpackage.rfa;
import defpackage.s5c;
import defpackage.sh;
import defpackage.v47;
import defpackage.x7g;
import defpackage.xde;
import defpackage.y7g;
import defpackage.zkc;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    public volatile i8g m;
    public volatile ph4 n;
    public volatile k8g o;
    public volatile die p;
    public volatile y7g q;
    public volatile a8g r;
    public volatile h7b s;

    @Override // defpackage.ilc
    public final v47 e() {
        return new v47(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // defpackage.ilc
    public final xde f(d34 d34Var) {
        return d34Var.c.a(new ana(d34Var.a, d34Var.b, new l0f(d34Var, new rfa(this), "5181942b9ebc31ce68dacb56c16fd79f", "ae2044fb577e65ee8bb576ca48a2f06e"), false, false));
    }

    @Override // defpackage.ilc
    public final List g() {
        return Arrays.asList(new ea9(13, 14, 20), new qfa(2));
    }

    @Override // defpackage.ilc
    public final Set i() {
        return new HashSet();
    }

    @Override // defpackage.ilc
    public final Map j() {
        HashMap map = new HashMap();
        map.put(i8g.class, Collections.emptyList());
        map.put(ph4.class, Collections.emptyList());
        map.put(k8g.class, Collections.emptyList());
        map.put(die.class, Collections.emptyList());
        map.put(y7g.class, Collections.emptyList());
        map.put(a8g.class, Collections.emptyList());
        map.put(h7b.class, Collections.emptyList());
        map.put(s5c.class, Collections.emptyList());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final ph4 t() {
        ph4 ph4Var;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new ph4(this, 0);
                }
                ph4Var = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ph4Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final h7b u() {
        h7b h7bVar;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    this.s = new h7b(this);
                }
                h7bVar = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h7bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final die v() {
        die dieVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    die dieVar2 = new die();
                    dieVar2.a = this;
                    dieVar2.b = new sh(this, 26);
                    dieVar2.c = new zkc(this, 12);
                    dieVar2.o = new zkc(this, 13);
                    this.p = dieVar2;
                }
                dieVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dieVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final y7g w() {
        y7g y7gVar;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new y7g(this);
                }
                y7gVar = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return y7gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final a8g x() {
        a8g a8gVar;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    a8g a8gVar2 = new a8g();
                    a8gVar2.a = this;
                    a8gVar2.b = new x7g(this, 1);
                    a8gVar2.c = new ktf(this, 1);
                    a8gVar2.o = new ktf(this, 2);
                    this.r = a8gVar2;
                }
                a8gVar = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a8gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final i8g y() {
        i8g i8gVar;
        if (this.m != null) {
            return this.m;
        }
        synchronized (this) {
            try {
                if (this.m == null) {
                    this.m = new i8g(this);
                }
                i8gVar = this.m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8gVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public final k8g z() {
        k8g k8gVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new k8g((ilc) this);
                }
                k8gVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return k8gVar;
    }
}
