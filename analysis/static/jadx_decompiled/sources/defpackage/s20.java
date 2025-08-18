package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.attaches.fragments.FrgAttachUnknown;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.media.attaches.fragments.FrgAttachView;

/* loaded from: classes2.dex */
public final class s20 extends cm5 {
    public final c i;
    public final ArrayList j;
    public final List k;
    public final Context l;
    public final boolean m;
    public final boolean n;
    public final HashMap o;
    public String p;
    public String q;

    public s20(n16 n16Var, List list, Context context, boolean z, boolean z2) {
        super(n16Var);
        this.j = new ArrayList();
        this.o = new HashMap();
        this.i = n16Var;
        this.k = list;
        this.l = context;
        this.m = z;
        this.n = z2;
    }

    @Override // defpackage.cm5, defpackage.hpa
    public final void a(ViewGroup viewGroup, int i, a aVar) {
        super.a(viewGroup, i, aVar);
        mpa mpaVarL = l(i);
        if (mpaVarL != null) {
            this.o.remove(((l20) mpaVarL.a).r);
        }
    }

    @Override // defpackage.hpa
    public final int b() {
        return this.j.size();
    }

    @Override // defpackage.hpa
    public final int c(a aVar) {
        if (!(aVar instanceof FrgAttachView)) {
            return -2;
        }
        int iIndexOf = this.j.indexOf(((FrgAttachView) aVar).D1.r);
        if (iIndexOf == -1) {
            return -2;
        }
        return iIndexOf;
    }

    @Override // defpackage.cm5
    public final a g(int i) {
        String string;
        a frgAttachVideo;
        mpa mpaVarL = l(i);
        Object obj = mpaVarL.a;
        l20 l20Var = (l20) obj;
        boolean z = l20Var.t;
        g20 g20Var = g20.c;
        Object obj2 = mpaVarL.b;
        if (z || !(l20Var.a == g20Var || s5c.N(l20Var))) {
            l20 l20Var2 = (l20) obj;
            boolean z2 = l20Var2.t;
            g20 g20Var2 = g20.o;
            if (z2 || !(l20Var2.a == g20Var2 || s5c.P(l20Var2))) {
                if (l20Var2.t) {
                    vl vlVar = vl.o;
                    int i2 = zqe.a;
                    g20 g20Var3 = l20Var2.a;
                    string = g20Var3 == g20Var2 ? vlVar.getString(jpc.V) : g20Var3 == g20Var ? vlVar.getString(jpc.U) : vlVar.getString(jpc.T);
                } else {
                    string = this.l.getString(jpc.h3);
                }
                FrgAttachUnknown frgAttachUnknown = new FrgAttachUnknown();
                Bundle bundleS1 = FrgAttachView.s1(l20Var2, (es8) obj2, false, false, false);
                bundleS1.putString("ru.ok.tamtam.extra.TEXT", string);
                frgAttachUnknown.X0(bundleS1);
                frgAttachVideo = frgAttachUnknown;
            } else {
                boolean zEquals = TextUtils.equals(l20Var2.r, this.q);
                if (zEquals) {
                    this.q = null;
                }
                Bundle bundleS12 = FrgAttachView.s1(l20Var2, (es8) obj2, false, l20Var2.r.equals(this.p), false);
                bundleS12.putBoolean("ru.ok.tamtam.extra.PLAY_AT_START", zEquals);
                frgAttachVideo = new FrgAttachVideo();
                frgAttachVideo.X0(bundleS12);
            }
        } else {
            l20 l20Var3 = (l20) obj;
            boolean zEquals2 = l20Var3.r.equals(this.p);
            Bundle bundleS13 = FrgAttachView.s1(l20Var3, (es8) obj2, false, zEquals2, zEquals2 && this.m);
            frgAttachVideo = new FrgAttachPhoto();
            frgAttachVideo.X0(bundleS13);
        }
        frgAttachVideo.Z.putBoolean("ru.ok.tamtam.extra.COMPAT_MODE", this.n);
        this.o.put(((l20) obj).r, new WeakReference(frgAttachVideo));
        return frgAttachVideo;
    }

    @Override // defpackage.cm5
    public final String h(int i) {
        return (String) this.j.get(i);
    }

    @Override // defpackage.cm5
    public final void i(Bundle bundle) {
        Bundle bundle2;
        l20 l20VarA;
        super.i(bundle);
        for (String str : bundle.keySet()) {
            if (!TextUtils.isEmpty(str) && str.startsWith("f")) {
                a aVarH = this.i.H(str, bundle);
                if ((aVarH instanceof FrgAttachView) && (bundle2 = aVarH.Z) != null && (l20VarA = iz7.a(bundle2.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"))) != null) {
                    this.o.put(l20VarA.r, new WeakReference((FrgAttachView) aVarH));
                }
            }
        }
    }

    public final void j(List list, boolean z) {
        for (int i = 0; i < list.size(); i++) {
            ((es8) list.get(i)).a.z0.i();
        }
        List<es8> list2 = this.k;
        if (z) {
            list2.addAll(list);
        } else {
            list2.addAll(0, list);
        }
        ArrayList arrayList = this.j;
        arrayList.clear();
        for (es8 es8Var : list2) {
            for (int i2 = 0; i2 < es8Var.a.z0.i(); i2++) {
                arrayList.add(es8Var.a.z0.h(i2).r);
            }
        }
    }

    public final FrgAttachView k(String str) {
        WeakReference weakReference = (WeakReference) this.o.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return (FrgAttachView) weakReference.get();
    }

    public final mpa l(int i) {
        int i2 = 0;
        for (es8 es8Var : this.k) {
            if (es8Var != null) {
                cu8 cu8Var = es8Var.a;
                if (cu8Var.n()) {
                    for (int i3 = 0; i3 < cu8Var.z0.i(); i3++) {
                        l20 l20VarH = cu8Var.z0.h(i3);
                        if (i2 == i) {
                            if (l20VarH.g()) {
                                c20 c20Var = l20VarH.g;
                                if (c20Var.a()) {
                                    l20VarH = c20Var.g;
                                }
                            }
                            return new mpa(l20VarH, es8Var);
                        }
                        i2++;
                    }
                } else {
                    continue;
                }
            }
        }
        return null;
    }
}
