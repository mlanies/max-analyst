package defpackage;

/* loaded from: classes.dex */
public final class nm7 {
    public final Object a;
    public rm5 b = new rm5(0);
    public boolean c;

    public nm7(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || nm7.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((nm7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
