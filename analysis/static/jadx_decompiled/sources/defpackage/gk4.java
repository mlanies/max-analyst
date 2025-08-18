package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class gk4 extends v4 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gk4(ruc rucVar, int i) {
        super(rucVar);
        this.b = i;
    }

    @Override // defpackage.v4
    public ArrayList a(Class cls) {
        switch (this.b) {
            case 1:
                return this.a.c(cls);
            default:
                return super.a(cls);
        }
    }
}
