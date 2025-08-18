package defpackage;

/* loaded from: classes.dex */
public final class pde implements jde {
    public static final xc3 c = new xc3(5);
    public volatile jde a;
    public Object b;

    @Override // defpackage.jde
    public final Object get() {
        jde jdeVar = this.a;
        xc3 xc3Var = c;
        if (jdeVar != xc3Var) {
            synchronized (this) {
                try {
                    if (this.a != xc3Var) {
                        Object obj = this.a.get();
                        this.b = obj;
                        this.a = xc3Var;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public final String toString() {
        Object obj = this.a;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (obj == c) {
            obj = "<supplier that returned " + this.b + ">";
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
