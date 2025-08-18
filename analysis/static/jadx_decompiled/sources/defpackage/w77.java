package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class w77 extends q2b {
    public static final boolean c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numE0 = property != null ? dae.e0(property) : null;
        boolean z = false;
        if (numE0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numE0.intValue() >= 9) {
            z = true;
        }
        c = z;
    }

    @Override // defpackage.q2b
    public final void d(SSLSocket sSLSocket, String str, List list) {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
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
        Object[] array = arrayList2.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        sSLParameters.setApplicationProtocols((String[]) array);
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // defpackage.q2b
    public final String f(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                return null;
            }
            if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    return null;
                }
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
