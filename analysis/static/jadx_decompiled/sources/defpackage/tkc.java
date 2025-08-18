package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final /* synthetic */ class tkc implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ alc b;
    public final /* synthetic */ String c;

    public /* synthetic */ tkc(alc alcVar, String str, int i) {
        this.a = i;
        this.b = alcVar;
        this.c = str;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.a) {
            case 0:
                alc alcVar = this.b;
                alcVar.getClass();
                return alc.b(alcVar, this.c, continuation);
            default:
                alc alcVar2 = this.b;
                alcVar2.getClass();
                return alc.a(alcVar2, this.c, continuation);
        }
    }
}
