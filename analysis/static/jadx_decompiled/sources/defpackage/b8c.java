package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b8c implements Cloneable {
    public final u2a A0;
    public final mhc B0;
    public final boolean C0;
    public Object X;
    public v45 Y;
    public f8c Z;
    public final g8c a;
    public final dp3 b;
    public final qp6 c;
    public final AtomicBoolean o;
    public boolean s0;
    public od t0;
    public boolean u0;
    public boolean v0;
    public boolean w0;
    public volatile boolean x0;
    public volatile od y0;
    public volatile f8c z0;

    public b8c(u2a u2aVar, mhc mhcVar, boolean z) {
        this.A0 = u2aVar;
        this.B0 = mhcVar;
        this.C0 = z;
        this.a = (g8c) u2aVar.b.b;
        this.b = (dp3) u2aVar.X.b;
        qp6 qp6Var = new qp6(1, this);
        qp6Var.g(u2aVar.H0, TimeUnit.MILLISECONDS);
        this.c = qp6Var;
        this.o = new AtomicBoolean();
        this.w0 = true;
    }

    public static final String a(b8c b8cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(b8cVar.x0 ? "canceled " : "");
        sb.append(b8cVar.C0 ? "web socket" : "call");
        sb.append(" to ");
        sb.append(b8cVar.B0.b.g());
        return sb.toString();
    }

    public final void b(f8c f8cVar) {
        byte[] bArr = naf.a;
        if (this.Z != null) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.Z = f8cVar;
        f8cVar.o.add(new a8c(this, this.X));
    }

    public final IOException c(IOException iOException) throws IOException {
        IOException interruptedIOException;
        Socket socketK;
        byte[] bArr = naf.a;
        f8c f8cVar = this.Z;
        if (f8cVar != null) {
            synchronized (f8cVar) {
                socketK = k();
            }
            if (this.Z == null) {
                if (socketK != null) {
                    naf.d(socketK);
                }
                this.b.getClass();
            } else if (socketK != null) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        if (!this.s0 && this.c.j()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            this.b.getClass();
        } else {
            this.b.getClass();
        }
        return interruptedIOException;
    }

    public final Object clone() {
        return new b8c(this.A0, this.B0, this.C0);
    }

    public final void d() {
        Socket socket;
        if (this.x0) {
            return;
        }
        this.x0 = true;
        od odVar = this.y0;
        if (odVar != null) {
            ((u45) odVar.Y).cancel();
        }
        f8c f8cVar = this.z0;
        if (f8cVar != null && (socket = f8cVar.b) != null) {
            naf.d(socket);
        }
        this.b.getClass();
    }

    public final void e(gq1 gq1Var) {
        z7c z7cVar;
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        q2b q2bVar = q2b.a;
        this.X = q2b.a.g();
        this.b.getClass();
        a8g a8gVar = this.A0.a;
        z7c z7cVar2 = new z7c(this, gq1Var);
        synchronized (a8gVar) {
            ((ArrayDeque) a8gVar.b).add(z7cVar2);
            if (!this.C0) {
                String str = this.B0.b.e;
                Iterator it = ((ArrayDeque) a8gVar.c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        Iterator it2 = ((ArrayDeque) a8gVar.b).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                z7cVar = null;
                                break;
                            } else {
                                z7cVar = (z7c) it2.next();
                                if (tpa.f(z7cVar.c.B0.b.e, str)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        z7cVar = (z7c) it.next();
                        if (tpa.f(z7cVar.c.B0.b.e, str)) {
                            break;
                        }
                    }
                }
                if (z7cVar != null) {
                    z7cVar2.a = z7cVar.a;
                }
            }
        }
        a8gVar.q();
    }

    public final yic f() {
        if (!this.o.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        this.c.i();
        q2b q2bVar = q2b.a;
        this.X = q2b.a.g();
        this.b.getClass();
        try {
            a8g a8gVar = this.A0.a;
            synchronized (a8gVar) {
                ((ArrayDeque) a8gVar.o).add(this);
            }
            return h();
        } finally {
            a8g a8gVar2 = this.A0.a;
            a8gVar2.i((ArrayDeque) a8gVar2.o, this);
        }
    }

    public final void g(boolean z) {
        od odVar;
        synchronized (this) {
            if (!this.w0) {
                throw new IllegalStateException("released".toString());
            }
        }
        if (z && (odVar = this.y0) != null) {
            ((u45) odVar.Y).cancel();
            ((b8c) odVar.c).i(odVar, true, true, null);
        }
        this.t0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.yic h() throws java.lang.Throwable {
        /*
            r12 = this;
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            u2a r0 = r12.A0
            java.util.List r0 = r0.c
            defpackage.d63.V(r0, r2)
            ur0 r0 = new ur0
            u2a r1 = r12.A0
            r3 = 2
            r0.<init>(r3, r1)
            r2.add(r0)
            ur0 r0 = new ur0
            u2a r1 = r12.A0
            kj6 r1 = r1.u0
            r3 = 0
            r0.<init>(r3, r1)
            r2.add(r0)
            tw0 r0 = new tw0
            u2a r1 = r12.A0
            r1.getClass()
            r1 = 0
            r0.<init>(r1)
            r2.add(r0)
            tw0 r0 = defpackage.tw0.b
            r2.add(r0)
            boolean r0 = r12.C0
            if (r0 != 0) goto L42
            u2a r0 = r12.A0
            java.util.List r0 = r0.o
            defpackage.d63.V(r0, r2)
        L42:
            fl1 r0 = new fl1
            boolean r1 = r12.C0
            r0.<init>(r1)
            r2.add(r0)
            h8c r9 = new h8c
            mhc r10 = r12.B0
            u2a r0 = r12.A0
            int r6 = r0.I0
            int r7 = r0.J0
            int r8 = r0.K0
            r3 = 0
            r4 = 0
            r0 = r9
            r1 = r12
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            r1 = 0
            yic r2 = r9.d(r10)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            boolean r3 = r12.x0     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            if (r3 != 0) goto L6e
            r12.j(r0)
            return r2
        L6e:
            defpackage.naf.c(r2)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            java.lang.String r3 = "Canceled"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
            throw r2     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7b
        L79:
            r2 = move-exception
            goto L91
        L7b:
            r1 = move-exception
            r2 = 1
            java.io.IOException r1 = r12.j(r1)     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L90
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L8b
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L8b
            throw r1     // Catch: java.lang.Throwable -> L8b
        L8b:
            r1 = move-exception
            r11 = r2
            r2 = r1
            r1 = r11
            goto L91
        L90:
            throw r1     // Catch: java.lang.Throwable -> L8b
        L91:
            if (r1 != 0) goto L96
            r12.j(r0)
        L96:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b8c.h():yic");
    }

    public final IOException i(od odVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        boolean z4;
        if (!odVar.equals(this.y0)) {
            return iOException;
        }
        synchronized (this) {
            z3 = false;
            if (z) {
                try {
                    if (!this.u0) {
                        if (z2 || !this.v0) {
                            z4 = false;
                        }
                    }
                    if (z) {
                        this.u0 = false;
                    }
                    if (z2) {
                        this.v0 = false;
                    }
                    boolean z5 = this.u0;
                    boolean z6 = (z5 || this.v0) ? false : true;
                    if (!z5 && !this.v0) {
                        if (!this.w0) {
                            z3 = true;
                        }
                    }
                    z4 = z3;
                    z3 = z6;
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                if (z2) {
                }
                z4 = false;
            }
        }
        if (z3) {
            this.y0 = null;
            f8c f8cVar = this.Z;
            if (f8cVar != null) {
                synchronized (f8cVar) {
                    f8cVar.l++;
                }
            }
        }
        return z4 ? c(iOException) : iOException;
    }

    public final IOException j(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.w0) {
                this.w0 = false;
                if (!this.u0) {
                    if (!this.v0) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket k() {
        f8c f8cVar = this.Z;
        byte[] bArr = naf.a;
        ArrayList arrayList = f8cVar.o;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (tpa.f((b8c) ((Reference) it.next()).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.".toString());
        }
        arrayList.remove(i);
        this.Z = null;
        if (arrayList.isEmpty()) {
            f8cVar.p = System.nanoTime();
            g8c g8cVar = this.a;
            g8cVar.getClass();
            byte[] bArr2 = naf.a;
            boolean z = f8cVar.i;
            coe coeVar = (coe) g8cVar.c;
            if (z || g8cVar.b == 0) {
                f8cVar.i = true;
                ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) g8cVar.e;
                concurrentLinkedQueue.remove(f8cVar);
                if (concurrentLinkedQueue.isEmpty()) {
                    coeVar.a();
                }
                return f8cVar.c;
            }
            coeVar.c((ip6) g8cVar.d, 0L);
        }
        return null;
    }
}
