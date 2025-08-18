package ru.ok.messages.views.dialogs;

import android.app.Dialog;
import android.content.res.Resources;
import defpackage.are;
import defpackage.d10;
import defpackage.e10;
import defpackage.jpc;
import defpackage.lze;
import defpackage.oag;
import defpackage.oc;
import defpackage.s08;
import defpackage.vl;
import defpackage.y8a;
import java.util.ArrayList;
import java.util.Locale;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* loaded from: classes2.dex */
public class FrgDlgAudioTracksPicker extends FrgDlgChecked<FrgAttachVideo> {
    public ArrayList F1;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog h1() throws Resources.NotFoundException {
        s08 s08Var = new s08(U0());
        s08Var.e(h0(jpc.g));
        this.F1 = T0().getParcelableArrayList("ru.ok.tamtam.extra.AUDIO_TRACKS");
        lze lzeVar = (lze) T0().getParcelable("ru.ok.tamtam.extra.CURRENT_AUDIO_TRACK");
        Locale localeV = ((y8a) vl.b()).n().a.v();
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (int i2 = 0; i2 < this.F1.size(); i2++) {
            lze lzeVar2 = (lze) this.F1.get(i2);
            String string = lzeVar2.b;
            String str = lzeVar2.c;
            String strE = null;
            if (!oag.t(str) && !"und".equals(str)) {
                strE = are.e(new Locale(str).getDisplayLanguage(localeV));
            }
            if (oag.t(string)) {
                string = strE;
            } else if (!oag.t(strE)) {
                string = string + "(" + strE + ")";
            }
            boolean zT = oag.t(string);
            int i3 = lzeVar2.s0;
            if (zT) {
                string = g0().getString(jpc.f, Integer.valueOf(i3 + 1));
            }
            arrayList.add(string);
            if (i3 == lzeVar.s0 && lzeVar2.t0 == lzeVar.t0) {
                i = i2;
            }
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        d10 d10Var = new d10(1, this);
        oc ocVar = s08Var.a;
        ocVar.p = charSequenceArr;
        ocVar.r = d10Var;
        ocVar.u = i;
        ocVar.t = true;
        String strH0 = h0(jpc.r);
        e10 e10Var = new e10(2);
        ocVar.k = strH0;
        ocVar.l = e10Var;
        return s08Var.a();
    }

    @Override // ru.ok.messages.views.dialogs.FrgDlgChecked
    public final Class n1() {
        return FrgAttachVideo.class;
    }
}
