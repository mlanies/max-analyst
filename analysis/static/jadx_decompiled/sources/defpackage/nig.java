package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class nig {
    public static final jn a = new jn("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        bkg.y(context).n();
        Set set = mdg.b;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((mdg) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        synchronized (ie6.B0) {
            try {
                ie6 ie6Var = ie6.C0;
                if (ie6Var != null) {
                    ie6Var.t0.incrementAndGet();
                    fc9 fc9Var = ie6Var.x0;
                    fc9Var.sendMessageAtFrontOfQueue(fc9Var.obtainMessage(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
