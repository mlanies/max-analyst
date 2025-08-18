package defpackage;

import android.text.style.ClickableSpan;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class gt8 implements hk7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gt8(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.hk7
    public final void a(nu8 nu8Var) {
        switch (this.a) {
            case 0:
                MessagesListWidget.n0(((b69) ((xs8) this.b)).a, nu8Var, ((ht8) this.c).J0);
                break;
            default:
                xs8 xs8Var = ((m29) this.b).X;
                MessagesListWidget.n0(((b69) xs8Var).a, nu8Var, ((MessageModel) this.c).a);
                break;
        }
    }

    @Override // defpackage.hk7
    public final void b(String str, lk7 lk7Var, ClickableSpan clickableSpan) {
        switch (this.a) {
            case 0:
                MessagesListWidget.m0(((b69) ((xs8) this.b)).a, str, lk7Var, ((ht8) this.c).J0);
                break;
            default:
                xs8 xs8Var = ((m29) this.b).X;
                MessagesListWidget.m0(((b69) xs8Var).a, str, lk7Var, ((MessageModel) this.c).a);
                break;
        }
    }
}
