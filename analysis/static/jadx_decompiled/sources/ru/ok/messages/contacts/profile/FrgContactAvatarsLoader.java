package ru.ok.messages.contacts.profile;

import android.os.Bundle;
import defpackage.a66;
import defpackage.an3;
import defpackage.hm9;
import defpackage.jy2;
import defpackage.k4a;
import defpackage.kk0;
import defpackage.kl7;
import defpackage.nu0;
import defpackage.oi0;
import defpackage.p7b;
import defpackage.pk;
import defpackage.qu;
import defpackage.u46;
import defpackage.uae;
import defpackage.uj3;
import defpackage.vl;
import defpackage.vp3;
import defpackage.wm3;
import defpackage.y8a;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

/* loaded from: classes2.dex */
public class FrgContactAvatarsLoader extends FrgBaseNonUi {
    public long B1;
    public wm3 C1;
    public final ArrayList D1 = new ArrayList();
    public int E1;
    public int F1;
    public int G1;
    public long H1;
    public boolean I1;
    public u46 J1;

    @uae
    public void onEvent(vp3 vp3Var) {
        List list;
        if (this.H1 != vp3Var.a || (list = vp3Var.b) == null) {
            return;
        }
        this.H1 = 0L;
        if (list.isEmpty()) {
            this.E1 = Integer.MAX_VALUE;
            return;
        }
        hm9.n("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "onEvent = " + vp3Var);
        this.E1 = list.size() + this.E1;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = this.D1;
        linkedHashSet.addAll(arrayList);
        linkedHashSet.addAll(list);
        arrayList.clear();
        arrayList.addAll(linkedHashSet);
        int i = vp3Var.c;
        this.F1 = i;
        u46 u46Var = this.J1;
        if (u46Var != null) {
            ((ActContactAvatars) u46Var).k0(i + this.G1, arrayList);
        }
    }

    public final void r1() {
        int i = this.E1;
        if ((i == 0 || i < this.F1) && this.H1 == 0) {
            hm9.n("ru.ok.messages.contacts.profile.FrgContactAvatarsLoader", "loadNext");
            pk pkVar = (pk) ((y8a) vl.b()).getAccessor().c(pk.class);
            k4a k4aVar = (k4a) pkVar;
            this.H1 = k4a.v(k4aVar, new qu(((p7b) k4aVar.y()).a.o(), this.B1, this.E1));
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBaseNonUi, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        long j = this.Z.getLong("ru.ok.tamtam.extra.CONTACT_ID", -1L);
        this.B1 = j;
        if (j == -1) {
            wm3 wm3Var = ((an3) this.Z.getParcelable("ru.ok.tamtam.extra.CONTACT_INFO")).a;
            this.C1 = wm3Var;
            if (wm3Var == null) {
                throw new IllegalArgumentException("contact_id or contact's SearchResult must be defined");
            }
            this.B1 = wm3Var.a;
        }
        if (this.I1) {
            return;
        }
        this.I1 = true;
        wm3 wm3Var2 = this.C1;
        ArrayList arrayList = this.D1;
        if (wm3Var2 != null) {
            kl7 kl7VarN = nu0.n(kk0.a, kk0.X, new jy2(18, this));
            if (!kl7VarN.isEmpty()) {
                arrayList.add(new AbstractMap.SimpleEntry(kl7VarN, Long.valueOf(this.C1.Y)));
            }
        } else {
            final uj3 uj3VarI = this.q1.g().i(this.B1, true);
            final int i = 0;
            final int i2 = 1;
            kl7 kl7VarM = nu0.m(new a66() { // from class: t46
                @Override // defpackage.a66
                public final Object invoke(Object obj, Object obj2) {
                    kk0 kk0Var = (kk0) obj;
                    jk0 jk0Var = (jk0) obj2;
                    switch (i) {
                        case 0:
                            return ju0.t(uj3VarI.a.c.c, kk0Var, jk0Var);
                        default:
                            return ju0.t(uj3VarI.a.c.d, kk0Var, jk0Var);
                    }
                }
            }, new a66() { // from class: t46
                @Override // defpackage.a66
                public final Object invoke(Object obj, Object obj2) {
                    kk0 kk0Var = (kk0) obj;
                    jk0 jk0Var = (jk0) obj2;
                    switch (i2) {
                        case 0:
                            return ju0.t(uj3VarI.a.c.c, kk0Var, jk0Var);
                        default:
                            return ju0.t(uj3VarI.a.c.d, kk0Var, jk0Var);
                    }
                }
            });
            if (!kl7VarM.isEmpty()) {
                arrayList.add(new AbstractMap.SimpleEntry(kl7VarM, Long.valueOf(uj3VarI.a.c.e)));
            }
        }
        int size = arrayList.size();
        this.G1 = size;
        u46 u46Var = this.J1;
        if (u46Var != null) {
            ((ActContactAvatars) u46Var).k0(size, arrayList);
        }
        r1();
    }

    @uae
    public void onEvent(oi0 oi0Var) {
        if (this.H1 == oi0Var.a) {
            this.H1 = 0L;
            r1();
        }
    }
}
