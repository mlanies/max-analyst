package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class cm5 extends hpa {
    public final c c;
    public he0 d = null;
    public final mw7 e = new mw7(10);
    public final boolean f;
    public final HashMap g;
    public a h;

    public cm5(n16 n16Var) {
        new qqd(17, (byte) 0);
        this.g = new HashMap();
        this.h = null;
        this.c = n16Var;
        this.f = false;
    }

    @Override // defpackage.hpa
    public void a(ViewGroup viewGroup, int i, a aVar) {
        String str;
        he0 he0Var = this.d;
        c cVar = this.c;
        if (he0Var == null) {
            cVar.getClass();
            this.d = new he0(cVar);
        }
        HashMap map = this.g;
        Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            } else {
                str = (String) it.next();
                if (aVar.equals((a) map.get(str))) {
                    break;
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            boolean zO0 = aVar.o0();
            mw7 mw7Var = this.e;
            if (zO0) {
                mw7Var.d(str, new bm5(str, cVar.b0(aVar)));
            } else {
                mw7Var.e(str);
            }
            map.remove(str);
        }
        this.d.h(aVar);
    }

    @Override // defpackage.hpa
    public final void e(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    bm5 bm5Var = (bm5) parcelable2;
                    this.e.d(bm5Var.a, bm5Var);
                }
            }
            i(bundle);
        }
    }

    @Override // defpackage.hpa
    public final void f(ViewGroup viewGroup) {
        if (viewGroup.getId() != -1) {
            return;
        }
        throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
    }

    public abstract a g(int i);

    public abstract String h(int i);

    public void i(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (str.startsWith("f")) {
                try {
                    a aVarH = this.c.H(str, bundle);
                    if (aVarH != null) {
                        aVarH.Z0(false);
                        this.g.put(str.substring(1), aVarH);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }
}
