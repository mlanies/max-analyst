package defpackage;

import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Process;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import one.me.calls.ui.view.mode.grid.CallGridLayoutManager;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.profile.ProfileScreen;

/* loaded from: classes.dex */
public final class gaa implements s7c, za7, e71, p21, ar8, oy1, y2a, co7, wm4, a76, hmf, n9f, dke {
    public Object a;

    public /* synthetic */ gaa(Object obj) {
        this.a = obj;
    }

    public foc A(bc7 bc7Var) {
        foc focVar = (foc) this.a;
        if (focVar != null) {
            return focVar;
        }
        throw new IllegalStateException(("Property " + bc7Var.getName() + " should be initialized before get.").toString());
    }

    public boolean B() {
        rg8 rg8Var = (rg8) this.a;
        return rg8Var != null && rg8Var.d;
    }

    public boolean C(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.containsKey(str)) {
            return ((m9f) linkedHashMap.get(str)).e;
        }
        return false;
    }

    public void D() {
        ((z06) this.a).w0.S();
    }

    public void E(Rect rect, View view, RecyclerView recyclerView) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        int iR = RecyclerView.R(view);
        SparseArray sparseArray = (SparseArray) this.a;
        if (iR == -1) {
            sparseArray.remove(iR);
            return;
        }
        int[] iArr = (int[]) sparseArray.get(iR);
        if (iArr == null) {
            iArr = new int[8];
            sparseArray.put(iR, iArr);
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        int i = (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0) + ((pdc) view.getLayoutParams()).b.left;
        iArr[1] = i;
        iArr[0] = i + rect.left;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        int i2 = (marginLayoutParams2 != null ? marginLayoutParams2.topMargin : 0) + ((pdc) view.getLayoutParams()).b.top;
        iArr[3] = i2;
        iArr[2] = i2 + rect.top;
        ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
        int i3 = (marginLayoutParams3 != null ? marginLayoutParams3.rightMargin : 0) + ((pdc) view.getLayoutParams()).b.right;
        iArr[5] = i3;
        iArr[4] = i3 + rect.right;
        ViewGroup.LayoutParams layoutParams4 = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
        int i4 = (marginLayoutParams4 != null ? marginLayoutParams4.bottomMargin : 0) + ((pdc) view.getLayoutParams()).b.bottom;
        iArr[7] = i4;
        iArr[6] = i4 + rect.bottom;
    }

    @Override // defpackage.x85
    public vh9 F() {
        return (mi9) this.a;
    }

    public void G(String str, lk7 lk7Var) {
        ProfileScreen profileScreen = (ProfileScreen) ((qlb) this.a).X;
        profileScreen.r0().x(1, str, lk7Var);
        int iOrdinal = lk7Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 4) {
                cnb cnbVarR0 = profileScreen.r0();
                String strA = ((fl7) cnbVarR0.x0.getValue()).a(str);
                if (strA == null) {
                    return;
                }
                cnbVarR0.v(strA);
                return;
            }
            if (iOrdinal != 6) {
                return;
            }
        }
        profileScreen.r0().v(str);
    }

    public void H(String str, lk7 lk7Var, MotionEvent motionEvent) {
        List listM;
        ProfileScreen profileScreen = (ProfileScreen) ((qlb) this.a).X;
        ejb ejbVar = (ejb) profileScreen.r0().H0.getValue();
        ejbVar.getClass();
        int iOrdinal = lk7Var.ordinal();
        if (iOrdinal == 0 || iOrdinal == 4 || iOrdinal == 6) {
            int iS = au1.s(ju0.B(str) ? 3 : ju0.C(str) ? 2 : 1);
            c8d c8dVar = ejbVar.a;
            if (iS != 0) {
                if (iS == 1) {
                    wva wvaVar = (wva) c8dVar.c;
                    listM = y53.M((tt3) wvaVar.b, (tt3) wvaVar.c);
                } else {
                    if (iS != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    djb djbVar = (djb) c8dVar.b;
                    listM = y53.M((tt3) djbVar.b, (tt3) djbVar.c);
                }
            } else if (lk7Var == lk7.X) {
                b9b b9bVar = (b9b) ((re6) c8dVar.o).b;
                listM = y53.M((tt3) b9bVar.b, (tt3) b9bVar.c);
            } else {
                l7b l7bVar = (l7b) c8dVar.a;
                listM = y53.M((tt3) l7bVar.b, (tt3) l7bVar.c);
            }
        } else {
            listM = null;
        }
        if (listM == null || listM.isEmpty()) {
            return;
        }
        profileScreen.r0().x(2, str, lk7Var);
        dy7.c(1).d0().L(motionEvent.getRawX(), motionEvent.getRawY()).S(dy7.g(new kpa("profile:contextmenu:link", str), new kpa("profile:contextmenu:link_type", Integer.valueOf(lk7Var.ordinal())))).U(new iqe(str)).I(listM).build().q(profileScreen);
        View view = profileScreen.getView();
        if (view != null) {
            pag.F(view, ni6.LONG_PRESS);
        }
    }

    public void I(String str, fad fadVar, o9f o9fVar, vb0 vb0Var, List list) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        if (linkedHashMap.containsKey(str)) {
            m9f m9fVar = new m9f(fadVar, o9fVar, vb0Var, list);
            m9f m9fVar2 = (m9f) linkedHashMap.get(str);
            m9fVar.e = m9fVar2.e;
            m9fVar.f = m9fVar2.f;
            linkedHashMap.put(str, m9fVar);
        }
    }

    @Override // defpackage.n9f
    public o9f J() {
        return new d9e(wma.a((mi9) this.a));
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
        if (!Objects.equals(coordinatorLayout.A0, x6gVar)) {
            coordinatorLayout.A0 = x6gVar;
            boolean z = x6gVar.d() > 0;
            coordinatorLayout.B0 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            v6g v6gVar = x6gVar.a;
            if (!v6gVar.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = zmf.a;
                    if (childAt.getFitsSystemWindows() && ((rw3) childAt.getLayoutParams()).a != null && v6gVar.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return x6gVar;
    }

    @Override // defpackage.q7c
    public /* bridge */ /* synthetic */ Object T0(Object obj, bc7 bc7Var) {
        return A(bc7Var);
    }

    @Override // defpackage.a76
    public /* bridge */ /* synthetic */ void a(Object obj) {
    }

    @Override // defpackage.wm4
    public void b() {
        u5e u5eVar = (u5e) ((zm4) this.a).e;
        u5eVar.getClass();
        bc7[] bc7VarArr = VideoViewerWidget.u0;
        dmf dmfVarO0 = ((VideoViewerWidget) u5eVar.a).o0();
        if (dmfVarO0 != null) {
            ((ChatMediaViewerScreen) dmfVarO0).G0(true);
        }
    }

    @Override // defpackage.e71
    public int c() {
        return ((CallGridLayoutManager) this.a).M.getResources().getDisplayMetrics().heightPixels;
    }

    @Override // defpackage.a76
    public void d(Throwable th) throws Exception {
        ((ov6) this.a).close();
    }

    @Override // defpackage.dke
    public void e(gle gleVar) {
        lme lmeVar = (lme) this.a;
        lmeVar.b().a(new flc(lmeVar, 28, gleVar));
    }

    @Override // defpackage.wm4
    public void f(int i) {
        zm4.a((zm4) this.a, false, i * 10);
    }

    @Override // defpackage.dke
    public void g(pke pkeVar) {
        lme lmeVar = (lme) this.a;
        lmeVar.b().a(new nle(lmeVar, pkeVar, 2));
    }

    @Override // defpackage.ar8
    public void h(wq8 wq8Var, br8 br8Var) {
        ((zz1) this.a).Z.removeCallbacksAndMessages(wq8Var);
    }

    @Override // defpackage.dke
    public long i() {
        return 0L;
    }

    public ue j(a8g a8gVar, Rect rect) {
        AnimatedFactoryV2Impl animatedFactoryV2Impl = (AnimatedFactoryV2Impl) this.a;
        if (animatedFactoryV2Impl.g == null) {
            animatedFactoryV2Impl.g = new oz7();
        }
        return new ue(animatedFactoryV2Impl.g, a8gVar, rect, animatedFactoryV2Impl.d);
    }

    @Override // defpackage.ar8
    public void k(wq8 wq8Var, br8 br8Var) {
        zz1 zz1Var = (zz1) this.a;
        zz1Var.Z.removeCallbacksAndMessages(null);
        ArrayList arrayList = zz1Var.t0;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (wq8Var == ((yz1) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        zz1Var.Z.postAtTime(new r8g(this, i2 < arrayList.size() ? (yz1) arrayList.get(i2) : null, br8Var, wq8Var, 1), wq8Var, SystemClock.uptimeMillis() + 200);
    }

    @Override // defpackage.hmf
    public int l(View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        ((a) this.a).getClass();
        return a.F(view) - ((ViewGroup.MarginLayoutParams) pdcVar).topMargin;
    }

    public ead m() {
        ead eadVar = new ead();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            m9f m9fVar = (m9f) entry.getValue();
            if (m9fVar.e) {
                eadVar.a(m9fVar.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        return eadVar;
    }

    public Collection n() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (((m9f) entry.getValue()).e) {
                arrayList.add(((m9f) entry.getValue()).a);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // defpackage.co7
    public void o(fo7 fo7Var, long j, long j2, boolean z) {
        ((x14) this.a).r((aqa) fo7Var, j, j2);
    }

    @Override // defpackage.s7c
    public void o1(Object obj, bc7 bc7Var, Object obj2) {
        hm9.n(gaa.class.getName(), "set new router");
        this.a = (foc) obj2;
    }

    @Override // defpackage.hmf
    public int p() {
        return ((a) this.a).L();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    @Override // defpackage.za7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object parse(defpackage.db7 r8) {
        /*
            r7 = this;
            java.lang.Object r7 = r7.a
            il[] r7 = (defpackage.il[]) r7
            int r0 = r7.length
            va8[] r0 = new defpackage.va8[r0]
            r8.u()
            int r1 = r7.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L74
            r3 = r7[r2]
            r8.s()
            java.lang.String r4 = r8.T()
            int r5 = r4.hashCode()
            r6 = 3548(0xddc, float:4.972E-42)
            if (r5 == r6) goto L45
            r6 = 3135262(0x2fd71e, float:4.393438E-39)
            if (r5 == r6) goto L25
            goto L63
        L25:
            java.lang.String r5 = "fail"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L2e
            goto L63
        L2e:
            yk r4 = r3.b
            za7 r4 = r4.getFailParser()
            java.lang.Object r4 = r4.parse(r8)
            ru.ok.android.api.core.ApiInvocationException r4 = (ru.ok.android.api.core.ApiInvocationException) r4
            va8 r4 = new va8
            jl r5 = new jl
            r5.<init>()
            r4.<init>(r3, r5)
            goto L6c
        L45:
            java.lang.String r5 = "ok"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L63
            i03 r4 = new i03
            r4.<init>(r8)
            yk r5 = r3.b
            za7 r5 = r5.getOkParser()
            java.lang.Object r4 = r5.parse(r4)
            va8 r5 = new va8
            r5.<init>(r3, r4)
            r4 = r5
            goto L6c
        L63:
            r8.z()
            va8 r4 = new va8
            r5 = 0
            r4.<init>(r3, r5)
        L6c:
            r8.q()
            r0[r2] = r4
            int r2 = r2 + 1
            goto Lc
        L74:
            r8.t()
            cl0 r7 = new cl0
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gaa.parse(db7):java.lang.Object");
    }

    @Override // defpackage.oy1
    public void q(Typeface typeface) {
        s53 s53Var = (s53) this.a;
        if (s53Var.o(typeface)) {
            s53Var.i(false);
        }
    }

    @Override // defpackage.hmf
    public int r() {
        a aVar = (a) this.a;
        return aVar.o - aVar.I();
    }

    public Collection s() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) this.a).entrySet()) {
            if (((m9f) entry.getValue()).e) {
                arrayList.add(((m9f) entry.getValue()).b);
            }
        }
        return Collections.unmodifiableCollection(arrayList);
    }

    @Override // defpackage.hmf
    public View t(int i) {
        return ((a) this.a).v(i);
    }

    public File u() {
        kk5 kk5Var = (kk5) ((v4) this.a).c(kk5.class);
        kk5Var.getClass();
        return kk5.g(kk5Var.b(), "stickerCache");
    }

    public void v(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.a).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getBottom() + iArr[6]);
    }

    @Override // defpackage.hmf
    public int w(View view) {
        pdc pdcVar = (pdc) view.getLayoutParams();
        ((a) this.a).getClass();
        return a.z(view) + ((ViewGroup.MarginLayoutParams) pdcVar).bottomMargin;
    }

    public void x(Rect rect, View view, int i) {
        int[] iArr = (int[]) ((SparseArray) this.a).get(i, null);
        if (iArr == null) {
            return;
        }
        rect.set(view.getLeft() - iArr[0], view.getTop() - iArr[2], view.getRight() + iArr[4], view.getTop() - iArr[3]);
    }

    @Override // defpackage.co7
    public void y(fo7 fo7Var, long j, long j2) {
        aqa aqaVar = (aqa) fo7Var;
        x14 x14Var = (x14) this.a;
        x14Var.getClass();
        long j3 = aqaVar.a;
        z24 z24Var = aqaVar.b;
        t1e t1eVar = aqaVar.o;
        xn7 xn7Var = new xn7(j3, z24Var, t1eVar.c, t1eVar.o, j, j2, t1eVar.b);
        x14Var.n.getClass();
        x14Var.q.f(xn7Var, aqaVar.c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        x14Var.L = ((Long) aqaVar.Y).longValue() - j;
        x14Var.s(true);
    }

    @Override // defpackage.co7
    public b11 z(fo7 fo7Var, long j, long j2, IOException iOException, int i) {
        aqa aqaVar = (aqa) fo7Var;
        x14 x14Var = (x14) this.a;
        x14Var.getClass();
        long j3 = aqaVar.a;
        t1e t1eVar = aqaVar.o;
        x14Var.q.i(new xn7(j3, aqaVar.b, t1eVar.c, t1eVar.o, j, j2, t1eVar.b), aqaVar.c, iOException, true);
        x14Var.n.getClass();
        fm9.c("Failed to resolve time offset.", iOException);
        x14Var.s(true);
        return jo7.X;
    }

    public gaa(final String str, int i) {
        switch (i) {
            case 29:
                this.a = new LinkedHashMap();
                break;
            default:
                final AtomicInteger atomicInteger = new AtomicInteger(0);
                this.a = Executors.newCachedThreadPool(new ThreadFactory() { // from class: rye
                    @Override // java.util.concurrent.ThreadFactory
                    public final Thread newThread(Runnable runnable) {
                        return new Thread(runnable, "tracer-io-" + str + '-' + atomicInteger.getAndIncrement());
                    }
                });
                break;
        }
    }

    public gaa(int i) {
        switch (i) {
            case 18:
                Process.getStartElapsedRealtime();
                this.a = new hs();
                break;
            default:
                this.a = new SparseArray();
                break;
        }
    }

    public gaa(mi9 mi9Var) {
        Object objH;
        this.a = mi9Var;
        Object objH2 = null;
        try {
            objH = mi9Var.h(cne.e0);
        } catch (IllegalArgumentException unused) {
            objH = null;
        }
        Class cls = (Class) objH;
        if (cls != null && !cls.equals(c9e.class)) {
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
        ((mi9) this.a).j(o9f.o0, q9f.X);
        aa0 aa0Var = cne.e0;
        mi9 mi9Var2 = (mi9) this.a;
        mi9Var2.j(aa0Var, c9e.class);
        try {
            objH2 = mi9Var2.h(cne.d0);
        } catch (IllegalArgumentException unused2) {
        }
        if (objH2 == null) {
            mi9Var2.j(cne.d0, c9e.class.getCanonicalName() + "-" + UUID.randomUUID());
        }
    }
}
