package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class pca {
    public final Collection a;
    public final je7 b;
    public final k56 c;
    public final k56 d;

    public pca(List list, je7 je7Var, ot2 ot2Var, ot2 ot2Var2) {
        this.a = list;
        this.b = je7Var;
        this.c = ot2Var;
        this.d = ot2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pca)) {
            return false;
        }
        pca pcaVar = (pca) obj;
        return tpa.f(this.a, pcaVar.a) && tpa.f(this.b, pcaVar.b) && tpa.f(this.c, pcaVar.c) && tpa.f(this.d, pcaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ms2.d(ms2.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, true), 31, false)) * 31);
    }

    public final String toString() {
        return "Config(targets=" + this.a + ", fileSystem=" + this.b + ", isBuildObfuscated=true, isBuildDebugOrBeta=false, debugModeProvider=" + this.c + ", dispatcherProvider=" + this.d + ")";
    }
}
