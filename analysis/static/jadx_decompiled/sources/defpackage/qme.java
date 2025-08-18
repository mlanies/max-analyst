package defpackage;

import android.view.TextureView;
import ru.ok.messages.video.widgets.VideoView;

/* loaded from: classes2.dex */
public final class qme extends TextureView {
    public pme a;

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        slf slfVar;
        pme pmeVar = this.a;
        if (pmeVar != null && (slfVar = ((VideoView) ((gte) pmeVar).b).o) != null) {
            slfVar.f1();
        }
        super.onDetachedFromWindow();
    }

    public void setListener(pme pmeVar) {
        this.a = pmeVar;
    }
}
