package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public abstract class vib extends bjb {
    @Override // defpackage.ol7
    public final boolean h(ol7 ol7Var) {
        if (equals(sib.a)) {
            return ol7Var instanceof sib;
        }
        if (this instanceof tib) {
            return ol7Var instanceof tib;
        }
        if (this instanceof uib) {
            return (ol7Var instanceof uib) && ((uib) this).a.a == ((uib) ol7Var).a.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.ol7
    public final boolean t(Object obj) {
        ol7 ol7Var = (ol7) obj;
        if (equals(sib.a)) {
            return ol7Var instanceof sib;
        }
        if (this instanceof tib) {
            return ol7Var instanceof tib;
        }
        if (this instanceof uib) {
            return (ol7Var instanceof uib) && tpa.f(((uib) this).a, ((uib) ol7Var).a);
        }
        throw new NoWhenBranchMatchedException();
    }
}
