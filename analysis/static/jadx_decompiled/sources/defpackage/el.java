package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class el {
    public final ArrayList a = new ArrayList();
    public boolean b = true;
    public boolean c;
    public boolean d;
    public boolean e;

    public final void a(dl dlVar) {
        this.a.add(dlVar);
        this.b &= dlVar.a();
        this.c |= dlVar.c();
        this.d |= !dlVar.b();
        this.e = dlVar.b() | this.e;
    }

    public final void b(String str, String str2) {
        a(new n9e(str, str2));
    }

    public final void c(kb7 kb7Var) {
        if (this.d) {
            ArrayList arrayList = this.a;
            if (arrayList.size() > 1) {
                c63.U(arrayList, new fs4(8));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                dl dlVar = (dl) it.next();
                if (!dlVar.b()) {
                    dlVar.d(kb7Var);
                }
            }
        }
    }

    public final void d(kb7 kb7Var) {
        if (this.e) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                dl dlVar = (dl) it.next();
                if (dlVar.b()) {
                    dlVar.d(kb7Var);
                }
            }
        }
    }
}
