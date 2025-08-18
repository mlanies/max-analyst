package defpackage;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ovd {
    public int a;
    public int b;
    public final a c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public final e l;

    public ovd(int i, int i2, e eVar) {
        a aVar = eVar.c;
        this.a = i;
        this.b = i2;
        this.c = aVar;
        this.d = new ArrayList();
        this.i = true;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        this.k = arrayList;
        this.l = eVar;
    }

    public final void a(ViewGroup viewGroup) {
        this.h = false;
        if (this.e) {
            return;
        }
        this.e = true;
        if (this.j.isEmpty()) {
            b();
            return;
        }
        for (nvd nvdVar : x53.D0(this.k)) {
            if (!nvdVar.b) {
                nvdVar.a(viewGroup);
            }
            nvdVar.b = true;
        }
    }

    public final void b() {
        this.h = false;
        if (!this.f) {
            if (Log.isLoggable("FragmentManager", 2)) {
                toString();
            }
            this.f = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.c.y0 = false;
        this.l.k();
    }

    public final void c(nvd nvdVar) {
        ArrayList arrayList = this.j;
        if (arrayList.remove(nvdVar) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i, int i2) {
        int iS = au1.s(i2);
        a aVar = this.c;
        if (iS == 0) {
            if (this.a != 1) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(aVar);
                    if (i != 1 && i != 2 && i != 3 && i != 4) {
                        throw null;
                    }
                }
                this.a = i;
                return;
            }
            return;
        }
        if (iS != 1) {
            if (iS != 2) {
                return;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
            }
            this.a = 1;
            this.b = 3;
            this.i = true;
            return;
        }
        if (this.a == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Objects.toString(aVar);
            }
            this.a = 2;
            this.b = 2;
            this.i = true;
        }
    }

    public final String toString() {
        StringBuilder sbM = au1.m("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        int i = this.a;
        sbM.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED");
        sbM.append(" lifecycleImpact = ");
        int i2 = this.b;
        sbM.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "REMOVING" : "ADDING" : "NONE");
        sbM.append(" fragment = ");
        sbM.append(this.c);
        sbM.append('}');
        return sbM.toString();
    }
}
