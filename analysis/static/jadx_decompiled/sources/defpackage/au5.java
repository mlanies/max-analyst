package defpackage;

import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class au5 implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ au5(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
        }
        return ((Boolean) this.b.invoke(obj)).booleanValue();
    }
}
