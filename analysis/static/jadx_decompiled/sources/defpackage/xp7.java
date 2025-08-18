package defpackage;

import android.content.ContentResolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class xp7 {
    public static final /* synthetic */ int h = 0;
    public final av0 a;
    public final ox3 b;
    public final hq7 c;
    public final kke d;
    public final ContextScope e;
    public final p4d f;
    public Map g;

    public xp7(av0 av0Var, ox3 ox3Var, m7b m7bVar, hq7 hq7Var, kke kkeVar, ContentResolver contentResolver, zi5 zi5Var) {
        this.a = av0Var;
        this.b = ox3Var;
        this.c = hq7Var;
        this.d = kkeVar;
        w9a w9aVar = (w9a) kkeVar;
        ContextScope contextScopeA = j1e.a(w9aVar.a());
        this.e = contextScopeA;
        p7b p7bVar = (p7b) m7bVar;
        this.f = new p4d(p7bVar.c, p7bVar.e, new imc(contentResolver, zi5Var, false, 22));
        this.g = oz4.a;
        od2.L(od2.F(new zn5(((fz6) hq7Var).w0, new vp7(this, null), 5), w9aVar.a()), j1e.F(contextScopeA, ox3Var));
    }

    public final List a(String str) {
        nz4 nz4Var = nz4.a;
        if (str == null) {
            return nz4Var;
        }
        if (str.equals("SELECTED_MEDIA_ALBUM")) {
            p4d p4dVar = this.f;
            p4dVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = p4dVar.a.iterator();
            while (it.hasNext()) {
                r4d r4dVar = (r4d) it.next();
                if (r4dVar.f) {
                    arrayList.add(r4dVar.a);
                }
            }
            return arrayList;
        }
        b86 b86Var = (b86) this.g.get(str);
        if (b86Var == null) {
            return nz4Var;
        }
        List listC = ((fz6) this.c).c(b86Var.a);
        ArrayList arrayList2 = new ArrayList(z53.S(listC, 10));
        Iterator it2 = listC.iterator();
        while (it2.hasNext()) {
            arrayList2.add(ay7.H((zp7) it2.next()));
        }
        return arrayList2;
    }
}
