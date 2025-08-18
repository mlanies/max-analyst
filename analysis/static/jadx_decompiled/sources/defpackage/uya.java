package defpackage;

import java.util.Set;
import one.me.chats.picker.contacts.PickerContactsListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class uya implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ PickerContactsListWidget b;

    public /* synthetic */ uya(PickerContactsListWidget pickerContactsListWidget, int i) {
        this.a = i;
        this.b = pickerContactsListWidget;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        pxa pxaVar;
        int i = this.a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i) {
            case 0:
                PickerContactsListWidget pickerContactsListWidget = this.b;
                int iJ = pickerContactsListWidget.Z.j();
                nxa nxaVar = pickerContactsListWidget.X;
                int iJ2 = nxaVar.j() + iJ;
                CharSequence charSequence = (CharSequence) pickerContactsListWidget.n0().u0.a.getValue();
                if (!(!(charSequence == null || charSequence.length() == 0)) && iIntValue >= iJ && iIntValue < iJ2 && (pxaVar = (pxa) nxaVar.G(iIntValue - iJ)) != null) {
                    return pxaVar.c;
                }
                return null;
            case 1:
                PickerContactsListWidget pickerContactsListWidget2 = this.b;
                int iJ3 = pickerContactsListWidget2.Z.j();
                int iJ4 = pickerContactsListWidget2.X.j() + iJ3;
                CharSequence charSequence2 = (CharSequence) pickerContactsListWidget2.n0().u0.a.getValue();
                boolean z = false;
                if ((!(charSequence2 == null || charSequence2.length() == 0)) || (iIntValue >= iJ3 && iIntValue < iJ4)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                PickerContactsListWidget pickerContactsListWidget3 = this.b;
                int iJ5 = pickerContactsListWidget3.Z.j();
                nxa nxaVar2 = pickerContactsListWidget3.X;
                int iJ6 = nxaVar2.j() + iJ5;
                CharSequence charSequence3 = (CharSequence) pickerContactsListWidget3.n0().u0.a.getValue();
                pxa pxaVar2 = (charSequence3 == null || charSequence3.length() == 0) ^ true ? (pxa) pickerContactsListWidget3.Y.G(iIntValue) : (iIntValue >= iJ5 && iIntValue < iJ6) ? (pxa) nxaVar2.G(iIntValue - iJ5) : null;
                return Boolean.valueOf(pxaVar2 != null ? ((Set) pickerContactsListWidget3.n0().Z.a.getValue()).contains(Long.valueOf(pxaVar2.a)) : false);
        }
    }
}
