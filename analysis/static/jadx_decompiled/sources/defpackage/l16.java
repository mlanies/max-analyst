package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l16 implements k16 {
    public final int a;
    public final int b;
    public final /* synthetic */ c c;

    public l16(c cVar, int i, int i2) {
        this.c = cVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.k16
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.c;
        a aVar = cVar.z;
        int i = this.a;
        if (aVar == null || i >= 0 || !aVar.c0().U(-1, 0)) {
            return cVar.V(arrayList, arrayList2, i, this.b);
        }
        return false;
    }
}
