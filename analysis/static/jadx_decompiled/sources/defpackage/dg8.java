package defpackage;

/* loaded from: classes.dex */
public final class dg8 {
    public final Object a;
    public final int b;

    public dg8(Object obj) {
        this.a = obj;
        if (obj instanceof String) {
            this.b = 1;
        } else if (obj instanceof dh8) {
            this.b = 2;
        } else {
            this.b = 0;
        }
    }
}
