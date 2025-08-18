package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.c;
import defpackage.a4a;
import defpackage.au1;
import defpackage.b16;
import defpackage.br7;
import defpackage.bt7;
import defpackage.d16;
import defpackage.e16;
import defpackage.eh7;
import defpackage.f16;
import defpackage.f8;
import defpackage.fg7;
import defpackage.g16;
import defpackage.gh7;
import defpackage.h16;
import defpackage.he0;
import defpackage.i3a;
import defpackage.i8;
import defpackage.ie0;
import defpackage.isc;
import defpackage.j16;
import defpackage.j3a;
import defpackage.je0;
import defpackage.k16;
import defpackage.m3a;
import defpackage.mm;
import defpackage.n16;
import defpackage.nec;
import defpackage.o16;
import defpackage.p16;
import defpackage.pl8;
import defpackage.pxb;
import defpackage.q16;
import defpackage.qb3;
import defpackage.qqd;
import defpackage.qz7;
import defpackage.r16;
import defpackage.r3a;
import defpackage.re;
import defpackage.rh4;
import defpackage.ru3;
import defpackage.rxd;
import defpackage.s3a;
import defpackage.sp3;
import defpackage.tj3;
import defpackage.u16;
import defpackage.v16;
import defpackage.w06;
import defpackage.w4d;
import defpackage.wb3;
import defpackage.wg0;
import defpackage.x06;
import defpackage.xje;
import defpackage.yd4;
import defpackage.ynf;
import defpackage.yq8;
import defpackage.z06;
import defpackage.zr6;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class c {
    public pl8 C;
    public pl8 D;
    public pl8 E;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public FragmentManagerViewModel O;
    public boolean b;
    public ArrayList e;
    public i3a g;
    public final d16 q;
    public final d16 r;
    public final d16 s;
    public final d16 t;
    public z06 w;
    public br7 x;
    public a y;
    public a z;
    public final ArrayList a = new ArrayList();
    public final f c = new f();
    public ArrayList d = new ArrayList();
    public final b16 f = new b16(this);
    public he0 h = null;
    public final ru3 i = new ru3(5, this);
    public final AtomicInteger j = new AtomicInteger();
    public final Map k = Collections.synchronizedMap(new HashMap());
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());
    public final ArrayList n = new ArrayList();
    public final qz7 o = new qz7(this);
    public final CopyOnWriteArrayList p = new CopyOnWriteArrayList();
    public final e16 u = new e16(this);
    public int v = -1;
    public final f16 A = new f16(this);
    public final sp3 B = new sp3();
    public ArrayDeque F = new ArrayDeque();
    public final re P = new re(24, this);

    /* JADX WARN: Type inference failed for: r0v16, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v17, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v18, types: [d16] */
    /* JADX WARN: Type inference failed for: r0v19, types: [d16] */
    public c() {
        final int i = 0;
        this.q = new tj3(this) { // from class: d16
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.tj3
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.N()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.N() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lg9 lg9Var = (lg9) obj;
                        c cVar3 = this.b;
                        if (cVar3.N()) {
                            cVar3.n(lg9Var.a, false);
                            break;
                        }
                        break;
                    default:
                        tza tzaVar = (tza) obj;
                        c cVar4 = this.b;
                        if (cVar4.N()) {
                            cVar4.s(tzaVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.r = new tj3(this) { // from class: d16
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.tj3
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.N()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.N() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lg9 lg9Var = (lg9) obj;
                        c cVar3 = this.b;
                        if (cVar3.N()) {
                            cVar3.n(lg9Var.a, false);
                            break;
                        }
                        break;
                    default:
                        tza tzaVar = (tza) obj;
                        c cVar4 = this.b;
                        if (cVar4.N()) {
                            cVar4.s(tzaVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.s = new tj3(this) { // from class: d16
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.tj3
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.N()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.N() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lg9 lg9Var = (lg9) obj;
                        c cVar3 = this.b;
                        if (cVar3.N()) {
                            cVar3.n(lg9Var.a, false);
                            break;
                        }
                        break;
                    default:
                        tza tzaVar = (tza) obj;
                        c cVar4 = this.b;
                        if (cVar4.N()) {
                            cVar4.s(tzaVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.t = new tj3(this) { // from class: d16
            public final /* synthetic */ c b;

            {
                this.b = this;
            }

            @Override // defpackage.tj3
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        c cVar = this.b;
                        if (cVar.N()) {
                            cVar.i(false, configuration);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        c cVar2 = this.b;
                        if (cVar2.N() && num.intValue() == 80) {
                            cVar2.m(false);
                            break;
                        }
                        break;
                    case 2:
                        lg9 lg9Var = (lg9) obj;
                        c cVar3 = this.b;
                        if (cVar3.N()) {
                            cVar3.n(lg9Var.a, false);
                            break;
                        }
                        break;
                    default:
                        tza tzaVar = (tza) obj;
                        c cVar4 = this.b;
                        if (cVar4.N()) {
                            cVar4.s(tzaVar.a, false);
                            break;
                        }
                        break;
                }
            }
        };
    }

    public static HashSet G(he0 he0Var) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < he0Var.a.size(); i++) {
            a aVar = ((v16) he0Var.a.get(i)).b;
            if (aVar != null && he0Var.g) {
                hashSet.add(aVar);
            }
        }
        return hashSet;
    }

    public static boolean M(a aVar) {
        if (!aVar.Q0 || !aVar.R0) {
            Iterator it = aVar.H0.c.e().iterator();
            boolean zM = false;
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != null) {
                    zM = M(aVar2);
                }
                if (zM) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean O(a aVar) {
        if (aVar == null) {
            return true;
        }
        return aVar.R0 && (aVar.F0 == null || O(aVar.I0));
    }

    public static boolean P(a aVar) {
        if (aVar == null) {
            return true;
        }
        c cVar = aVar.F0;
        return aVar.equals(cVar.z) && P(cVar.y);
    }

    public final boolean A(boolean z) {
        boolean zA;
        z(z);
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.L;
            ArrayList arrayList2 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.a.size();
                        zA = false;
                        for (int i = 0; i < size; i++) {
                            zA |= ((k16) this.a.get(i)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                l0();
                v();
                this.c.b.values().removeAll(Collections.singleton(null));
                return z2;
            }
            z2 = true;
            this.b = true;
            try {
                Y(this.L, this.M);
            } finally {
                d();
            }
        }
    }

    public final void B(k16 k16Var, boolean z) {
        if (z && (this.w == null || this.J)) {
            return;
        }
        z(z);
        if (k16Var.a(this.L, this.M)) {
            this.b = true;
            try {
                Y(this.L, this.M);
            } finally {
                d();
            }
        }
        l0();
        v();
        this.c.b.values().removeAll(Collections.singleton(null));
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x022e A[PHI: r15
      0x022e: PHI (r15v11 int) = (r15v10 int), (r15v13 int) binds: [B:107:0x021b, B:111:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(java.util.ArrayList r24, java.util.ArrayList r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.C(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final a D(int i) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && aVar.J0 == i) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (aVar2.J0 == i) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final a E(String str) {
        f fVar = this.c;
        ArrayList arrayList = fVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            if (aVar != null && str.equals(aVar.L0)) {
                return aVar;
            }
        }
        for (e eVar : fVar.b.values()) {
            if (eVar != null) {
                a aVar2 = eVar.c;
                if (str.equals(aVar2.L0)) {
                    return aVar2;
                }
            }
        }
        return null;
    }

    public final void F() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            yd4 yd4Var = (yd4) it.next();
            if (yd4Var.e) {
                yd4Var.e = false;
                yd4Var.e();
            }
        }
    }

    public final a H(String str, Bundle bundle) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        a aVarB = this.c.b(string);
        if (aVarB != null) {
            return aVarB;
        }
        k0(new IllegalStateException(rh4.k("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    public final ViewGroup I(a aVar) {
        ViewGroup viewGroup = aVar.T0;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (aVar.K0 > 0 && this.x.K()) {
            View viewJ = this.x.J(aVar.K0);
            if (viewJ instanceof ViewGroup) {
                return (ViewGroup) viewJ;
            }
        }
        return null;
    }

    public final f16 J() {
        a aVar = this.y;
        return aVar != null ? aVar.F0.J() : this.A;
    }

    public final sp3 K() {
        a aVar = this.y;
        return aVar != null ? aVar.F0.K() : this.B;
    }

    public final void L(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        if (aVar.M0) {
            return;
        }
        aVar.M0 = true;
        aVar.Y0 = true ^ aVar.Y0;
        i0(aVar);
    }

    public final boolean N() {
        a aVar = this.y;
        if (aVar == null) {
            return true;
        }
        return aVar.o0() && this.y.f0().N();
    }

    public final boolean Q() {
        return this.H || this.I;
    }

    public final void R(int i, boolean z) {
        HashMap map;
        z06 z06Var;
        if (this.w == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i != this.v) {
            this.v = i;
            f fVar = this.c;
            Iterator it = fVar.a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = fVar.b;
                if (!zHasNext) {
                    break;
                }
                e eVar = (e) map.get(((a) it.next()).Y);
                if (eVar != null) {
                    eVar.k();
                }
            }
            for (e eVar2 : map.values()) {
                if (eVar2 != null) {
                    eVar2.k();
                    a aVar = eVar2.c;
                    if (aVar.x0 && !aVar.q0()) {
                        fVar.h(eVar2);
                    }
                }
            }
            j0();
            if (this.G && (z06Var = this.w) != null && this.v == 7) {
                z06Var.x0.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void S() {
        if (this.w == null) {
            return;
        }
        this.H = false;
        this.I = false;
        this.O.g = false;
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.H0.S();
            }
        }
    }

    public final boolean T() {
        return U(-1, 0);
    }

    public final boolean U(int i, int i2) {
        A(false);
        z(true);
        a aVar = this.z;
        if (aVar != null && i < 0 && aVar.c0().T()) {
            return true;
        }
        boolean zV = V(this.L, this.M, i, i2);
        if (zV) {
            this.b = true;
            try {
                Y(this.L, this.M);
            } finally {
                d();
            }
        }
        l0();
        v();
        this.c.b.values().removeAll(Collections.singleton(null));
        return zV;
    }

    public final boolean V(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z = (i2 & 1) != 0;
        int size = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                size = z ? 0 : this.d.size() - 1;
            } else {
                int size2 = this.d.size() - 1;
                while (size2 >= 0) {
                    he0 he0Var = (he0) this.d.get(size2);
                    if (i >= 0 && i == he0Var.s) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z) {
                        while (size2 > 0) {
                            he0 he0Var2 = (he0) this.d.get(size2 - 1);
                            if (i < 0 || i != he0Var2.s) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.d.size() - 1; size3 >= size; size3--) {
            arrayList.add((he0) this.d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void W(Bundle bundle, String str, a aVar) {
        if (aVar.F0 == this) {
            bundle.putString(str, aVar.Y);
        } else {
            k0(new IllegalStateException(rh4.i("Fragment ", aVar, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void X(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
            int i = aVar.E0;
        }
        boolean z = !aVar.q0();
        if (!aVar.N0 || z) {
            f fVar = this.c;
            synchronized (fVar.a) {
                fVar.a.remove(aVar);
            }
            aVar.w0 = false;
            if (M(aVar)) {
                this.G = true;
            }
            aVar.x0 = true;
            i0(aVar);
        }
    }

    public final void Y(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((he0) arrayList.get(i)).o) {
                if (i2 != i) {
                    C(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((he0) arrayList.get(i2)).o) {
                        i2++;
                    }
                }
                C(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            C(arrayList, arrayList2, i2, size);
        }
    }

    public final void Z(Bundle bundle) {
        qz7 qz7Var;
        int i;
        e eVar;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.w.u0.getClassLoader());
                this.l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.w.u0.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        f fVar = this.c;
        HashMap map2 = fVar.c;
        map2.clear();
        map2.putAll(map);
        o16 o16Var = (o16) bundle.getParcelable("state");
        if (o16Var == null) {
            return;
        }
        HashMap map3 = fVar.b;
        map3.clear();
        Iterator it = o16Var.a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qz7Var = this.o;
            if (!zHasNext) {
                break;
            }
            Bundle bundleI = fVar.i((String) it.next(), null);
            if (bundleI != null) {
                a aVar = (a) this.O.b.get(((r16) bundleI.getParcelable("state")).b);
                if (aVar != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        aVar.toString();
                    }
                    eVar = new e(qz7Var, fVar, aVar, bundleI);
                } else {
                    eVar = new e(this.o, this.c, this.w.u0.getClassLoader(), J(), bundleI);
                }
                a aVar2 = eVar.c;
                aVar2.b = bundleI;
                aVar2.F0 = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar2.toString();
                }
                eVar.m(this.w.u0.getClassLoader());
                fVar.g(eVar);
                eVar.e = this.v;
            }
        }
        FragmentManagerViewModel fragmentManagerViewModel = this.O;
        fragmentManagerViewModel.getClass();
        Iterator it2 = new ArrayList(fragmentManagerViewModel.b.values()).iterator();
        while (it2.hasNext()) {
            a aVar3 = (a) it2.next();
            if (map3.get(aVar3.Y) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar3.toString();
                    Objects.toString(o16Var.a);
                }
                this.O.g(aVar3);
                aVar3.F0 = this;
                e eVar2 = new e(qz7Var, fVar, aVar3);
                eVar2.e = 1;
                eVar2.k();
                aVar3.x0 = true;
                eVar2.k();
            }
        }
        ArrayList<String> arrayList = o16Var.b;
        fVar.a.clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                a aVarB = fVar.b(str3);
                if (aVarB == null) {
                    throw new IllegalStateException(zr6.i("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVarB.toString();
                }
                fVar.a(aVarB);
            }
        }
        if (o16Var.c != null) {
            this.d = new ArrayList(o16Var.c.length);
            int i2 = 0;
            while (true) {
                ie0[] ie0VarArr = o16Var.c;
                if (i2 >= ie0VarArr.length) {
                    break;
                }
                ie0 ie0Var = ie0VarArr[i2];
                ie0Var.getClass();
                he0 he0Var = new he0(this);
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    int[] iArr = ie0Var.a;
                    if (i3 >= iArr.length) {
                        break;
                    }
                    v16 v16Var = new v16();
                    int i5 = i3 + 1;
                    v16Var.a = iArr[i3];
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(he0Var);
                        int i6 = iArr[i5];
                    }
                    v16Var.h = fg7.values()[ie0Var.c[i4]];
                    v16Var.i = fg7.values()[ie0Var.o[i4]];
                    int i7 = i3 + 2;
                    v16Var.c = iArr[i5] != 0;
                    int i8 = iArr[i7];
                    v16Var.d = i8;
                    int i9 = iArr[i3 + 3];
                    v16Var.e = i9;
                    int i10 = i3 + 5;
                    int i11 = iArr[i3 + 4];
                    v16Var.f = i11;
                    i3 += 6;
                    int i12 = iArr[i10];
                    v16Var.g = i12;
                    he0Var.b = i8;
                    he0Var.c = i9;
                    he0Var.d = i11;
                    he0Var.e = i12;
                    he0Var.b(v16Var);
                    i4++;
                }
                he0Var.f = ie0Var.X;
                he0Var.h = ie0Var.Y;
                he0Var.g = true;
                he0Var.i = ie0Var.s0;
                he0Var.j = ie0Var.t0;
                he0Var.k = ie0Var.u0;
                he0Var.l = ie0Var.v0;
                he0Var.m = ie0Var.w0;
                he0Var.n = ie0Var.x0;
                he0Var.o = ie0Var.y0;
                he0Var.s = ie0Var.Z;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = ie0Var.b;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i13);
                    if (str4 != null) {
                        ((v16) he0Var.a.get(i13)).b = fVar.b(str4);
                    }
                    i13++;
                }
                he0Var.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    he0Var.toString();
                    PrintWriter printWriter = new PrintWriter(new bt7());
                    he0Var.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(he0Var);
                i2++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.j.set(o16Var.o);
        String str5 = o16Var.X;
        if (str5 != null) {
            a aVarB2 = fVar.b(str5);
            this.z = aVarB2;
            r(aVarB2);
        }
        ArrayList arrayList3 = o16Var.Y;
        if (arrayList3 != null) {
            for (int i14 = i; i14 < arrayList3.size(); i14++) {
                this.k.put((String) arrayList3.get(i14), (je0) o16Var.Z.get(i14));
            }
        }
        this.F = new ArrayDeque(o16Var.s0);
    }

    public final e a(a aVar) {
        String str = aVar.b1;
        if (str != null) {
            u16.c(aVar, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            aVar.toString();
        }
        e eVarG = g(aVar);
        aVar.F0 = this;
        f fVar = this.c;
        fVar.g(eVarG);
        if (!aVar.N0) {
            fVar.a(aVar);
            aVar.x0 = false;
            if (aVar.U0 == null) {
                aVar.Y0 = false;
            }
            if (M(aVar)) {
                this.G = true;
            }
        }
        return eVarG;
    }

    public final Bundle a0() {
        ArrayList arrayList;
        ie0[] ie0VarArr;
        Bundle bundle = new Bundle();
        F();
        x();
        A(true);
        this.H = true;
        this.O.g = true;
        f fVar = this.c;
        fVar.getClass();
        HashMap map = fVar.b;
        ArrayList arrayList2 = new ArrayList(map.size());
        for (e eVar : map.values()) {
            if (eVar != null) {
                a aVar = eVar.c;
                fVar.i(aVar.Y, eVar.o());
                arrayList2.add(aVar.Y);
                if (Log.isLoggable("FragmentManager", 2)) {
                    aVar.toString();
                    Objects.toString(aVar.b);
                }
            }
        }
        HashMap map2 = this.c.c;
        if (!map2.isEmpty()) {
            f fVar2 = this.c;
            synchronized (fVar2.a) {
                try {
                    if (fVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(fVar2.a.size());
                        Iterator it = fVar2.a.iterator();
                        while (it.hasNext()) {
                            a aVar2 = (a) it.next();
                            arrayList.add(aVar2.Y);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                aVar2.toString();
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.d.size();
            if (size > 0) {
                ie0VarArr = new ie0[size];
                for (int i = 0; i < size; i++) {
                    ie0VarArr[i] = new ie0((he0) this.d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(this.d.get(i));
                    }
                }
            } else {
                ie0VarArr = null;
            }
            o16 o16Var = new o16();
            o16Var.X = null;
            ArrayList arrayList3 = new ArrayList();
            o16Var.Y = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            o16Var.Z = arrayList4;
            o16Var.a = arrayList2;
            o16Var.b = arrayList;
            o16Var.c = ie0VarArr;
            o16Var.o = this.j.get();
            a aVar3 = this.z;
            if (aVar3 != null) {
                o16Var.X = aVar3.Y;
            }
            arrayList3.addAll(this.k.keySet());
            arrayList4.addAll(this.k.values());
            o16Var.s0 = new ArrayList(this.F);
            bundle.putParcelable("state", o16Var);
            for (String str : this.l.keySet()) {
                bundle.putBundle(wg0.i("result_", str), (Bundle) this.l.get(str));
            }
            for (String str2 : map2.keySet()) {
                bundle.putBundle(wg0.i("fragment_", str2), (Bundle) map2.get(str2));
            }
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(z06 z06Var, br7 br7Var, a aVar) {
        if (this.w != null) {
            throw new IllegalStateException("Already attached");
        }
        this.w = z06Var;
        this.x = br7Var;
        this.y = aVar;
        CopyOnWriteArrayList copyOnWriteArrayList = this.p;
        if (aVar != 0) {
            copyOnWriteArrayList.add(new h16(aVar));
        } else if (z06Var instanceof p16) {
            copyOnWriteArrayList.add(z06Var);
        }
        if (this.y != null) {
            l0();
        }
        if (z06Var instanceof j3a) {
            i3a i3aVarE = z06Var.x0.E();
            this.g = i3aVarE;
            i3aVarE.a(aVar != 0 ? aVar : z06Var, this.i);
        }
        if (aVar != 0) {
            FragmentManagerViewModel fragmentManagerViewModel = aVar.F0.O;
            HashMap map = fragmentManagerViewModel.c;
            FragmentManagerViewModel fragmentManagerViewModel2 = (FragmentManagerViewModel) map.get(aVar.Y);
            if (fragmentManagerViewModel2 == null) {
                fragmentManagerViewModel2 = new FragmentManagerViewModel(fragmentManagerViewModel.e);
                map.put(aVar.Y, fragmentManagerViewModel2);
            }
            this.O = fragmentManagerViewModel2;
        } else if (z06Var instanceof ynf) {
            this.O = (FragmentManagerViewModel) new xje(z06Var.x0.w(), FragmentManagerViewModel.h).b(nec.a(FragmentManagerViewModel.class));
        } else {
            this.O = new FragmentManagerViewModel(false);
        }
        this.O.g = Q();
        this.c.d = this.O;
        z06 z06Var2 = this.w;
        if ((z06Var2 instanceof isc) && aVar == 0) {
            mm mmVarY = z06Var2.y();
            mmVarY.f("android:support:fragments", new qb3(2, (n16) this));
            Bundle bundleC = mmVarY.c("android:support:fragments");
            if (bundleC != null) {
                Z(bundleC);
            }
        }
        z06 z06Var3 = this.w;
        if (z06Var3 instanceof i8) {
            wb3 wb3Var = z06Var3.x0.s0;
            String strI = wg0.i("FragmentManager:", aVar != 0 ? zr6.l(new StringBuilder(), aVar.Y, ":") : "");
            n16 n16Var = (n16) this;
            this.C = wb3Var.c(au1.g(strI, "StartActivityForResult"), new f8(1), new qqd(13, n16Var));
            this.D = wb3Var.c(au1.g(strI, "StartIntentSenderForResult"), new f8(2), new rxd(16, n16Var));
            this.E = wb3Var.c(au1.g(strI, "RequestPermissions"), new f8(0), new w4d(14, n16Var));
        }
        z06 z06Var4 = this.w;
        if (z06Var4 instanceof m3a) {
            z06Var4.j0(this.q);
        }
        z06 z06Var5 = this.w;
        if (z06Var5 instanceof a4a) {
            z06Var5.m0(this.r);
        }
        z06 z06Var6 = this.w;
        if (z06Var6 instanceof r3a) {
            z06Var6.k0(this.s);
        }
        z06 z06Var7 = this.w;
        if (z06Var7 instanceof s3a) {
            z06Var7.l0(this.t);
        }
        z06 z06Var8 = this.w;
        if ((z06Var8 instanceof yq8) && aVar == 0) {
            z06Var8.i0(this.u);
        }
    }

    public final x06 b0(a aVar) {
        e eVar = (e) this.c.b.get(aVar.Y);
        if (eVar != null) {
            a aVar2 = eVar.c;
            if (aVar2.equals(aVar)) {
                if (aVar2.a > -1) {
                    return new x06(eVar.o());
                }
                return null;
            }
        }
        k0(new IllegalStateException(rh4.i("Fragment ", aVar, " is not currently in the FragmentManager")));
        throw null;
    }

    public final void c(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        if (aVar.N0) {
            aVar.N0 = false;
            if (aVar.w0) {
                return;
            }
            this.c.a(aVar);
            if (Log.isLoggable("FragmentManager", 2)) {
                aVar.toString();
            }
            if (M(aVar)) {
                this.G = true;
            }
        }
    }

    public final void c0() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.v0.removeCallbacks(this.P);
                    this.w.v0.post(this.P);
                    l0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(a aVar, boolean z) {
        ViewGroup viewGroupI = I(aVar);
        if (viewGroupI == null || !(viewGroupI instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupI).setDrawDisappearingViewsLast(!z);
    }

    public final HashSet e() {
        yd4 yd4Var;
        HashSet hashSet = new HashSet();
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((e) it.next()).c.T0;
            if (viewGroup != null) {
                K();
                Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
                if (tag instanceof yd4) {
                    yd4Var = (yd4) tag;
                } else {
                    yd4Var = new yd4(viewGroup);
                    viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4Var);
                }
                hashSet.add(yd4Var);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e0(java.lang.String r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.util.Map r0 = r3.m
            java.lang.Object r0 = r0.get(r4)
            j16 r0 = (defpackage.j16) r0
            if (r0 == 0) goto L1a
            fg7 r1 = defpackage.fg7.o
            gh7 r2 = r0.a
            fg7 r2 = r2.d
            boolean r1 = r2.a(r1)
            if (r1 == 0) goto L1a
            r0.b(r4, r5)
            goto L1f
        L1a:
            java.util.Map r3 = r3.l
            r3.put(r4, r5)
        L1f:
            java.lang.String r3 = "FragmentManager"
            r4 = 2
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L2b
            java.util.Objects.toString(r5)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.c.e0(java.lang.String, android.os.Bundle):void");
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        yd4 yd4Var;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            Iterator it = ((he0) arrayList.get(i)).a.iterator();
            while (it.hasNext()) {
                a aVar = ((v16) it.next()).b;
                if (aVar != null && (viewGroup = aVar.T0) != null) {
                    K();
                    Object tag = viewGroup.getTag(pxb.special_effects_controller_view_tag);
                    if (tag instanceof yd4) {
                        yd4Var = (yd4) tag;
                    } else {
                        yd4Var = new yd4(viewGroup);
                        viewGroup.setTag(pxb.special_effects_controller_view_tag, yd4Var);
                    }
                    hashSet.add(yd4Var);
                }
            }
            i++;
        }
        return hashSet;
    }

    public final void f0(String str, eh7 eh7Var, q16 q16Var) {
        gh7 gh7VarQ = eh7Var.Q();
        if (gh7VarQ.d == fg7.a) {
            return;
        }
        g16 g16Var = new g16(this, str, q16Var, gh7VarQ);
        j16 j16Var = (j16) this.m.put(str, new j16(gh7VarQ, q16Var, g16Var));
        if (j16Var != null) {
            j16Var.a.f(j16Var.c);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(q16Var);
        }
        gh7VarQ.a(g16Var);
    }

    public final e g(a aVar) {
        String str = aVar.Y;
        f fVar = this.c;
        e eVar = (e) fVar.b.get(str);
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this.o, fVar, aVar);
        eVar2.m(this.w.u0.getClassLoader());
        eVar2.e = this.v;
        return eVar2;
    }

    public final void g0(a aVar, fg7 fg7Var) {
        if (aVar.equals(this.c.b(aVar.Y)) && (aVar.G0 == null || aVar.F0 == this)) {
            aVar.c1 = fg7Var;
            return;
        }
        throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);
    }

    public final void h(a aVar) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(aVar);
        }
        if (aVar.N0) {
            return;
        }
        aVar.N0 = true;
        if (aVar.w0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                aVar.toString();
            }
            f fVar = this.c;
            synchronized (fVar.a) {
                fVar.a.remove(aVar);
            }
            aVar.w0 = false;
            if (M(aVar)) {
                this.G = true;
            }
            i0(aVar);
        }
    }

    public final void h0(a aVar) {
        if (aVar != null) {
            if (!aVar.equals(this.c.b(aVar.Y)) || (aVar.G0 != null && aVar.F0 != this)) {
                throw new IllegalArgumentException("Fragment " + aVar + " is not an active fragment of FragmentManager " + this);
            }
        }
        a aVar2 = this.z;
        this.z = aVar;
        r(aVar2);
        r(this.z);
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.w instanceof m3a)) {
            k0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.onConfigurationChanged(configuration);
                if (z) {
                    aVar.H0.i(true, configuration);
                }
            }
        }
    }

    public final void i0(a aVar) {
        ViewGroup viewGroupI = I(aVar);
        if (viewGroupI != null) {
            w06 w06Var = aVar.X0;
            if ((w06Var == null ? 0 : w06Var.e) + (w06Var == null ? 0 : w06Var.d) + (w06Var == null ? 0 : w06Var.c) + (w06Var == null ? 0 : w06Var.b) > 0) {
                if (viewGroupI.getTag(pxb.visible_removing_fragment_view_tag) == null) {
                    viewGroupI.setTag(pxb.visible_removing_fragment_view_tag, aVar);
                }
                a aVar2 = (a) viewGroupI.getTag(pxb.visible_removing_fragment_view_tag);
                w06 w06Var2 = aVar.X0;
                boolean z = w06Var2 != null ? w06Var2.a : false;
                if (aVar2.X0 == null) {
                    return;
                }
                aVar2.a0().a = z;
            }
        }
    }

    public final boolean j() {
        if (this.v < 1) {
            return false;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                if (!aVar.M0 ? aVar.H0.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void j0() {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            a aVar = eVar.c;
            if (aVar.V0) {
                if (this.b) {
                    this.K = true;
                } else {
                    aVar.V0 = false;
                    eVar.k();
                }
            }
        }
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        boolean zK;
        boolean z;
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && O(aVar)) {
                if (aVar.M0) {
                    zK = false;
                } else {
                    if (aVar.Q0 && aVar.R0) {
                        aVar.w0(menu, menuInflater);
                        z = true;
                    } else {
                        z = false;
                    }
                    zK = z | aVar.H0.k(menu, menuInflater);
                }
                if (zK) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(aVar);
                    z2 = true;
                }
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                a aVar2 = (a) this.e.get(i);
                if (arrayList == null || !arrayList.contains(aVar2)) {
                    aVar2.getClass();
                }
            }
        }
        this.e = arrayList;
        return z2;
    }

    public final void k0(IllegalStateException illegalStateException) {
        illegalStateException.getMessage();
        PrintWriter printWriter = new PrintWriter(new bt7());
        z06 z06Var = this.w;
        try {
            if (z06Var != null) {
                z06Var.x0.dump("  ", null, printWriter, new String[0]);
            } else {
                w("  ", null, printWriter, new String[0]);
            }
            throw illegalStateException;
        } catch (Exception unused) {
            throw illegalStateException;
        }
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.J = true;
        A(true);
        x();
        z06 z06Var = this.w;
        boolean z = z06Var instanceof ynf;
        f fVar = this.c;
        if (z) {
            zIsChangingConfigurations = fVar.d.f;
        } else {
            Context context = z06Var.u0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((je0) it.next()).a.iterator();
                while (it2.hasNext()) {
                    fVar.d.f((String) it2.next(), false);
                }
            }
        }
        u(-1);
        z06 z06Var2 = this.w;
        if (z06Var2 instanceof a4a) {
            z06Var2.r0(this.r);
        }
        z06 z06Var3 = this.w;
        if (z06Var3 instanceof m3a) {
            z06Var3.o0(this.q);
        }
        z06 z06Var4 = this.w;
        if (z06Var4 instanceof r3a) {
            z06Var4.p0(this.s);
        }
        z06 z06Var5 = this.w;
        if (z06Var5 instanceof s3a) {
            z06Var5.q0(this.t);
        }
        z06 z06Var6 = this.w;
        if ((z06Var6 instanceof yq8) && this.y == null) {
            z06Var6.n0(this.u);
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.i.e();
            this.g = null;
        }
        pl8 pl8Var = this.C;
        if (pl8Var != null) {
            pl8Var.F();
            this.D.F();
            this.E.F();
        }
    }

    public final void l0() {
        synchronized (this.a) {
            try {
                if (!this.a.isEmpty()) {
                    this.i.f(true);
                    if (Log.isLoggable("FragmentManager", 3)) {
                        toString();
                    }
                } else {
                    boolean z = this.d.size() + (this.h != null ? 1 : 0) > 0 && P(this.y);
                    if (Log.isLoggable("FragmentManager", 3)) {
                        toString();
                    }
                    this.i.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(boolean z) {
        if (z && (this.w instanceof a4a)) {
            k0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                aVar.onLowMemory();
                if (z) {
                    aVar.H0.m(true);
                }
            }
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.w instanceof r3a)) {
            k0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z2) {
                aVar.H0.n(z, true);
            }
        }
    }

    public final void o() {
        Iterator it = this.c.e().iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar != null) {
                aVar.D0(aVar.p0());
                aVar.H0.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null) {
                if (!aVar.M0 ? (aVar.Q0 && aVar.R0 && aVar.G0(menuItem)) ? true : aVar.H0.p(menuItem) : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.v < 1) {
            return;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && !aVar.M0) {
                aVar.H0.q();
            }
        }
    }

    public final void r(a aVar) {
        if (aVar != null) {
            if (aVar.equals(this.c.b(aVar.Y))) {
                aVar.F0.getClass();
                boolean zP = P(aVar);
                Boolean bool = aVar.v0;
                if (bool == null || bool.booleanValue() != zP) {
                    aVar.v0 = Boolean.valueOf(zP);
                    n16 n16Var = aVar.H0;
                    n16Var.l0();
                    n16Var.r(n16Var.z);
                }
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.w instanceof s3a)) {
            k0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (a aVar : this.c.f()) {
            if (aVar != null && z2) {
                aVar.H0.s(z, true);
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean zT;
        boolean z;
        if (this.v < 1) {
            return false;
        }
        boolean z2 = false;
        for (a aVar : this.c.f()) {
            if (aVar != null && O(aVar)) {
                if (aVar.M0) {
                    zT = false;
                } else {
                    if (aVar.Q0 && aVar.R0) {
                        aVar.I0(menu);
                        z = true;
                    } else {
                        z = false;
                    }
                    zT = aVar.H0.t(menu) | z;
                }
                if (zT) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a aVar = this.y;
        if (aVar != null) {
            sb.append(aVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            z06 z06Var = this.w;
            if (z06Var != null) {
                sb.append(z06Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (e eVar : this.c.b.values()) {
                if (eVar != null) {
                    eVar.e = i;
                }
            }
            R(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((yd4) it.next()).h();
            }
            this.b = false;
            A(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.K) {
            this.K = false;
            j0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strG = au1.g(str, "    ");
        f fVar = this.c;
        fVar.getClass();
        String str2 = str + "    ";
        HashMap map = fVar.b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (e eVar : map.values()) {
                printWriter.print(str);
                if (eVar != null) {
                    a aVar = eVar.c;
                    printWriter.println(aVar);
                    aVar.Z(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = fVar.a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                a aVar2 = (a) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(aVar2.toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                a aVar3 = (a) this.e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(aVar3.toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                he0 he0Var = (he0) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(he0Var.toString());
                he0Var.g(strG, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj = (k16) this.a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((yd4) it.next()).h();
        }
    }

    public final void y(k16 k16Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (!this.J) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (Q()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (!z) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.a.add(k16Var);
                    c0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z) {
        if (this.b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.w == null) {
            if (!this.J) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.w.v0.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z && Q()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.L == null) {
            this.L = new ArrayList();
            this.M = new ArrayList();
        }
    }
}
