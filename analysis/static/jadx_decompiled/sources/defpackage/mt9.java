package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class mt9 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public final boolean d;
    public final Bundle e;
    public ArrayList f;
    public int g;
    public boolean h;
    public final boolean i;
    public final boolean j;

    public mt9(int i, String str, PendingIntent pendingIntent) {
        this(i != 0 ? IconCompat.d(null, "", i) : null, str, pendingIntent, new Bundle());
    }

    public final nt9 a() {
        CharSequence[] charSequenceArr;
        Set set;
        if (this.i && this.c == null) {
            throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                vfc vfcVar = (vfc) it.next();
                if (vfcVar.d || (!((charSequenceArr = vfcVar.c) == null || charSequenceArr.length == 0) || (set = vfcVar.g) == null || set.isEmpty())) {
                    arrayList2.add(vfcVar);
                } else {
                    arrayList.add(vfcVar);
                }
            }
        }
        return new nt9(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (vfc[]) arrayList2.toArray(new vfc[arrayList2.size()]), arrayList.isEmpty() ? null : (vfc[]) arrayList.toArray(new vfc[arrayList.size()]), this.d, this.g, this.h, this.i, this.j);
    }

    public mt9(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.d = true;
        this.h = true;
        this.a = iconCompat;
        this.b = bu9.c(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = 0;
        this.h = true;
        this.i = false;
        this.j = false;
    }
}
