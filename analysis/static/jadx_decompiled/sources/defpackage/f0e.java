package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final /* synthetic */ class f0e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk8 b;
    public final /* synthetic */ zbg c;

    public /* synthetic */ f0e(vk8 vk8Var, zbg zbgVar, int i) {
        this.a = i;
        this.b = vk8Var;
        this.c = zbgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.m(this.c);
                break;
            default:
                ((LinkedHashSet) this.b.f).remove(this.c);
                break;
        }
    }
}
