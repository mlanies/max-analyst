package defpackage;

import android.util.SparseArray;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class k1f implements wt {
    public final int a;
    public final lv4 b;
    public final dd3 c;
    public final f1f d;
    public final yb9 e;
    public final zff f;
    public final x99 g;
    public final xw0 h;
    public long i;
    public final /* synthetic */ l1f j;

    public k1f(l1f l1fVar, int i, dd3 dd3Var, f1f f1fVar, yb9 yb9Var, zff zffVar, x99 x99Var, xw0 xw0Var) {
        this.j = l1fVar;
        this.a = i;
        this.b = (lv4) ((mv4) dd3Var.a.get(i)).a.get(0);
        this.c = dd3Var;
        this.d = f1fVar;
        this.e = yb9Var;
        this.f = zffVar;
        this.g = x99Var;
        this.h = xw0Var;
    }

    public final void a(qy5 qy5Var) throws ExportException {
        qy5 qy5Var2;
        boolean z;
        int iW = np8.w(qy5Var.n);
        l1f l1fVar = this.j;
        fm9.k(((yqc) ((SparseArray) l1fVar.m.b).get(iW)) == null);
        die dieVar = l1fVar.m;
        SparseArray sparseArray = ((i1f) ((ArrayList) dieVar.a).get(this.a)).a;
        fm9.k(oaf.l(sparseArray, iW));
        qy5 qy5Var3 = (qy5) sparseArray.get(iW);
        String str = qy5Var.n;
        boolean zH = ia9.h(str);
        dd3 dd3Var = this.c;
        if (zH) {
            dieVar.J(1, new z60(qy5Var3, qy5Var, this.d, this.b, dd3Var.c.a, this.e, l1fVar.d, l1fVar.o, this.g));
            return;
        }
        if (ia9.k(str)) {
            boolean z2 = this.d.d == 1;
            i63 i63Var = qy5Var3.A;
            if (i63Var == null || !i63Var.e()) {
                i63Var = i63.h;
            }
            if (z2 && i63.g(i63Var)) {
                i63Var = i63.h;
            }
            ny5 ny5VarA = qy5Var3.a();
            ny5VarA.z = i63Var;
            qy5Var2 = new qy5(ny5VarA);
        } else {
            if (!ia9.i(str)) {
                throw ExportException.e(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
            }
            ny5 ny5VarA2 = qy5Var.a();
            i63 i63Var2 = qy5Var.A;
            if (i63Var2 == null || !i63Var2.e()) {
                i63Var2 = i63.h;
            }
            ny5VarA2.z = i63Var2;
            qy5Var2 = new qy5(ny5VarA2);
        }
        qy5 qy5Var4 = qy5Var2;
        crd crdVar = dd3Var.b;
        zw6 zw6Var = dd3Var.c.b;
        gte gteVar = new gte(3, this);
        ArrayList arrayList = (ArrayList) dieVar.a;
        if (arrayList.size() < 2) {
            z = false;
        } else {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (oaf.l(((i1f) arrayList.get(i2)).a, 2)) {
                    i++;
                }
            }
            z = i > 1;
        }
        dieVar.J(2, new flf(l1fVar.a, qy5Var4, this.d, crdVar, zw6Var, this.f, l1fVar.d, l1fVar.o, gteVar, this.g, this.h, l1fVar.h, z));
    }

    @Override // defpackage.wt
    public final void b(int i) {
        if (i <= 0) {
            d(ExportException.a(new IllegalStateException("AssetLoader instances must provide at least 1 track."), MultiFileUploader.MSG_TRY_UPLOAD_NEXT));
            return;
        }
        synchronized (this.j.l) {
            die dieVar = this.j.m;
            ((i1f) ((ArrayList) dieVar.a).get(this.a)).b = i;
        }
    }

    @Override // defpackage.wt
    public final wqc c(qy5 qy5Var) {
        synchronized (this.j.l) {
            try {
                if (!this.j.m.z()) {
                    return null;
                }
                final int iW = np8.w(qy5Var.n);
                SparseArray sparseArray = (SparseArray) this.j.m.c;
                fm9.k(oaf.l(sparseArray, iW));
                int i = 0;
                if (((Boolean) sparseArray.get(iW)).booleanValue()) {
                    die dieVar = this.j.m;
                    fm9.j("Primary track can only be queried after all tracks are added.", dieVar.z());
                    int i2 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) dieVar.a;
                        if (i2 >= arrayList.size()) {
                            i2 = -1;
                            break;
                        }
                        if (oaf.l(((i1f) arrayList.get(i2)).a, iW)) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 == this.a) {
                        a(qy5Var);
                    }
                } else {
                    e(iW);
                }
                yqc yqcVar = (yqc) ((SparseArray) this.j.m.b).get(iW);
                if (yqcVar == null) {
                    return null;
                }
                final sf6 sf6VarJ = yqcVar.j(this.b, qy5Var, this.a);
                q3a q3aVar = new q3a() { // from class: j1f
                    @Override // defpackage.q3a
                    public final void b(lv4 lv4Var, long j, qy5 qy5Var2, boolean z) {
                        int i3 = iW;
                        sf6 sf6Var = sf6VarJ;
                        k1f k1fVar = this.a;
                        if (k1fVar.j.c) {
                            synchronized (k1fVar.j.l) {
                                try {
                                    if (!k1fVar.j.m.P(k1fVar.a) || i3 != 2) {
                                        if (!((mv4) k1fVar.c.a.get(k1fVar.a)).b) {
                                            boolean z2 = true;
                                            fm9.j("MediaItem duration required for sequence looping could not be extracted.", j != -9223372036854775807L);
                                            k1fVar.i += j;
                                            synchronized (k1fVar.j.q) {
                                                if (z) {
                                                    try {
                                                        l1f l1fVar = k1fVar.j;
                                                        l1fVar.v--;
                                                    } finally {
                                                    }
                                                }
                                                if (k1fVar.j.v != 0) {
                                                    z2 = false;
                                                }
                                                if (k1fVar.i > k1fVar.j.u || z2) {
                                                    l1f l1fVar2 = k1fVar.j;
                                                    l1fVar2.u = Math.max(k1fVar.i, l1fVar2.u);
                                                    for (int i4 = 0; i4 < k1fVar.j.k.size(); i4++) {
                                                        ((e6d) k1fVar.j.k.get(i4)).j(k1fVar.j.u, z2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        sf6Var.b(lv4Var, j, qy5Var2, z);
                    }
                };
                e6d e6dVar = (e6d) this.j.k.get(this.a);
                e6dVar.getClass();
                fm9.f(iW == 1 || iW == 2);
                HashMap map = e6dVar.i;
                fm9.f(map.get(Integer.valueOf(iW)) == null);
                map.put(Integer.valueOf(iW), q3aVar);
                SparseArray sparseArray2 = (SparseArray) this.j.m.o;
                sparseArray2.put(iW, Integer.valueOf(oaf.l(sparseArray2, iW) ? 1 + ((Integer) sparseArray2.get(iW)).intValue() : 1));
                die dieVar2 = this.j.m;
                int i3 = 0;
                while (true) {
                    ArrayList arrayList2 = (ArrayList) dieVar2.a;
                    if (i >= arrayList2.size()) {
                        break;
                    }
                    if (oaf.l(((i1f) arrayList2.get(i)).a, iW)) {
                        i3++;
                    }
                    i++;
                }
                if (((Integer) ((SparseArray) dieVar2.o).get(iW)).intValue() == i3) {
                    this.j.g();
                    this.j.j.a(2, yqcVar).b();
                }
                return sf6VarJ;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wt
    public final void d(ExportException exportException) {
        l1f l1fVar = this.j;
        l1fVar.g();
        l1fVar.j.b(exportException, 4, 2, 0).b();
    }

    public final void e(int i) {
        l1f l1fVar = this.j;
        fm9.k(((yqc) ((SparseArray) l1fVar.m.b).get(i)) == null);
        die dieVar = l1fVar.m;
        SparseArray sparseArray = ((i1f) ((ArrayList) dieVar.a).get(this.a)).a;
        fm9.k(oaf.l(sparseArray, i));
        dieVar.J(i, new j05((qy5) sparseArray.get(i), this.d, l1fVar.o, this.g, l1fVar.h));
    }

    @Override // defpackage.wt
    public final void f(long j) {
    }

    @Override // defpackage.wt
    public final boolean g(int i, qy5 qy5Var) {
        boolean zH;
        int iW = np8.w(qy5Var.n);
        synchronized (this.j.l) {
            try {
                die dieVar = this.j.m;
                int i2 = this.a;
                dieVar.getClass();
                int iW2 = np8.w(qy5Var.n);
                SparseArray sparseArray = ((i1f) ((ArrayList) dieVar.a).get(i2)).a;
                boolean z = true;
                fm9.k(!oaf.l(sparseArray, iW2));
                sparseArray.put(iW2, qy5Var);
                if (this.j.m.z()) {
                    die dieVar2 = this.j.m;
                    int i3 = 0;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) dieVar2.a;
                        if (i3 >= arrayList.size()) {
                            break;
                        }
                        SparseArray sparseArray2 = ((i1f) arrayList.get(i3)).a;
                        if (oaf.l(sparseArray2, 1)) {
                            i4 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i5 = 1;
                        }
                        i3++;
                    }
                    int i6 = i4 + i5;
                    hj9 hj9Var = this.j.o;
                    if (hj9Var.r != 2) {
                        fm9.j("The track count cannot be changed after adding track formats.", hj9Var.e.size() == 0);
                        hj9Var.w = i6;
                    }
                    ((AtomicInteger) this.g.X).set(i6);
                }
                zH = h(i, qy5Var);
                if (!zH && np8.w(qy5Var.n) == 2) {
                    np8.C(this.j.o, this.b.g.b, qy5Var);
                }
                SparseArray sparseArray3 = (SparseArray) this.j.m.c;
                if (oaf.l(sparseArray3, iW)) {
                    if (zH != ((Boolean) sparseArray3.get(iW)).booleanValue()) {
                        z = false;
                    }
                    fm9.k(z);
                } else {
                    sparseArray3.put(iW, Boolean.valueOf(zH));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zH;
    }

    public final boolean h(int i, qy5 qy5Var) {
        boolean z = (i & 1) != 0;
        int iW = np8.w(qy5Var.n);
        if (!z) {
            return true;
        }
        l1f l1fVar = this.j;
        if (iW == 1) {
            return np8.H(qy5Var, this.c, this.a, this.d, l1fVar.d, l1fVar.o);
        }
        if (iW == 2) {
            if (np8.I(qy5Var, this.c, this.a, this.d, l1fVar.d, l1fVar.o)) {
                return true;
            }
            db8 db8Var = this.b.a.e;
            if (db8Var.a > 0 && !db8Var.g) {
                return true;
            }
        }
        return false;
    }
}
