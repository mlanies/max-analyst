package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public interface t7c extends ce3 {
    @Override // defpackage.ce3
    default void e(f9 f9Var) {
        getConfig().e(f9Var);
    }

    @Override // defpackage.ce3
    default Object f(aa0 aa0Var, Object obj) {
        return getConfig().f(aa0Var, obj);
    }

    @Override // defpackage.ce3
    default Set g() {
        return getConfig().g();
    }

    ce3 getConfig();

    @Override // defpackage.ce3
    default Object h(aa0 aa0Var) {
        return getConfig().h(aa0Var);
    }

    @Override // defpackage.ce3
    default Set i(aa0 aa0Var) {
        return getConfig().i(aa0Var);
    }

    @Override // defpackage.ce3
    default Object l(aa0 aa0Var, be3 be3Var) {
        return getConfig().l(aa0Var, be3Var);
    }

    @Override // defpackage.ce3
    default boolean o(aa0 aa0Var) {
        return getConfig().o(aa0Var);
    }

    @Override // defpackage.ce3
    default be3 q(aa0 aa0Var) {
        return getConfig().q(aa0Var);
    }
}
