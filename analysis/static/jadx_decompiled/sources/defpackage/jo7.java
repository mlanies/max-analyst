package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Rational;
import android.util.Size;
import android.widget.FrameLayout;
import androidx.fragment.app.a;
import androidx.startup.StartupException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.webrtc.CapturerObserver;
import org.webrtc.VideoFrame;

/* loaded from: classes.dex */
public final class jo7 implements ko7, ed6, fd6, qj3, f1d, CapturerObserver, ifg {
    public static final b11 X;
    public static final b11 Y;
    public static volatile jo7 Z;
    public static final b11 o;
    public static final Object s0 = new Object();
    public Object a;
    public Object b;
    public Object c;

    static {
        long j = -9223372036854775807L;
        o = new b11(j, 0, 4, false);
        int i = 4;
        boolean z = false;
        X = new b11(j, 2, i, z);
        Y = new b11(j, 3, i, z);
    }

    public jo7(vd8 vd8Var, a aVar, FrameLayout frameLayout) {
        this.c = vd8Var;
        this.a = aVar;
        this.b = frameLayout;
    }

    public static b11 e(long j, boolean z) {
        return new b11(j, z ? 1 : 0, 4, false);
    }

    public static jo7 i(Context context) {
        if (Z == null) {
            synchronized (s0) {
                try {
                    if (Z == null) {
                        jo7 jo7Var = new jo7();
                        jo7Var.c = context.getApplicationContext();
                        jo7Var.b = new HashSet();
                        jo7Var.a = new HashMap();
                        Z = jo7Var;
                    }
                } finally {
                }
            }
        }
        return Z;
    }

    public static ArrayList j(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(lt.a);
        arrayList2.add(lt.c);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList2.contains(rational)) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        arrayList2.add(rational);
                        break;
                    }
                    if (lt.a(size, (Rational) it2.next(), msd.c)) {
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational l(int i, boolean z) {
        if (i == 0) {
            return z ? lt.a : lt.b;
        }
        if (i != 1) {
            return null;
        }
        return z ? lt.c : lt.d;
    }

    public static HashMap m(ArrayList arrayList) {
        HashMap map = new HashMap();
        Iterator it = j(arrayList).iterator();
        while (it.hasNext()) {
            map.put((Rational) it.next(), new ArrayList());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Size size = (Size) it2.next();
            for (Rational rational : map.keySet()) {
                if (lt.a(size, rational, msd.c)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    public static void t(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z) {
            list.addAll(arrayList);
        }
    }

    public static void u(List list, Size size, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            Size size2 = (Size) list.get(i);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z) {
            list.addAll(arrayList);
        }
    }

    @Override // defpackage.fd6
    public synchronized void B(hd6 hd6Var, long j) {
        ((l0f) this.b).Q(hd6Var, j);
    }

    public void a() {
        eo7 eo7Var = (eo7) this.b;
        np8.g(eo7Var);
        eo7Var.a(false);
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        hm9.p(gn4.i, "MsgGetCmd failed", (Throwable) obj);
        ((gn4) this.a).c((e52) this.b, (n7d) this.c);
    }

    @Override // defpackage.f1d
    public void b(tue tueVar, pa5 pa5Var, l3f l3fVar) {
        this.b = tueVar;
        l3fVar.a();
        l3fVar.b();
        yze yzeVarMo6B = pa5Var.mo6B(l3fVar.e, 5);
        this.c = yzeVarMo6B;
        yzeVarMo6B.e((qy5) this.a);
    }

    @Override // defpackage.ko7
    public void c() throws IOException {
        IOException iOException;
        IOException iOException2 = (IOException) this.c;
        if (iOException2 != null) {
            throw iOException2;
        }
        eo7 eo7Var = (eo7) this.b;
        if (eo7Var != null && (iOException = eo7Var.o) != null && eo7Var.X > eo7Var.b) {
            throw iOException;
        }
    }

    @Override // defpackage.f1d
    public void d(wpa wpaVar) {
        long jD;
        long j;
        fm9.l((tue) this.b);
        int i = oaf.a;
        tue tueVar = (tue) this.b;
        synchronized (tueVar) {
            try {
                long j2 = tueVar.c;
                jD = j2 != -9223372036854775807L ? j2 + tueVar.b : tueVar.d();
            } finally {
            }
        }
        tue tueVar2 = (tue) this.b;
        synchronized (tueVar2) {
            j = tueVar2.b;
        }
        if (jD == -9223372036854775807L || j == -9223372036854775807L) {
            return;
        }
        qy5 qy5Var = (qy5) this.a;
        if (j != qy5Var.s) {
            ny5 ny5VarA = qy5Var.a();
            ny5VarA.r = j;
            qy5 qy5Var2 = new qy5(ny5VarA);
            this.a = qy5Var2;
            ((yze) this.c).e(qy5Var2);
        }
        int iA = wpaVar.a();
        ((yze) this.c).b(wpaVar, iA, 0);
        ((yze) this.c).a(jD, 1, iA, 0, null);
    }

    public void f(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = ((Context) this.c).getString(e2c.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = (HashSet) this.b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (x07.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    g((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public Object g(Class cls, HashSet hashSet) {
        Object objB;
        if (hye.a()) {
            try {
                Trace.beginSection(c37.F(cls.getSimpleName()));
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = (HashMap) this.a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                x07 x07Var = (x07) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = x07Var.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            g(cls2, hashSet);
                        }
                    }
                }
                objB = x07Var.b((Context) this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objB;
    }

    @Override // defpackage.ed6
    public synchronized void h() {
        ((l0f) this.b).h();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList k(defpackage.o9f r13) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo7.k(o9f):java.util.ArrayList");
    }

    public boolean n() {
        return ((IOException) this.c) != null;
    }

    public boolean o() {
        return ((eo7) this.b) != null;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z) {
        if (z) {
            ((py0) ((u5e) this.b).a).V0.log("OKRTCCall", "Screen capture has started, fast=true");
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        ((u5e) this.b).b(true);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        if (videoFrame != null) {
            ((dnc) this.a).getClass();
        } else {
            videoFrame = null;
        }
        CapturerObserver capturerObserver = (CapturerObserver) this.c;
        if (capturerObserver != null) {
            capturerObserver.onFrameCaptured(videoFrame);
        }
    }

    public void p(ho7 ho7Var) {
        eo7 eo7Var = (eo7) this.b;
        if (eo7Var != null) {
            eo7Var.a(true);
        }
        ExecutorService executorService = (ExecutorService) this.a;
        if (ho7Var != null) {
            executorService.execute(new q57(5, ho7Var));
        }
        executorService.shutdown();
    }

    @Override // defpackage.fd6
    public synchronized void q() {
        ((l0f) this.b).S();
    }

    @Override // defpackage.ifg
    public Object r() {
        Object objR = ((ifg) this.a).r();
        Context context = (Context) ((zig) ((ifg) this.c)).a.b;
        if (context != null) {
            return new fig((fkg) objR, context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // defpackage.ed6
    public void s(hd6 hd6Var) {
        ((nx0) this.c).v(new i12(this, 0, hd6Var));
    }

    @Override // defpackage.ed6
    public synchronized void v() {
        ((l0f) this.b).v();
        nx0 nx0Var = (nx0) this.c;
        gd6 gd6Var = (gd6) this.a;
        Objects.requireNonNull(gd6Var);
        nx0Var.v(new j12(gd6Var, 0));
    }

    public long w(fo7 fo7Var, co7 co7Var, int i) {
        Looper looperMyLooper = Looper.myLooper();
        np8.g(looperMyLooper);
        this.c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        eo7 eo7Var = new eo7(this, looperMyLooper, fo7Var, co7Var, i, jElapsedRealtime, 0);
        np8.f(((eo7) this.b) == null);
        this.b = eo7Var;
        eo7Var.o = null;
        ((ExecutorService) this.a).execute(eo7Var);
        return jElapsedRealtime;
    }

    public /* synthetic */ jo7(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public jo7(va8 va8Var, gd6 gd6Var, gd6 gd6Var2, nx0 nx0Var) {
        this.a = gd6Var;
        this.b = new l0f(va8Var, gd6Var2, nx0Var);
        this.c = nx0Var;
    }

    public jo7(yw1 yw1Var, Size size) {
        Rational rational;
        this.a = yw1Var;
        yw1Var.b();
        yw1Var.g();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List listQ = yw1Var.q(256);
            if (listQ.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(listQ, new x93(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.b = rational;
        this.c = new yd9(yw1Var, rational);
    }

    public jo7(String str, int i) {
        switch (i) {
            case 10:
                ny5 ny5Var = new ny5();
                ny5Var.m = ia9.l(str);
                this.a = new qy5(ny5Var);
                break;
            default:
                String strConcat = str.length() != 0 ? "ExoPlayer:Loader:".concat(str) : new String("ExoPlayer:Loader:");
                int i2 = maf.a;
                this.a = Executors.newSingleThreadExecutor(new pd3(1, strConcat));
                break;
        }
    }
}
