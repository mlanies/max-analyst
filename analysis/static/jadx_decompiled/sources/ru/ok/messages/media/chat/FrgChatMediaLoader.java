package ru.ok.messages.media.chat;

import android.os.Bundle;
import defpackage.es8;
import defpackage.hm9;
import defpackage.ql8;
import defpackage.xf2;
import defpackage.zf2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import ru.ok.messages.views.fragments.base.FrgBaseNonUi;

/* loaded from: classes2.dex */
public class FrgChatMediaLoader extends FrgBaseNonUi {
    public zf2 B1;

    public static ArrayList r1(List list, HashSet hashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            es8 es8Var = (es8) it.next();
            int i = 0;
            while (true) {
                if (i >= es8Var.a.z0.i()) {
                    break;
                }
                if (hashSet.contains(es8Var.a.z0.h(i).a)) {
                    arrayList.add(es8Var);
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBaseNonUi, ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        long j = this.Z.getLong("ru.ok.tamtam.extra.CHAT_ID");
        HashSet hashSet = new HashSet(this.Z.getIntegerArrayList("ru.ok.tamtam.extra.TYPES"));
        boolean z = this.Z.getBoolean("ru.ok.tamtam.extra.DESC_ORDER");
        long j2 = this.Z.getLong("ru.ok.tamtam.extra.INITIAL_MESSAGE_ID", -1L);
        xf2 xf2Var = (xf2) this.q1.getAccessor().c(xf2.class);
        Long lValueOf = Long.valueOf(j2);
        xf2Var.getClass();
        zf2 zf2Var = new zf2(j, lValueOf, z, hashSet, xf2Var.d, xf2Var.e, xf2Var.f, xf2Var.g, xf2Var.h, xf2Var.i, xf2Var.a, xf2Var.b, xf2Var.c);
        this.B1 = zf2Var;
        zf2Var.p.d(zf2Var);
        if (hashSet.equals(ql8.d)) {
            zf2 zf2Var2 = this.B1;
            if (zf2Var2.k) {
                return;
            }
            hm9.n("zf2", "load: start");
            zf2Var2.d.clear();
            zf2Var2.b(false);
        }
    }

    @Override // ru.ok.messages.views.fragments.base.FrgBase, androidx.fragment.app.a
    public final void y0() {
        zf2 zf2Var = this.B1;
        zf2Var.p.f(zf2Var);
        super.y0();
    }
}
