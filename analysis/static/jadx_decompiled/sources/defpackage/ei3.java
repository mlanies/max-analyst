package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class ei3 implements eg4 {
    @Override // defpackage.eg4
    public final boolean b(SSLSocket sSLSocket) {
        boolean z = di3.d;
        return bi3.b() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.eg4
    public final oud l(SSLSocket sSLSocket) {
        return new fi3();
    }
}
