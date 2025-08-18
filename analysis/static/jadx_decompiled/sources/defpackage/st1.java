package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class st1 implements hw1 {
    public final qt1 b;
    public final Executor c;
    public final Object d = new Object();
    public final xv1 e;
    public final sy4 f;
    public final bad g;
    public final xs5 h;
    public final od i;
    public final bye j;
    public final td k;
    public final mag l;
    public final nx0 m;
    public final u40 n;
    public final bdb o;
    public int p;
    public eu6 q;
    public volatile boolean r;
    public volatile int s;
    public final wmc t;
    public final oq0 u;
    public final AtomicLong v;
    public volatile bm7 w;
    public int x;
    public long y;
    public final pt1 z;

    public st1(xv1 xv1Var, zh6 zh6Var, q6d q6dVar, sy4 sy4Var, bj6 bj6Var) {
        bad badVar = new bad();
        this.g = badVar;
        this.p = 0;
        this.r = false;
        this.s = 2;
        this.v = new AtomicLong(0L);
        this.w = dw6.c;
        this.x = 1;
        this.y = 0L;
        pt1 pt1Var = new pt1();
        pt1Var.b = new HashSet();
        pt1Var.c = new ArrayMap();
        this.z = pt1Var;
        this.e = xv1Var;
        this.f = sy4Var;
        this.c = q6dVar;
        this.o = new bdb(q6dVar);
        qt1 qt1Var = new qt1(q6dVar);
        this.b = qt1Var;
        badVar.b.c = this.x;
        badVar.b.b(new jz1(qt1Var));
        badVar.b.b(pt1Var);
        this.k = new td(this, q6dVar);
        this.h = new xs5(this, zh6Var, q6dVar, bj6Var);
        od odVar = new od();
        odVar.a = false;
        bag bagVar = new bag(odVar);
        odVar.b = this;
        odVar.c = q6dVar;
        cag cagVarB = od.b(xv1Var);
        odVar.Y = cagVarB;
        hag hagVar = new hag(cagVarB.c(), cagVarB.d());
        odVar.o = hagVar;
        hagVar.f(1.0f);
        odVar.X = new ci9(sa0.e(hagVar));
        p(bagVar);
        this.i = odVar;
        this.j = new bye(this, xv1Var, q6dVar);
        this.l = new mag(xv1Var);
        wmc wmcVar = new wmc();
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) bj6Var.e(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            wmcVar.a = null;
        } else {
            wmcVar.a = aeFpsRangeLegacyQuirk.a;
        }
        this.t = wmcVar;
        this.u = new oq0(bj6Var, 2);
        this.m = new nx0(this, q6dVar);
        this.n = new u40(this, xv1Var, bj6Var, q6dVar, zh6Var);
    }

    public static int t(xv1 xv1Var, int i) {
        int[] iArr = (int[]) xv1Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i, iArr) ? i : w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof nje) && (l = (Long) ((nje) tag).a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public final long A() {
        this.y = this.v.getAndIncrement();
        ((fu1) this.f.b).K();
        return this.y;
    }

    @Override // defpackage.hw1
    public final void a() {
        bdb bdbVar = this.o;
        bdbVar.getClass();
        ((Executor) bdbVar.b).execute(new rlf(bdbVar, 0));
    }

    @Override // defpackage.hw1
    public final bm7 b(float f) {
        bm7 dw6Var;
        sa0 sa0VarE;
        if (!v()) {
            return new dw6(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        od odVar = this.i;
        synchronized (((hag) odVar.o)) {
            try {
                ((hag) odVar.o).e(f);
                sa0VarE = sa0.e((hag) odVar.o);
            } catch (IllegalArgumentException e) {
                dw6Var = new dw6(1, e);
            }
        }
        odVar.h(sa0VarE);
        dw6Var = f8.g(new z9g(odVar, sa0VarE, 1));
        return kq0.w(dw6Var);
    }

    @Override // defpackage.hw1
    public final void c(ce3 ce3Var) {
        nx0 nx0Var = this.m;
        re6 re6VarU = wd6.w(ce3Var).u();
        synchronized (nx0Var.X) {
            re6 re6Var = (re6) nx0Var.Z;
            re6Var.getClass();
            be3 be3Var = be3.o;
            for (aa0 aa0Var : re6VarU.g()) {
                ((mi9) re6Var.b).d(aa0Var, be3Var, re6VarU.h(aa0Var));
            }
        }
        kq0.w(f8.g(new kt1(nx0Var, 0))).d(new kc(5), ju0.k());
    }

    @Override // defpackage.hw1
    public final bm7 d(float f) {
        bm7 dw6Var;
        sa0 sa0VarE;
        if (!v()) {
            return new dw6(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        od odVar = this.i;
        synchronized (((hag) odVar.o)) {
            try {
                ((hag) odVar.o).f(f);
                sa0VarE = sa0.e((hag) odVar.o);
            } catch (IllegalArgumentException e) {
                dw6Var = new dw6(1, e);
            }
        }
        odVar.h(sa0VarE);
        dw6Var = f8.g(new z9g(odVar, sa0VarE, 0));
        return kq0.w(dw6Var);
    }

    @Override // defpackage.hw1
    public final Rect e() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.hw1
    public final void f(int i) {
        if (v()) {
            this.s = i;
            mag magVar = this.l;
            boolean z = true;
            if (this.s != 1 && this.s != 0) {
                z = false;
            }
            magVar.d = z;
            this.w = kq0.w(f8.g(new ync(22, this)));
        }
    }

    @Override // defpackage.hw1
    public final void g(eu6 eu6Var) {
        this.q = eu6Var;
    }

    @Override // defpackage.hw1
    public final bm7 h(bw4 bw4Var) {
        if (!v()) {
            return new dw6(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        xs5 xs5Var = this.h;
        xs5Var.getClass();
        return kq0.w(f8.g(new x72(xs5Var, bw4Var)));
    }

    @Override // defpackage.hw1
    public final bm7 i(final ArrayList arrayList, final int i, final int i2) {
        if (!v()) {
            return new dw6(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        final int i3 = this.s;
        b76 b76VarA = b76.a(kq0.w(this.w));
        wu wuVar = new wu() { // from class: nt1
            @Override // defpackage.wu
            public final bm7 apply(Object obj) {
                u40 u40Var = this.a.n;
                int i4 = i2;
                int i5 = i;
                int i6 = i3;
                su1 su1VarE = u40Var.e(i5, i6, i4);
                b76 b76VarA2 = b76.a(su1VarE.a(i6));
                ui0 ui0Var = new ui0(su1VarE, (ArrayList) arrayList, i6, 1);
                b76VarA2.getClass();
                Executor executor = su1VarE.b;
                k12 k12VarK = kq0.K(b76VarA2, ui0Var, executor);
                k12VarK.d(new cu1(1, su1VarE), executor);
                return kq0.w(k12VarK);
            }
        };
        Executor executor = this.c;
        b76VarA.getClass();
        return kq0.K(b76VarA, wuVar, executor);
    }

    @Override // defpackage.hw1
    public final void j(bad badVar) throws Exception {
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        mag magVar = this.l;
        xv1 xv1Var = magVar.a;
        while (true) {
            nag nagVar = magVar.b;
            if (nagVar.g()) {
                break;
            } else {
                ((ov6) nagVar.d()).close();
            }
        }
        fw6 fw6Var = magVar.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (fw6Var != null) {
            hqc hqcVar = magVar.g;
            if (hqcVar != null) {
                kq0.w(fw6Var.e).d(new nz1(hqcVar, 2), ju0.D());
                magVar.g = null;
            }
            fw6Var.a();
            magVar.i = null;
        }
        ImageWriter imageWriter = magVar.j;
        if (imageWriter != null) {
            imageWriter.close();
            magVar.j = null;
        }
        boolean z = magVar.c;
        u40 u40Var = badVar.b;
        if (z) {
            u40Var.c = 1;
            return;
        }
        if (magVar.f) {
            u40Var.c = 1;
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) xv1Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            e.getMessage();
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new x93(true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (magVar.e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) xv1Var.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    i99 i99Var = new i99(size.getWidth(), size.getHeight(), 34, 9);
                    magVar.h = i99Var.b;
                    magVar.g = new hqc(i99Var);
                    i99Var.l(new gte(24, magVar), ju0.z());
                    fw6 fw6Var2 = new fw6(magVar.g.getSurface(), new Size(magVar.g.getWidth(), magVar.g.getHeight()), 34);
                    magVar.i = fw6Var2;
                    hqc hqcVar2 = magVar.g;
                    bm7 bm7VarW = kq0.w(fw6Var2.e);
                    Objects.requireNonNull(hqcVar2);
                    bm7VarW.d(new nz1(hqcVar2, 2), ju0.D());
                    badVar.b(magVar.i, eu4.d, -1);
                    oz1 oz1Var = magVar.h;
                    u40Var.b(oz1Var);
                    ArrayList arrayList = badVar.e;
                    if (!arrayList.contains(oz1Var)) {
                        arrayList.add(oz1Var);
                    }
                    rv1 rv1Var = new rv1(2, magVar);
                    ArrayList arrayList2 = badVar.d;
                    if (!arrayList2.contains(rv1Var)) {
                        arrayList2.add(rv1Var);
                    }
                    badVar.g = new InputConfiguration(magVar.g.getWidth(), magVar.g.getHeight(), magVar.g.j());
                    return;
                }
            }
        }
        u40Var.c = 1;
    }

    @Override // defpackage.hw1
    public final bm7 k(boolean z) {
        bm7 bm7VarG;
        if (!v()) {
            return new dw6(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        bye byeVar = this.j;
        if (byeVar.c) {
            bye.b(byeVar.b, Integer.valueOf(z ? 1 : 0));
            bm7VarG = f8.g(new fe4(byeVar, z, 5));
        } else {
            bm7VarG = new dw6(1, new IllegalStateException("No flash unit"));
        }
        return kq0.w(bm7VarG);
    }

    @Override // defpackage.hw1
    public final bm7 l(int i, int i2) {
        if (!v()) {
            return new dw6(1, new CameraControl$OperationCanceledException("Camera is not active."));
        }
        int i3 = this.s;
        b76 b76VarA = b76.a(kq0.w(this.w));
        ot1 ot1Var = new ot1(this, i, i3, i2);
        Executor executor = this.c;
        b76VarA.getClass();
        return kq0.K(b76VarA, ot1Var, executor);
    }

    @Override // defpackage.hw1
    public final ce3 m() {
        cv1 cv1Var;
        nx0 nx0Var = this.m;
        synchronized (nx0Var.X) {
            re6 re6Var = (re6) nx0Var.Z;
            re6Var.getClass();
            cv1Var = new cv1(8, wma.a((mi9) re6Var.b));
        }
        return cv1Var;
    }

    @Override // defpackage.hw1
    public final void n() {
        nx0 nx0Var = this.m;
        synchronized (nx0Var.X) {
            nx0Var.Z = new re6(7);
        }
        kq0.w(f8.g(new kt1(nx0Var, 1))).d(new kc(5), ju0.k());
    }

    @Override // defpackage.hw1
    public final void o() {
        bdb bdbVar = this.o;
        bdbVar.getClass();
        ((Executor) bdbVar.b).execute(new rlf(bdbVar, 1));
    }

    public final void p(rt1 rt1Var) {
        ((HashSet) this.b.b).add(rt1Var);
    }

    public final void q() {
        synchronized (this.d) {
            try {
                int i = this.p;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.p = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z) {
        this.r = z;
        if (!z) {
            u40 u40Var = new u40();
            u40Var.c = this.x;
            u40Var.b = true;
            mi9 mi9VarB = mi9.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            mi9VarB.j(cv1.v0(key), Integer.valueOf(t(this.e, 1)));
            mi9VarB.j(cv1.v0(CaptureRequest.FLASH_MODE), 0);
            u40Var.c(new cv1(8, wma.a(mi9VarB)));
            z(Collections.singletonList(u40Var.d()));
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fad s() {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.s():fad");
    }

    public final int u(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i, iArr)) {
            return i;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i;
        synchronized (this.d) {
            i = this.p;
        }
        return i > 0;
    }

    public final void y(boolean z) {
        sa0 sa0VarE;
        xs5 xs5Var = this.h;
        if (z != xs5Var.d) {
            xs5Var.d = z;
            if (!xs5Var.d) {
                xs5Var.b();
            }
        }
        od odVar = this.i;
        if (odVar.a != z) {
            odVar.a = z;
            if (!z) {
                synchronized (((hag) odVar.o)) {
                    ((hag) odVar.o).f(1.0f);
                    sa0VarE = sa0.e((hag) odVar.o);
                }
                odVar.h(sa0VarE);
                ((cag) odVar.Y).g();
                ((st1) odVar.b).A();
            }
        }
        bye byeVar = this.j;
        if (byeVar.e != z) {
            byeVar.e = z;
            if (!z) {
                if (byeVar.g) {
                    byeVar.g = false;
                    byeVar.a.r(false);
                    bye.b(byeVar.b, 0);
                }
                lq1 lq1Var = byeVar.f;
                if (lq1Var != null) {
                    lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
                    byeVar.f = null;
                }
            }
        }
        td tdVar = this.k;
        if (z != tdVar.b) {
            tdVar.b = z;
            if (!z) {
                sh0 sh0Var = (sh0) tdVar.c;
                synchronized (sh0Var.c) {
                    sh0Var.b = 0;
                }
            }
        }
        nx0 nx0Var = this.m;
        nx0Var.getClass();
        ((Executor) nx0Var.o).execute(new u60(nx0Var, z, 6));
        if (z) {
            return;
        }
        this.q = null;
        ((AtomicInteger) this.o.c).set(0);
    }

    public final void z(List list) {
        int iC;
        int iB;
        pv1 pv1Var;
        sy4 sy4Var = this.f;
        sy4Var.getClass();
        list.getClass();
        fu1 fu1Var = (fu1) sy4Var.b;
        fu1Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kz1 kz1Var = (kz1) it.next();
            HashSet hashSet = new HashSet();
            mi9.b();
            ArrayList arrayList2 = new ArrayList();
            ui9.a();
            hashSet.addAll(kz1Var.a);
            mi9 mi9VarC = mi9.c(kz1Var.b);
            arrayList2.addAll(kz1Var.e);
            ArrayMap arrayMap = new ArrayMap();
            nje njeVar = kz1Var.g;
            for (String str : njeVar.a.keySet()) {
                arrayMap.put(str, njeVar.a.get(str));
            }
            ui9 ui9Var = new ui9(arrayMap);
            pv1 pv1Var2 = (kz1Var.c != 5 || (pv1Var = kz1Var.h) == null) ? null : pv1Var;
            if (Collections.unmodifiableList(kz1Var.a).isEmpty() && kz1Var.f) {
                if (hashSet.isEmpty()) {
                    gaa gaaVar = fu1Var.a;
                    gaaVar.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) gaaVar.a).entrySet()) {
                        m9f m9fVar = (m9f) entry.getValue();
                        if (m9fVar.f && m9fVar.e) {
                            arrayList3.add(((m9f) entry.getValue()).a);
                        }
                    }
                    Iterator it2 = Collections.unmodifiableCollection(arrayList3).iterator();
                    while (it2.hasNext()) {
                        kz1 kz1Var2 = ((fad) it2.next()).g;
                        List listUnmodifiableList = Collections.unmodifiableList(kz1Var2.a);
                        if (!listUnmodifiableList.isEmpty()) {
                            if (kz1Var2.b() != 0 && (iB = kz1Var2.b()) != 0) {
                                mi9VarC.j(o9f.p0, Integer.valueOf(iB));
                            }
                            if (kz1Var2.c() != 0 && (iC = kz1Var2.c()) != 0) {
                                mi9VarC.j(o9f.q0, Integer.valueOf(iC));
                            }
                            Iterator it3 = listUnmodifiableList.iterator();
                            while (it3.hasNext()) {
                                hashSet.add((xf4) it3.next());
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                    }
                }
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            wma wmaVarA = wma.a(mi9VarC);
            ArrayList arrayList5 = new ArrayList(arrayList2);
            nje njeVar2 = nje.b;
            ArrayMap arrayMap2 = new ArrayMap();
            Map map = ui9Var.a;
            for (String str2 : map.keySet()) {
                arrayMap2.put(str2, map.get(str2));
            }
            arrayList.add(new kz1(arrayList4, wmaVarA, kz1Var.c, kz1Var.d, arrayList5, kz1Var.f, new nje(arrayMap2), pv1Var2));
        }
        fu1Var.toString();
        fu1Var.w0.j(arrayList);
    }
}
