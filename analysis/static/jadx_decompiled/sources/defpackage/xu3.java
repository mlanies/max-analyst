package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.AssetManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.fresco.ui.common.ImagePerfDataListener;
import com.facebook.fresco.ui.common.c;
import com.facebook.fresco.ui.common.d;
import com.google.android.material.tabs.TabLayout;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class xu3 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public xu3(ar0 ar0Var, ja7 ja7Var, g9g g9gVar, xu3[] xu3VarArr) {
        this.b = ar0Var;
        this.c = ja7Var;
        this.d = g9gVar;
        this.e = xu3VarArr;
        this.f = ja7Var.a;
        int iOrdinal = g9gVar.ordinal();
        if (xu3VarArr != null) {
            xu3 xu3Var = xu3VarArr[iOrdinal];
            if (xu3Var == null && xu3Var == this) {
                return;
            }
            xu3VarArr[iOrdinal] = this;
        }
    }

    public void a() {
        if (this.a) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        ViewPager2 viewPager2 = (ViewPager2) this.c;
        hdc adapter = viewPager2.getAdapter();
        this.e = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        this.a = true;
        TabLayout tabLayout = (TabLayout) this.b;
        mg6 mg6Var = new mg6(tabLayout, 2);
        this.f = mg6Var;
        viewPager2.b(mg6Var);
        cx5 cx5Var = new cx5(3, viewPager2);
        this.g = cx5Var;
        tabLayout.a(cx5Var);
        pz4 pz4Var = new pz4(8, this);
        this.h = pz4Var;
        ((hdc) this.e).z(pz4Var);
        s();
        tabLayout.q(viewPager2.getCurrentItem(), 0.0f, true, true, true);
    }

    public xu3 b(r6d r6dVar) {
        xu3 xu3Var;
        ja7 ja7Var = (ja7) this.c;
        g9g g9gVarG = fp3.G(ja7Var, r6dVar);
        char c = g9gVarG.a;
        ar0 ar0Var = (ar0) this.b;
        ar0Var.t(c);
        ar0Var.k();
        String str = (String) this.g;
        if (str != null) {
            String strA = (String) this.h;
            if (strA == null) {
                strA = r6dVar.a();
            }
            ar0Var.l();
            m(str);
            ar0Var.t(':');
            ar0Var.x();
            m(strA);
            this.g = null;
            this.h = null;
        }
        if (((g9g) this.d) == g9gVarG) {
            return this;
        }
        xu3[] xu3VarArr = (xu3[]) this.e;
        return (xu3VarArr == null || (xu3Var = xu3VarArr[g9gVarG.ordinal()]) == null) ? new xu3(ar0Var, ja7Var, g9gVarG, xu3VarArr) : xu3Var;
    }

    public void c() {
        hdc hdcVar = (hdc) this.e;
        if (hdcVar != null) {
            hdcVar.B((pz4) this.h);
            this.h = null;
        }
        ((TabLayout) this.b).l((cx5) this.g);
        ((ViewPager2) this.c).g((mg6) this.f);
        this.g = null;
        this.f = null;
        this.e = null;
        this.a = false;
    }

    public void d(boolean z) {
        if (this.a) {
            m(String.valueOf(z));
        } else {
            ((sh0) ((ar0) this.b).b).J(String.valueOf(z));
        }
    }

    public void e(r6d r6dVar, int i, boolean z) {
        f(r6dVar, i);
        d(z);
    }

    public void f(r6d r6dVar, int i) {
        int iOrdinal = ((g9g) this.d).ordinal();
        boolean z = true;
        ar0 ar0Var = (ar0) this.b;
        if (iOrdinal == 1) {
            if (!ar0Var.a) {
                ar0Var.t(',');
            }
            ar0Var.l();
            return;
        }
        if (iOrdinal == 2) {
            if (ar0Var.a) {
                this.a = true;
                ar0Var.l();
                return;
            }
            if (i % 2 == 0) {
                ar0Var.t(',');
                ar0Var.l();
            } else {
                ar0Var.t(':');
                ar0Var.x();
                z = false;
            }
            this.a = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!ar0Var.a) {
                ar0Var.t(',');
            }
            ar0Var.l();
            tu0.t((ja7) this.c, r6dVar);
            m(r6dVar.g(i));
            ar0Var.t(':');
            ar0Var.x();
            return;
        }
        if (i == 0) {
            this.a = true;
        }
        if (i == 1) {
            ar0Var.t(',');
            ar0Var.x();
            this.a = false;
        }
    }

    public void g(r6d r6dVar, int i) {
        m(r6dVar.g(i));
    }

    public void h() {
        ((ar0) this.b).u("null");
    }

    public void i(r6d r6dVar, int i, Object obj) {
        s9e s9eVar = s9e.a;
        if (obj != null || ((la7) this.f).f) {
            j(r6dVar, i, obj);
        }
    }

    public void j(r6d r6dVar, int i, Object obj) {
        s9e s9eVar = s9e.a;
        f(r6dVar, i);
        s9e s9eVar2 = s9e.a;
        if (obj == null) {
            h();
        } else {
            l(s9eVar, obj);
        }
    }

    public void k(r6d r6dVar, int i, cc7 cc7Var, Object obj) {
        f(r6dVar, i);
        l(cc7Var, obj);
    }

    public void l(cc7 cc7Var, Object obj) {
        String strDiscriminator;
        ja7 ja7Var = (ja7) this.c;
        la7 la7Var = ja7Var.a;
        if (la7Var.i) {
            cc7Var.b(this, obj);
            return;
        }
        int iS = au1.s(la7Var.p);
        if (iS == 0) {
            strDiscriminator = null;
        } else {
            if (iS == 1) {
                pag pagVarE = cc7Var.d().e();
                if (tpa.f(pagVarE, nae.e) || tpa.f(pagVarE, nae.h)) {
                    Iterator it = cc7Var.d().getAnnotations().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            strDiscriminator = ja7Var.a.j;
                            break;
                        }
                        Annotation annotation = (Annotation) it.next();
                        if (annotation instanceof ka7) {
                            strDiscriminator = ((ka7) annotation).discriminator();
                            break;
                        }
                    }
                }
            } else if (iS != 2) {
                throw new NoWhenBranchMatchedException();
            }
            strDiscriminator = null;
        }
        if (strDiscriminator != null) {
            String strA = cc7Var.d().a();
            this.g = strDiscriminator;
            this.h = strA;
        }
        cc7Var.b(this, obj);
    }

    public void m(String str) {
        ((ar0) this.b).w(str);
    }

    public void n(r6d r6dVar, int i, String str) {
        f(r6dVar, i);
        m(str);
    }

    public void o() {
        g9g g9gVar = (g9g) this.d;
        char c = g9gVar.b;
        ar0 ar0Var = (ar0) this.b;
        ar0Var.y();
        ar0Var.n();
        ar0Var.t(g9gVar.b);
    }

    public void p(d dVar, vu6 vu6Var) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        la6 la6Var;
        umc umcVar;
        dVar.getClass();
        if (!this.a || (copyOnWriteArrayList = (CopyOnWriteArrayList) this.h) == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        if (vu6Var == vu6.c && (la6Var = ((d2b) this.b).h) != null && (umcVar = la6Var.d) != null) {
            Rect bounds = umcVar.getBounds();
            bounds.width();
            d dVar2 = (d) this.d;
            dVar2.getClass();
            bounds.height();
            dVar2.getClass();
        }
        c cVarB2 = dVar.b2();
        Iterator it = ((CopyOnWriteArrayList) this.h).iterator();
        while (it.hasNext()) {
            ((ImagePerfDataListener) it.next()).onImageLoadStatusUpdated(cVarB2, vu6Var);
        }
    }

    public void q() {
        zu3 zu3Var = (zu3) this.d;
        uu3 uu3Var = (uu3) this.b;
        if (uu3Var != null) {
            uu3Var.changeEnded(zu3Var, (av3) this.e);
        }
        uu3 uu3Var2 = (uu3) this.c;
        if (uu3Var2 != null) {
            zu3.c.remove(uu3Var2.getInstanceId());
            uu3Var2.changeEnded(zu3Var, (av3) this.f);
        }
        Iterator it = ((List) this.g).iterator();
        while (it.hasNext()) {
            ((yu3) it.next()).b(uu3Var2, uu3Var, this.a);
        }
        if (zu3Var.a) {
            View view = (View) this.h;
            ViewParent parent = view != null ? view.getParent() : null;
            ViewGroup viewGroup = parent instanceof ViewGroup ? parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        if (!zu3Var.d() || uu3Var == null) {
            return;
        }
        uu3Var.setNeedsAttach(false);
    }

    public FileInputStream r(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((ihb) this.c).getClass();
            }
            return null;
        }
    }

    public void s() {
        TabLayout tabLayout = (TabLayout) this.b;
        tabLayout.k();
        hdc hdcVar = (hdc) this.e;
        if (hdcVar != null) {
            int iJ = hdcVar.j();
            for (int i = 0; i < iJ; i++) {
                eje ejeVarI = tabLayout.i();
                ((hje) this.d).h(ejeVarI, i);
                tabLayout.b(ejeVarI, tabLayout.b.size(), false);
            }
            if (iJ > 0) {
                int iMin = Math.min(((ViewPager2) this.c).getCurrentItem(), tabLayout.getTabCount() - 1);
                if (iMin != tabLayout.getSelectedTabPosition()) {
                    tabLayout.o(tabLayout.h(iMin), true);
                }
            }
        }
    }

    public void t(int i, Serializable serializable) {
        ((Executor) this.b).execute(new si1(this, i, serializable, 6));
    }

    public void u() {
        ArrayList arrayList;
        zec zecVar;
        int i;
        if (this.a) {
            ArrayList<ServiceInfo> arrayList2 = new ArrayList();
            int i2 = Build.VERSION.SDK_INT;
            PackageManager packageManager = (PackageManager) this.e;
            if (i2 >= 30) {
                Intent intent = new Intent("android.media.MediaRoute2ProviderService");
                ArrayList arrayList3 = new ArrayList();
                Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 0).iterator();
                while (it.hasNext()) {
                    arrayList3.add(it.next().serviceInfo);
                }
                arrayList2 = arrayList3;
            }
            Iterator<ResolveInfo> it2 = packageManager.queryIntentServices(new Intent("android.media.MediaRouteProviderService"), 0).iterator();
            int i3 = 0;
            while (true) {
                boolean zHasNext = it2.hasNext();
                arrayList = (ArrayList) this.f;
                boolean z = true;
                zecVar = (zec) this.c;
                if (!zHasNext) {
                    break;
                }
                ServiceInfo serviceInfo = it2.next().serviceInfo;
                if (serviceInfo != null) {
                    if ((eh8.d == null ? false : eh8.c().d) && !arrayList2.isEmpty()) {
                        for (ServiceInfo serviceInfo2 : arrayList2) {
                            if (!serviceInfo.packageName.equals(serviceInfo2.packageName) || !serviceInfo.name.equals(serviceInfo2.name)) {
                            }
                        }
                    }
                    String str = serviceInfo.packageName;
                    String str2 = serviceInfo.name;
                    int size = arrayList.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            i4 = -1;
                            break;
                        }
                        ComponentName componentName = ((yec) arrayList.get(i4)).t0;
                        if (componentName.getPackageName().equals(str) && componentName.getClassName().equals(str2)) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 < 0) {
                        yec yecVar = new yec((Context) this.b, new ComponentName(serviceInfo.packageName, serviceInfo.name));
                        yecVar.A0 = new yt8(this, yecVar);
                        if (!yecVar.w0) {
                            if (yec.B0) {
                                yecVar.toString();
                            }
                            yecVar.w0 = true;
                            yecVar.m();
                        }
                        i = i3 + 1;
                        arrayList.add(i3, yecVar);
                        ((ah8) zecVar).a(yecVar);
                    } else if (i4 >= i3) {
                        yec yecVar2 = (yec) arrayList.get(i4);
                        if (!yecVar2.w0) {
                            if (yec.B0) {
                                yecVar2.toString();
                            }
                            yecVar2.w0 = true;
                            yecVar2.m();
                        }
                        if (yecVar2.y0 == null) {
                            if (!yecVar2.w0 || (yecVar2.X == null && yecVar2.v0.isEmpty())) {
                                z = false;
                            }
                            if (z) {
                                yecVar2.l();
                                yecVar2.i();
                            }
                        }
                        i = i3 + 1;
                        Collections.swap(arrayList, i4, i3);
                    }
                    i3 = i;
                }
            }
            if (i3 < arrayList.size()) {
                for (int size2 = arrayList.size() - 1; size2 >= i3; size2--) {
                    yec yecVar3 = (yec) arrayList.get(size2);
                    ah8 ah8Var = (ah8) zecVar;
                    ch8 ch8VarD = ah8Var.d(yecVar3);
                    if (ch8VarD != null) {
                        yecVar3.getClass();
                        eh8.b();
                        yecVar3.o = null;
                        yecVar3.h(null);
                        ah8Var.l(ch8VarD, null);
                        if (eh8.c) {
                            ch8VarD.toString();
                        }
                        ah8Var.m.b(514, ch8VarD);
                        ah8Var.i.remove(ch8VarD);
                    }
                    arrayList.remove(yecVar3);
                    yecVar3.A0 = null;
                    if (yecVar3.w0) {
                        if (yec.B0) {
                            yecVar3.toString();
                        }
                        yecVar3.w0 = false;
                        yecVar3.m();
                    }
                }
            }
        }
    }

    public void v(boolean z) {
        this.a = z;
        if (!z) {
            gv6 gv6Var = (gv6) this.f;
            if (gv6Var != null) {
                ((d2b) this.b).g.removeListener(gv6Var);
            }
            p06 p06Var = (p06) this.g;
            if (p06Var != null) {
                d2b d2bVar = (d2b) this.b;
                synchronized (d2bVar) {
                    HashSet hashSet = d2bVar.G;
                    if (hashSet == null) {
                        return;
                    }
                    hashSet.remove(p06Var);
                    return;
                }
            }
            return;
        }
        gv6 gv6Var2 = (gv6) this.f;
        d dVar = (d) this.d;
        hc9 hc9Var = (hc9) this.c;
        if (gv6Var2 == null) {
            this.f = new gv6(hc9Var, dVar, this);
        }
        if (((fv6) this.e) == null) {
            this.e = new fv6(hc9Var, dVar);
        }
        if (((p06) this.g) == null) {
            this.g = new p06((fv6) this.e);
        }
        gv6 gv6Var3 = (gv6) this.f;
        if (gv6Var3 != null) {
            ((d2b) this.b).g.addListener(gv6Var3);
        }
        p06 p06Var2 = (p06) this.g;
        if (p06Var2 != null) {
            d2b d2bVar2 = (d2b) this.b;
            synchronized (d2bVar2) {
                try {
                    if (d2bVar2.G == null) {
                        d2bVar2.G = new HashSet();
                    }
                    d2bVar2.G.add(p06Var2);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public boolean w() {
        return ((la7) this.f).a;
    }

    public xu3(AwakeTimeSinceBootClock awakeTimeSinceBootClock, d2b d2bVar) {
        this.c = awakeTimeSinceBootClock;
        this.b = d2bVar;
        d dVar = new d(6);
        vu6 vu6Var = vu6.a;
        nqf nqfVar = nqf.a;
        this.d = dVar;
    }

    public xu3(Context context, zec zecVar) {
        this.f = new ArrayList();
        this.g = new an(10, this);
        this.h = new q57(20, this);
        this.b = context;
        this.c = zecVar;
        this.d = new Handler();
        this.e = context.getPackageManager();
    }

    public xu3(TabLayout tabLayout, ViewPager2 viewPager2, hje hjeVar) {
        this.b = tabLayout;
        this.c = viewPager2;
        this.d = hjeVar;
    }

    public xu3(AssetManager assetManager, Executor executor, ihb ihbVar, String str, File file) {
        this.a = false;
        this.b = executor;
        this.c = ihbVar;
        this.f = str;
        this.e = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 29:
                case 30:
                    bArr = oag.c;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = oag.b;
                    break;
            }
        }
        this.d = bArr;
    }

    public xu3(uu3 uu3Var, zu3 zu3Var, av3 av3Var, uu3 uu3Var2, List list, View view, av3 av3Var2, boolean z, ViewGroup viewGroup) {
        this.b = uu3Var;
        this.d = zu3Var;
        this.e = av3Var;
        this.c = uu3Var2;
        this.g = list;
        this.h = view;
        this.f = av3Var2;
        this.a = z;
    }
}
