package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Messenger;
import android.service.media.MediaBrowserService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class v68 extends MediaBrowserService {
    public final /* synthetic */ t68 a;
    public final /* synthetic */ u68 b;
    public final /* synthetic */ w68 c;

    public v68(w68 w68Var, Context context) {
        this.c = w68Var;
        this.b = w68Var;
        this.a = w68Var;
        attachBaseContext(context);
    }

    @Override // android.service.media.MediaBrowserService
    public final MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        Bundle bundleG;
        ph4 ph4Var;
        bi8.a(bundle);
        Bundle bundle2 = bundle == null ? null : new Bundle(bundle);
        t68 t68Var = this.a;
        cj8 cj8Var = (cj8) t68Var.d;
        int i2 = -1;
        if (bundle2 == null || bundle2.getInt("extra_client_version", 0) == 0) {
            bundleG = null;
        } else {
            bundle2.remove("extra_client_version");
            t68Var.c = new Messenger(cj8Var.Z);
            bundleG = zr6.g(2, "extra_service_version");
            bundleG.putBinder("extra_messenger", ((Messenger) t68Var.c).getBinder());
            ai8 ai8Var = cj8Var.s0;
            if (ai8Var != null) {
                pr6 pr6VarA = ai8Var.a();
                bundleG.putBinder("extra_session_binder", pr6VarA == null ? null : pr6VarA.asBinder());
            } else {
                ((ArrayList) t68Var.a).add(bundleG);
            }
            i2 = bundle2.getInt("extra_calling_pid", -1);
            bundle2.remove("extra_calling_pid");
        }
        s68 s68Var = new s68((cj8) t68Var.d, str, i2, i, null);
        cj8Var.Y = s68Var;
        ph4 ph4VarB = cj8Var.b(bundle2);
        cj8Var.Y = null;
        if (ph4VarB == null) {
            ph4Var = null;
        } else {
            if (((Messenger) t68Var.c) != null) {
                cj8Var.o.add(s68Var);
            }
            Bundle bundle3 = (Bundle) ph4VarB.b;
            if (bundleG == null) {
                bundleG = bundle3;
            } else if (bundle3 != null) {
                bundleG.putAll(bundle3);
            }
            ph4Var = new ph4(bundleG);
        }
        if (ph4Var == null) {
            return null;
        }
        return new MediaBrowserService.BrowserRoot((String) ph4Var.a, (Bundle) ph4Var.b);
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        fd7 fd7Var = new fd7(result);
        t68 t68Var = this.a;
        t68Var.getClass();
        cj8 cj8Var = (cj8) t68Var.d;
        cj8Var.Y = cj8Var.c;
        fd7Var.L(null);
        cj8Var.Y = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        fd7 fd7Var = new fd7(result);
        cj8 cj8Var = this.b.e;
        cj8Var.Y = cj8Var.c;
        fd7Var.L(null);
        cj8Var.Y = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        bi8.a(bundle);
        w68 w68Var = this.c;
        cj8 cj8Var = w68Var.f;
        s68 s68Var = cj8Var.c;
        fd7 fd7Var = new fd7(result);
        cj8Var.Y = s68Var;
        fd7Var.L(null);
        cj8Var.Y = null;
        w68Var.f.Y = null;
    }
}
