package defpackage;

import android.os.Bundle;
import java.util.List;

/* loaded from: classes2.dex */
public final class fjb implements ijb {
    public final jqe a;
    public final jqe b;
    public final List c;
    public final Bundle d;

    public fjb(jqe jqeVar, jqe jqeVar2, List list, Bundle bundle) {
        this.a = jqeVar;
        this.b = jqeVar2;
        this.c = list;
        this.d = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjb)) {
            return false;
        }
        fjb fjbVar = (fjb) obj;
        return tpa.f(this.a, fjbVar.a) && tpa.f(this.b, fjbVar.b) && tpa.f(this.c, fjbVar.c) && tpa.f(this.d, fjbVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        jqe jqeVar = this.b;
        return this.d.hashCode() + k7d.g(this.c, (iHashCode + (jqeVar == null ? 0 : jqeVar.hashCode())) * 31, 31);
    }

    public final String toString() {
        return "ShowConfirmationDialog(title=" + this.a + ", subtitle=" + this.b + ", buttons=" + this.c + ", payload=" + this.d + ")";
    }
}
