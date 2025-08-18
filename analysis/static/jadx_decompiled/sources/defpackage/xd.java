package defpackage;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* loaded from: classes.dex */
public final class xd extends q2b {
    public static final boolean e;
    public final ArrayList c;
    public final vq7 d;

    static {
        boolean z = false;
        if (b46.p() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        e = z;
    }

    public xd() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        xxd xxdVar;
        Method method;
        Method method2;
        int i = 4;
        Method method3 = null;
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl"));
            Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl"));
            Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl"));
            xxdVar = new xxd(cls);
        } catch (Exception e2) {
            q2b.a.getClass();
            q2b.i(5, "unable to load android socket classes", e2);
            xxdVar = null;
        }
        ArrayList arrayListD0 = ys.d0(new oud[]{xxdVar, new fg4(de.f), new fg4(fi3.a), new fg4(pr0.a)});
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListD0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((oud) next).a()) {
                arrayList.add(next);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls2 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls2.getMethod("get", null);
            method2 = cls2.getMethod("open", String.class);
            method = cls2.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new vq7(method3, method2, method, i);
    }

    @Override // defpackage.q2b
    public final a14 b(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        jd jdVar = x509TrustManagerExtensions != null ? new jd(x509TrustManager, x509TrustManagerExtensions) : null;
        return jdVar != null ? jdVar : super.b(x509TrustManager);
    }

    @Override // defpackage.q2b
    public final c3f c(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new wd(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.c(x509TrustManager);
        }
    }

    @Override // defpackage.q2b
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((oud) next).b(sSLSocket)) {
                    break;
                }
            }
        }
        oud oudVar = (oud) next;
        if (oudVar != null) {
            oudVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.q2b
    public final void e(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    @Override // defpackage.q2b
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((oud) next).b(sSLSocket)) {
                break;
            }
        }
        oud oudVar = (oud) next;
        if (oudVar != null) {
            return oudVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.q2b
    public final Object g() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vq7 vq7Var = this.d;
        Method method = (Method) vq7Var.b;
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(null, null);
            ((Method) vq7Var.c).invoke(objInvoke, "response.body().close()");
            return objInvoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // defpackage.q2b
    public final boolean h(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.q2b
    public final void j(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        vq7 vq7Var = this.d;
        vq7Var.getClass();
        if (obj != null) {
            try {
                ((Method) vq7Var.o).invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        q2b.i(5, str, null);
    }
}
