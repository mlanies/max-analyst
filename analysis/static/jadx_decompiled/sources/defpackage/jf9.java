package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import one.me.sdk.tasks.MsgSendNotFoundException;
import ru.ok.tamtam.ExceptionHandler$HandledException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class jf9 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final boolean s0;
    public final long t0;

    public jf9(long j, long j2, long j3, long j4, long j5, boolean z, long j6) {
        super(j);
        this.Y = j4;
        this.Z = j5;
        this.o = j3;
        this.X = j2;
        this.s0 = z;
        this.t0 = j6;
    }

    public static lna v(cu8 cu8Var) {
        int i;
        nna nnaVar = null;
        wz wzVarF = !cu8Var.p() ? iz7.f(cu8Var.z0) : null;
        if (cu8Var.C0 != null) {
            int i2 = 2;
            int i3 = cu8Var.A0;
            if (i3 == 1) {
                i = i2;
                nnaVar = new nna(i, cu8Var.J0, cu8Var.K0);
            } else if (i3 != 2) {
                i = 1;
                nnaVar = new nna(i, cu8Var.J0, cu8Var.K0);
            } else {
                i2 = 3;
                i = i2;
                nnaVar = new nna(i, cu8Var.J0, cu8Var.K0);
            }
        }
        ArrayList arrayListV = iz7.v(cu8Var.R0);
        kna knaVar = new kna();
        knaVar.a = cu8Var.Z;
        knaVar.b = cu8Var.s0;
        knaVar.c = wzVarF;
        knaVar.d = nnaVar;
        knaVar.e = cu8Var.G0;
        knaVar.f = cu8Var.M0;
        knaVar.h = arrayListV;
        knaVar.i = cu8Var.T0;
        return knaVar.a();
    }

    public static jf9 x(byte[] bArr) throws ProtoException {
        try {
            Tasks.MsgSend msgSend = (Tasks.MsgSend) qw8.mergeFrom(new Tasks.MsgSend(), bArr);
            return new jf9(msgSend.requestId, msgSend.messageId, msgSend.chatId, msgSend.chatServerId, msgSend.userId, msgSend.notify, msgSend.lastKnownDraftTime);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new ProtoException(e);
        }
    }

    public final void A(long j, long j2) {
        if (j != 0) {
            ((sna) this.c.z.getValue()).getClass();
            sna.b(j, j2);
        }
    }

    @Override // defpackage.hua
    public final int c() {
        hm9.n("MsgSendApiTask", "onPreExecute");
        cu8 cu8VarQ = this.c.d().q(this.X);
        e52 e52VarC = cu8VarQ != null ? this.c.c().C(cu8VarQ.t0) : this.c.c().C(this.o);
        long j = this.Y;
        if (j == 0 && e52VarC != null) {
            j = e52VarC.b.a;
        }
        vx8 vx8Var = vx8.DELETED;
        if (cu8VarQ != null && cu8VarQ.v0 == vx8Var && cu8VarQ.c == 0) {
            au8 au8VarD = this.c.d();
            long j2 = this.o;
            long j3 = this.X;
            au8VarD.getClass();
            au8VarD.c(j2, Collections.singletonList(Long.valueOf(j3)));
            A(j, this.X);
            return 3;
        }
        if (cu8VarQ == null || cu8VarQ.v0 == vx8Var || cu8VarQ.u0 == iu8.s0) {
            A(j, this.X);
            return 3;
        }
        if (e52VarC == null) {
            ((cba) ((o45) this.c.u.getValue())).c(new HandledException("chat is null"), true);
            A(j, this.X);
            return 3;
        }
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            Locale locale = Locale.ROOT;
            long j4 = e52VarC.a;
            long j5 = cu8VarQ.b;
            StringBuilder sbK = au1.k(j4, "onPreExecute: chat = ", ", messageId = ");
            sbK.append(j5);
            sbK.append(", serverMessageId = ");
            sbK.append(cu8VarQ.c);
            ir6Var.d(us7Var, "MsgSendApiTask", sbK.toString(), null);
        }
        if (!e52VarC.M() && e52VarC.b.a == 0 && (!cu8VarQ.x() || cu8VarQ.f().a != p10.b)) {
            return 2;
        }
        if (!((!cu8VarQ.p() && cu8VarQ.n()) ? t20.a(cu8VarQ.z0) : true)) {
            hm9.n("MsgSendApiTask", "onPreExecute: attaches not ready, SKIP");
            return 2;
        }
        if (cu8VarQ.z()) {
            d20 d20Var = cu8VarQ.a(g20.x0).o;
            if (d20Var.d() || d20Var.a()) {
                return 2;
            }
        }
        lna lnaVarV = v(cu8VarQ);
        wz wzVar = lnaVarV.c;
        if ((wzVar != null && !wzVar.isEmpty()) || !oag.t(lnaVarV.b) || lnaVarV.d != null) {
            return 1;
        }
        hm9.m("MsgSendApiTask", "createRequest: empty outgoing message chatId = %s, messageId = %s", Long.valueOf(this.o), Long.valueOf(this.X));
        g(new pke("android.empty.message.and.attach", "MsgSend with empty text and attaches", null));
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        cu8 cu8VarQ = this.c.d().q(this.X);
        if (cu8VarQ != null) {
            this.c.d().x(cu8VarQ, iu8.s0);
            this.c.b().c(new l6f(cu8VarQ.t0, cu8VarQ.b));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lme
    public final void e(gle gleVar) {
        vx8 vx8Var;
        mf9 mf9Var = (mf9) gleVar;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "MsgSendApiTask", "onSuccess: chat=" + this.Y + ", messageId=" + this.X, null);
        }
        cu8 cu8VarQ = this.c.d().q(this.X);
        fs8 fs8Var = mf9Var.o;
        if (fs8Var != null && cu8VarQ != null && fs8Var.D0 == null && cu8VarQ.o()) {
            hm9.l0("MsgSendApiTask", "look's like delayed attrs is not supported!", new IllegalStateException("receive message without delayed attrs but send as delayed"));
            au8 au8VarD = this.c.d();
            long j = cu8VarQ.b;
            au8VarD.getClass();
            hm9.m("au8", "clearDelayedAttrs %d", Long.valueOf(j));
            ((k24) au8VarD.a).c.q(j, null, null);
            au8VarD.f.c.remove(Long.valueOf(j));
            ((of9) this.c.B.getValue()).a(this.o, mf9Var.c, mf9Var.o);
            this.c.b().c(new su(4));
            return;
        }
        if (cu8VarQ != null && !cu8VarQ.o()) {
            A(mf9Var.c, this.X);
        }
        if (cu8VarQ != null && cu8VarQ.v0 == (vx8Var = vx8.DELETED) && cu8VarQ.c == 0) {
            au8 au8VarD2 = this.c.d();
            fs8 fs8Var2 = mf9Var.o;
            long j2 = this.o;
            oz7 oz7Var = iu8.b;
            ((k24) au8VarD2.a).c.o(fs8Var2, j2, false, vx8Var);
            ((k4a) this.c.a()).B(this.o, this.Y, Collections.singletonList(Long.valueOf(cu8VarQ.b)), Collections.singletonList(Long.valueOf(mf9Var.o.a)), null, false, cu8VarQ.o() ? mg4.DELAYED : mg4.REGULAR);
            hm9.n("MsgSendApiTask", "onSuccess: sent api request for deletion locally deleted message");
            return;
        }
        if (cu8VarQ == null || !cu8VarQ.x()) {
            ((of9) this.c.B.getValue()).a(this.o, mf9Var.c, mf9Var.o);
            return;
        }
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            ir6Var2.d(us7.o, "MsgSendApiTask", "onSuccessControlMessage, messageDb.event = " + cu8VarQ.f().a, null);
        }
        if (cu8VarQ.f().a.ordinal() == 1) {
            ArrayList arrayList = cu8VarQ.f().c;
            List list = ((ju3) mf9Var.o.s0.get(0)).Y;
            ArrayList arrayList2 = new ArrayList(arrayList);
            arrayList2.removeAll(list);
            if (!arrayList2.isEmpty()) {
                this.c.b().c(new h9b(cu8VarQ.t0, arrayList2));
            }
        }
        ((of9) this.c.B.getValue()).a(this.o, mf9Var.c, mf9Var.o);
        ((k4a) this.c.a()).j(mf9Var.c);
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgSend msgSend = new Tasks.MsgSend();
        msgSend.requestId = this.a;
        msgSend.messageId = this.X;
        msgSend.chatId = this.o;
        long j = this.Y;
        if (j != 0) {
            msgSend.chatServerId = j;
        }
        long j2 = this.Z;
        if (j2 != 0) {
            msgSend.userId = j2;
        }
        msgSend.notify = this.s0;
        msgSend.lastKnownDraftTime = this.t0;
        return qw8.toByteArray(msgSend);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        long j;
        long j2;
        long j3;
        k8g k8gVar;
        uj3 uj3VarL;
        StringBuilder sb = new StringBuilder("onFail: chat=");
        long j4 = this.Y;
        sb.append(j4);
        sb.append(", messageId=");
        long j5 = this.X;
        sb.append(j5);
        hm9.l("MsgSendApiTask", sb.toString(), pkeVar.X);
        cu8 cu8VarQ = this.c.d().q(j5);
        if (cu8VarQ != null) {
            p82 p82VarC = this.c.c();
            long j6 = this.o;
            e52 e52VarC = p82VarC.C(j6);
            long j7 = e52VarC != null ? e52VarC.b.a : 0L;
            t19 t19VarD = ((k24) this.c.d().a).c.d();
            ilc ilcVar = t19VarD.a;
            ilcVar.b();
            th thVar = t19VarD.i;
            q36 q36VarF = thVar.f();
            long j8 = j7;
            String str = pkeVar.b;
            q36VarF.f(1, str);
            q36VarF.j(2, j5);
            try {
                ilcVar.c();
                try {
                    q36VarF.n();
                    ilcVar.r();
                    thVar.t(q36VarF);
                    au8 au8VarD = this.c.d();
                    String str2 = pkeVar.o;
                    if (str2 == null) {
                        str2 = "";
                    }
                    t19 t19VarD2 = ((k24) au8VarD.a).c.d();
                    ilcVar = t19VarD2.a;
                    ilcVar.b();
                    th thVar2 = t19VarD2.j;
                    q36 q36VarF2 = thVar2.f();
                    q36VarF2.f(1, str2);
                    q36VarF2.j(2, j5);
                    try {
                        ilcVar.c();
                        try {
                            q36VarF2.n();
                            ilcVar.r();
                            thVar2.t(q36VarF2);
                            boolean zU = f46.U(str);
                            long j9 = this.a;
                            long j10 = cu8VarQ.b;
                            if (zU) {
                                j = j6;
                                j2 = j9;
                                j3 = j10;
                                z(cu8VarQ, j8);
                            } else {
                                boolean zX = cu8VarQ.x();
                                mg4 mg4Var = cu8VarQ.U0;
                                if (zX) {
                                    if ("error.phone.binding.required".equals(str)) {
                                        w(cu8VarQ);
                                    } else {
                                        hm9.p("MsgSendApiTask", "onFailControlMessage, in event = " + cu8VarQ.f().a, null);
                                        p82 p82VarC2 = this.c.c();
                                        p82VarC2.getClass();
                                        hm9.n("p82", "deleteAndUpdateLastMessage, chatId = " + j6);
                                        rm4 rm4Var = p82VarC2.s;
                                        au8 au8Var = (au8) rm4Var.get();
                                        au8Var.getClass();
                                        au8Var.c(j6, Collections.singletonList(Long.valueOf(j10)));
                                        p82VarC2.m.c(new re9(j6, Collections.singletonList(Long.valueOf(j10)), null));
                                        p82VarC2.k0(j6, ((au8) rm4Var.get()).p(j6, mg4Var), true);
                                        ((k4a) this.c.a()).j(j4);
                                        this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(j6)), false));
                                    }
                                } else if ("user.not.found".equals(str)) {
                                    u(cu8VarQ);
                                    e52 e52VarC2 = this.c.c().C(j6);
                                    if (e52VarC2 != null && (uj3VarL = e52VarC2.l()) != null) {
                                        ((el3) this.c.k.getValue()).o(uj3VarL.n());
                                        this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(j6)), true));
                                    }
                                    A(j8, j5);
                                } else {
                                    if ("not.found".equals(str)) {
                                        u(cu8VarQ);
                                        pl plVar = this.c;
                                        if (plVar == null) {
                                            plVar = null;
                                        }
                                        ((cba) ((o45) plVar.u.getValue())).c(new ExceptionHandler$HandledException(null, "ONEME-17243", new MsgSendNotFoundException("got \"not.found\" error on send message, with causeMessage=" + pkeVar.c)), true);
                                        A(j8, j5);
                                        j2 = j9;
                                        j = j6;
                                    } else if ("privacy.restricted".equals(str)) {
                                        StringBuilder sb2 = new StringBuilder("onFailPrivacyRestricted, message send to dialog, chatId = ");
                                        j2 = j9;
                                        sb2.append(cu8VarQ.t0);
                                        hm9.p("MsgSendApiTask", sb2.toString(), null);
                                        u(cu8VarQ);
                                        j = j6;
                                        h9b h9bVar = new h9b(j, Collections.singletonList(Long.valueOf(this.Z)));
                                        this.c.b().c(h9bVar);
                                        ((k4a) this.c.a()).j(j4);
                                        this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, mg4.REGULAR, h9bVar, 96));
                                        A(j8, j5);
                                    } else {
                                        j2 = j9;
                                        j = j6;
                                        if ("error.phone.binding.required".equals(str)) {
                                            w(cu8VarQ);
                                            A(j8, j5);
                                        } else {
                                            if (("video.not.found".equalsIgnoreCase(str) || "photo.not.found".equalsIgnoreCase(str) || "file.not.found".equalsIgnoreCase(str) || "sticker.not.found".equalsIgnoreCase(str)) && (k8gVar = cu8VarQ.z0) != null && k8gVar.i() > 0 && k8gVar.i() != 0) {
                                                for (int i = 0; i < k8gVar.i(); i++) {
                                                    if (!oag.t(k8gVar.h(i).s)) {
                                                    }
                                                }
                                                if (y(cu8VarQ)) {
                                                    for (int i2 = 0; i2 < k8gVar.i(); i2++) {
                                                        l20 l20VarH = k8gVar.h(i2);
                                                        this.c.d().v(j10, l20VarH.r, new yt8(7, l20VarH));
                                                    }
                                                    ((s8g) this.c.g.getValue()).a(new v8d(j, j5));
                                                    this.c.e().d(j2);
                                                    j3 = j10;
                                                    j9 = j2;
                                                } else {
                                                    u(cu8VarQ);
                                                    j3 = j10;
                                                    j9 = j2;
                                                    this.c.b().c(new nf9(this.a, pkeVar, this.o));
                                                    A(j4, j5);
                                                }
                                                j2 = j9;
                                            }
                                            j3 = j10;
                                            if ("attachment.not.ready".equals(str)) {
                                                z(cu8VarQ, j8);
                                                ((t20) this.c.C.getValue()).b(cu8VarQ);
                                            } else if ("android.empty.message.and.attach".equals(str)) {
                                                try {
                                                    y(cu8VarQ);
                                                } catch (Throwable unused) {
                                                }
                                                A(j8, j5);
                                                ((k24) this.c.d().a).c.d().o(j, Collections.singletonList(Long.valueOf(j5)), vx8.DELETED);
                                                av0 av0VarB = this.c.b();
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(Long.valueOf(j3));
                                                av0VarB.c(new re9(this.o, arrayList, mg4Var));
                                                this.c.e().d(j2);
                                            } else {
                                                u(cu8VarQ);
                                                j2 = j2;
                                                this.c.b().c(new nf9(this.a, pkeVar, this.o));
                                                A(j8, j5);
                                            }
                                            j2 = j2;
                                        }
                                    }
                                    j3 = j10;
                                }
                                j3 = j10;
                                j = j6;
                                j2 = j9;
                            }
                            this.c.b().c(new l6f(j, j3, 0));
                            this.c.b().c(new oi0(j2, pkeVar));
                        } finally {
                        }
                    } catch (Throwable th) {
                        thVar2.t(q36VarF2);
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th2) {
                thVar.t(q36VarF);
                throw th2;
            }
        }
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.o;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // defpackage.ol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dle i() {
        /*
            r22 = this;
            r0 = r22
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "createRequest"
            defpackage.hm9.n(r1, r2)
            pl r2 = r0.c
            au8 r2 = r2.d()
            long r3 = r0.X
            cu8 r2 = r2.q(r3)
            r5 = 0
            if (r2 != 0) goto L22
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "messageDb is null"
            defpackage.hm9.H(r1, r2, r0)
            goto Lac
        L22:
            pl r6 = r0.c
            p82 r6 = r6.c()
            long r7 = r2.t0
            e52 r6 = r6.C(r7)
            long r7 = r0.Y
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 != 0) goto L48
            if (r6 == 0) goto L48
            boolean r11 = r6.M()
            if (r11 != 0) goto L48
            k92 r11 = r6.b
            long r11 = r11.a
            int r9 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r9 == 0) goto L48
            r14 = r11
            goto L49
        L48:
            r14 = r7
        L49:
            if (r6 == 0) goto L5a
            boolean r6 = r6.I()
            if (r6 == 0) goto L5a
            boolean r6 = r0.s0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r19 = r6
            goto L5c
        L5a:
            r19 = r5
        L5c:
            lna r2 = v(r2)
            wz r6 = r2.c
            if (r6 == 0) goto L6a
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L9c
        L6a:
            java.lang.String r6 = r2.b
            boolean r6 = defpackage.oag.t(r6)
            if (r6 == 0) goto L9c
            nna r6 = r2.d
            if (r6 == 0) goto L77
            goto L9c
        L77:
            long r6 = r0.o
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "createRequest: empty outgoing message chatId = %s, messageId = %s"
            defpackage.hm9.m(r1, r3, r2)
            pke r1 = new pke
            java.lang.String r2 = "android.empty.message.and.attach"
            java.lang.String r3 = "MsgSend with empty text and attaches"
            r1.<init>(r2, r3, r5)
            r0.g(r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L9c:
            tq2 r5 = new tq2
            long r3 = r0.Z
            long r0 = r0.t0
            r13 = r5
            r16 = r3
            r18 = r2
            r20 = r0
            r13.<init>(r14, r16, r18, r19, r20)
        Lac:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf9.i():dle");
    }

    public final void u(cu8 cu8Var) {
        this.c.d().x(cu8Var, iu8.s0);
        this.c.c().k0(this.o, cu8Var, false);
        this.c.e().d(this.a);
    }

    public final void w(cu8 cu8Var) {
        hm9.p("MsgSendApiTask", "onFailPhoneBindingRequired, message send to dialog, chatId = " + cu8Var.t0, null);
        u(cu8Var);
        this.c.b().c(new tua(tua.c));
        ((k4a) this.c.a()).j(this.Y);
        this.c.b().c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0053, B:26:0x0067), top: B:31:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(defpackage.cu8 r8) {
        /*
            r7 = this;
            k8g r8 = r8.z0
            java.lang.Object r8 = r8.a
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
            r0 = 0
        Lb:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r8.next()
            l20 r1 = (defpackage.l20) r1
            g20 r2 = r1.a
            int r2 = r2.ordinal()
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L42
            r3 = 3
            if (r2 == r3) goto L3b
            r3 = 5
            r6 = 0
            if (r2 == r3) goto L36
            r3 = 9
            if (r2 == r3) goto L2f
        L2d:
            r2 = r4
            goto L47
        L2f:
            s10 r1 = r1.j
            long r2 = r1.a
            java.lang.String r6 = r1.e
            goto L47
        L36:
            f20 r1 = r1.f
            long r2 = r1.a
            goto L47
        L3b:
            k20 r1 = r1.d
            long r2 = r1.a
            java.lang.String r6 = r1.m
            goto L47
        L42:
            x10 r1 = r1.b
            java.lang.String r6 = r1.Z
            goto L2d
        L47:
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 != 0) goto L51
            boolean r4 = defpackage.oag.t(r6)
            if (r4 != 0) goto Lb
        L51:
            if (r1 == 0) goto L67
            pl r0 = r7.c     // Catch: java.lang.Throwable -> L65
            je7 r0 = r0.A     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L65
            y8f r0 = (defpackage.y8f) r0     // Catch: java.lang.Throwable -> L65
            pa3 r0 = r0.b(r2)     // Catch: java.lang.Throwable -> L65
            r0.a()     // Catch: java.lang.Throwable -> L65
            goto L80
        L65:
            r0 = move-exception
            goto L79
        L67:
            pl r0 = r7.c     // Catch: java.lang.Throwable -> L65
            je7 r0 = r0.A     // Catch: java.lang.Throwable -> L65
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L65
            y8f r0 = (defpackage.y8f) r0     // Catch: java.lang.Throwable -> L65
            pa3 r0 = r0.e(r6)     // Catch: java.lang.Throwable -> L65
            r0.a()     // Catch: java.lang.Throwable -> L65
            goto L80
        L79:
            java.lang.String r1 = "MsgSendApiTask"
            java.lang.String r2 = "onAttachNotFound: failed"
            defpackage.hm9.p(r1, r2, r0)
        L80:
            r0 = 1
            goto Lb
        L82:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jf9.y(cu8):boolean");
    }

    public final void z(cu8 cu8Var, long j) {
        this.c.d().x(cu8Var, iu8.X);
        if (j != 0) {
            sna snaVar = (sna) this.c.z.getValue();
            snaVar.getClass();
            if (j == 0) {
                return;
            }
            snaVar.f(j, cu8Var.A() ? b10.PHOTO : cu8Var.u() ? b10.AUDIO : cu8Var.m(g20.o) ? b10.VIDEO : cu8Var.t() ? b10.VIDEO_MSG : cu8Var.m(g20.u0) ? b10.FILE : cu8Var.D() ? b10.STICKER : null, cu8Var.b);
        }
    }
}
