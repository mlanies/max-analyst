package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class foe {
    public static final foe h = new foe(new w4d(new je3(zr6.l(new StringBuilder(), naf.g, " TaskRunner"), true)));
    public static final Logger i = Logger.getLogger(foe.class.getName());
    public boolean b;
    public long c;
    public final w4d g;
    public int a = 10000;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final q57 f = new q57(28, this);

    public foe(w4d w4dVar) {
        this.g = w4dVar;
    }

    public static final void a(foe foeVar, mne mneVar) {
        foeVar.getClass();
        byte[] bArr = naf.a;
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(mneVar.c);
        try {
            long jA = mneVar.a();
            synchronized (foeVar) {
                foeVar.b(mneVar, jA);
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th) {
            synchronized (foeVar) {
                foeVar.b(mneVar, -1L);
                threadCurrentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(mne mneVar, long j) {
        byte[] bArr = naf.a;
        coe coeVar = mneVar.a;
        if (coeVar.b != mneVar) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z = coeVar.d;
        coeVar.d = false;
        coeVar.b = null;
        this.d.remove(coeVar);
        if (j != -1 && !z && !coeVar.a) {
            coeVar.d(mneVar, j, true);
        }
        if (!coeVar.c.isEmpty()) {
            this.e.add(coeVar);
        }
    }

    public final mne c() {
        boolean z;
        boolean z2;
        byte[] bArr = naf.a;
        while (true) {
            ArrayList arrayList = this.e;
            if (arrayList.isEmpty()) {
                return null;
            }
            w4d w4dVar = this.g;
            w4dVar.getClass();
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            mne mneVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                mne mneVar2 = (mne) ((coe) it.next()).c.get(0);
                long jMax = Math.max(0L, mneVar2.b - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (mneVar != null) {
                        z = true;
                        break;
                    }
                    mneVar = mneVar2;
                }
            }
            if (mneVar != null) {
                byte[] bArr2 = naf.a;
                mneVar.b = -1L;
                coe coeVar = mneVar.a;
                coeVar.c.remove(mneVar);
                arrayList.remove(coeVar);
                coeVar.b = mneVar;
                this.d.add(coeVar);
                if (z || (!this.b && (!arrayList.isEmpty()))) {
                    ((ThreadPoolExecutor) w4dVar.b).execute(this.f);
                }
                return mneVar;
            }
            if (this.b) {
                if (jMin < this.c - jNanoTime) {
                    notify();
                }
                return null;
            }
            this.b = true;
            this.c = jNanoTime + jMin;
            try {
                try {
                    long j = jMin / 1000000;
                    long j2 = jMin - (1000000 * j);
                    if (j > 0 || jMin > 0) {
                        wait(j, (int) j2);
                    }
                    z2 = false;
                } catch (InterruptedException unused) {
                    d();
                    z2 = false;
                }
                this.b = z2;
            } catch (Throwable th) {
                this.b = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((coe) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.e;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            coe coeVar = (coe) arrayList2.get(size2);
            coeVar.b();
            if (coeVar.c.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(coe coeVar) {
        byte[] bArr = naf.a;
        if (coeVar.b == null) {
            boolean z = !coeVar.c.isEmpty();
            ArrayList arrayList = this.e;
            if (!z) {
                arrayList.remove(coeVar);
            } else if (!arrayList.contains(coeVar)) {
                arrayList.add(coeVar);
            }
        }
        boolean z2 = this.b;
        w4d w4dVar = this.g;
        if (!z2) {
            ((ThreadPoolExecutor) w4dVar.b).execute(this.f);
        } else {
            w4dVar.getClass();
            notify();
        }
    }

    public final coe f() {
        int i2;
        synchronized (this) {
            i2 = this.a;
            this.a = i2 + 1;
        }
        return new coe(this, zr6.h(i2, "Q"));
    }
}
