package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ukc implements m56 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ukc(alc alcVar, String str, int i) {
        this.c = alcVar;
        this.o = str;
        this.b = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                alc alcVar = (alc) this.c;
                alcVar.getClass();
                return alc.g(alcVar, (String) this.o, this.b, (Continuation) obj);
            default:
                return Widget.childRouter$lambda$10((Widget) this.c, this.b, (m56) this.o, (znc) obj);
        }
    }

    public /* synthetic */ ukc(Widget widget, int i, m56 m56Var) {
        this.c = widget;
        this.b = i;
        this.o = m56Var;
    }
}
