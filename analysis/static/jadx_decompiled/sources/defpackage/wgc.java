package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class wgc {
    public final List a;
    public final boolean b;

    public wgc(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgc)) {
            return false;
        }
        wgc wgcVar = (wgc) obj;
        return tpa.f(this.a, wgcVar.a) && this.b == wgcVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReplyKeyboard(buttons=" + this.a + ", defaultInputDisabled=" + this.b + ")";
    }
}
