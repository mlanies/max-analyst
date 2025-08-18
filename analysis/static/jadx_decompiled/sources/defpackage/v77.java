package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class v77 extends q2b {
    public final Method c;
    public final Method d;
    public final Method e;
    public final Class f;
    public final Class g;

    public v77(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.c = method;
        this.d = method2;
        this.e = method3;
        this.f = cls;
        this.g = cls2;
    }

    @Override // defpackage.q2b
    public final void a(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.e.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // defpackage.q2b
    public final void d(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((sob) obj) != sob.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(z53.S(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((sob) it.next()).a);
        }
        try {
            this.c.invoke(null, sSLSocket, Proxy.newProxyInstance(q2b.class.getClassLoader(), new Class[]{this.f, this.g}, new u77(arrayList2)));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // defpackage.q2b
    public final String f(SSLSocket sSLSocket) throws IllegalArgumentException {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.d.invoke(null, sSLSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            u77 u77Var = (u77) invocationHandler;
            boolean z = u77Var.a;
            if (!z && u77Var.b == null) {
                q2b.i(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", null);
                return null;
            }
            if (z) {
                return null;
            }
            return u77Var.b;
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}
