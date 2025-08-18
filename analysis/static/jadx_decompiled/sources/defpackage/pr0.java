package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class pr0 implements oud {
    public static final or0 a = new or0();

    @Override // defpackage.oud
    public final boolean a() {
        boolean z = nr0.d;
        return nr0.d;
    }

    @Override // defpackage.oud
    public final boolean b(SSLSocket sSLSocket) {
        return false;
    }

    @Override // defpackage.oud
    public final String c(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || (applicationProtocol.hashCode() == 0 && applicationProtocol.equals(""))) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // defpackage.oud
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (b(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            q2b q2bVar = q2b.a;
            Object[] array = b46.f(list).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            parameters.setApplicationProtocols((String[]) array);
            bCSSLSocket.setParameters(parameters);
        }
    }
}
