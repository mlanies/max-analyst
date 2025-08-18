package defpackage;

import android.os.SystemClock;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class s84 extends di0 {
    public final mm4 j;
    public final g47 k;
    public volatile List l;
    public int m;
    public final AtomicBoolean n;

    public s84(cjg cjgVar, String str, String str2, zwd zwdVar, nm4 nm4Var, ai3 ai3Var, ztc ztcVar) {
        super(cjgVar, new eh3(str, str2, true), zwdVar, ai3Var);
        this.l = new ArrayList();
        this.m = 0;
        this.n = new AtomicBoolean();
        this.j = nm4Var;
        this.k = nm4Var != null ? new g47(zwdVar) : null;
        r();
    }

    @Override // defpackage.k33
    public final void close() {
    }

    @Override // defpackage.di0, defpackage.k33
    public final Socket connect() throws Exception {
        try {
            Socket socketConnect = super.connect();
            this.m = 0;
            return socketConnect;
        } catch (Exception e) {
            synchronized (this) {
                this.m = (this.m + 1) % this.l.size();
                throw e;
            }
        }
    }

    @Override // defpackage.k33
    public final int d() {
        return ((Number) q().d.getValue()).intValue();
    }

    @Override // defpackage.k33
    public final void g(boolean z) {
        this.n.set(z);
    }

    @Override // defpackage.k33
    public final String i() {
        return q().a;
    }

    @Override // defpackage.k33
    public final int j() {
        return 15000;
    }

    @Override // defpackage.di0
    public final void l(Socket socket, String str, int i, int i2) throws IOException {
        InetAddress[] allByName;
        r84 r84Var;
        Object next;
        mm4 mm4Var = this.j;
        if (mm4Var == null) {
            super.l(socket, str, i, i2);
            return;
        }
        r84 r84Var2 = new r84(this, socket, i, i2);
        nm4 nm4Var = (nm4) mm4Var;
        String str2 = nm4Var.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.o, str2, zr6.i("resolve, host=", str, " ..."), null);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str3 = nm4Var.a;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.o, str3, "retrieveInetAddresses, host=".concat(str), null);
        }
        try {
            allByName = InetAddress.getAllByName(str);
        } catch (SecurityException e) {
            hm9.p(nm4Var.a, "failed to find ip addresses for " + str + " due to security violation", e);
            allByName = new InetAddress[0];
        } catch (UnknownHostException e2) {
            hm9.p(nm4Var.a, "could not find ip addresses for ".concat(str), e2);
            allByName = new InetAddress[0];
        }
        nm4Var.b.lock();
        try {
            long j = jElapsedRealtime - nm4Var.c;
            long j2 = nm4.f;
            if (j > j2) {
                String str4 = nm4Var.a;
                ir6 ir6Var3 = hm9.m;
                if (ir6Var3 != null && ir6Var3.c()) {
                    r84Var = r84Var2;
                    ir6Var3.d(us7.o, str4, "resolve, cache expired, elapsed=" + j + " ms, ttl=" + j2 + " ms", null);
                } else {
                    r84Var = r84Var2;
                }
                nm4Var.b();
            } else {
                r84Var = r84Var2;
            }
            if (!(allByName.length == 0)) {
                nm4Var.c(str, allByName);
            }
            nm4Var.c = jElapsedRealtime;
            String str5 = nm4Var.a;
            ir6 ir6Var4 = hm9.m;
            if (ir6Var4 != null && ir6Var4.c()) {
                ir6Var4.d(us7.o, str5, nm4.a(nm4Var), null);
            }
            ArrayList arrayList = (ArrayList) nm4Var.d.get(str);
            v67 v67VarA = arrayList != null ? nm4Var.e.a(arrayList) : null;
            if (v67VarA != null) {
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                String str6 = nm4Var.a;
                ir6 ir6Var5 = hm9.m;
                if (ir6Var5 != null && ir6Var5.c()) {
                    ir6Var5.d(us7.o, str6, "for " + str + " selected " + v67VarA, null);
                }
                try {
                    r84Var.a(str, v67VarA.a, jElapsedRealtime2);
                    nm4Var.b.lock();
                    try {
                        v67VarA.b--;
                        v67VarA.d++;
                        return;
                    } finally {
                    }
                } catch (Throwable th) {
                    nm4Var.b.lock();
                    try {
                        v67VarA.b--;
                        throw th;
                    } finally {
                    }
                }
            }
            super.l(socket, str, i, i2);
            InetAddress inetAddress = socket.getInetAddress();
            if (inetAddress != null) {
                nm4 nm4Var2 = (nm4) this.j;
                String str7 = nm4Var2.a;
                ir6 ir6Var6 = hm9.m;
                if (ir6Var6 != null && ir6Var6.c()) {
                    ir6Var6.d(us7.o, str7, "addInetAddress, host=" + str + ", address=" + inetAddress, null);
                }
                ReentrantLock reentrantLock = nm4Var2.b;
                reentrantLock.lock();
                try {
                    HashMap map = nm4Var2.d;
                    Object arrayList2 = map.get(str);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        map.put(str, arrayList2);
                    }
                    ArrayList arrayList3 = (ArrayList) arrayList2;
                    Iterator it = arrayList3.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (tpa.f(((v67) next).a, inetAddress)) {
                                break;
                            }
                        }
                    }
                    v67 v67Var = (v67) next;
                    if (v67Var == null) {
                        v67Var = new v67(inetAddress);
                        arrayList3.add(v67Var);
                    }
                    reentrantLock.unlock();
                    String str8 = nm4Var2.a;
                    ir6 ir6Var7 = hm9.m;
                    if (ir6Var7 != null && ir6Var7.c()) {
                        ir6Var7.d(us7.o, str8, "addInetAddress, " + v67Var + " added to cache", null);
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.di0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.Socket m(javax.net.SocketFactory r11, java.lang.String r12, int r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s84.m(javax.net.SocketFactory, java.lang.String, int):java.net.Socket");
    }

    public final synchronized eh3 q() {
        return (eh3) this.l.get(this.m);
    }

    public final synchronized void r() {
        List listUnmodifiableList;
        try {
            this.l.clear();
            eh3 eh3VarV = s5c.v(this.a);
            if (eh3VarV != null) {
                hm9.m("s84", "default host = %s", eh3VarV.toString());
                this.l.add(eh3VarV);
            }
            ((ri4) this.a.a).e();
            this.l.addAll(s5c.B(this.a));
            this.l.add(this.f);
            List list = this.l;
            if (list.size() <= 1) {
                listUnmodifiableList = Collections.unmodifiableList(list);
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (!arrayList.contains(obj)) {
                        arrayList.add(obj);
                    }
                }
                listUnmodifiableList = arrayList;
            }
            this.l = listUnmodifiableList;
            this.m = 0;
        } catch (Throwable th) {
            throw th;
        }
    }
}
