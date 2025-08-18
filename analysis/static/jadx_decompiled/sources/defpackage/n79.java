package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class n79 implements b79, qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public Integer t0;
    public final ContextScope u0;
    public final q0e v0;

    public n79(Context context, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, wxc wxcVar, kke kkeVar, ox3 ox3Var) {
        this.a = context;
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        this.Y = je7Var5;
        this.Z = je7Var7;
        this.s0 = je7Var8;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b().limitedParallelism(1, "notif-bundled").plus(ox3Var));
        this.u0 = contextScopeA;
        String string = context.getString(c2c.tt_you);
        kua kuaVar = new kua();
        kuaVar.a = string;
        kuaVar.b = null;
        kuaVar.c = null;
        kuaVar.d = null;
        kuaVar.e = false;
        kuaVar.f = false;
        this.v0 = r0e.a(kuaVar);
        nu0.z(new zn5(new j31(new m58(od2.h(od2.x(((hyc) ((q33) wxcVar.a.getValue())).u())), 10), this, wxcVar, 6), new f79(je7Var6, je7Var3, this, null), 5), contextScopeA);
    }

    public static kua b(rw8 rw8Var) {
        long j = rw8Var.g;
        if (j == 0) {
            j = rw8Var.c;
        }
        String strValueOf = String.valueOf(j);
        Bitmap bitmap = rw8Var.h;
        IconCompat iconCompatB = bitmap != null ? IconCompat.b(bitmap) : null;
        kua kuaVar = new kua();
        kuaVar.a = rw8Var.f;
        kuaVar.b = iconCompatB;
        kuaVar.c = null;
        kuaVar.d = strValueOf;
        kuaVar.e = false;
        kuaVar.f = false;
        return kuaVar;
    }

    @Override // defpackage.qu7
    public final void a() {
    }

    public final Object c(Continuation continuation) {
        hm9.n("n79", "cancelAll");
        h().a(g().e());
        Object objB = ((cm2) this.c.getValue()).b(continuation);
        return objB == tx3.a ? objB : e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(long r10, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r9 = this;
            r0 = 1
            boolean r1 = r12 instanceof defpackage.g79
            if (r1 == 0) goto L14
            r1 = r12
            g79 r1 = (defpackage.g79) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L14
            int r2 = r2 - r3
            r1.s0 = r2
            goto L19
        L14:
            g79 r1 = new g79
            r1.<init>(r9, r12)
        L19:
            java.lang.Object r12 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            e5f r4 = defpackage.e5f.a
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r0) goto L30
            int r9 = r1.X
            n79 r10 = r1.o
            defpackage.od2.a0(r12)
            r12 = r9
            r9 = r10
            goto L84
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            defpackage.od2.a0(r12)
            r6 = 0
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            java.lang.String r3 = "n79"
            if (r12 != 0) goto L49
            java.lang.String r9 = "cancelServerChatId: failed, serverChatId == 0L"
            defpackage.hm9.p(r3, r9, r5)
            return r4
        L49:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r6 = "cancelServerChatId: serverChatId="
            r12.<init>(r6)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.n(r3, r12)
            tda r12 = r9.g()
            r12.getClass()
            int r12 = (int) r10
            r3 = 32
            long r6 = r10 >> r3
            int r3 = (int) r6
            int r12 = r12 + r3
            bea r3 = r9.h()
            r3.a(r12)
            je7 r3 = r9.c
            java.lang.Object r3 = r3.getValue()
            cm2 r3 = (defpackage.cm2) r3
            r1.o = r9
            r1.X = r12
            r1.s0 = r0
            java.lang.Object r10 = r3.a(r10, r1)
            if (r10 != r2) goto L84
            return r2
        L84:
            bea r10 = r9.h()
            r10.getClass()
            android.app.NotificationManager r10 = r10.i()     // Catch: java.lang.Throwable -> Lcd
            android.service.notification.StatusBarNotification[] r10 = r10.getActiveNotifications()     // Catch: java.lang.Throwable -> Lcd
            int r11 = r10.length
            if (r11 != 0) goto L97
            goto Lcd
        L97:
            int r11 = r10.length
            r1 = 0
            r2 = r1
            r3 = r2
        L9b:
            java.lang.String r6 = "MESS_GROUP_NOTIF"
            if (r1 >= r11) goto Lb8
            r7 = r10[r1]
            java.lang.String r8 = r7.getTag()
            boolean r6 = r6.equalsIgnoreCase(r8)
            if (r6 == 0) goto Lad
            r5 = r7
            goto Lb6
        Lad:
            int r6 = r7.getId()
            if (r6 != r12) goto Lb5
            int r2 = r2 + r0
            goto Lb6
        Lb5:
            int r3 = r3 + r0
        Lb6:
            int r1 = r1 + r0
            goto L9b
        Lb8:
            if (r5 == 0) goto Lbe
            if (r2 < 0) goto Lcd
            if (r3 != 0) goto Lcd
        Lbe:
            bea r10 = r9.h()
            tda r9 = r9.g()
            int r9 = r9.e()
            r10.b(r9, r6)
        Lcd:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.d(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String e(boolean z) {
        String str;
        boolean zC = ((lqf) ((zp) this.b.getValue())).c();
        je7 je7Var = this.Y;
        if (zC) {
            lt9 lt9Var = (lt9) je7Var.getValue();
            lt9Var.c.getClass();
            if (lt9Var.g("ru.oneme.app.inapp.2") == null) {
                lt9Var.e(lt9Var.d());
            }
            return "ru.oneme.app.inapp.2";
        }
        if (z) {
            lt9 lt9Var2 = (lt9) je7Var.getValue();
            lt9Var2.c.getClass();
            str = "ru.oneme.app.dialogs";
            if (lt9Var2.g("ru.oneme.app.dialogs") == null) {
                lt9Var2.e(lt9Var2.c());
            }
        } else {
            lt9 lt9Var3 = (lt9) je7Var.getValue();
            lt9Var3.c.getClass();
            str = "ru.oneme.app.chats";
            if (lt9Var3.g("ru.oneme.app.chats") == null) {
                lt9Var3.e(lt9Var3.b());
            }
        }
        return str;
    }

    public final bu9 f(String str) {
        Context context = this.a;
        bu9 bu9Var = str == null ? new bu9(context, null) : new bu9(context, str);
        g().getClass();
        bu9Var.F.icon = avb.ic_notification;
        bu9Var.x = g().d();
        bu9Var.v = "msg";
        bu9Var.i(16, true);
        return bu9Var;
    }

    public final tda g() {
        return (tda) this.o.getValue();
    }

    public final bea h() {
        return (bea) this.X.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.i(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ca -> B:34:0x00d8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0105 -> B:43:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0128 -> B:48:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x012d -> B:50:0x0132). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0146 -> B:55:0x0149). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.gi9 r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.j(gi9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.cv9 r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.k(cv9, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x073d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.cv9 r55, kotlin.coroutines.Continuation r56) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1975
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n79.l(cv9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
