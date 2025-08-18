package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public final class fg4 implements oud {
    public oud a;
    public final eg4 b;

    public fg4(eg4 eg4Var) {
        this.b = eg4Var;
    }

    @Override // defpackage.oud
    public final boolean a() {
        return true;
    }

    @Override // defpackage.oud
    public final boolean b(SSLSocket sSLSocket) {
        return this.b.b(sSLSocket);
    }

    @Override // defpackage.oud
    public final String c(SSLSocket sSLSocket) {
        oud oudVarE = e(sSLSocket);
        if (oudVarE != null) {
            return oudVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.oud
    public final void d(SSLSocket sSLSocket, String str, List list) {
        oud oudVarE = e(sSLSocket);
        if (oudVarE != null) {
            oudVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized oud e(SSLSocket sSLSocket) {
        try {
            if (this.a == null && this.b.b(sSLSocket)) {
                this.a = this.b.l(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
