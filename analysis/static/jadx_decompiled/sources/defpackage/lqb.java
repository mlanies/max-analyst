package defpackage;

/* loaded from: classes.dex */
public final class lqb {
    public final Class a;
    public final Class b;

    public lqb(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static lqb a(Class cls) {
        return new lqb(kqb.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lqb.class != obj.getClass()) {
            return false;
        }
        lqb lqbVar = (lqb) obj;
        if (this.b.equals(lqbVar.b)) {
            return this.a.equals(lqbVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == kqb.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
