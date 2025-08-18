package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class dvc {
    public final cvc a;
    public final eu6 b;

    public dvc(cvc cvcVar, eu6 eu6Var) {
        this.a = cvcVar;
        this.b = eu6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvc)) {
            return false;
        }
        dvc dvcVar = (dvc) obj;
        return this.a == dvcVar.a && Objects.equals(this.b, dvcVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
