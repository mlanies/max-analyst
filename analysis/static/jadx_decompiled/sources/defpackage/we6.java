package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class we6 implements cud {
    public final Context a;
    public final kld b;
    public final v7c c;
    public final ContextScope d;
    public final String e;
    public reg f;
    public int g;
    public ukg h;

    public we6(Context context, kke kkeVar) {
        this.a = context;
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.b = kldVarB;
        this.c = new v7c(kldVarB);
        this.d = j1e.a(((w9a) kkeVar).c().getImmediate());
        String name = we6.class.getName();
        this.e = name;
        khe kheVar = new khe(new es3(23, this));
        this.g = 6;
        if (z7.N(context, (ve6) kheVar.getValue(), new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), "com.google.android.gms.auth.api.phone.permission.SEND", 2) == null) {
            hm9.r(name, new yx3("SMS Retriever registration failed"), null, new Object[0]);
        }
        b();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.we6 r9, java.lang.String r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9.getClass()
            java.lang.String r0 = "[0-9]{"
            boolean r1 = r11 instanceof defpackage.te6
            if (r1 == 0) goto L18
            r1 = r11
            te6 r1 = (defpackage.te6) r1
            int r2 = r1.t0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.t0 = r2
            goto L1d
        L18:
            te6 r1 = new te6
            r1.<init>(r9, r11)
        L1d:
            java.lang.Object r11 = r1.Z
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.t0
            java.lang.String r4 = ", message="
            java.lang.String r5 = "sms code matching failed: codeLength="
            r6 = 0
            r7 = 0
            r8 = 1
            if (r3 == 0) goto L43
            if (r3 != r8) goto L3b
            java.io.Serializable r9 = r1.Y
            java.lang.String r10 = r1.X
            we6 r0 = r1.o
            defpackage.od2.a0(r11)
            r11 = r9
            r9 = r0
            goto Lb2
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            defpackage.od2.a0(r11)
            int r11 = r9.g     // Catch: java.lang.Throwable -> L6c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L6c
            r3.append(r11)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r11 = "}"
            r3.append(r11)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L6c
            java.util.regex.Pattern r11 = java.util.regex.Pattern.compile(r11)     // Catch: java.lang.Throwable -> L6c
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r11.find()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L6e
            java.lang.String r11 = r11.group(r7)     // Catch: java.lang.Throwable -> L6c
            goto L76
        L6c:
            r11 = move-exception
            goto L70
        L6e:
            r11 = r6
            goto L76
        L70:
            njc r0 = new njc
            r0.<init>(r11)
            r11 = r0
        L76:
            boolean r0 = r11 instanceof defpackage.njc
            r0 = r0 ^ r8
            if (r0 == 0) goto Lb2
            r0 = r11
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto La1
            yx3 r0 = new yx3
            int r1 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r1)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r2 = r9.e
            defpackage.hm9.r(r2, r0, r6, r1)
            goto Lb2
        La1:
            kld r3 = r9.b
            r1.o = r9
            r1.X = r10
            r1.Y = r11
            r1.t0 = r8
            java.lang.Object r0 = r3.a(r0, r1)
            if (r0 != r2) goto Lb2
            goto Lda
        Lb2:
            java.lang.Throwable r11 = defpackage.pjc.a(r11)
            if (r11 == 0) goto Ld8
            java.lang.String r0 = r9.e
            yx3 r1 = new yx3
            int r9 = r9.g
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            r2.append(r9)
            r2.append(r4)
            r2.append(r10)
            java.lang.String r9 = r2.toString()
            r1.<init>(r9, r11)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            defpackage.hm9.r(r0, r1, r6, r9)
        Ld8:
            e5f r2 = defpackage.e5f.a
        Lda:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.we6.a(we6, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        ukg ukgVarC;
        if (this.h != null) {
            hm9.n(this.e, "task not null! skip start retriever");
            return;
        }
        ukg ukgVar = null;
        if (this.f == null) {
            this.f = new reg(this.a, reg.x0, null, new rq9());
        }
        reg regVar = this.f;
        if (regVar != null && (ukgVarC = regVar.c(1, new ydg())) != null) {
            wp wpVar = new wp(2, new jy2(19, this));
            q67 q67Var = xne.a;
            ukgVarC.d(q67Var, wpVar);
            ukgVarC.i(new se6(this));
            ukgVarC.c(q67Var, new se6(this));
            ukgVarC.a(q67Var, new se6(this));
            ukgVar = ukgVarC;
        }
        this.h = ukgVar;
    }
}
