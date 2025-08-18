package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class x99 implements z4d {
    public final Object X;
    public Object Y;
    public Object a;
    public Object b;
    public final Object c;
    public final Object o;

    public x99(long j, sx3 sx3Var, rp9 rp9Var, ds3 ds3Var, je7 je7Var) {
        this.a = rp9Var;
        this.b = je7Var;
        kld kldVarA = lld.a(1, 1, 2);
        this.c = kldVarA;
        this.o = new v7c(kldVarA);
        q0e q0eVarA = r0e.a(i2b.a);
        this.X = q0eVarA;
        this.Y = new w7c(q0eVarA);
        od2.L(new zn5(ds3Var.c(j), new bmb(this, null), 5), sx3Var);
    }

    public static void f(a94 a94Var, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = a94Var.b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    @Override // defpackage.z4d
    public void a(h4d h4dVar) {
        ((kld) this.c).g(h4dVar);
    }

    @Override // defpackage.z4d
    public void b(j4d j4dVar) {
        boolean z = j4dVar instanceof h4d;
        k56 k56Var = (k56) this.a;
        if (!z) {
            k56Var.invoke();
            return;
        }
        Object value = ((w7c) this.Y).a.getValue();
        j2b j2bVar = value instanceof j2b ? (j2b) value : null;
        if (j2bVar != null && ((h4d) j4dVar).c == j2bVar.b) {
            k56Var.invoke();
        } else {
            ((k4a) ((pk) ((je7) this.b).getValue())).H(1, ((h4d) j4dVar).c, null, null, null, null, null, null);
            k56Var.invoke();
        }
    }

    @Override // defpackage.z4d
    public w7c c() {
        return (w7c) this.Y;
    }

    @Override // defpackage.z4d
    public void d(qo9 qo9Var) {
        ((q0e) this.X).m(null, new j2b(qo9Var.a, qo9Var.b, qo9Var.c));
    }

    @Override // defpackage.z4d
    public v7c e() {
        return (v7c) this.o;
    }

    @Override // defpackage.z4d
    public dre g() {
        return new dre(v0c.oneme_login_neuro_avatars_profile_title, v0c.oneme_login_neuro_avatars_profile_description, v0c.oneme_login_neuro_avatars_save_button);
    }

    public fad h() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = (Size) this.o;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        Surface surface = new Surface(surfaceTexture);
        bad badVarD = bad.d((w99) this.c, size);
        badVarD.b.c = 1;
        fw6 fw6Var = new fw6(surface);
        this.a = fw6Var;
        kq0.a(kq0.w(fw6Var.e), new y7g(surface, 25, surfaceTexture), ju0.k());
        badVarD.b((fw6) this.a, eu4.d, -1);
        cad cadVar = (cad) this.Y;
        if (cadVar != null) {
            cadVar.b();
        }
        cad cadVar2 = new cad(new kt6(2, this));
        this.Y = cadVar2;
        badVarD.f = cadVar2;
        return badVarD.c();
    }

    public lx0 i(String str) {
        return (lx0) ((HashMap) this.a).get(str);
    }

    public lx0 j(String str) {
        HashMap map = (HashMap) this.a;
        lx0 lx0Var = (lx0) map.get(str);
        if (lx0Var != null) {
            return lx0Var;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            iKeyAt = i;
        }
        lx0 lx0Var2 = new lx0(iKeyAt, str, a94.c);
        map.put(str, lx0Var2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.o).put(iKeyAt, true);
        ((nx0) this.X).q(lx0Var2);
        return lx0Var2;
    }

    public void k(long j) throws Throwable {
        nx0 nx0Var;
        nx0 nx0Var2 = (nx0) this.X;
        nx0Var2.i(j);
        nx0 nx0Var3 = (nx0) this.Y;
        if (nx0Var3 != null) {
            nx0Var3.i(j);
        }
        boolean zF = nx0Var2.f();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap map = (HashMap) this.a;
        if (zF || (nx0Var = (nx0) this.Y) == null || !nx0Var.f()) {
            nx0Var2.k(map, sparseArray);
        } else {
            ((nx0) this.Y).k(map, sparseArray);
            nx0Var2.a(map);
        }
        nx0 nx0Var4 = (nx0) this.Y;
        if (nx0Var4 != null) {
            nx0Var4.l();
            this.Y = null;
        }
    }

    public void l(String str) {
        HashMap map = (HashMap) this.a;
        lx0 lx0Var = (lx0) map.get(str);
        if (lx0Var != null && lx0Var.c.isEmpty() && lx0Var.d.isEmpty()) {
            map.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.o;
            int i = lx0Var.a;
            boolean z = sparseBooleanArray.get(i);
            ((nx0) this.X).p(lx0Var, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
            } else {
                sparseArray.put(i, null);
                ((SparseBooleanArray) this.c).put(i, true);
            }
        }
    }

    public synchronized void m(f1f f1fVar) {
        try {
            fm9.k(((AtomicInteger) this.X).getAndDecrement() > 0);
            ty tyVarA = ((f1f) this.Y).a();
            if (!oaf.a(f1fVar.b, ((f1f) this.o).b)) {
                tyVarA.b(f1fVar.b);
            }
            if (!oaf.a(f1fVar.c, ((f1f) this.o).c)) {
                tyVarA.c(f1fVar.c);
            }
            int i = f1fVar.a;
            f1f f1fVar2 = (f1f) this.o;
            if (i != f1fVar2.a) {
                tyVarA.a = i;
            }
            int i2 = f1fVar.d;
            if (i2 != f1fVar2.d) {
                tyVarA.b = i2;
            }
            f1f f1fVarA = tyVarA.a();
            this.Y = f1fVarA;
            if (((AtomicInteger) this.X).get() == 0 && !((f1f) this.o).equals((f1f) this.Y)) {
                ((bie) ((di6) this.c)).d(new kl4(this, 23, f1fVarA));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void n() throws Throwable {
        ((nx0) this.X).h((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.o).clear();
    }

    public x99(dd3 dd3Var, pm7 pm7Var, di6 di6Var, f1f f1fVar) {
        this.a = dd3Var;
        this.b = pm7Var;
        this.c = di6Var;
        this.o = f1fVar;
        this.Y = f1fVar;
        this.X = new AtomicInteger();
    }

    public x99(xv1 xv1Var, ul4 ul4Var, tt1 tt1Var) {
        Size size;
        aee aeeVar = new aee();
        Size size2 = null;
        this.Y = null;
        this.c = new w99();
        this.X = tt1Var;
        Size[] sizeArrS = xv1Var.b().s(34);
        if (sizeArrS == null) {
            size = new Size(0, 0);
        } else {
            if (aeeVar.a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrS) {
                    if (aee.c.compare(size3, aee.b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrS = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrS);
            Collections.sort(listAsList, new ye4(9));
            Size sizeE = ul4Var.e();
            long jMin = Math.min(sizeE.getWidth() * sizeE.getHeight(), 307200L);
            int length = sizeArrS.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = sizeArrS[i];
                long width = size4.getWidth() * size4.getHeight();
                if (width == jMin) {
                    size = size4;
                    break;
                } else if (width <= jMin) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.o = size;
        Objects.toString(size);
        this.b = h();
    }

    public x99(File file) {
        this.a = new HashMap();
        this.b = new SparseArray();
        this.c = new SparseBooleanArray();
        this.o = new SparseBooleanArray();
        nx0 nx0Var = new nx0(new File(file, "cached_content_index.exi"), 0);
        int i = maf.a;
        this.X = nx0Var;
        this.Y = null;
    }
}
