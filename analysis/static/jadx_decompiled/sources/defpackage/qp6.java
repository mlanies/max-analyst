package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class qp6 extends wx {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ qp6(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.wx
    public IOException k(IOException iOException) {
        switch (this.k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            case 1:
            default:
                return super.k(iOException);
            case 2:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }

    @Override // defpackage.wx
    public final void l() throws IOException {
        switch (this.k) {
            case 0:
                ((rp6) this.l).e(9);
                kp6 kp6Var = ((rp6) this.l).n;
                synchronized (kp6Var) {
                    long j = kp6Var.A0;
                    long j2 = kp6Var.z0;
                    if (j < j2) {
                        return;
                    }
                    kp6Var.z0 = j2 + 1;
                    kp6Var.B0 = System.nanoTime() + 1000000000;
                    kp6Var.t0.c(new ip6(zr6.l(new StringBuilder(), kp6Var.o, " ping"), kp6Var), 0L);
                    return;
                }
            case 1:
                ((b8c) this.l).d();
                return;
            default:
                Socket socket = (Socket) this.l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e) {
                    Logger logger = x2a.a;
                    boolean z = false;
                    if (e.getCause() != null) {
                        String message = e.getMessage();
                        if (message != null ? w9e.p0(message, "getsockname failed", false) : false) {
                            z = true;
                        }
                    }
                    if (!z) {
                        throw e;
                    }
                    x2a.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                } catch (Exception e2) {
                    x2a.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                    return;
                }
        }
    }

    public void m() {
        if (j()) {
            throw k(null);
        }
    }
}
