package defpackage;

import android.view.ViewParent;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class pz7 implements fbb {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public static ViewPager2 e(RecyclerView recyclerView) {
        ViewParent parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return (ViewPager2) parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.fbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.ibb
            if (r0 == 0) goto L13
            r0 = r8
            ibb r0 = (defpackage.ibb) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            ibb r0 = new ibb
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            pz7 r7 = r0.X
            pz7 r0 = r0.o
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L2c
            goto L59
        L2c:
            r7 = move-exception
            goto L86
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.c     // Catch: java.lang.Throwable -> L83
            je7 r8 = (defpackage.je7) r8     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L83
            iy2 r8 = (defpackage.iy2) r8     // Catch: java.lang.Throwable -> L83
            long r5 = r7.a     // Catch: java.lang.Throwable -> L83
            jz2 r8 = (defpackage.jz2) r8     // Catch: java.lang.Throwable -> L83
            w7c r8 = r8.m(r5)     // Catch: java.lang.Throwable -> L83
            r0.o = r7     // Catch: java.lang.Throwable -> L83
            r0.X = r7     // Catch: java.lang.Throwable -> L83
            r0.s0 = r3     // Catch: java.lang.Throwable -> L83
            java.lang.Object r8 = defpackage.od2.A(r8, r0)     // Catch: java.lang.Throwable -> L83
            if (r8 != r1) goto L58
            return r1
        L58:
            r0 = r7
        L59:
            e52 r8 = (defpackage.e52) r8     // Catch: java.lang.Throwable -> L2c
            if (r8 != 0) goto L5f
            r1 = r4
            goto L8b
        L5f:
            dbb r1 = new dbb     // Catch: java.lang.Throwable -> L2c
            java.lang.String r2 = r8.q()     // Catch: java.lang.Throwable -> L2c
            iqe r3 = new iqe     // Catch: java.lang.Throwable -> L2c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L2c
            r7.f = r1     // Catch: java.lang.Throwable -> L2c
            c6 r7 = new c6     // Catch: java.lang.Throwable -> L2c
            r1 = 1
            r7.<init>(r8, r1)     // Catch: java.lang.Throwable -> L2c
            kl7 r7 = defpackage.nu0.l(r7)     // Catch: java.lang.Throwable -> L2c
            uab r1 = new uab     // Catch: java.lang.Throwable -> L2c
            long r2 = r8.f()     // Catch: java.lang.Throwable -> L2c
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L2c
            goto L8b
        L83:
            r8 = move-exception
            r0 = r7
            r7 = r8
        L86:
            njc r1 = new njc
            r1.<init>(r7)
        L8b:
            java.lang.Object r7 = r0.d
            q0e r7 = (defpackage.q0e) r7
            boolean r8 = r1 instanceof defpackage.njc
            if (r8 == 0) goto L94
            r1 = r4
        L94:
            if (r1 == 0) goto L9b
            java.util.List r8 = java.util.Collections.singletonList(r1)
            goto L9d
        L9b:
            nz4 r8 = defpackage.nz4.a
        L9d:
            r7.m(r4, r8)
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz7.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v2, types: [m56] */
    @Override // defpackage.fbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.xab r5, defpackage.uab r6, java.lang.String r7, boolean r8, defpackage.om8 r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r6 = r10 instanceof defpackage.hbb
            if (r6 == 0) goto L13
            r6 = r10
            hbb r6 = (defpackage.hbb) r6
            int r8 = r6.Z
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r8 & r0
            if (r1 == 0) goto L13
            int r8 = r8 - r0
            r6.Z = r8
            goto L18
        L13:
            hbb r6 = new hbb
            r6.<init>(r4, r10)
        L18:
            java.lang.Object r8 = r6.X
            tx3 r10 = defpackage.tx3.a
            int r0 = r6.Z
            e5f r1 = defpackage.e5f.a
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L3a
            if (r0 == r3) goto L36
            if (r0 != r2) goto L2e
            m56 r9 = r6.o
            defpackage.od2.a0(r8)
            goto L56
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            defpackage.od2.a0(r8)
            goto L78
        L3a:
            defpackage.od2.a0(r8)
            int r5 = r5.ordinal()
            r8 = 0
            java.lang.Object r4 = r4.b
            qrc r4 = (defpackage.qrc) r4
            if (r5 == 0) goto L6f
            if (r5 == r3) goto L4b
            goto L62
        L4b:
            r6.o = r9
            r6.Z = r2
            java.lang.Object r8 = defpackage.qrc.c(r4, r7, r8, r6)
            if (r8 != r10) goto L56
            return r10
        L56:
            if (r8 == 0) goto L63
            android.net.Uri r8 = (android.net.Uri) r8
            abb r4 = new abb
            r4.<init>(r8)
            r9.invoke(r4)
        L62:
            return r1
        L63:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Required value was null."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L6f:
            r6.Z = r3
            java.lang.Object r4 = defpackage.qrc.c(r4, r7, r8, r6)
            if (r4 != r10) goto L78
            return r10
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz7.b(xab, uab, java.lang.String, boolean, om8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.fbb
    public List c(boolean z) {
        return y53.M(xab.o, xab.X);
    }

    @Override // defpackage.fbb
    public w7c d() {
        return (w7c) this.e;
    }

    public void f(boolean z) {
        int currentItem;
        a aVar;
        vd8 vd8Var = (vd8) this.f;
        if (!vd8Var.X.Q() && ((ViewPager2) this.e).getScrollState() == 0) {
            wv7 wv7Var = vd8Var.Y;
            if (wv7Var.h() == 0) {
                return;
            }
            List list = vd8Var.x0;
            if (list.size() != 0 && (currentItem = ((ViewPager2) this.e).getCurrentItem()) < list.size()) {
                long j = currentItem;
                if ((j != this.a || z) && (aVar = (a) wv7Var.c(j)) != null && aVar.o0()) {
                    this.a = j;
                    c cVar = vd8Var.X;
                    cVar.getClass();
                    he0 he0Var = new he0(cVar);
                    ArrayList arrayList = new ArrayList();
                    a aVar2 = null;
                    for (int i = 0; i < wv7Var.h(); i++) {
                        long jE = wv7Var.e(i);
                        a aVar3 = (a) wv7Var.i(i);
                        if (aVar3.o0()) {
                            if (jE != this.a) {
                                he0Var.i(aVar3, fg7.o);
                                o9g o9gVar = vd8Var.u0;
                                o9gVar.getClass();
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = ((CopyOnWriteArrayList) o9gVar.b).iterator();
                                if (it.hasNext()) {
                                    au1.r(it.next());
                                    throw null;
                                }
                                arrayList.add(arrayList2);
                            } else {
                                aVar2 = aVar3;
                            }
                            aVar3.Z0(jE == this.a);
                        }
                    }
                    if (aVar2 != null) {
                        he0Var.i(aVar2, fg7.X);
                        o9g o9gVar2 = vd8Var.u0;
                        o9gVar2.getClass();
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it2 = ((CopyOnWriteArrayList) o9gVar2.b).iterator();
                        if (it2.hasNext()) {
                            au1.r(it2.next());
                            throw null;
                        }
                        arrayList.add(arrayList3);
                    }
                    if (he0Var.a.isEmpty()) {
                        return;
                    }
                    he0Var.e();
                    Collections.reverse(arrayList);
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        List list2 = (List) it3.next();
                        vd8Var.u0.getClass();
                        o9g.u(list2);
                    }
                }
            }
        }
    }

    @Override // defpackage.fbb
    public ebb getTitle() {
        return (ebb) this.f;
    }
}
