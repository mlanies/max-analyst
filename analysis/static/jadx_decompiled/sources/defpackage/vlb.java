package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class vlb extends amb {
    public final jqe a;
    public final jqe b;
    public final List c;
    public final Bundle d;

    public vlb(jqe jqeVar, jqe jqeVar2, List list, Bundle bundle) {
        this.a = jqeVar;
        this.b = jqeVar2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlb)) {
            return false;
        }
        vlb vlbVar = (vlb) obj;
        return tpa.f(this.a, vlbVar.a) && tpa.f(this.b, vlbVar.b) && tpa.f(this.c, vlbVar.c) && tpa.f(this.d, vlbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        int iG = k7d.g(this.c, (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31, 31);
        Bundle bundle = this.d;
        return iG + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        return "ShowConfirmationBottomSheet(title=" + this.a + ", description=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
