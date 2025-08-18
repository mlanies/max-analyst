package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class p31 implements nl, rl {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public p31(je7 je7Var, je7 je7Var2, je7 je7Var3, int i) {
        switch (i) {
            case 1:
                this.a = je7Var3;
                this.b = je7Var;
                this.c = je7Var2;
                break;
            default:
                this.a = je7Var;
                this.b = je7Var2;
                this.c = je7Var3;
                break;
        }
    }

    public q33 a() {
        return (q33) this.a.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r25) throws java.lang.Throwable {
        /*
            r24 = this;
            r0 = r24
            r1 = r25
            boolean r2 = r1 instanceof defpackage.y4g
            if (r2 == 0) goto L17
            r2 = r1
            y4g r2 = (defpackage.y4g) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            y4g r2 = new y4g
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L36
            if (r4 != r5) goto L2e
            p31 r0 = r2.o
            defpackage.od2.a0(r1)
            goto L93
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            defpackage.od2.a0(r1)
            je7 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f135welcomestickerids
            java.lang.String r4 = r4.name()
            java.util.List r1 = r1.h(r4, r6)
            r4 = 0
            if (r1 == 0) goto L5d
            java.lang.String[] r7 = new java.lang.String[r4]
            java.lang.Object[] r1 = r1.toArray(r7)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r1 != 0) goto L5f
        L5d:
            java.lang.String[] r1 = new java.lang.String[r4]
        L5f:
            int r4 = r1.length
            if (r4 != 0) goto L63
            return r6
        L63:
            m4c r4 = defpackage.n4c.a
            int r7 = r1.length
            if (r7 == 0) goto Lcc
            int r7 = r1.length
            r4.getClass()
            d3 r4 = defpackage.n4c.b
            int r4 = r4.g(r7)
            r1 = r1[r4]
            if (r1 == 0) goto Lcb
            java.lang.Long r1 = defpackage.dae.f0(r1)
            if (r1 == 0) goto Lcb
            long r7 = r1.longValue()
            je7 r1 = r0.a
            java.lang.Object r1 = r1.getValue()
            y4e r1 = (defpackage.y4e) r1
            r2.o = r0
            r2.Z = r5
            java.io.Serializable r1 = r1.a(r7, r2)
            if (r1 != r3) goto L93
            return r3
        L93:
            d2e r1 = (defpackage.d2e) r1
            if (r1 == 0) goto Lcb
            z2e r2 = new z2e
            je7 r0 = r0.c
            java.lang.Object r0 = r0.getValue()
            qe5 r0 = (defpackage.qe5) r0
            se5 r0 = (defpackage.se5) r0
            boolean r0 = r0.w()
            if (r0 == 0) goto Lab
            java.lang.String r6 = r1.z0
        Lab:
            r16 = r6
            r20 = 0
            r21 = 0
            long r8 = r1.a
            long r12 = r1.v0
            r10 = r12
            java.lang.String r14 = r1.s0
            java.lang.String r15 = r1.w0
            int r0 = r1.b
            r17 = r0
            int r0 = r1.c
            r18 = r0
            r19 = 0
            r23 = 7744(0x1e40, float:1.0852E-41)
            r7 = r2
            r7.<init>(r8, r10, r12, r14, r15, r16, r17, r18, r19, r20, r21, r23)
            r6 = r2
        Lcb:
            return r6
        Lcc:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Array is empty."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p31.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.rl
    public ql d() {
        String str = (String) j47.f0(hz4.a, new o31(this, null));
        qyc qycVar = (qyc) ((y7d) this.b.getValue());
        qycVar.getClass();
        String strW = qycVar.w(PmsKey.f15callsendpoint, null);
        if (strW == null) {
            strW = "";
        }
        return new ql(str, strW);
    }

    @Override // defpackage.nl
    public ml getSessionInfo() {
        try {
            hyc hycVar = (hyc) a();
            hycVar.getClass();
            List arrayList = new ArrayList();
            String string = hycVar.g.getString("user.callSession", null);
            if (string != null) {
                arrayList = Arrays.asList(TextUtils.split(string, ","));
            }
            if (arrayList != null && !arrayList.isEmpty() && arrayList.size() >= 3) {
                return new ml((String) arrayList.get(0), (String) arrayList.get(1), (String) arrayList.get(2));
            }
            return null;
        } catch (Throwable th) {
            hm9.l("OKConfigStoreTag", "Call session info cache error: ", th);
            return null;
        }
    }

    @Override // defpackage.nl
    public void setSessionInfo(ml mlVar) {
        if (mlVar == null) {
            q33 q33VarA = a();
            nz4 nz4Var = nz4.a;
            hyc hycVar = (hyc) q33VarA;
            hycVar.getClass();
            String strJoin = TextUtils.join(",", nz4Var);
            ji5 ji5Var = (ji5) hycVar.g.edit();
            ji5Var.putString("user.callSession", strJoin);
            ji5Var.apply();
            return;
        }
        q33 q33VarA2 = a();
        List listM = y53.M(mlVar.a, mlVar.b, mlVar.c);
        hyc hycVar2 = (hyc) q33VarA2;
        hycVar2.getClass();
        String strJoin2 = TextUtils.join(",", listM);
        ji5 ji5Var2 = (ji5) hycVar2.g.edit();
        ji5Var2.putString("user.callSession", strJoin2);
        ji5Var2.apply();
    }
}
