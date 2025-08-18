package defpackage;

import android.content.ContentResolver;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class tq7 implements dab {
    public final /* synthetic */ int a;
    public final Executor b;
    public final ContentResolver c;

    public /* synthetic */ tq7(Executor executor, ContentResolver contentResolver, int i) {
        this.a = i;
        this.b = executor;
        this.c = contentResolver;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        switch (this.a) {
            case 0:
                oj0 oj0Var = (oj0) eabVar;
                hab habVar = oj0Var.c;
                oj0Var.h("local", "thumbnail_bitmap");
                sq7 sq7Var = new sq7(this, fi0Var, habVar, eabVar, habVar, eabVar, oj0Var.a, new CancellationSignal());
                oj0Var.a(new fp7(sq7Var, 2));
                this.b.execute(sq7Var);
                break;
            default:
                oj0 oj0Var2 = (oj0) eabVar;
                hab habVar2 = oj0Var2.c;
                oj0Var2.h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                ip7 ip7Var = new ip7(this, fi0Var, habVar2, eabVar, habVar2, eabVar, oj0Var2.a);
                oj0Var2.a(new fp7(ip7Var, 3));
                this.b.execute(ip7Var);
                break;
        }
    }
}
