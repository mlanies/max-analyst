package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ar3 extends dec {
    public final wq3 F0;
    public final kh0 G0;

    public ar3(Context context, wq3 wq3Var) {
        kh0 kh0Var = (kh0) dh0.a.getAccessor().c(kh0.class);
        aba abaVar = new aba(context, null);
        super(abaVar);
        this.F0 = wq3Var;
        this.G0 = kh0Var;
        abaVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        abaVar.setIcon(woc.W);
        abaVar.setTitle(new eqe(b0c.banner_big_permit_phone_book_contacts_title));
        abaVar.setSubtitle(new eqe(b0c.banner_big_permit_phone_book_contacts_subtitle));
        abaVar.x(context.getString(b0c.banner_big_permit_phone_book_contacts_action_button_text), new c5(22, this));
    }
}
