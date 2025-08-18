package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class de3 extends ol implements lme, hua {
    public final boolean X;
    public final gaf Y;
    public final boolean Z;
    public final long o;
    public final long[] s0;
    public final boolean t0;
    public final List u0;
    public final List v0;

    public de3(long j, long j2, boolean z, gaf gafVar, boolean z2, long[] jArr, boolean z3, ArrayList arrayList, ArrayList arrayList2) {
        super(j);
        this.o = j2;
        this.X = z;
        this.Y = gafVar;
        this.Z = z2;
        this.s0 = jArr;
        this.t0 = z3;
        this.u0 = arrayList;
        this.v0 = arrayList2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.de3 v(byte[] r30) throws ru.ok.tamtam.nano.ProtoException {
        /*
            Method dump skipped, instructions count: 792
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.v(byte[]):de3");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ae A[RETURN] */
    @Override // defpackage.hua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            r7 = this;
            pl r0 = r7.c
            eoe r0 = r0.e()
            iua r1 = defpackage.iua.Z
            long r2 = r7.a
            java.util.List r0 = r0.h(r2, r1)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "de3"
            r3 = 3
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            une r1 = (defpackage.une) r1
            hua r4 = r1.f
            de3 r4 = (defpackage.de3) r4
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L12
            goe r4 = defpackage.goe.X
            goe r1 = r1.b
            if (r1 == r4) goto L12
            java.lang.String r7 = "onPreExecute: removed existent config task"
            defpackage.hm9.n(r2, r7)
            return r3
        L37:
            boolean r0 = r7.Z
            r1 = 1
            if (r0 == 0) goto L3d
            return r1
        L3d:
            boolean r0 = r7.X
            if (r0 == 0) goto L5f
            java.lang.String r7 = r7.u()
            boolean r7 = defpackage.oag.t(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onPreExecute: tokenEmpty="
            r0.<init>(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            defpackage.hm9.n(r2, r0)
            if (r7 == 0) goto L5d
            goto L5e
        L5d:
            r3 = r1
        L5e:
            return r3
        L5f:
            gaf r0 = r7.Y
            if (r0 == 0) goto L64
            return r1
        L64:
            long[] r0 = r7.s0
            if (r0 == 0) goto L6c
            int r0 = r0.length
            if (r0 <= 0) goto L6c
            return r1
        L6c:
            boolean r0 = r7.t0
            if (r0 == 0) goto L71
            return r1
        L71:
            pl r0 = r7.c
            p82 r0 = r0.c()
            long r4 = r7.o
            e52 r7 = r0.C(r4)
            if (r7 == 0) goto Laf
            boolean r0 = r7.C()
            if (r0 != 0) goto L86
            goto Laf
        L86:
            k92 r7 = r7.b
            j92 r0 = r7.b
            int r0 = r0.ordinal()
            r2 = 2
            if (r0 == 0) goto La7
            if (r0 == r1) goto L9e
            if (r0 != r2) goto L96
            goto L9e
        L96:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "invalid chat type"
            r7.<init>(r0)
            throw r7
        L9e:
            long r3 = r7.a
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto Lae
            goto Lad
        La7:
            i92 r0 = defpackage.i92.Z
            i92 r7 = r7.c
            if (r7 != r0) goto Lae
        Lad:
            return r2
        Lae:
            return r1
        Laf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.c():int");
    }

    @Override // defpackage.hua
    public final void d() {
        this.c.e().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        List list;
        if (gleVar instanceof fe3) {
            fe3 fe3Var = (fe3) gleVar;
            ((p7b) ((m7b) this.c.c.getValue())).b.m("hash", fe3Var.c);
            this.c.b().c(new che(true));
            if (fe3Var.o != null) {
                ((p7b) ((m7b) this.c.c.getValue())).c.z(fe3Var.o);
                if (Boolean.FALSE.equals(fe3Var.o.u)) {
                    t33 t33Var = (t33) ((q33) this.c.e.getValue());
                    t33Var.m("app.pin_" + t33Var.t(), null);
                }
                this.c.b().c(new su(2));
            }
            List list2 = this.v0;
            if (list2 == null || (list = this.u0) == null || ((ta2) this.c.v.getValue()) == null || !this.t0) {
                return;
            }
            ((zb2) ((ta2) this.c.v.getValue())).f(list, new HashSet(list2));
        }
    }

    public final boolean equals(Object obj) {
        List list;
        List list2;
        if (this == obj) {
            return true;
        }
        if (obj == null || de3.class != obj.getClass()) {
            return false;
        }
        de3 de3Var = (de3) obj;
        if (this.o != de3Var.o || this.X != de3Var.X || this.Z != de3Var.Z || this.t0 != de3Var.t0) {
            return false;
        }
        List list3 = this.v0;
        if (list3 != null && (list2 = de3Var.v0) != null && !list3.equals(list2)) {
            return false;
        }
        List list4 = this.u0;
        if (list4 != null && (list = de3Var.u0) != null && !list4.equals(list)) {
            return false;
        }
        gaf gafVar = de3Var.Y;
        gaf gafVar2 = this.Y;
        return gafVar2 != null ? gafVar2.equals(gafVar) : gafVar == null;
    }

    @Override // defpackage.hua
    public final byte[] f() {
        List list;
        Tasks.Config config = new Tasks.Config();
        config.requestId = this.a;
        config.chatId = this.o;
        config.isPushToken = this.X;
        config.reset = this.Z;
        config.isForFolders = this.t0;
        gaf gafVar = this.Y;
        if (gafVar == null) {
            config.userSettings = new HashMap();
        } else {
            us usVar = new us(0);
            Boolean bool = gafVar.a;
            if (bool != null) {
                usVar.put("pushNewContacts", String.valueOf(bool));
            }
            Long l = gafVar.b;
            if (l != null) {
                usVar.put("dontDustirbUntil", String.valueOf(l));
            }
            String str = gafVar.c;
            if (str != null) {
                usVar.put("dialogsPushNotification", str);
            }
            String str2 = gafVar.d;
            if (str2 != null) {
                usVar.put("chatsPushNotification", str2);
            }
            String str3 = gafVar.e;
            if (str3 != null) {
                usVar.put("pushSound", str3);
            }
            String str4 = gafVar.f;
            if (str4 != null) {
                usVar.put("dialogsPushSound", str4);
            }
            String str5 = gafVar.g;
            if (str5 != null) {
                usVar.put("chatsPushSound", str5);
            }
            Boolean bool2 = gafVar.h;
            if (bool2 != null) {
                usVar.put("hiddenOnline", String.valueOf(bool2));
            }
            Integer num = gafVar.i;
            if (num != null) {
                usVar.put("led", String.valueOf(num));
            }
            Integer num2 = gafVar.j;
            if (num2 != null) {
                usVar.put("dialogsLed", String.valueOf(num2));
            }
            Integer num3 = gafVar.k;
            if (num3 != null) {
                usVar.put("chatsLed", String.valueOf(num3));
            }
            Boolean bool3 = gafVar.l;
            if (bool3 != null) {
                usVar.put("vibration", String.valueOf(bool3));
            }
            Boolean bool4 = gafVar.m;
            if (bool4 != null) {
                usVar.put("dialogsVibration", String.valueOf(bool4));
            }
            Boolean bool5 = gafVar.n;
            if (bool5 != null) {
                usVar.put("chatsVibration", String.valueOf(bool5));
            }
            int i = gafVar.o;
            if (i != 0) {
                usVar.put("chatsInvite", h4f.k(i));
            }
            int i2 = gafVar.p;
            if (i2 != 0) {
                usVar.put("incomingCall", h4f.k(i2));
            }
            faf fafVar = gafVar.q;
            if (fafVar != null) {
                usVar.put("inactiveTTL", fafVar.a);
            }
            int i3 = gafVar.r;
            if (i3 != 0) {
                usVar.put("groupChatCallNotificationStatus", h4f.j(i3));
            }
            int i4 = gafVar.s;
            if (i4 != 0) {
                usVar.put("suggestStickersStatus", h4f.l(i4));
            }
            Boolean bool6 = gafVar.t;
            if (bool6 != null) {
                usVar.put("audioTranscriptionEnabled", String.valueOf(bool6));
            }
            Boolean bool7 = gafVar.u;
            if (bool7 != null) {
                usVar.put("safeMode", String.valueOf(bool7));
            }
            config.userSettings = usVar;
        }
        List list2 = this.v0;
        if (list2 != null && (list = this.u0) != null) {
            a[] aVarArr = new a[list.size()];
            String[] strArr = new String[list2.size()];
            for (int i5 = 0; i5 < list2.size(); i5++) {
                strArr[i5] = (String) list2.get(i5);
            }
            for (int i6 = 0; i6 < list.size(); i6++) {
                a aVar = new a();
                qa2 qa2Var = (qa2) list.get(i6);
                aVar.a = qa2Var.a;
                aVar.b = qa2Var.b;
                Set set = qa2Var.Y;
                String[] strArr2 = new String[set.size()];
                pa2[] pa2VarArr = (pa2[]) set.toArray(new pa2[0]);
                for (int i7 = 0; i7 < set.size(); i7++) {
                    strArr2[i7] = pa2VarArr[i7].name();
                }
                aVar.f = strArr2;
                aVar.g = qa2Var.Z;
                Set set2 = qa2Var.X;
                long[] jArr = new long[set2.size()];
                Long[] lArr = (Long[]) set2.toArray(new Long[0]);
                for (int i8 = 0; i8 < set2.size(); i8++) {
                    jArr[i8] = lArr[i8].longValue();
                }
                aVar.e = jArr;
                String str6 = qa2Var.c;
                if (str6 == null || str6.isEmpty()) {
                    str6 = "NO_EMOJI";
                }
                aVar.c = str6;
                Set set3 = qa2Var.o;
                long[] jArr2 = new long[set3.size()];
                Long[] lArr2 = (Long[]) set3.toArray(new Long[0]);
                for (int i9 = 0; i9 < set3.size(); i9++) {
                    jArr2[i9] = lArr2[i9].longValue();
                }
                aVar.d = jArr2;
                aVar.h = ou8.c(iz7.u(qa2Var.s0));
                aVar.i = qa2Var.t0;
                aVar.j = xfg.i(qa2Var.u0);
                aVar.k = xfg.k(qa2Var.v0);
                aVar.l = xfg.j(qa2Var.w0);
                aVarArr[i6] = aVar;
            }
            config.folders = aVarArr;
            config.excludedFolders = strArr;
        }
        config.syncChatIds = this.s0;
        return qw8.toByteArray(config);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        this.c.b().c(new che(false));
        if ("favorite.chats.limit".equals(pkeVar.b)) {
            this.c.c().V(this.o, false);
        }
        String str = pkeVar.b;
        if (oag.u(str) && (str.equals("wrong.device.token") || str.equals("WRONG_DEVICE_TOKEN"))) {
            ((hyc) ((q33) this.c.e.getValue())).m("user.fcmToken", "");
            ((xie) ((ti4) ((ri4) this.c.b.getValue())).i.getValue()).d();
        }
        if (pkeVar instanceof gke) {
            return;
        }
        d();
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.Z;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    @Override // defpackage.ol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dle i() {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de3.i():dle");
    }

    public final String u() {
        if (!this.X || !((xe6) ((ti4) ((ri4) this.c.b.getValue())).g).a()) {
            return null;
        }
        String strD = ((xie) ((ti4) ((ri4) this.c.b.getValue())).i.getValue()).d();
        if (oag.t(strD)) {
            return null;
        }
        return strD;
    }
}
