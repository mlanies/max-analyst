package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class sg8 extends tg8 {
    public final Object a = new Object();
    public Executor b;
    public wd6 c;
    public zf8 d;
    public ArrayList e;

    public String j() {
        return null;
    }

    public String k() {
        return null;
    }

    public final void l(zf8 zf8Var, ArrayList arrayList) {
        if (zf8Var == null) {
            throw new NullPointerException("groupRoute must not be null");
        }
        synchronized (this.a) {
            try {
                Executor executor = this.b;
                if (executor != null) {
                    executor.execute(new qg8(this, this.c, zf8Var, arrayList, 1));
                } else {
                    this.d = zf8Var;
                    this.e = new ArrayList(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void m(String str);

    public abstract void n(String str);

    public abstract void o(List list);
}
