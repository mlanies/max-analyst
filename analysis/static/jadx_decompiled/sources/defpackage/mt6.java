package defpackage;

import android.util.Rational;
import android.util.Size;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mt6 implements n9f {
    public final /* synthetic */ int a;
    public final mi9 b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public mt6(int i) {
        this(mi9.b(), 0);
        this.a = i;
        switch (i) {
            case 1:
                this(mi9.b(), 1);
                break;
            case 2:
                this(mi9.b(), 2);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.x85
    public final vh9 F() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.n9f
    public final o9f J() {
        switch (this.a) {
            case 0:
                return new st6(wma.a(this.b));
            case 1:
                return new gu6(wma.a(this.b));
            case 2:
                return new i8b(wma.a(this.b));
            default:
                return new sdf(wma.a(this.b));
        }
    }

    public fu6 a() {
        Object objH;
        Object objH2;
        Object objH3;
        aa0 aa0Var = gu6.X;
        mi9 mi9Var = this.b;
        mi9Var.getClass();
        Object objH4 = null;
        try {
            objH = mi9Var.h(aa0Var);
        } catch (IllegalArgumentException unused) {
            objH = null;
        }
        Integer num = (Integer) objH;
        if (num != null) {
            mi9Var.j(tu6.z, num);
        } else {
            du6 du6Var = fu6.A;
            try {
                objH2 = mi9Var.h(gu6.Y);
            } catch (IllegalArgumentException unused2) {
                objH2 = null;
            }
            if (Objects.equals(objH2, 1)) {
                mi9Var.j(tu6.z, 4101);
                mi9Var.j(tu6.A, eu4.c);
            } else {
                mi9Var.j(tu6.z, 256);
            }
        }
        gu6 gu6Var = new gu6(wma.a(mi9Var));
        ev6.e0(gu6Var);
        fu6 fu6Var = new fu6(gu6Var);
        try {
            objH3 = mi9Var.h(ev6.F);
        } catch (IllegalArgumentException unused3) {
            objH3 = null;
        }
        Size size = (Size) objH3;
        if (size != null) {
            fu6Var.t = new Rational(size.getWidth(), size.getHeight());
        }
        aa0 aa0Var2 = n67.M;
        Object objZ = ju0.z();
        try {
            objZ = mi9Var.h(aa0Var2);
        } catch (IllegalArgumentException unused4) {
        }
        c54.o((Executor) objZ, "The IO executor can't be null");
        aa0 aa0Var3 = gu6.c;
        if (mi9Var.a.containsKey(aa0Var3)) {
            Integer num2 = (Integer) mi9Var.h(aa0Var3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3) {
                try {
                    objH4 = mi9Var.h(gu6.v0);
                } catch (IllegalArgumentException unused5) {
                }
                if (objH4 == null) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                }
            }
        }
        return fu6Var;
    }

    public h8b b() {
        i8b i8bVar = new i8b(wma.a(this.b));
        ev6.e0(i8bVar);
        h8b h8bVar = new h8b(i8bVar);
        h8bVar.q = h8b.y;
        return h8bVar;
    }

    public final Object c(kic kicVar) {
        switch (this.a) {
            case 0:
                this.b.j(ev6.J, kicVar);
                break;
            case 1:
                this.b.j(ev6.J, kicVar);
                break;
            case 2:
                this.b.j(ev6.J, kicVar);
                break;
            default:
                this.b.j(ev6.J, kicVar);
                break;
        }
        return this;
    }

    public final Object d(Size size) {
        switch (this.a) {
            case 0:
                this.b.j(ev6.F, size);
                return this;
            case 1:
                this.b.j(ev6.F, size);
                return this;
            case 2:
                this.b.j(ev6.F, size);
                return this;
            default:
                throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }
    }

    public final Object e(int i) {
        switch (this.a) {
            case 0:
                this.b.j(ev6.C, Integer.valueOf(i));
                break;
            case 1:
                this.b.j(ev6.C, Integer.valueOf(i));
                break;
            case 2:
                aa0 aa0Var = ev6.C;
                Integer numValueOf = Integer.valueOf(i);
                mi9 mi9Var = this.b;
                mi9Var.j(aa0Var, numValueOf);
                mi9Var.j(ev6.D, Integer.valueOf(i));
                break;
            default:
                this.b.j(ev6.C, Integer.valueOf(i));
                break;
        }
        return this;
    }

    public mt6(mi9 mi9Var, int i) {
        Object objH;
        Object objH2;
        Object objH3;
        Object objH4;
        this.a = i;
        switch (i) {
            case 1:
                this.b = mi9Var;
                Object objH5 = null;
                try {
                    objH = mi9Var.h(cne.e0);
                } catch (IllegalArgumentException unused) {
                    objH = null;
                }
                Class cls = (Class) objH;
                if (cls != null && !cls.equals(fu6.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                this.b.j(o9f.o0, q9f.a);
                aa0 aa0Var = cne.e0;
                mi9 mi9Var2 = this.b;
                mi9Var2.j(aa0Var, fu6.class);
                try {
                    objH5 = mi9Var2.h(cne.d0);
                } catch (IllegalArgumentException unused2) {
                }
                if (objH5 == null) {
                    this.b.j(cne.d0, fu6.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.b = mi9Var;
                Object objH6 = null;
                try {
                    objH2 = mi9Var.h(cne.e0);
                } catch (IllegalArgumentException unused3) {
                    objH2 = null;
                }
                Class cls2 = (Class) objH2;
                if (cls2 != null && !cls2.equals(h8b.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                this.b.j(o9f.o0, q9f.b);
                aa0 aa0Var2 = cne.e0;
                mi9 mi9Var3 = this.b;
                mi9Var3.j(aa0Var2, h8b.class);
                try {
                    objH6 = mi9Var3.h(cne.d0);
                } catch (IllegalArgumentException unused4) {
                }
                if (objH6 == null) {
                    this.b.j(cne.d0, h8b.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                Object objH7 = -1;
                try {
                    objH7 = mi9Var.h(ev6.E);
                } catch (IllegalArgumentException unused5) {
                }
                if (((Integer) objH7).intValue() == -1) {
                    mi9Var.j(ev6.E, 2);
                    return;
                }
                return;
            case 3:
                this.b = mi9Var;
                if (mi9Var.a.containsKey(sdf.b)) {
                    Object objH8 = null;
                    try {
                        objH3 = mi9Var.h(cne.e0);
                    } catch (IllegalArgumentException unused6) {
                        objH3 = null;
                    }
                    Class cls3 = (Class) objH3;
                    if (cls3 != null && !cls3.equals(rdf.class)) {
                        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                    }
                    this.b.j(o9f.o0, q9f.o);
                    aa0 aa0Var3 = cne.e0;
                    mi9 mi9Var4 = this.b;
                    mi9Var4.j(aa0Var3, rdf.class);
                    try {
                        objH8 = mi9Var4.h(cne.d0);
                    } catch (IllegalArgumentException unused7) {
                    }
                    if (objH8 == null) {
                        mi9Var4.j(cne.d0, rdf.class.getCanonicalName() + "-" + UUID.randomUUID());
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("VideoOutput is required");
            default:
                this.b = mi9Var;
                Object objH9 = null;
                try {
                    objH4 = mi9Var.h(cne.e0);
                } catch (IllegalArgumentException unused8) {
                    objH4 = null;
                }
                Class cls4 = (Class) objH4;
                if (cls4 != null && !cls4.equals(pt6.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
                }
                this.b.j(o9f.o0, q9f.c);
                aa0 aa0Var4 = cne.e0;
                mi9 mi9Var5 = this.b;
                mi9Var5.j(aa0Var4, pt6.class);
                try {
                    objH9 = mi9Var5.h(cne.d0);
                } catch (IllegalArgumentException unused9) {
                }
                if (objH9 == null) {
                    mi9Var5.j(cne.d0, pt6.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public mt6(wjf wjfVar) {
        this.a = 3;
        mi9 mi9VarB = mi9.b();
        mi9VarB.j(sdf.b, wjfVar);
        this(mi9VarB, 3);
    }
}
