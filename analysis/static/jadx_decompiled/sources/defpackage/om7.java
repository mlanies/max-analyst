package defpackage;

/* loaded from: classes.dex */
public final class om7 {
    public final Object a;
    public rm5 b = new rm5(1);
    public boolean c;
    public boolean d;

    public om7(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((om7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
