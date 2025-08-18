package defpackage;

/* loaded from: classes.dex */
public final class le7 implements gpb {
    public static final Object c = new Object();
    public volatile Object a = c;
    public volatile gpb b;

    public le7(gpb gpbVar) {
        this.b = gpbVar;
    }

    @Override // defpackage.gpb
    public final Object get() {
        Object obj = this.a;
        Object obj2 = c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.a;
                    if (obj == obj2) {
                        obj = this.b.get();
                        this.a = obj;
                        this.b = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
