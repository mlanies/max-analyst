package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public interface zb3 {
    default Object a(Class cls) {
        return f(lqb.a(cls));
    }

    default Set b(lqb lqbVar) {
        return (Set) d(lqbVar).get();
    }

    default gpb c(Class cls) {
        return e(lqb.a(cls));
    }

    gpb d(lqb lqbVar);

    gpb e(lqb lqbVar);

    default Object f(lqb lqbVar) {
        gpb gpbVarE = e(lqbVar);
        if (gpbVarE == null) {
            return null;
        }
        return gpbVarE.get();
    }
}
