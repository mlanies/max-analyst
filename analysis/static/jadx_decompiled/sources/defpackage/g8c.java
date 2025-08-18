package defpackage;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes.dex */
public final class g8c {
    public final long a;
    public final int b;
    public final Object c;
    public Object d;
    public final Object e;

    public g8c(foe foeVar, TimeUnit timeUnit) {
        this.b = 5;
        this.a = timeUnit.toNanos(5L);
        this.c = foeVar.f();
        this.d = new ip6(this, zr6.l(new StringBuilder(), naf.g, " ConnectionPool"), 1);
        this.e = new ConcurrentLinkedQueue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.c
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = defpackage.oag.t(r0)
            if (r1 != 0) goto L25
            java.lang.String r1 = "youtube"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L13
            goto L26
        L13:
            java.lang.String r1 = "vimeo"
            boolean r2 = r0.contains(r1)
            if (r2 == 0) goto L1c
            goto L26
        L1c:
            java.lang.String r1 = "instagram"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L25
            goto L26
        L25:
            r1 = 0
        L26:
            r0 = 2
            int r3 = r3.b
            if (r3 == r0) goto L32
            r0 = 3
            if (r3 != r0) goto L2f
            goto L32
        L2f:
            java.lang.String r3 = "player"
            goto L34
        L32:
            java.lang.String r3 = "attachment"
        L34:
            if (r1 == 0) goto L3c
            java.lang.String r0 = "/"
            java.lang.String r3 = defpackage.rh4.j(r3, r0, r1)
        L3c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.a():java.lang.String");
    }

    public boolean b(y9 y9Var, b8c b8cVar, ArrayList arrayList, boolean z) {
        Iterator it = ((ConcurrentLinkedQueue) this.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            f8c f8cVar = (f8c) it.next();
            synchronized (f8cVar) {
                if (z) {
                    if (!(f8cVar.f != null)) {
                    }
                }
                if (f8cVar.h(y9Var, arrayList)) {
                    b8cVar.b(f8cVar);
                    return true;
                }
            }
        }
    }

    public int c(f8c f8cVar, long j) {
        byte[] bArr = naf.a;
        ArrayList arrayList = f8cVar.o;
        int i = 0;
        while (i < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                String str = "A connection to " + f8cVar.q.a.a + " was leaked. Did you forget to close a response body?";
                q2b q2bVar = q2b.a;
                q2b.a.j(((a8c) reference).a, str);
                arrayList.remove(i);
                f8cVar.i = true;
                if (arrayList.isEmpty()) {
                    f8cVar.p = j - this.a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    public void d(Throwable th) {
        String str;
        boolean z;
        String strA = a();
        if (!((gh3) ((y8a) vl.b()).getAccessor().c(gh3.class)).f() || (((z = th instanceof FetcherException)) && ((FetcherException) th).a == 2)) {
            str = "offline";
        } else if (z && ((FetcherException) th).a == 4) {
            str = "parse_manifest";
        } else if (z) {
            return;
        } else {
            str = th instanceof TimeoutException ? "timeout" : "unknown";
        }
        String str2 = str;
        int i = this.b;
        f("error", str2, null, null, i == 1, strA, i == 5, i == 3 ? "auto" : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(java.lang.Object r11, java.lang.String r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.d
            fef r0 = (defpackage.fef) r0
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r7 = r10.a()
            java.lang.Object r0 = r10.d
            fef r0 = (defpackage.fef) r0
            boolean r1 = r0 instanceof defpackage.b24
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.String r1 = "VIDEO_DASH"
        L16:
            r4 = r1
            goto L27
        L18:
            boolean r1 = r0 instanceof defpackage.yn6
            if (r1 == 0) goto L1f
            java.lang.String r1 = "HLS_PLAYLIST"
            goto L16
        L1f:
            boolean r1 = r0 instanceof defpackage.ee9
            if (r1 == 0) goto L26
            java.lang.String r1 = "VIDEO_MP4"
            goto L16
        L26:
            r4 = r2
        L27:
            android.net.Uri r0 = r0.l()
            java.lang.String r5 = r0.getHost()
            r0 = 1
            r1 = 0
            int r3 = r10.b
            if (r3 != r0) goto L37
            r6 = r0
            goto L38
        L37:
            r6 = r1
        L38:
            r8 = 5
            if (r3 != r8) goto L3d
            r8 = r0
            goto L3e
        L3d:
            r8 = r1
        L3e:
            r0 = 3
            if (r3 != r0) goto L45
            java.lang.String r0 = "auto"
            r9 = r0
            goto L46
        L45:
            r9 = r2
        L46:
            r1 = r10
            r2 = r12
            r3 = r11
            r1.f(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.e(java.lang.Object, java.lang.String):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.lang.String r19, java.lang.Object r20, java.lang.String r21, java.lang.String r22, boolean r23, java.lang.String r24, boolean r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g8c.f(java.lang.String, java.lang.Object, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, java.lang.String):void");
    }

    public g8c(long j, int i, String str, ef7 ef7Var) {
        this.a = j;
        this.b = i;
        this.c = str != null ? str.toLowerCase() : null;
        this.e = ef7Var;
    }
}
