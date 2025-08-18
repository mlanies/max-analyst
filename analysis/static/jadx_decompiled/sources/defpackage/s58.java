package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class s58 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaBarWidget b;

    public /* synthetic */ s58(MediaBarWidget mediaBarWidget, int i) {
        this.a = i;
        this.b = mediaBarWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        Object value;
        n00 n00Var;
        e5f e5fVar = e5f.a;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MediaBarWidget.d1;
                q0e q0eVar = mediaBarWidget.B0().s0;
                do {
                    value = q0eVar.getValue();
                    int iOrdinal = ((n00) value).ordinal();
                    if (iOrdinal == 0) {
                        n00Var = n00.b;
                    } else {
                        if (iOrdinal != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        n00Var = n00.a;
                    }
                } while (!q0eVar.c(value, n00Var));
                return e5fVar;
            case 1:
                mediaBarWidget.X.f.k = (CharSequence) obj;
                return e5fVar;
            default:
                bc7[] bc7VarArr2 = MediaBarWidget.d1;
                mediaBarWidget.x0().j(true);
                return e5fVar;
        }
    }
}
