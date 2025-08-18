package defpackage;

import kotlin.coroutines.Continuation;
import one.me.devmenu.DevMenuScreen;

/* loaded from: classes.dex */
public final class ni4 implements mn5 {
    public final /* synthetic */ mn5 a;
    public final /* synthetic */ DevMenuScreen b;
    public final /* synthetic */ int c;

    public ni4(j0e j0eVar, DevMenuScreen devMenuScreen, int i) {
        this.a = j0eVar;
        this.b = devMenuScreen;
        this.c = i;
    }

    @Override // defpackage.mn5
    public final Object d(on5 on5Var, Continuation continuation) {
        Object objD = this.a.d(new zq(on5Var, this.b, this.c), continuation);
        return objD == tx3.a ? objD : e5f.a;
    }
}
