package defpackage;

/* loaded from: classes2.dex */
public abstract class brd implements b37 {
    public volatile Object a = kq0.h;

    @Override // defpackage.b37
    public final Object a(v4 v4Var) {
        Object objB;
        Object obj = this.a;
        Object obj2 = kq0.h;
        if (obj != obj2) {
            return obj;
        }
        synchronized (this) {
            objB = this.a;
            if (objB == obj2) {
                objB = b(v4Var);
                this.a = objB;
            }
        }
        return objB;
    }

    public abstract Object b(v4 v4Var);
}
