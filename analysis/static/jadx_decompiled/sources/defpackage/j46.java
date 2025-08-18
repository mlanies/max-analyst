package defpackage;

import androidx.fragment.app.b;
import ru.ok.messages.media.attaches.fragments.FrgAttachVideo;

/* loaded from: classes2.dex */
public final /* synthetic */ class j46 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrgAttachVideo b;

    public /* synthetic */ j46(FrgAttachVideo frgAttachVideo, int i) {
        this.a = i;
        this.b = frgAttachVideo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.q1();
                break;
            case 1:
                this.b.G1();
                break;
            default:
                b bVarB0 = this.b.b0();
                if (bVarB0 != null) {
                    bVarB0.finish();
                    bVarB0.overridePendingTransition(0, esb.fullscreen_to_pip);
                    break;
                }
                break;
        }
    }
}
