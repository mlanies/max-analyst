package defpackage;

/* loaded from: classes.dex */
public final class gfg implements ifg {
    public static final Object c = new Object();
    public volatile ifg a;
    public volatile Object b;

    public static ifg a(ifg ifgVar) {
        if (ifgVar instanceof gfg) {
            return ifgVar;
        }
        gfg gfgVar = new gfg();
        gfgVar.b = c;
        gfgVar.a = ifgVar;
        return gfgVar;
    }

    @Override // defpackage.ifg
    public final Object r() {
        Object objR = this.b;
        Object obj = c;
        if (objR == obj) {
            synchronized (this) {
                try {
                    objR = this.b;
                    if (objR == obj) {
                        objR = this.a.r();
                        Object obj2 = this.b;
                        if (obj2 != obj && obj2 != objR) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objR + ". This is likely due to a circular dependency.");
                        }
                        this.b = objR;
                        this.a = null;
                    }
                } finally {
                }
            }
        }
        return objR;
    }
}
