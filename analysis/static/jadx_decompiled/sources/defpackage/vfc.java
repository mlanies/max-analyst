package defpackage;

import android.app.RemoteInput;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class vfc {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public vfc(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, HashSet hashSet) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = hashSet;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput a(vfc vfcVar) {
        RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(vfcVar.a).setLabel(vfcVar.b).setChoices(vfcVar.c).setAllowFreeFormInput(vfcVar.d).addExtras(vfcVar.f);
        Set set = vfcVar.g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                tfc.d(builderAddExtras, (String) it.next(), true);
            }
        }
        ufc.b(builderAddExtras, vfcVar.e);
        return builderAddExtras.build();
    }
}
