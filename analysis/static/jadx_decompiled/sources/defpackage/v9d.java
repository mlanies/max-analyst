package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.tamtam.api.SessionSendLimitException;

/* loaded from: classes2.dex */
public final class v9d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9d b;

    public /* synthetic */ v9d(x9d x9dVar, int i) {
        this.a = i;
        this.b = x9dVar;
    }

    public boolean a(bpa bpaVar) {
        x9d x9dVar = this.b;
        if (x9dVar.c.get() != 2 && !x9d.b(x9dVar, bpaVar, jt7.class)) {
            return false;
        }
        bpaVar.b.c.g(new pke("session.state", "session is in logged in state or login already in progress", null));
        return true;
    }

    public void b() {
        boolean z;
        long j;
        boolean z2;
        apa apaVar;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ai3 ai3VarA = this.b.n.a();
        zh3 zh3VarB = ((gh3) ((je7) ai3VarA.b).getValue()).b();
        int i = 1;
        if (((zh3) ((AtomicReference) ai3VarA.o).getAndSet(zh3VarB)) != zh3VarB) {
            String name = ai3.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, "reset timeoutIndex", null);
            }
            ((AtomicInteger) ai3VarA.c).set(0);
            z = true;
        } else {
            z = false;
        }
        long[] jArr = (long[]) ((Map) ((khe) ai3VarA.Y).getValue()).getOrDefault(zh3VarB, c37.c);
        int i2 = ((AtomicInteger) ai3VarA.c).get();
        if (i2 >= 0 && i2 < jArr.length) {
            j = jArr[i2];
        } else if (i2 >= jArr.length) {
            if (jArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            j = jArr[jArr.length - 1];
        } else {
            if (jArr.length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            j = jArr[0];
        }
        if (z) {
            String name2 = ai3.class.getName();
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.X, name2, "connType=" + zh3VarB + ", timeout = " + j, null);
            }
        }
        x9d x9dVar = this.b;
        int size = x9dVar.w.size();
        boolean z3 = x9dVar.B > 0 && x9dVar.k();
        if (z3 && !x9dVar.C && x9dVar.B < size) {
            hm9.k0(x9dVar.a, null, "amount of send_tasks=%d has exceeded the specified limit=%d", Arrays.copyOf(new Object[]{Integer.valueOf(size), Integer.valueOf(x9dVar.B)}, 2));
            x9dVar.o(new SessionSendLimitException(x9dVar.B, size));
            x9dVar.C = true;
        }
        if (z3) {
            hm9.m(this.b.a, "!==! invalidate start time for cmds, tasks=%d, limit=%d", Integer.valueOf(this.b.w.size()), Integer.valueOf(this.b.B));
        }
        synchronized (this.b.x) {
            try {
                if (this.b.w.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (bpa bpaVar : this.b.w) {
                        if (bpaVar != null && bpaVar.a == i && (apaVar = bpaVar.b) != null) {
                            if (z3) {
                                int i3 = dc7.a;
                                int i4 = ft4.o;
                                apaVar.d = z7.S(System.currentTimeMillis(), kt4.MILLISECONDS);
                            } else {
                                long jE = jCurrentTimeMillis - ft4.e(apaVar.d);
                                if (jE > j) {
                                    this.b.m(ds7.o, bpaVar.b.c.i(), (short) 0, bpaVar.b.a.N(), true, "send timeout: diff=" + jE + " requestTimeout=" + j);
                                    bpaVar.b.c.g(new gke());
                                    this.b.n.f();
                                    arrayList.add(bpaVar);
                                }
                            }
                        }
                        i = 1;
                    }
                    this.b.w.removeAll(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (this.b.v.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = this.b.v.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z2 = false;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (jCurrentTimeMillis - ft4.e(((zoa) entry.getValue()).c) > j && jCurrentTimeMillis - this.b.d.get() > j) {
                    this.b.m(ds7.o, ((zoa) entry.getValue()).a.i(), ((Short) entry.getKey()).shortValue(), ((zoa) entry.getValue()).b.b.a.N(), false, "read timeout");
                    this.b.n.f();
                    arrayList2.add((Short) entry.getKey());
                    z2 = true;
                    break;
                }
            }
            gke gkeVar = new gke();
            if (z2) {
                hm9.k0(this.b.a, null, "session timeout", Arrays.copyOf(new Object[0], 0));
                Iterator it2 = this.b.v.values().iterator();
                while (it2.hasNext()) {
                    ((zoa) it2.next()).a.g(gkeVar);
                }
                this.b.v.clear();
                this.b.p(0);
                this.b.g.set(false);
                return;
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Short sh = (Short) it3.next();
                zoa zoaVar = (zoa) this.b.v.get(sh);
                if (zoaVar != null) {
                    zoaVar.a.g(gkeVar);
                    this.b.v.remove(sh);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0119 A[Catch: all -> 0x0111, Exception -> 0x0114, IOException -> 0x0116, TRY_ENTER, TryCatch #3 {IOException -> 0x0116, blocks: (B:64:0x0106, B:73:0x0119, B:78:0x012e, B:80:0x0157, B:82:0x0160, B:81:0x015c), top: B:116:0x0106, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c() {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.c():void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(defpackage.yoa r27, byte[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.d(yoa, byte[]):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:907:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:911:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:913:0x0ec0  */
    /* JADX WARN: Removed duplicated region for block: B:958:0x0776 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(byte[] r34, defpackage.yoa r35, defpackage.dke r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 3968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.e(byte[], yoa, dke):void");
    }

    public yoa f() throws IOException {
        byte[] bArr = new byte[10];
        this.b.s.readFully(bArr, 0, 10);
        return new yoa(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v9d.run():void");
    }
}
