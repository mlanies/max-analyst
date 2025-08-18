package defpackage;

import android.view.View;
import one.me.members.list.MembersListWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class a42 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    public /* synthetic */ a42(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        m56 m56Var = this.b;
        switch (this.a) {
            case 0:
                m56Var.invoke((CharSequence) obj);
                break;
            case 1:
                m56Var.invoke((String) obj);
                break;
            case 2:
                break;
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                bc7[] bc7VarArr = MembersListWidget.D0;
                break;
            case 4:
                Integer num2 = (Integer) obj;
                num2.intValue();
                bc7[] bc7VarArr2 = MembersListWidget.D0;
                kn8 kn8Var = (kn8) m56Var.invoke(num2);
                break;
            case 5:
                bc7[] bc7VarArr3 = ProfileChangeLinkScreen.v0;
                m56Var.invoke((View) obj);
                break;
            default:
                bc7[] bc7VarArr4 = ProfileChangeLinkScreen.v0;
                m56Var.invoke((View) obj);
                break;
        }
        return e5fVar;
    }
}
