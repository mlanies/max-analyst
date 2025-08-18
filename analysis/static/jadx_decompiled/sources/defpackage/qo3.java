package defpackage;

import android.view.View;
import one.me.contactlist.ContactListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class qo3 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ qo3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        ContactListWidget contactListWidget = this.b;
        switch (this.a) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                int iJ = contactListWidget.u0.j();
                a3g a3gVar = contactListWidget.Y;
                int iJ2 = a3gVar.j() + iJ;
                a3g a3gVar2 = contactListWidget.s0;
                int iJ3 = a3gVar2.j() + iJ2;
                int iJ4 = contactListWidget.t0.j();
                CharSequence charSequenceN0 = contactListWidget.n0();
                if (!(true ^ (charSequenceN0 == null || charSequenceN0.length() == 0)) && iIntValue >= iJ && iIntValue >= iJ4) {
                    if (iIntValue >= iJ2) {
                        if (iIntValue < iJ3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                break;
            case 1:
                ((l67) contactListWidget.o.getValue()).a("show", "plus", "invite_friends");
                dy7.c(1).Y((View) obj).I(contactListWidget.E0).s().build().q(contactListWidget);
                break;
            default:
                bc7[] bc7VarArr = ContactListWidget.P0;
                contactListWidget.getRouter().B(contactListWidget);
                break;
        }
        return e5fVar;
    }
}
