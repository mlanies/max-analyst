package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class gi2 extends pnf implements dv, ad8 {
    public static final /* synthetic */ bc7[] R0 = {new oi9(gi2.class, "attachClickJob", "getAttachClickJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, gi2.class, "confirmationBottomSheetJob", "getConfirmationBottomSheetJob()Lkotlinx/coroutines/Job;"), new oi9(gi2.class, "editMessageJob", "getEditMessageJob()Lkotlinx/coroutines/Job;")};
    public final je7 A0;
    public final AtomicReference B0;
    public final je7 C0;
    public final w4d D0;
    public final w4d E0;
    public final w4d F0;
    public final khe G0;
    public final khe H0;
    public final q0e I0;
    public final q0e J0;
    public final s35 K0;
    public final khe L0;
    public final khe M0;
    public final gd1 N0;
    public final q0e O0;
    public final w7c P0;
    public final je7 Q0;
    public final au8 X;
    public final pk Y;
    public final av0 Z;
    public final long b;
    public final ih2 c;
    public final iy2 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final khe w0;
    public final je7 x0;
    public final z7d y0;
    public final se5 z0;

    public gi2(long j, ih2 ih2Var, jf2 jf2Var) {
        xcb xcbVar = xcb.a;
        iy2 iy2Var = (iy2) ((khe) xcbVar.c()).getValue();
        khe kheVarD = xcbVar.getAccessor().d(tp7.class);
        khe kheVarD2 = xcbVar.getAccessor().d(dv4.class);
        khe kheVarD3 = xcbVar.getAccessor().d(hu8.class);
        khe kheVarD4 = xcbVar.getAccessor().d(pf5.class);
        ns8 ns8Var = (ns8) xcbVar.getAccessor().c(ns8.class);
        je7 je7VarF = xcbVar.f();
        p82 p82Var = (p82) xcbVar.getAccessor().c(p82.class);
        ge2 ge2Var = (ge2) xcbVar.getAccessor().d(ge2.class).getValue();
        khe kheVarD5 = xcbVar.getAccessor().d(o20.class);
        khe kheVarD6 = xcbVar.getAccessor().d(z3b.class);
        au8 au8Var = (au8) xcbVar.getAccessor().c(au8.class);
        m7b m7bVar = (m7b) xcbVar.getAccessor().c(m7b.class);
        pk pkVar = (pk) ((khe) xcbVar.b()).getValue();
        fme fmeVar = (fme) xcbVar.getAccessor().c(fme.class);
        hle hleVar = (hle) xcbVar.getAccessor().c(hle.class);
        o45 o45Var = (o45) xcbVar.getAccessor().d(o45.class).getValue();
        av0 av0Var = (av0) xcbVar.getAccessor().c(av0.class);
        khe kheVarD7 = xcbVar.getAccessor().d(wha.class);
        this.b = j;
        this.c = ih2Var;
        this.o = iy2Var;
        this.X = au8Var;
        this.Y = pkVar;
        this.Z = av0Var;
        this.s0 = kheVarD;
        this.t0 = kheVarD2;
        this.u0 = kheVarD3;
        this.v0 = kheVarD4;
        this.w0 = new khe(new m52(12));
        this.x0 = kheVarD7;
        p7b p7bVar = (p7b) m7bVar;
        this.y0 = p7bVar.b;
        this.z0 = p7bVar.e;
        this.A0 = kheVarD6;
        this.B0 = new AtomicReference(null);
        this.C0 = je7VarF;
        this.D0 = mqd.D();
        this.E0 = mqd.D();
        this.F0 = mqd.D();
        this.G0 = new khe(new m52(13));
        this.H0 = new khe(new x2(ns8Var, 23, m7bVar));
        this.I0 = r0e.a(new di9());
        this.J0 = r0e.a(new di9());
        this.K0 = new s35(0);
        this.L0 = new khe(new p61(this, p82Var, ge2Var, m7bVar, fmeVar, hleVar, o45Var, 1));
        this.M0 = new khe(new md1(11, this));
        this.N0 = new gd1(1, this);
        q0e q0eVarA = r0e.a(lh2.d);
        this.O0 = q0eVarA;
        this.P0 = new w7c(q0eVarA);
        this.Q0 = tu0.r(3, new bp(m7bVar, ge2Var, kheVarD5, kheVarD6));
        e52 e52VarV = v();
        es8 es8Var = e52VarV != null ? e52VarV.c : null;
        if (es8Var != null) {
            av0Var.d(this);
            if (ih2Var == ih2.b) {
                z3b z3bVar = (z3b) kheVarD6.getValue();
                ((uh9) z3bVar.a).e(z3bVar.g);
                z3bVar.b();
            }
            tf2 tf2VarX = x();
            if (tf2VarX != null) {
                tf2VarX.X.a(tf2VarX.c.b(new xu(tf2VarX, es8Var, 0)));
                tf2VarX.Z = this;
            }
            od2.L(od2.F(new zn5(new ac(new t03(new w7c(p82Var.J(j)), 11), 11, this), new kh2(this, null), 5), ((w9a) w()).a()), this.a);
            od2.L(od2.F(new zn5(new v7c(jf2Var.b), new vw(2, this, gi2.class, "handleChatMediaEvent", "handleChatMediaEvent(Lone/me/profile/screens/media/ChatMediaEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 7), 5), ((w9a) w()).a()), this.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.gi2 r10, defpackage.hf2 r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.q(gi2, hf2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object r(defpackage.gi2 r31, defpackage.um8 r32, kotlin.coroutines.Continuation r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.r(gi2, um8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void s(gi2 gi2Var) {
        wha whaVar = (wha) gi2Var.x0.getValue();
        whaVar.g(new eqe(yea.T1));
        whaVar.e(new kia(woc.I));
        whaVar.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.gi2 r7, java.util.List r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof defpackage.fi2
            if (r0 == 0) goto L16
            r0 = r9
            fi2 r0 = (defpackage.fi2) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.s0 = r1
            goto L1b
        L16:
            fi2 r0 = new fi2
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            long r7 = r0.X
            gi2 r0 = r0.o
            defpackage.od2.a0(r9)
            goto La1
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            defpackage.od2.a0(r9)
            q0e r9 = r7.O0
            java.lang.Object r9 = r9.getValue()
            lh2 r9 = (defpackage.lh2) r9
            java.util.List r9 = r9.a
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto Lb8
            ih2 r9 = defpackage.ih2.a
            ih2 r2 = r7.c
            if (r2 != r9) goto Lb8
            int r9 = r8.size()
            java.util.ListIterator r8 = r8.listIterator(r9)
        L58:
            boolean r9 = r8.hasPrevious()
            r2 = 0
            if (r9 == 0) goto L77
            java.lang.Object r9 = r8.previous()
            r4 = r9
            vk6 r4 = (defpackage.vk6) r4
            boolean r5 = r4 instanceof defpackage.es8
            if (r5 == 0) goto L58
            es8 r4 = (defpackage.es8) r4
            cu8 r4 = r4.a
            if (r4 == 0) goto L58
            boolean r4 = r4.n()
            if (r4 != r3) goto L58
            goto L78
        L77:
            r9 = r2
        L78:
            boolean r8 = r9 instanceof defpackage.es8
            if (r8 == 0) goto L7f
            r2 = r9
            es8 r2 = (defpackage.es8) r2
        L7f:
            if (r2 == 0) goto L86
            cu8 r8 = r2.a
            long r8 = r8.b
            goto L88
        L86:
            r8 = 0
        L88:
            java.util.HashSet r2 = defpackage.b10.E0
            r0.o = r7
            r0.X = r8
            r0.s0 = r3
            iy2 r3 = r7.o
            jz2 r3 = (defpackage.jz2) r3
            long r4 = r7.b
            java.lang.Object r0 = r3.t(r4, r2, r0)
            if (r0 != r1) goto L9d
            goto Lba
        L9d:
            r6 = r0
            r0 = r7
            r7 = r8
            r9 = r6
        La1:
            x82 r9 = (defpackage.x82) r9
            long r1 = r9.d
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 == 0) goto Lb8
            iy2 r9 = r0.o
            jh2 r1 = new jh2
            r2 = 0
            r1.<init>(r7, r2)
            jz2 r9 = (defpackage.jz2) r9
            long r7 = r0.b
            r9.f(r7, r1)
        Lb8:
            e5f r1 = defpackage.e5f.a
        Lba:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.t(gi2, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        r15 = (defpackage.yc8) r2.Q0.getValue();
        r12 = (java.util.Set) r2.M0.getValue();
        r4.o = r2;
        r4.X = r0;
        r4.Y = r1;
        r4.Z = r9;
        r4.s0 = r8;
        r4.t0 = r8;
        r4.u0 = r7;
        r4.x0 = r6;
        r15.getClass();
        r13 = r2.c.ordinal();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00e3, code lost:
    
        if (r13 == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e5, code lost:
    
        if (r13 == r6) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e7, code lost:
    
        if (r13 == 2) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e9, code lost:
    
        if (r13 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00eb, code lost:
    
        r10 = r15.a(r11, r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r18 = r1;
        r23 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fa, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        r10 = r15.c(r11, r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0100, code lost:
    
        r10 = r15.b(r11, r12, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0105, code lost:
    
        r13 = r11.a.z0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
    
        if (r13 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
    
        r13 = (java.util.List) r13.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
    
        if (r13 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        r14 = new java.util.ArrayList();
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        if (r13.hasNext() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        r5 = r13.next();
        r6 = (defpackage.l20) r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0131, code lost:
    
        if (r12.contains(r6.a.toString()) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0135, code lost:
    
        if (r6.t != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0137, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013d, code lost:
    
        if (r6.a == defpackage.g20.o) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x013f, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0149, code lost:
    
        if (((defpackage.se5) r15.d).v() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0150, code lost:
    
        if (r6.i() == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0152, code lost:
    
        r1 = r6.d.b;
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0157, code lost:
    
        if (r1 == 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0159, code lost:
    
        r14.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x015c, code lost:
    
        r1 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0162, code lost:
    
        r18 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0164, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0166, code lost:
    
        r18 = r1;
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0169, code lost:
    
        r18 = r1;
        r14 = defpackage.nz4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        if (r14.size() <= 1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
    
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0176, code lost:
    
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0177, code lost:
    
        r1 = defpackage.j1e.a(r4.b);
        r5 = new java.util.ArrayList(defpackage.z53.S(r14, 10));
        r6 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
    
        if (r6.hasNext() == false) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0192, code lost:
    
        r19 = r15;
        r5.add(defpackage.j47.h(r1, null, new defpackage.xc8(r6.next(), null, r11, r10, r19), 3));
        r6 = r6;
        r2 = r2;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01bc, code lost:
    
        r23 = r2;
        r10 = defpackage.pag.c(r5, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c3, code lost:
    
        if (r10 != r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c5, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01c6, code lost:
    
        r11 = r23;
        r1 = r4;
        r2 = r7;
        r4 = r8;
        r7 = r4;
        r8 = r9;
        r9 = r18;
        r20 = r10;
        r10 = r0;
        r0 = r20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0216  */
    /* JADX WARN: Type inference failed for: r14v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x01c6 -> B:83:0x01d4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x01e2 -> B:85:0x01e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(java.util.List r22, java.lang.Long r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.A(java.util.List, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        if (r2.c(r11, (defpackage.lh2) r12) == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00da -> B:45:0x00dd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(long r9, boolean r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.B(long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void C(int i, xm8 xm8Var) {
        vm8 vm8Var;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        int i2 = wea.Z;
        s35 s35Var = this.K0;
        if (i == i2) {
            pnf.o(s35Var, new kg2(this.b, xm8Var.j()));
            return;
        }
        if (i == wea.Y) {
            if (xm8Var instanceof um8) {
                um8 um8Var = (um8) xm8Var;
                pnf.o(s35Var, new lg2(Long.valueOf(um8Var.c), um8Var.b, false));
                return;
            }
            if (xm8Var instanceof vm8) {
                vm8 vm8Var2 = (vm8) xm8Var;
                pnf.o(s35Var, new lg2(Long.valueOf(vm8Var2.c), vm8Var2.b, true));
                return;
            } else if (xm8Var instanceof wm8) {
                wm8 wm8Var = (wm8) xm8Var;
                pnf.o(s35Var, new lg2(Long.valueOf(wm8Var.c), wm8Var.b, true));
                return;
            } else {
                if (!(xm8Var instanceof qm8)) {
                    throw new NoWhenBranchMatchedException();
                }
                qm8 qm8Var = (qm8) xm8Var;
                pnf.o(s35Var, new lg2(Long.valueOf(qm8Var.c), qm8Var.b, false));
                return;
            }
        }
        int i3 = wea.d0;
        ContextScope contextScope = this.a;
        if (i == i3) {
            this.E0.o1(this, R0[1], j47.S(contextScope, ((w9a) w()).b(), vx3.b, new yh2(this, xm8Var, null)));
            return;
        }
        if (i == wea.X) {
            u(xm8Var, true);
            return;
        }
        if (i == wea.W) {
            u(xm8Var, false);
            return;
        }
        if (i == wea.a0) {
            vm8Var = xm8Var instanceof vm8 ? (vm8) xm8Var : null;
            if (vm8Var == null || (charSequence3 = vm8Var.Z) == null) {
                return;
            }
            pnf.o(s35Var, new jg2(charSequence3.toString()));
            return;
        }
        if (i == wea.V) {
            vm8Var = xm8Var instanceof vm8 ? (vm8) xm8Var : null;
            if (vm8Var == null || (charSequence2 = vm8Var.Z) == null) {
                return;
            }
            pnf.o(s35Var, new fg2(charSequence2.toString()));
            wha whaVar = (wha) this.x0.getValue();
            whaVar.g(new eqe(yea.s1));
            whaVar.e(new kia(woc.u));
            whaVar.i();
            return;
        }
        if (i != wea.c0) {
            if (i == wea.b0 && (xm8Var instanceof wm8)) {
                j47.T(contextScope, ((w9a) w()).b(), null, new ci2(this, xm8Var, null), 2);
                return;
            }
            return;
        }
        vm8Var = xm8Var instanceof vm8 ? (vm8) xm8Var : null;
        if (vm8Var == null || (charSequence = vm8Var.Z) == null) {
            return;
        }
        pnf.o(s35Var, new mg2(charSequence.toString()));
    }

    @Override // defpackage.ad8
    public final zc8 d() {
        zc8 zc8Var = (zc8) this.B0.get();
        if (zc8Var != null) {
            return zc8Var;
        }
        Set set = (Set) this.M0.getValue();
        ArrayList arrayList = new ArrayList(z53.S(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(b10.a((String) it.next()));
        }
        return new zc8(0L, 0L, x53.H0(arrayList), this.b);
    }

    @Override // defpackage.jl6
    public final void k() {
        tf2 tf2VarX = x();
        if (tf2VarX == null) {
            return;
        }
        j47.T(this.a, ((w9a) w()).b().plus(xq9.a), null, new xh2(this, tf2VarX, null), 2);
    }

    @Override // defpackage.pnf
    public final void p() {
        tf2 tf2VarX = x();
        if (tf2VarX != null) {
            hm9.n(tf2VarX.a, "clear");
            ev evVar = tf2VarX.s0;
            evVar.c();
            evVar.a();
            synchronized (evVar) {
                evVar.c = null;
            }
            ev evVar2 = tf2VarX.u0;
            evVar2.c();
            evVar2.a();
            synchronized (evVar2) {
                evVar2.c = null;
            }
            ev evVar3 = tf2VarX.t0;
            evVar3.c();
            evVar3.a();
            synchronized (evVar3) {
                evVar3.c = null;
            }
            tf2VarX.X.d();
        }
        this.Z.f(this);
    }

    public final void u(xm8 xm8Var, boolean z) {
        vxd vxdVarS = j47.S(this.a, ((w9a) w()).b(), vx3.b, new oh2(this, xm8Var, z, null));
        this.F0.o1(this, R0[2], vxdVarS);
    }

    public final e52 v() {
        return (e52) ((jz2) this.o).m(this.b).a.getValue();
    }

    public final kke w() {
        return (kke) this.C0.getValue();
    }

    public final tf2 x() {
        return (tf2) this.L0.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y(long r5, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ph2
            if (r0 == 0) goto L13
            r0 = r7
            ph2 r0 = (defpackage.ph2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ph2 r0 = new ph2
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L27
            goto L49
        L27:
            r4 = move-exception
            goto L4c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r7)
            je7 r4 = r4.s0     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L27
            tp7 r4 = (defpackage.tp7) r4     // Catch: java.lang.Throwable -> L27
            q1a r4 = defpackage.tp7.a(r4, r5)     // Catch: java.lang.Throwable -> L27
            r0.Y = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r7 = defpackage.s36.f(r4, r0)     // Catch: java.lang.Throwable -> L27
            if (r7 != r1) goto L49
            return r1
        L49:
            es8 r7 = (defpackage.es8) r7     // Catch: java.lang.Throwable -> L27
            goto L51
        L4c:
            njc r7 = new njc
            r7.<init>(r4)
        L51:
            boolean r4 = r7 instanceof defpackage.njc
            if (r4 == 0) goto L56
            r7 = 0
        L56:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.y(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(long r15, java.lang.String r17, long r18, boolean r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r14
            r1 = r21
            boolean r2 = r1 instanceof defpackage.qh2
            if (r2 == 0) goto L16
            r2 = r1
            qh2 r2 = (defpackage.qh2) r2
            int r3 = r2.s0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.s0 = r3
            goto L1b
        L16:
            qh2 r2 = new qh2
            r2.<init>(r14, r1)
        L1b:
            java.lang.Object r1 = r2.Y
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.s0
            r5 = 1
            if (r4 == 0) goto L39
            if (r4 != r5) goto L31
            boolean r0 = r2.X
            java.lang.String r2 = r2.o
            defpackage.od2.a0(r1)
            r13 = r2
            r2 = r1
            r1 = r13
            goto L6d
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            defpackage.od2.a0(r1)
            z7d r1 = r0.y0
            r1.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f92newmediaviewerenabled
            r6 = 0
            boolean r1 = r1.n(r4, r6)
            if (r1 == 0) goto L58
            hg2 r0 = new hg2
            r6 = r0
            r7 = r15
            r9 = r18
            r11 = r17
            r12 = r20
            r6.<init>(r7, r9, r11, r12)
            goto L8f
        L58:
            r1 = r17
            r2.o = r1
            r4 = r20
            r2.X = r4
            r2.s0 = r5
            r5 = r18
            java.lang.Object r0 = r14.y(r5, r2)
            if (r0 != r3) goto L6b
            return r3
        L6b:
            r2 = r0
            r0 = r4
        L6d:
            es8 r2 = (defpackage.es8) r2
            if (r2 != 0) goto L73
            r0 = 0
            return r0
        L73:
            xcb r3 = defpackage.xcb.a
            v4 r3 = r3.getAccessor()
            java.lang.Class<df7> r4 = defpackage.df7.class
            java.lang.Object r3 = r3.c(r4)
            df7 r3 = (defpackage.df7) r3
            r3.getClass()
            xw8 r3 = new xw8
            r3.<init>(r2)
            ig2 r2 = new ig2
            r2.<init>(r3, r1, r0)
            r0 = r2
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gi2.z(long, java.lang.String, long, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
