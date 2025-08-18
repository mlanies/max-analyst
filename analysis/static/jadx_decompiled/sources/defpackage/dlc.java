package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final /* synthetic */ class dlc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k56 b;

    public /* synthetic */ dlc(int i, k56 k56Var) {
        this.a = i;
        this.b = k56Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
        }
        return this.b.invoke();
    }
}
