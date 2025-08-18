package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final /* synthetic */ class kr3 implements a8 {
    @Override // defpackage.a8
    public final void a(znc zncVar) {
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.dir/raw_contact");
        intent.putExtra("finishActivityOnSaveCompleted", true);
        try {
            ay7.F(zncVar).startActivityForResult(intent, HttpStatus.SC_PROCESSING);
        } catch (ActivityNotFoundException unused) {
            hm9.p("ContactsDeepLinkFactory", "createContact: failed, no activity found", null);
        }
    }
}
