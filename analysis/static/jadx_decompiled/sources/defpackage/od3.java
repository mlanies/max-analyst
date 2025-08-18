package defpackage;

import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.apache.http.HttpHost;

/* loaded from: classes.dex */
public final class od3 {
    public final /* synthetic */ int a;
    public int b;
    public final ArrayList c;
    public ArrayList d;
    public Object e;
    public Object f;
    public Serializable g;
    public Object h;
    public Object i;

    public od3(nd3 nd3Var, md3 md3Var) {
        this.a = 0;
        this.c = new ArrayList();
        this.g = new IdentityHashMap();
        this.d = new ArrayList();
        this.h = new w();
        this.e = nd3Var;
        if (md3Var.a) {
            sh0 sh0Var = new sh0((char) 0, 21);
            sh0Var.c = new SparseArray();
            sh0Var.b = 0;
            this.f = sh0Var;
        } else {
            gpf gpfVar = new gpf();
            gpfVar.a = new SparseArray();
            this.f = gpfVar;
        }
        int i = md3Var.b;
        this.b = i;
        if (i == 1) {
            this.i = new wd6(28);
            return;
        }
        if (i == 2) {
            lh4 lh4Var = new lh4();
            lh4Var.a = 0L;
            this.i = lh4Var;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.i = new re6(28);
        }
    }

    public boolean a(int i, hdc hdcVar) {
        ArrayList arrayList = this.d;
        if (i < 0 || i > arrayList.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + arrayList.size() + ". Given:" + i);
        }
        if (this.b != 1) {
            c54.j("All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS", hdcVar.b);
        } else {
            boolean z = hdcVar.b;
        }
        int i2 = i(hdcVar);
        if ((i2 == -1 ? null : (cn9) arrayList.get(i2)) != null) {
            return false;
        }
        cn9 cn9Var = new cn9(hdcVar, this, (ipf) this.f, ((lxd) this.i).Q());
        arrayList.add(i, cn9Var);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
            if (recyclerView != null) {
                hdcVar.q(recyclerView);
            }
        }
        if (cn9Var.e > 0) {
            ((nd3) this.e).p(d(cn9Var), cn9Var.e);
        }
        c();
        return true;
    }

    public vq6 b() {
        ArrayList arrayList;
        String str = (String) this.e;
        if (str == null) {
            throw new IllegalStateException("scheme == null");
        }
        String strZ = buc.z(0, (String) this.f, 0, 7, false);
        String strZ2 = buc.z(0, (String) this.g, 0, 7, false);
        String str2 = (String) this.h;
        if (str2 == null) {
            throw new IllegalStateException("host == null");
        }
        int iE = e();
        ArrayList arrayList2 = this.c;
        ArrayList arrayList3 = new ArrayList(z53.S(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(buc.z(0, (String) it.next(), 0, 7, false));
        }
        ArrayList<String> arrayList4 = this.d;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(z53.S(arrayList4, 10));
            for (String str3 : arrayList4) {
                arrayList5.add(str3 != null ? buc.z(0, str3, 0, 3, true) : null);
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        String str4 = (String) this.i;
        return new vq6(str, strZ, strZ2, str2, iE, arrayList, str4 != null ? buc.z(0, str4, 0, 7, false) : null, toString());
    }

    public void c() {
        int i;
        Iterator it = this.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                i = 1;
                break;
            }
            cn9 cn9Var = (cn9) it.next();
            int i2 = cn9Var.c.c;
            i = 3;
            if (i2 == 3 || (i2 == 2 && cn9Var.e == 0)) {
                break;
            }
        }
        nd3 nd3Var = (nd3) this.e;
        if (i != nd3Var.c) {
            nd3Var.c = i;
            nd3Var.a.g();
        }
    }

    public int d(cn9 cn9Var) {
        cn9 cn9Var2;
        Iterator it = this.d.iterator();
        int i = 0;
        while (it.hasNext() && (cn9Var2 = (cn9) it.next()) != cn9Var) {
            i += cn9Var2.e;
        }
        return i;
    }

    public int e() {
        int i;
        int i2 = this.b;
        if (i2 != -1) {
            return i2;
        }
        String str = (String) this.e;
        int iHashCode = str.hashCode();
        if (iHashCode == 3213448) {
            if (str.equals(HttpHost.DEFAULT_SCHEME_NAME)) {
                i = 80;
                return i;
            }
            return -1;
        }
        if (iHashCode == 99617003 && str.equals("https")) {
            i = 443;
            return i;
        }
        return -1;
    }

    public w f(int i) {
        w wVar = (w) this.h;
        if (wVar.b) {
            wVar = new w();
        } else {
            wVar.b = true;
        }
        Iterator it = this.d.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            cn9 cn9Var = (cn9) it.next();
            int i3 = cn9Var.e;
            if (i3 > i2) {
                wVar.c = cn9Var;
                wVar.a = i2;
                break;
            }
            i2 -= i3;
        }
        if (((cn9) wVar.c) != null) {
            return wVar;
        }
        throw new IllegalArgumentException(zr6.h(i, "Cannot find wrapper for "));
    }

    public cn9 g(dec decVar) {
        cn9 cn9Var = (cn9) ((IdentityHashMap) this.g).get(decVar);
        if (cn9Var != null) {
            return cn9Var;
        }
        throw new IllegalStateException("Cannot find wrapper for " + decVar + ", seems like it is not bound by this adapter: " + this);
    }

    public void h(String str) {
        String strY = mr0.Y(buc.z(0, str, 0, 7, false));
        if (strY == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        this.h = strY;
    }

    public int i(hdc hdcVar) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((cn9) arrayList.get(i)).c == hdcVar) {
                return i;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0021  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(defpackage.vq6 r27, java.lang.String r28) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.j(vq6, java.lang.String):void");
    }

    public void k(int i) {
        if (1 > i || 65535 < i) {
            throw new IllegalArgumentException(zr6.h(i, "unexpected port: ").toString());
        }
        this.b = i;
    }

    public void l() {
        if (this.d == null) {
            return;
        }
        String strE = buc.e("TAM_TAM_ORIGINAL_HOST", 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, 219);
        h37 h37VarX = ote.X(new h37(this.d.size() - 2, 0, -1), 2);
        int i = h37VarX.a;
        int i2 = h37VarX.b;
        int i3 = h37VarX.c;
        if (i3 >= 0) {
            if (i > i2) {
                return;
            }
        } else if (i < i2) {
            return;
        }
        while (true) {
            if (strE.equals((String) this.d.get(i))) {
                this.d.remove(i + 1);
                this.d.remove(i);
                if (this.d.isEmpty()) {
                    this.d = null;
                    return;
                }
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public void m(String str) {
        if (str.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME)) {
            this.e = HttpHost.DEFAULT_SCHEME_NAME;
        } else {
            if (!str.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str));
            }
            this.e = "https";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od3.toString():java.lang.String");
    }

    public od3() {
        this.a = 1;
        this.f = "";
        this.g = "";
        this.b = -1;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        arrayList.add("");
    }
}
