package defpackage;

import java.util.HashMap;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class xme implements yme {
    public final yme a;
    public final HashMap b = new HashMap();

    public xme(yme ymeVar) {
        this.a = ymeVar;
    }

    @Override // defpackage.yme
    public final ThreadFactory a(String str) {
        HashMap map = this.b;
        ThreadFactory threadFactory = (ThreadFactory) map.get(str);
        if (threadFactory != null) {
            return threadFactory;
        }
        ThreadFactory threadFactoryA = this.a.a(str);
        map.put(str, threadFactoryA);
        return threadFactoryA;
    }
}
