package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.locks.ReentrantLock;
import one.me.net.client.api.AddressUnreachableException;

/* loaded from: classes2.dex */
public final /* synthetic */ class r84 implements u98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ r84(Object obj, Object obj2, int i, int i2) {
        this.c = obj;
        this.o = obj2;
        this.a = i;
        this.b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, InetAddress inetAddress, long j) throws IOException {
        s84 s84Var = (s84) this.c;
        Socket socket = (Socket) this.o;
        int i = this.a;
        int i2 = this.b;
        tg3 tg3Var = s84Var.g;
        tg3Var.getClass();
        tg3Var.d = Math.max(j, 0L);
        ir6 ir6Var = hm9.m;
        v67 v67Var = null;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "s84", String.format(Locale.ROOT, "connectSocket, address=%s:%d, timeout=%dms", inetAddress, Integer.valueOf(i), Integer.valueOf(i2)), null);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            socket.connect(new InetSocketAddress(inetAddress, i), i2);
            tg3 tg3Var2 = s84Var.g;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
            tg3Var2.getClass();
            tg3Var2.e = Math.max(jElapsedRealtime2, 0L);
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, "s84", String.format(Locale.ROOT, "connected %s", socket), null);
            }
        } catch (SocketTimeoutException e) {
            mm4 mm4Var = s84Var.j;
            if (mm4Var != null) {
                nm4 nm4Var = (nm4) mm4Var;
                ReentrantLock reentrantLock = nm4Var.b;
                reentrantLock.lock();
                try {
                    ArrayList arrayList = (ArrayList) nm4Var.d.get(str);
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (tpa.f(((v67) next).a, inetAddress)) {
                                v67Var = next;
                                break;
                            }
                        }
                        v67Var = v67Var;
                    }
                    char c = 1;
                    if (v67Var != null && v67Var.c != 0) {
                        if (v67Var.d == 0) {
                            c = 2;
                        }
                    }
                    if (c == 2) {
                        throw new AddressUnreachableException(inetAddress, e);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            throw e;
        }
    }

    @Override // defpackage.u98
    public void c(qr6 qr6Var, int i) {
        w98 w98Var = (w98) this.c;
        w98Var.getClass();
        ww6 ww6VarI = zw6.i();
        int i2 = 0;
        while (true) {
            List list = (List) this.o;
            if (i2 >= list.size()) {
                break;
            }
            ww6VarI.a(((tb8) list.get(i2)).d(true));
            i2++;
        }
        pu0 pu0Var = new pu0(ww6VarI.j());
        obd obdVar = w98Var.k;
        obdVar.getClass();
        int iF = obdVar.a.f();
        int i3 = this.a;
        int i4 = this.b;
        if (iF >= 2) {
            qr6Var.N(w98Var.c, i, i3, i4, pu0Var);
            return;
        }
        ga8 ga8Var = w98Var.c;
        qr6Var.U(ga8Var, i, i4, pu0Var);
        qr6Var.K(ga8Var, i, i3, i4);
    }
}
