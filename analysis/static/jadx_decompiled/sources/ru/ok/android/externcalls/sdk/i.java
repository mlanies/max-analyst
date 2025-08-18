package ru.ok.android.externcalls.sdk;

import defpackage.qj3;
import defpackage.rj3;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj3 b;

    public /* synthetic */ i(rj3 rj3Var, int i) {
        this.a = i;
        this.b = rj3Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        int i = this.a;
        rj3 rj3Var = this.b;
        Throwable th = (Throwable) obj;
        switch (i) {
            case 0:
                rj3Var.accept(th);
                break;
            case 1:
                rj3Var.accept(th);
                break;
            case 2:
                rj3Var.accept(th);
                break;
            default:
                rj3Var.accept(th);
                break;
        }
    }
}
