package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class ap6 extends mne {
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ long f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap6(String str, long j, m8c m8cVar) {
        super(str, true);
        this.f = j;
        this.g = m8cVar;
    }

    @Override // defpackage.mne
    public final long a() throws IOException {
        kp6 kp6Var;
        boolean z;
        n3g n3gVar;
        switch (this.e) {
            case 0:
                synchronized (((kp6) this.g)) {
                    kp6Var = (kp6) this.g;
                    long j = kp6Var.y0;
                    long j2 = kp6Var.x0;
                    if (j < j2) {
                        z = true;
                    } else {
                        kp6Var.x0 = j2 + 1;
                        z = false;
                    }
                }
                if (z) {
                    kp6Var.a(2, 2, null);
                    return -1L;
                }
                try {
                    kp6Var.J0.n(1, 0, false);
                } catch (IOException e) {
                    kp6Var.a(2, 2, e);
                }
                return this.f;
            default:
                m8c m8cVar = (m8c) this.g;
                synchronized (m8cVar) {
                    try {
                        if (!m8cVar.o && (n3gVar = m8cVar.e) != null) {
                            int i = m8cVar.q ? m8cVar.p : -1;
                            m8cVar.p++;
                            m8cVar.q = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(m8cVar.u);
                                sb.append("ms (after ");
                                m8cVar.c(new SocketTimeoutException(zr6.j(sb, i - 1, " successful ping/pongs)")));
                            } else {
                                try {
                                    n3gVar.a(9, aw0.o);
                                } catch (IOException e2) {
                                    m8cVar.c(e2);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return this.f;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ap6(String str, kp6 kp6Var, long j) {
        super(str, true);
        this.g = kp6Var;
        this.f = j;
    }
}
