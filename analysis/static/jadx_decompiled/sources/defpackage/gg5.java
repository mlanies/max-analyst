package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.ProgressBar;
import androidx.fragment.app.c;
import java.io.File;
import java.util.ArrayList;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;
import ru.ok.messages.views.dialogs.ProgressDialog;

/* loaded from: classes2.dex */
public final /* synthetic */ class gg5 implements qj3, b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg5 b;

    public /* synthetic */ gg5(jg5 jg5Var, int i) {
        this.a = i;
        this.b = jg5Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        ProgressDialog progressDialog;
        jg5 jg5Var = this.b;
        switch (this.a) {
            case 0:
                l20 l20Var = (l20) obj;
                if (jg5Var.a()) {
                    FrgAttachVideo frgAttachVideo = (FrgAttachVideo) jg5Var.d;
                    int i = (int) l20Var.q;
                    c cVar = frgAttachVideo.F0;
                    if (cVar != null && (progressDialog = (ProgressDialog) cVar.E("ru.ok.messages.views.dialogs.ProgressDialog")) != null) {
                        ((ProgressBar) progressDialog.i1().findViewById(xxb.dialog_progress__progress)).setProgress(i);
                        break;
                    }
                }
                break;
            case 1:
                gua guaVar = (gua) obj;
                if (!oag.t(jg5Var.j) && wmd.M(guaVar.b, guaVar.c, wmd.s())) {
                    jg5Var.d(jg5Var.j, jg5Var.k);
                    break;
                } else {
                    jg5Var.j = null;
                    jg5Var.k = false;
                    jg5Var.m = false;
                    jg5Var.l = 0;
                    break;
                }
                break;
            default:
                l20 l20Var2 = (l20) obj;
                if (jg5Var.a()) {
                    ((FrgAttachVideo) jg5Var.d).j1();
                    if (sme.b(l20Var2.j.c, false)) {
                        jg5Var.e.f("ACTION_THEME_SHARE_EXTERNAL");
                    }
                    kk5 kk5Var = jg5Var.g;
                    File fileH = kk5Var.h(l20Var2);
                    Context contextD0 = jg5Var.c.d0();
                    if (contextD0 != null) {
                        ArrayList arrayList = hm9.l;
                        try {
                            Uri uriF = kk5Var.f(contextD0, fileH);
                            die dieVar = new die(contextD0, 13);
                            ((Intent) dieVar.b).setType("*/*");
                            dieVar.Q(uriF);
                            dieVar.R(null);
                            dieVar.S();
                            break;
                        } catch (Exception e) {
                            hm9.p("hm9", "shareFile error", e);
                        }
                    }
                }
                break;
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        es8 es8Var = (es8) obj;
        jg5 jg5Var = this.b;
        jg5Var.getClass();
        cu8 cu8Var = es8Var.a;
        return cu8Var.b == jg5Var.i && cu8Var.n() && es8Var.a.g() != null;
    }
}
