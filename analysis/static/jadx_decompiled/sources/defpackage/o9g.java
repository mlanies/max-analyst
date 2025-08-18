package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.media.MediaCodec;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsController;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.work.WorkRequest;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import one.me.calllist.ui.page.CallHistoryPageScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class o9g implements y2a, ah9, ku6, ln1, qj3, m18, fj9, q1b, Provider, t5e, a76, o1f {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ o9g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public static Object p(String str) {
        ClassLoader classLoader = o9g.class.getClassLoader();
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader.loadClass(str).getField("INSTANCE").get(null);
    }

    public static void u(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            au1.r(it.next());
            throw null;
        }
    }

    public static o9g v() {
        boolean z;
        synchronized (em9.class) {
            z = em9.a;
        }
        if (!z && em9.class.getClassLoader() != ClassLoader.getSystemClassLoader()) {
            w();
            throw null;
        }
        synchronized (o9g.class) {
            y("JNI");
            throw null;
        }
    }

    public static o9g w() {
        if (!paf.b) {
            synchronized (o9g.class) {
                y("JavaSafe");
                throw null;
            }
        }
        try {
            synchronized (o9g.class) {
                y("JavaUnsafe");
                throw null;
            }
        } finally {
        }
    }

    public static o9g x(xv1 xv1Var) {
        DynamicRangeProfiles dynamicRangeProfilesH;
        int i = Build.VERSION.SDK_INT;
        o9g o9gVar = null;
        if (i >= 33 && (dynamicRangeProfilesH = e4.h(xv1Var.a(CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES))) != null) {
            c54.p("DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.", i >= 33);
            o9gVar = new o9g(14, new ju4(dynamicRangeProfilesH));
        }
        return o9gVar == null ? ku4.a : o9gVar;
    }

    public static void y(String str) {
        try {
            new o9g(str);
            throw null;
        } catch (Exception e) {
            throw new AssertionError(e);
        }
    }

    public void A(nnf nnfVar) {
        bc7[] bc7VarArr = CallTopPanelWidget.o;
        pnf.o(((CallTopPanelWidget) this.b).n0().b.M0, new bj1(nnfVar));
    }

    public void B(long j, boolean z) {
        final int i = 0;
        buc bucVar = CallHistoryPageScreen.u0;
        m81 m81VarP0 = ((CallHistoryPageScreen) this.b).p0();
        final al6 al6VarQ = m81VarP0.q(j);
        if (al6VarQ != null) {
            boolean z2 = al6VarQ instanceof yk6;
            zs1 zs1Var = zs1.HISTORY;
            je7 je7Var = m81VarP0.t0;
            rg1 rg1Var = m81VarP0.c;
            if (z2) {
                rg1Var.l(((yk6) al6VarQ).a, z, new k81(al6VarQ, z, i));
                ((bt1) je7Var.getValue()).e(zs1Var, z);
                return;
            }
            if (al6VarQ instanceof wk6) {
                wk6 wk6Var = (wk6) al6VarQ;
                if (wk6Var.c) {
                    rg1Var.j(wk6Var.e, true, z, false, new k56() { // from class: l81
                        @Override // defpackage.k56
                        public final Object invoke() {
                            switch (i) {
                                case 0:
                                    z71.c.P1().b(":call-join-link?link=".concat(((wk6) al6VarQ).e), null);
                                    break;
                                default:
                                    z71.c.P1().b(":call-join-link?link=".concat(((xk6) al6VarQ).a), null);
                                    break;
                            }
                            return e5f.a;
                        }
                    });
                    bt1 bt1Var = (bt1) je7Var.getValue();
                    String strValueOf = String.valueOf(j);
                    bt1Var.getClass();
                    bt1.c(bt1Var, "GROUP_CALL_JOIN", strValueOf, null, null, null, null, true, 52);
                    return;
                }
            }
            if (al6VarQ instanceof xk6) {
                final int i2 = 1;
                rg1Var.j(((xk6) al6VarQ).a, true, z, false, new k56() { // from class: l81
                    @Override // defpackage.k56
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                z71.c.P1().b(":call-join-link?link=".concat(((wk6) al6VarQ).e), null);
                                break;
                            default:
                                z71.c.P1().b(":call-join-link?link=".concat(((xk6) al6VarQ).a), null);
                                break;
                        }
                        return e5f.a;
                    }
                });
                ((bt1) je7Var.getValue()).e(zs1Var, z);
            }
        }
    }

    public bg1 C(int i) {
        fp1 fp1Var = (fp1) ((ConcurrentHashMap) this.b).get(Integer.valueOf(i));
        if (fp1Var != null) {
            return fp1Var.b;
        }
        return null;
    }

    public int D(qy5 qy5Var) {
        String str = qy5Var.n;
        return (str == null || !ia9.i(str)) ? vj0.b(0, 0, 0, 0) : oaf.K(qy5Var.n) ? vj0.b(4, 0, 0, 0) : vj0.b(1, 0, 0, 0);
    }

    public void E() {
        fu6 fu6Var = (fu6) this.b;
        synchronized (fu6Var.q) {
            try {
                Integer num = (Integer) fu6Var.q.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != fu6Var.H()) {
                    fu6Var.K();
                }
            } finally {
            }
        }
    }

    @Override // defpackage.y2a
    public x6g P(View view, x6g x6gVar) {
        boolean z;
        boolean z2;
        x6g x6gVarB = x6gVar;
        int iD = x6gVar.d();
        dn dnVar = (dn) this.b;
        dnVar.getClass();
        int iD2 = x6gVar.d();
        ActionBarContextView actionBarContextView = dnVar.G0;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dnVar.G0.getLayoutParams();
            if (dnVar.G0.isShown()) {
                if (dnVar.n1 == null) {
                    dnVar.n1 = new Rect();
                    dnVar.o1 = new Rect();
                }
                Rect rect = dnVar.n1;
                Rect rect2 = dnVar.o1;
                rect.set(x6gVar.b(), x6gVar.d(), x6gVar.c(), x6gVar.a());
                opf.a(dnVar.L0, rect, rect2);
                int i = rect.top;
                int i2 = rect.left;
                int i3 = rect.right;
                ViewGroup viewGroup = dnVar.L0;
                WeakHashMap weakHashMap = zmf.a;
                x6g x6gVarA = pmf.a(viewGroup);
                int iB = x6gVarA == null ? 0 : x6gVarA.b();
                int iC = x6gVarA == null ? 0 : x6gVarA.c();
                if (marginLayoutParams.topMargin == i && marginLayoutParams.leftMargin == i2 && marginLayoutParams.rightMargin == i3) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i;
                    marginLayoutParams.leftMargin = i2;
                    marginLayoutParams.rightMargin = i3;
                    z2 = true;
                }
                Context context = dnVar.v0;
                if (i <= 0 || dnVar.N0 != null) {
                    View view2 = dnVar.N0;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i4 = marginLayoutParams2.height;
                        int i5 = marginLayoutParams.topMargin;
                        if (i4 != i5 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i5;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            dnVar.N0.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    dnVar.N0 = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    dnVar.L0.addView(dnVar.N0, -1, layoutParams);
                }
                View view4 = dnVar.N0;
                z = view4 != null;
                if (z && view4.getVisibility() != 0) {
                    View view5 = dnVar.N0;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? lt3.a(context, itb.abc_decor_view_status_guard_light) : lt3.a(context, itb.abc_decor_view_status_guard));
                }
                if (!dnVar.S0 && z) {
                    iD2 = 0;
                }
                boolean z3 = z;
                z = z2;
                z = z3;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z = false;
            }
            if (z) {
                dnVar.G0.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = dnVar.N0;
        if (view6 != null) {
            view6.setVisibility(z ? 0 : 8);
        }
        if (iD != iD2) {
            int iB2 = x6gVar.b();
            int iC2 = x6gVar.c();
            int iA = x6gVar.a();
            o6g n6gVar = Build.VERSION.SDK_INT >= 30 ? new n6g(x6gVarB) : new m6g(x6gVarB);
            n6gVar.f(v27.b(iB2, iD2, iC2, iA));
            x6gVarB = n6gVar.b();
        }
        return zmf.f(view, x6gVarB);
    }

    @Override // defpackage.a76
    public void a(Object obj) {
        ((Runnable) this.b).run();
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 8:
                Throwable th = (Throwable) obj;
                s12 s12Var = (s12) this.b;
                hm9.p(s12Var.Z, "onUploadFailed: failed", th);
                eoe eoeVarS = s12Var.s();
                long j = s12Var.b;
                eoeVarS.d(j);
                s12Var.z();
                s12Var.y();
                s12Var.t().c(new oi0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new pke("internal-error", th.toString(), null)));
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Throwable th2 = (Throwable) obj;
                m56 m56Var = ((r44) this.b).c;
                if (m56Var != null) {
                    m56Var.invoke(th2);
                    break;
                }
                break;
            default:
                hm9.p(((jy8) this.b).getClass().getName(), "fail restore uploads", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.q1b
    public void b() {
        ((cb5) this.b).c(50L);
    }

    @Override // defpackage.t5e
    public void c(w3e w3eVar) {
        ad7 ad7Var = ((m4e) this.b).Y;
        ad7Var.getClass();
        bc7[] bc7VarArr = KeyboardStickersWidget.t0;
        b8e b8eVarO0 = ad7Var.a.o0();
        vxd vxdVarS = j47.S(b8eVarO0.a, ((w9a) b8eVarO0.b).b(), vx3.b, new y7e(b8eVarO0, w3eVar, null));
        b8eVarO0.z0.o1(b8eVarO0, b8e.B0[1], vxdVarS);
    }

    @Override // defpackage.fj9
    public void close() {
        ((fj9) this.b).close();
    }

    @Override // defpackage.a76
    public void d(Throwable th) {
    }

    @Override // defpackage.fj9
    public void e(d99 d99Var) {
        ((fj9) this.b).e(d99Var);
    }

    @Override // defpackage.fj9
    public void f(g36 g36Var, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((fj9) this.b).f(g36Var, byteBuffer, bufferInfo);
    }

    @Override // defpackage.t5e
    public void g(z2e z2eVar) {
        ((m4e) this.b).Y.a(z2eVar);
    }

    @Override // javax.inject.Provider
    public Object get() {
        d9f d9fVar = (d9f) ((Provider) this.b).get();
        HashMap map = new HashMap();
        z8b z8bVar = z8b.a;
        Set setEmptySet = Collections.emptySet();
        if (setEmptySet == null) {
            throw new NullPointerException("Null flags");
        }
        Long l = 86400000L;
        map.put(z8bVar, new qb0(Long.valueOf(WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS).longValue(), l.longValue(), setEmptySet));
        z8b z8bVar2 = z8b.c;
        Set setEmptySet2 = Collections.emptySet();
        if (setEmptySet2 == null) {
            throw new NullPointerException("Null flags");
        }
        Long l2 = 1000L;
        Long l3 = 86400000L;
        map.put(z8bVar2, new qb0(l2.longValue(), l3.longValue(), setEmptySet2));
        z8b z8bVar3 = z8b.b;
        if (Collections.emptySet() == null) {
            throw new NullPointerException("Null flags");
        }
        Long l4 = 86400000L;
        Long l5 = 86400000L;
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(cuc.b)));
        if (setUnmodifiableSet == null) {
            throw new NullPointerException("Null flags");
        }
        map.put(z8bVar3, new qb0(l4.longValue(), l5.longValue(), setUnmodifiableSet));
        if (d9fVar == null) {
            throw new NullPointerException("missing required property: clock");
        }
        if (map.keySet().size() < z8b.values().length) {
            throw new IllegalStateException("Not all priorities have been configured");
        }
        new HashMap();
        return new pb0(d9fVar, map);
    }

    @Override // defpackage.ah9
    public void h() {
        t50.c((t50) this.b);
    }

    @Override // defpackage.fj9
    public g36 i(qy5 qy5Var) {
        return ((fj9) this.b).i(qy5Var);
    }

    @Override // defpackage.ah9
    public void j() {
        t50.c((t50) this.b);
    }

    @Override // defpackage.t5e
    public void k(z2e z2eVar) {
        cc8 cc8Var = (cc8) ((m4e) this.b).Y.a.b.getValue();
        cc8Var.getClass();
        zb8 zb8Var = new zb8(z2eVar.a);
        s35 s35Var = cc8Var.X;
        pnf.o(s35Var, zb8Var);
        pnf.o(s35Var, yb8.a);
    }

    @Override // defpackage.ah9
    public void l() {
        t50.c((t50) this.b);
    }

    @Override // defpackage.o1f
    public p1f m(Context context, i63 i63Var, xw0 xw0Var, pgf pgfVar, crd crdVar, List list, long j) {
        nk4 nk4Var = nk4.a;
        b8b b8bVar = null;
        for (int i = 0; i < list.size(); i++) {
            z18 z18Var = (z18) list.get(i);
            if (z18Var instanceof b8b) {
                b8bVar = (b8b) z18Var;
            }
        }
        return new n1f(context, (zff) this.b, i63Var, pgfVar, xw0Var, nk4Var, crdVar, true, b8bVar, j);
    }

    public void n(int i, boolean z) {
        rm5 rm5Var = (rm5) this.b;
        if (z) {
            rm5Var.a(i);
        } else {
            rm5Var.getClass();
        }
    }

    public e14 o() {
        Context context = (Context) this.b;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        e14 e14Var = new e14();
        e14Var.a = sm4.a(j1e.b);
        sy4 sy4Var = new sy4(18, context);
        e14Var.b = sy4Var;
        e14Var.c = sm4.a(new h7b(sy4Var, new k8g(sy4Var), false, 25));
        sy4 sy4Var2 = e14Var.b;
        e14Var.o = new nw4(sy4Var2);
        Provider providerA = sm4.a(new i45(sy4Var2, 0));
        e14Var.X = providerA;
        nw4 nw4Var = e14Var.o;
        c32 c32Var = z04.c;
        nd2 nd2Var = a14.g;
        qq9 qq9Var = mqd.b;
        jc6 jc6Var = new jc6();
        jc6Var.a = c32Var;
        jc6Var.b = nd2Var;
        jc6Var.c = qq9Var;
        jc6Var.o = nw4Var;
        jc6Var.X = providerA;
        Provider providerA2 = sm4.a(jc6Var);
        e14Var.Y = providerA2;
        o9g o9gVar = new o9g(24);
        sy4 sy4Var3 = e14Var.b;
        nd2 nd2Var2 = a14.g;
        c8d c8dVar = new c8d();
        c8dVar.a = sy4Var3;
        c8dVar.b = providerA2;
        c8dVar.c = o9gVar;
        c8dVar.o = nd2Var2;
        Provider provider = e14Var.a;
        Provider provider2 = e14Var.c;
        x3c x3cVar = new x3c(provider, provider2, c8dVar, providerA2, providerA2);
        c32 c32Var2 = z04.c;
        nd2 nd2Var3 = a14.g;
        qp4 qp4Var = new qp4();
        qp4Var.b = sy4Var3;
        qp4Var.c = provider2;
        qp4Var.a = providerA2;
        qp4Var.o = c8dVar;
        qp4Var.X = provider;
        qp4Var.Y = providerA2;
        qp4Var.Z = c32Var2;
        qp4Var.s0 = nd2Var3;
        qp4Var.t0 = providerA2;
        e14Var.Z = sm4.a(new bg4(x3cVar, qp4Var, new die(provider, providerA2, c8dVar, providerA2)));
        return e14Var;
    }

    @Override // defpackage.ah9
    public void q() {
        t50.c((t50) this.b);
    }

    @Override // defpackage.ah9
    public void r() {
        t50.c((t50) this.b);
    }

    @Override // defpackage.ah9
    public void s() {
        t50.c((t50) this.b);
    }

    @Override // defpackage.ah9
    public void t() {
        t50.c((t50) this.b);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return o9g.class.getSimpleName() + ":" + ((String) this.b);
            default:
                return super.toString();
        }
    }

    public void z() {
        m1f m1fVar = (m1f) this.b;
        m1fVar.D0 = true;
        if (!m1fVar.w0.isEmpty()) {
            m1fVar.b();
            return;
        }
        rf4 rf4Var = m1fVar.z0;
        rf4Var.getClass();
        rf4Var.f();
    }

    public /* synthetic */ o9g(int i, boolean z) {
        this.a = i;
    }

    public o9g(View view) {
        this.a = 25;
        if (Build.VERSION.SDK_INT >= 30) {
            rud rudVar = new rud(28, view);
            rudVar.c = view;
            this.b = rudVar;
            return;
        }
        this.b = new rxd(28, view);
    }

    public o9g(WindowInsetsController windowInsetsController) {
        this.a = 25;
        rud rudVar = new rud(28, null);
        rudVar.o = windowInsetsController;
        this.b = rudVar;
    }

    public o9g(int i) {
        this.a = i;
        switch (i) {
            case 19:
                this.b = new ConcurrentHashMap();
                break;
            case 23:
                this.b = new rm5(0);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                this.b = z04.c;
                break;
            case 28:
                this.b = new SparseArray();
                break;
            default:
                this.b = new un0(0);
                break;
        }
    }

    public o9g(String str) {
        this.a = 0;
        this.b = str;
        au1.r(p("net.jpountz.xxhash.XXHash32".concat(str)));
        au1.r(p("net.jpountz.xxhash.StreamingXXHash32" + str + "$Factory"));
        au1.r(p("net.jpountz.xxhash.XXHash64".concat(str)));
        au1.r(p("net.jpountz.xxhash.StreamingXXHash64" + str + "$Factory"));
        Random random = new Random();
        random.nextBytes(new byte[100]);
        random.nextInt();
        throw null;
    }
}
