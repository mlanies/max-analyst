package com.my.tracker.obfuscated;

import android.content.Context;
import android.text.TextUtils;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.obfuscated.c0;
import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.z0;
import defpackage.ibg;
import defpackage.kcg;
import defpackage.r60;
import defpackage.ss5;
import defpackage.tb2;
import defpackage.vcg;
import defpackage.wcg;
import defpackage.zcg;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {
    final z0 b;
    final Context c;
    final a d;
    k0 g;
    final Map a = new HashMap();
    protected boolean e = false;
    protected b1 f = b1.j;
    private final l h = new l(65536);
    final l0 i = l0.b();
    long j = 0;

    public interface a {
        void a();

        void a(String str);
    }

    private t(z0 z0Var, a aVar, Context context) {
        this.b = z0Var;
        this.d = aVar;
        this.c = context.getApplicationContext();
    }

    public static t a(z0 z0Var, a aVar, Context context) {
        return new t(z0Var, aVar, context);
    }

    public static boolean b(Map map) {
        if (map == null) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (a((String) entry.getKey()) || a((String) entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        if (a(this.g)) {
            return;
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        if (this.g != null) {
            y0.b("EventTracker error: tracker has already been initialized");
            return;
        }
        j0 j0VarA = j0.a(this.b.g(), this.c);
        if (j0VarA == null) {
            return;
        }
        k0 k0VarA = k0.a(j0VarA);
        this.g = k0VarA;
        if (a(k0VarA)) {
            return;
        }
        this.j = p0.a(this.c).k();
        this.b.i().a(new kcg(this, 2), new kcg(this, 3));
        b();
    }

    public void c(Boolean bool) {
        a(new ibg(this, 4, bool));
    }

    public void d() {
        a(new zcg(this, 0));
    }

    public void g() {
        a(new r60(this, x0.a(), 8));
    }

    public static boolean a(k0 k0Var) {
        if (k0Var != null) {
            return false;
        }
        y0.b("EventTracker error: repository is null");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(b1 b1Var) {
        a(new ibg(this, 3, b1Var));
    }

    public static boolean a(String str) {
        if (str == null || str.length() <= 255) {
            return false;
        }
        y0.b("EventTracker error: length of the string " + str + " is more than 255, event ignored");
        return true;
    }

    public void b(String str, String str2, Map map) {
        a(new wcg(this, a(map), str, str2, x0.a(), 0));
    }

    public void c() {
        if (a(this.g)) {
            return;
        }
        this.d.a();
        if (!c0.a(this.c)) {
            y0.a("MyTrackerRepository: no network connection");
            return;
        }
        String strA = a(this.e, this.f, this.g);
        if (strA != null) {
            this.d.a(strA);
        }
        b(this.g);
    }

    private static Map a(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        return new HashMap(map);
    }

    private static void a(Runnable runnable) {
        h.a(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(Map map, String str, String str2, long j) {
        byte[] bArrB;
        if (a(this.g) || b(map) || (bArrB = this.i.b(this.e, str, str2, map)) == null || !this.g.h(bArrB, j)) {
            return;
        }
        b();
    }

    private static int a(r0 r0Var, k0 k0Var, z0.a aVar, boolean z, b1 b1Var, l0 l0Var, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        if (!k0Var.g()) {
            return 3;
        }
        return l0Var.a(r0Var, aVar, z, b1Var, v.a().a(aVar.i, z, context), k0Var.f(), k0Var.b(), k0Var.c());
    }

    public void b(String str) {
        a(new tb2(this, str, x0.a(), 9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b1 b1Var) {
        this.f = b1Var;
    }

    public void b(String str, String str2, long j, long j2) {
        a(new vcg(this, str, str2, j, j2, x0.a(), 0));
    }

    public void a() {
        a(new zcg(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j) {
        if (a(this.g)) {
            return;
        }
        boolean zA = this.g.a(j, p0.a(this.c).m());
        if (this.g.b(j)) {
            zA = true;
        }
        if (zA) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str, String str2, long j, long j2, long j3) {
        byte[] bArrB;
        if (a(this.g) || (bArrB = this.i.b(str, str2, j, j2)) == null || !this.g.d(bArrB, j3)) {
            return;
        }
        b();
    }

    public void a(String str, String str2, Map map) {
        a(new wcg(this, a(map), str, str2, x0.a(), 1));
    }

    public void b(Boolean bool) {
        this.e = bool.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(b1 b1Var) {
        y0.a("onUserInfoStateChanged: customUserIds=" + Arrays.toString(b1Var.g));
        if (g.a(this.f.g, b1Var.g) != 0 && !a(this.g)) {
            b(this.e, this.f, this.g);
        }
        this.f = b1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Map map, String str, String str2, long j) {
        byte[] bArrA;
        if (a(this.g) || b(map) || (bArrA = this.i.a(this.e, str, str2, map)) == null || !this.g.f(bArrA, j)) {
            return;
        }
        b();
    }

    public void b(boolean z, b1 b1Var, k0 k0Var) {
        y0.a("createAndStorePartialPacket: start");
        z0.a aVarK = this.b.k();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderJ = this.b.j();
        this.h.a();
        int iA = a(this.h, k0Var, aVarK, z, b1Var, this.i, okHttpClientProviderJ, this.c);
        y0.a("createAndStorePartialPacket: writeResult=" + iA);
        if (iA == 1) {
            k0Var.a();
            k0Var.a(this.h.c());
        } else if (iA == 2) {
            k0Var.a();
        }
        this.h.d();
    }

    public void a(final long j, final String str, final o0.a aVar) {
        final long jA = x0.a();
        a(new Runnable() { // from class: xcg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(j, str, aVar, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(long j, String str, o0.a aVar, long j2) {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(j, str, aVar)) == null || !this.g.e(bArrA, j2)) {
            return;
        }
        p0.a(this.c).b(j2);
        this.j = j2;
        b();
    }

    public void b(k0 k0Var) {
        String strL = this.b.l();
        MyTrackerConfig.OkHttpClientProvider okHttpClientProviderJ = this.b.j();
        try {
            b bVarD = k0Var.d();
            try {
                if (bVarD == null) {
                    y0.a("EventTracker error: iterator is null");
                    if (bVarD == null) {
                        return;
                    }
                } else {
                    while (bVarD.a()) {
                        long jC = bVarD.c();
                        byte[] bArrH = bVarD.h();
                        this.h.a();
                        this.h.b(bArrH);
                        c0.b bVarA = a(strL, okHttpClientProviderJ, this.h);
                        if (bVarA == null || !bVarA.b()) {
                            break;
                        }
                        String str = (String) bVarA.a();
                        if (!TextUtils.isEmpty(str)) {
                            this.d.a(str);
                        }
                        k0Var.a(jC);
                    }
                }
                bVarD.close();
            } finally {
            }
        } catch (Throwable th) {
            y0.b("EventTracker error: ", th);
        }
    }

    public void a(String str, String str2, Runnable runnable) {
        a(new wcg(this, str, str2, x0.a(), runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j, Runnable runnable) {
        if (a(this.g)) {
            return;
        }
        byte[] bArrB = this.i.b(str, str2);
        if (bArrB != null && this.g.g(bArrB, j)) {
            b();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(String str, String str2, long j, long j2) {
        a(new vcg(this, str, str2, j, j2, x0.a(), 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j, long j2, long j3) {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str, str2, j, j2)) == null || !this.g.a(bArrA, j3)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, long j) {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str)) == null || !this.g.b(bArrA, j)) {
            return;
        }
        b();
    }

    public void b() {
        int iF;
        if (a(this.g)) {
            return;
        }
        if (this.g.e() != 0 || ((iF = this.b.f()) > 0 && x0.a() - this.j <= iF)) {
            c();
        }
    }

    public void a(final String str, final String str2, final String str3, final String str4, final String str5) {
        final long jA = x0.a();
        a(new Runnable() { // from class: ycg
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(str, str2, str3, str4, str5, jA);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, String str3, String str4, String str5, long j) {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str, str2, str3, str4, str5)) == null || !this.g.i(bArrA, j)) {
            return;
        }
        p0.a(this.c).b(j);
        this.j = j;
        b();
    }

    public void a(String str, String str2) {
        a(new ss5(this, str, str2, x0.a(), 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(String str, String str2, long j) {
        byte[] bArrA;
        if (a(this.g) || (bArrA = this.i.a(str, str2)) == null || !this.g.c(bArrA, j)) {
            return;
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Boolean bool) {
        y0.a("updateKidMode: newKidMode=" + bool);
        if (bool.booleanValue() == this.e) {
            return;
        }
        if (!a(this.g)) {
            b(this.e, this.f, this.g);
        }
        this.e = bool.booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(boolean r11, com.my.tracker.obfuscated.b1 r12, com.my.tracker.obfuscated.k0 r13) {
        /*
            r10 = this;
            com.my.tracker.obfuscated.z0 r0 = r10.b
            com.my.tracker.obfuscated.z0$a r3 = r0.k()
            com.my.tracker.obfuscated.z0 r0 = r10.b
            java.lang.String r0 = r0.l()
            com.my.tracker.obfuscated.z0 r1 = r10.b
            com.my.tracker.MyTrackerConfig$OkHttpClientProvider r9 = r1.j()
            com.my.tracker.obfuscated.l r1 = r10.h
            r1.a()
            com.my.tracker.obfuscated.l r1 = r10.h
            com.my.tracker.obfuscated.l0 r6 = r10.i
            android.content.Context r8 = r10.c
            r2 = r13
            r4 = r11
            r5 = r12
            r7 = r9
            int r11 = a(r1, r2, r3, r4, r5, r6, r7, r8)
            r12 = 1
            if (r11 == r12) goto L29
            goto L4d
        L29:
            com.my.tracker.obfuscated.l r11 = r10.h
            com.my.tracker.obfuscated.c0$b r11 = r10.a(r0, r9, r11)
            if (r11 != 0) goto L32
            goto L4d
        L32:
            boolean r12 = r11.b()
            if (r12 == 0) goto L40
            java.lang.String r12 = "Events were sent successfully"
            com.my.tracker.obfuscated.y0.a(r12)
            r13.a()
        L40:
            java.lang.Object r11 = r11.a()
            java.lang.String r11 = (java.lang.String) r11
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 != 0) goto L4d
            goto L4e
        L4d:
            r11 = 0
        L4e:
            com.my.tracker.obfuscated.l r10 = r10.h
            r10.d()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.my.tracker.obfuscated.t.a(boolean, com.my.tracker.obfuscated.b1, com.my.tracker.obfuscated.k0):java.lang.String");
    }

    private c0.b a(String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, l lVar) {
        if (this.i.a(lVar, x0.a())) {
            return c0.a(new m(lVar), okHttpClientProvider, true).a(str);
        }
        return null;
    }
}
