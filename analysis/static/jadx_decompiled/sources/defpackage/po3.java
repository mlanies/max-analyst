package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.contactlist.ContactListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes.dex */
public final /* synthetic */ class po3 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactListWidget b;

    public /* synthetic */ po3(ContactListWidget contactListWidget, int i) {
        this.a = i;
        this.b = contactListWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 6;
        wka wkaVar = null;
        uo3 uo3Var = uo3.a;
        int i2 = 1;
        int i3 = 2;
        ContactListWidget contactListWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ContactListWidget.P0;
                bc7 bc7Var = bc7VarArr[7];
                if (((Boolean) contactListWidget.M0.a(contactListWidget)).booleanValue()) {
                    ((EndlessRecyclerView2) contactListWidget.C0.T0(contactListWidget, bc7VarArr[2])).x0(0);
                    bc7 bc7Var2 = bc7VarArr[7];
                    contactListWidget.M0.b(contactListWidget, Boolean.FALSE);
                }
                return e5f.a;
            case 1:
                bc7[] bc7VarArr2 = ContactListWidget.P0;
                return Boolean.valueOf(((dn3) contactListWidget.p0().z0.a.getValue()).b());
            case 2:
                bc7[] bc7VarArr3 = ContactListWidget.P0;
                return contactListWidget.getRouter();
            case 3:
                bc7[] bc7VarArr4 = ContactListWidget.P0;
                cla claVar = new cla(contactListWidget.getContext(), 6);
                claVar.setId(z8a.t);
                int iOrdinal = contactListWidget.p0().b.ordinal();
                if (iOrdinal == 0) {
                    claVar.setForm(uka.a);
                    claVar.setTitle(l0c.contact_list_call_contact_title);
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    claVar.setForm(uka.b);
                    claVar.setTitle(jpc.Q);
                }
                if (vo3.$EnumSwitchMapping$1[contactListWidget.p0().b.ordinal()] == 1) {
                    claVar.setLeftActions(new kka(new qo3(contactListWidget, i3)));
                }
                xka xkaVar = new xka(new gd1(i, contactListWidget));
                int iOrdinal2 = contactListWidget.p0().b.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wkaVar = new wka(woc.M0, 0, new qo3(contactListWidget, i2), 14);
                }
                claVar.setRightActions(new pka(xkaVar, wkaVar));
                eha searchView = claVar.getSearchView();
                if (searchView != null) {
                    searchView.setSearchHint(z7.B(claVar.getContext(), a9a.j));
                    if (contactListWidget.q0()) {
                        searchView.setExpandWithAnimation(false);
                        searchView.d();
                        searchView.setExpandWithAnimation(true);
                        searchView.setSearchText(contactListWidget.n0());
                    }
                }
                return claVar;
            case 4:
                bc7[] bc7VarArr5 = ContactListWidget.P0;
                return new yo3(contactListWidget);
            case 5:
                bc7[] bc7VarArr6 = ContactListWidget.P0;
                uo3 uo3Var2 = contactListWidget.p0().b;
                uo3Var2.getClass();
                return new bh0(uo3Var2 == uo3Var ? dh0.a.getAccessor().d(br3.class) : dh0.a.getAccessor().d(os3.class), ((Boolean) contactListWidget.z0.getValue()).booleanValue(), new po3(contactListWidget, i2), 14);
            case 6:
                bc7[] bc7VarArr7 = ContactListWidget.P0;
                return new wha(contactListWidget);
            case 7:
                bc7[] bc7VarArr8 = ContactListWidget.P0;
                return new rg1(new khe(new po3(contactListWidget, i3)), new l5g(contactListWidget, 0));
            default:
                bc7[] bc7VarArr9 = ContactListWidget.P0;
                uo3 uo3Var3 = contactListWidget.p0().b;
                uo3Var3.getClass();
                if (uo3Var3 == uo3Var) {
                    return wuc.CALL_NEW_CALL;
                }
                return null;
        }
    }
}
