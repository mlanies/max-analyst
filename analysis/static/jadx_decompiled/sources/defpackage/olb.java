package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import one.me.profile.ProfileScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class olb implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ qlb b;
    public final /* synthetic */ cjb c;

    public /* synthetic */ olb(cjb cjbVar, qlb qlbVar) {
        this.c = cjbVar;
        this.b = qlbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                long j = ((uib) this.c).a.a;
                ((ProfileScreen) this.b.X).getClass();
                ckb.c.a2(j);
                break;
            default:
                xib xibVar = (xib) this.c;
                ProfileScreen profileScreen = (ProfileScreen) this.b.X;
                profileScreen.getClass();
                StringBuilder sb = new StringBuilder("ID #");
                long j2 = xibVar.a;
                String strK = zr6.k(sb, j2, " скопирован в буфер обмена");
                ((ClipboardManager) profileScreen.requireActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(strK, String.valueOf(j2)));
                wha whaVar = (wha) xcb.a.getAccessor().d(wha.class).getValue();
                whaVar.h(strK);
                uia uiaVar = whaVar.b;
                whaVar.b = uia.a(uiaVar, null, null, null, null, eia.a(uiaVar.X, 2, 0, 0, 6), null, 47);
                whaVar.i();
                break;
        }
    }

    public /* synthetic */ olb(qlb qlbVar, cjb cjbVar) {
        this.b = qlbVar;
        this.c = cjbVar;
    }
}
